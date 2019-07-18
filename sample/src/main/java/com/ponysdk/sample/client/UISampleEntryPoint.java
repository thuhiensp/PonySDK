/*
 * Copyright (c) 2011 PonySDK
 *  Owners:
 *  Luciano Broussal  <luciano.broussal AT gmail.com>
 *	Mathieu Barbier   <mathieu.barbier AT gmail.com>
 *	Nicolas Ciaravola <nicolas.ciaravola.pro AT gmail.com>
 *
 *  WebSite:
 *  http://code.google.com/p/pony-sdk/
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.ponysdk.sample.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ponysdk.core.model.PUnit;
import com.ponysdk.core.server.application.UIContext;
import com.ponysdk.core.server.concurrent.PScheduler;
import com.ponysdk.core.server.stm.Txn;
import com.ponysdk.core.ui.basic.Element;
import com.ponysdk.core.ui.basic.PAbsolutePanel;
import com.ponysdk.core.ui.basic.PAnchor;
import com.ponysdk.core.ui.basic.PButton;
import com.ponysdk.core.ui.basic.PDateBox;
import com.ponysdk.core.ui.basic.PDockLayoutPanel;
import com.ponysdk.core.ui.basic.PFileUpload;
import com.ponysdk.core.ui.basic.PFlowPanel;
import com.ponysdk.core.ui.basic.PFrame;
import com.ponysdk.core.ui.basic.PFunctionalLabel;
import com.ponysdk.core.ui.basic.PInput;
import com.ponysdk.core.ui.basic.PLabel;
import com.ponysdk.core.ui.basic.PListBox;
import com.ponysdk.core.ui.basic.PMenuBar;
import com.ponysdk.core.ui.basic.PScript;
import com.ponysdk.core.ui.basic.PScrollPanel;
import com.ponysdk.core.ui.basic.PSimplePanel;
import com.ponysdk.core.ui.basic.PStackLayoutPanel;
import com.ponysdk.core.ui.basic.PTabLayoutPanel;
import com.ponysdk.core.ui.basic.PTextBox;
import com.ponysdk.core.ui.basic.PTree;
import com.ponysdk.core.ui.basic.PTreeItem;
import com.ponysdk.core.ui.basic.PWidget;
import com.ponysdk.core.ui.basic.PWindow;
import com.ponysdk.core.ui.basic.event.PClickEvent;
import com.ponysdk.core.ui.basic.event.PKeyUpEvent;
import com.ponysdk.core.ui.basic.event.PKeyUpHandler;
import com.ponysdk.core.ui.datagrid.ColumnDescriptor;
import com.ponysdk.core.ui.datagrid.DataGrid;
import com.ponysdk.core.ui.datagrid.dynamic.Configuration;
import com.ponysdk.core.ui.datagrid.dynamic.DynamicDataGrid;
import com.ponysdk.core.ui.datagrid.impl.PLabelCellRenderer;
import com.ponysdk.core.ui.eventbus2.EventBus.EventHandler;
import com.ponysdk.core.ui.formatter.TextFunction;
import com.ponysdk.core.ui.grid.AbstractGridWidget;
import com.ponysdk.core.ui.grid.GridTableWidget;
import com.ponysdk.core.ui.list.DataGridColumnDescriptor;
import com.ponysdk.core.ui.list.refreshable.Cell;
import com.ponysdk.core.ui.list.refreshable.RefreshableDataGrid;
import com.ponysdk.core.ui.list.renderer.cell.CellRenderer;
import com.ponysdk.core.ui.list.valueprovider.IdentityValueProvider;
import com.ponysdk.core.ui.main.EntryPoint;
import com.ponysdk.core.ui.model.PKeyCodes;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.events.PMouseEvent;
import com.ponysdk.core.ui2.html.PHTMLAnchorElement;
import com.ponysdk.core.ui2.html.PHTMLAreaElement;
import com.ponysdk.core.ui2.html.PHTMLAudioElement;
import com.ponysdk.core.ui2.html.PHTMLBRElement;
import com.ponysdk.core.ui2.html.PHTMLBodyElement;
import com.ponysdk.core.ui2.html.PHTMLButtonElement;
import com.ponysdk.core.ui2.html.PHTMLDivElement;
import com.ponysdk.core.ui2.html.PHTMLImageElement;
import com.ponysdk.core.ui2.html.PHTMLInputElement;
import com.ponysdk.core.ui2.html.PHTMLLabelElement;
import com.ponysdk.core.ui2.html.PHTMLMapElement;
import com.ponysdk.core.ui2.html.PHTMLSourceElement;
import com.ponysdk.core.ui2.html.PHTMLSpanElement;
import com.ponysdk.core.ui2.html.PHTMLTextAreaElement;
import com.ponysdk.core.ui2.html.PHTMLVideoElement;
import com.ponysdk.sample.client.event.UserLoggedOutEvent;
import com.ponysdk.sample.client.event.UserLoggedOutHandler;
import com.ponysdk.sample.client.page.addon.LoggerAddOn;

public class UISampleEntryPoint implements EntryPoint, UserLoggedOutHandler {

    private static final Logger log = LoggerFactory.getLogger(UISampleEntryPoint.class);
    private PLabel mainLabel;

    // HighChartsStackedColumnAddOn highChartsStackedColumnAddOn;
    int a = 0;
    int b = 0;

    private static int counter;

    @Override
    public void start(final UIContext uiContext) {
        uiContext.setTerminalDataReceiver((object, instruction) -> System.err.println(object + " : " + instruction));

        //final PWebSocket ws = new PWebSocket("ws://echo.websocket.org");
        //final PWebSocket ws = new PWebSocket("ws://localhost:8081/sample/ws?c=");
        final PHTMLDivElement pDiv0 = new PHTMLDivElement();
        final PHTMLSpanElement pSpan0 = new PHTMLSpanElement();
        final PHTMLLabelElement pLabel0 = new PHTMLLabelElement();
        final PHTMLBRElement pBr0 = new PHTMLBRElement();
        final PHTMLBRElement pBr1 = new PHTMLBRElement();
        final PHTMLBRElement pBr2 = new PHTMLBRElement();
        final PHTMLBRElement pBr3 = new PHTMLBRElement();
        pLabel0.setInnerHTML("OK");
        final PHTMLInputElement pInput0 = new PHTMLInputElement();
        pInput0.setType("radio");

        final PHTMLLabelElement pLabel1 = new PHTMLLabelElement();
        final PHTMLInputElement pInput1 = new PHTMLInputElement();

        pLabel1.setInnerHTML("KO");
        pInput1.setType("radio");

        final PHTMLTextAreaElement pTextArea2 = new PHTMLTextAreaElement();
        final PHTMLImageElement pImage = new PHTMLImageElement();
        pImage.setUseMap("#infographic");
        pImage.setSrc("https://singledealerplatforms.files.wordpress.com/2015/07/new-html5-spotstream-gui.png");
        pImage.setAlt("MDN infographic");

        final PHTMLAnchorElement pAnchor = new PHTMLAnchorElement();

        pAnchor.setHref("https://heycam.github.io/webidl/");
        pAnchor.setTitle("Titre du lien");
        pAnchor.setInnerHTML(
            "I am a Anchor element HTML. Click me, you see the page web idl, the source we used for generate our project.");

        final PHTMLBRElement pBr4 = new PHTMLBRElement();

        final PHTMLInputElement pInput4 = new PHTMLInputElement();

        pInput4.setValue("I am an input. Mouse up me. You will se a video.");

        final PHTMLVideoElement pVideo = new PHTMLVideoElement();
        pVideo.setControls(true);
        pVideo.setWidth(250.00);
        final PHTMLSourceElement pSource = new PHTMLSourceElement();
        pSource.setSrc("https://interactive-examples.mdn.mozilla.net/media/examples/flower.webm");
        pSource.setType("video/webm");
        pVideo.add(pSource);

        pInput4.setOnmouseup(event -> {
            PHTMLBodyElement.getMain().add(pVideo);
            pInput4.setValue("event ClientX:  " + ((PMouseEvent) event).getClientX());
        }, PEventAttributesName.CLIENTX);

        final PHTMLButtonElement pButton1 = new PHTMLButtonElement();

        pButton1.setInnerHTML("I am a nice button, wheel on me!");

        pButton1.setOnwheel(event -> {
            PHTMLBodyElement.getMain().add(pBr0);
            PHTMLBodyElement.getMain().add(pTextArea2);
            PHTMLBodyElement.getMain().add(pImage);
            pTextArea2.setRows(2.5);
            //pTextArea2.setInnerHTML("\u00e9");
            pTextArea2.setInnerHTML("You click on area EURUSD of the image, you see a cercle. Do same thing on area USDJPY.");

        });

        final PHTMLInputElement pInput3 = new PHTMLInputElement();
        // final PHTMLInputElement pInput2 = new PHTMLInputElement();
        final PHTMLDivElement pDiv1 = new PHTMLDivElement();

        final PHTMLMapElement pMap = new PHTMLMapElement();
        final PHTMLAreaElement pArea1 = new PHTMLAreaElement();
        final PHTMLAreaElement pArea2 = new PHTMLAreaElement();

        final PHTMLAudioElement pAudio = new PHTMLAudioElement();

        PHTMLBodyElement.getMain().add(pDiv0);
        PHTMLBodyElement.getMain().add(pSpan0);
        PHTMLBodyElement.getMain().add(pBr0);
        PHTMLBodyElement.getMain().add(pLabel0);
        PHTMLBodyElement.getMain().add(pInput0);
        PHTMLBodyElement.getMain().add(pBr1);
        PHTMLBodyElement.getMain().add(pLabel1);
        PHTMLBodyElement.getMain().add(pInput1);
        PHTMLBodyElement.getMain().add(pBr2);
        PHTMLBodyElement.getMain().add(pDiv1);
        PHTMLBodyElement.getMain().add(pAnchor);
        PHTMLBodyElement.getMain().add(pBr3);
        PHTMLBodyElement.getMain().add(pInput4);
        PHTMLBodyElement.getMain().add(pBr4);
        PHTMLBodyElement.getMain().add(pButton1);

        PHTMLBodyElement.getMain().add(pMap);
        pMap.add(pArea1);
        pMap.add(pArea2);

        pInput0.setOnclick(event -> {
            pLabel0.setInnerHTML("Thank you for your apreciation");
            pLabel1.setInnerHTML("");
        });

        pInput1.setOnclick(event -> {
            pLabel1.setInnerHTML("Thank you, we will improve it.");
            pLabel0.setInnerHTML("");
        });

        pDiv0.setInnerHTML("This is a first demo of stage Pony by Hien Le, tutor Amine Bagdouri.");
        pSpan0.setInnerHTML("What do you think about this version of PonySDK? ");

        pMap.setName("infographic");

        pArea1.setShape("circle");
        pArea1.setCoords("75,75,75");
        pArea1.setHref("https://www.smart-trade.net/");

        pArea2.setShape("circle");
        pArea2.setCoords("475,75,75");
        pArea2.setHref("https://www.linkedin.com/company/smart-trade-technologies");

        pInput3.setValue("Report to do");
        //pDiv1.add(pInput1);
        // pDiv1.add(pInput2);
        pDiv1.setTitle("PonySDK");
        //        pInput1.setMinLength(10.00);
        //        pInput1.setType("checkbox");
        //        pInput1.setSize(20.00);
        // pInput2.setValue("Bonjour Juillet !");

        //pButton1.setInnerHTML("I am a nice button");
        // pButton1.setOnclick(event -> {
        // pButton1.setInnerHTML(pInput2.getValue());
        // log.info("MouseEvent pppp" + ((PMouseEvent) event).getPath()[1]);
        // log.info("MouseEvent pppp" + ((PMouseEvent) event).getClientY());
        //   }, PEventAttributesName.PATH);
        //  pInput1.setOnclick(event -> pInput2.setValue("You are in Summer"));

        // pArea1.setOnwheel(event -> {
        //        pInput1.setType("date");
        //        pInput1.setValue("2019-07-02");
        //        pInput1.setMin("2019-04-01");
        //        pInput1.setMax("2019-09-27");
        // pInput2.setValue(event.getPath()[1].getClass().getName());
        //        }, PEventAttributesName.PATH);

        //        pButton1.setOnclick(event -> {
        //            pInput1.setType("date");
        //            pInput1.setValue("2019-07-02");
        //            pInput1.setMin("2019-04-01");
        //            pInput1.setMax("2019-09-27");
        //        });

        //  pInput2.setOnchange(event -> pInput1.setValue(event.getType()));

        //        pTextArea1.setOnchange(event -> {
        //            pInput1.setType("date");
        //            pInput1.setValue("2019-07-02");
        //            pInput1.setMin("2019-04-01");
        //            pInput1.setMax("2019-09-27");
        //        });

        //        final PSVGSVGElement pSVG = new PSVGSVGElement();
        //        PHTMLBodyElement.getMain().add(pSVG);
        //        final PSVGCircleElement pCircle = new PSVGCircleElement();
        //        pSVG.add(pCircle);

        //        final PBatteryManager pBatteryManage = new PBatteryManager();
        //        final PArrayBuffer pArrayBuffer = new PArrayBuffer(250.00);
        //        final PDate pDate = new PDate(1988, 1);
        //        //final PPushEvent pEvent = new PPushEvent("fffff");
        //        final PCSSUnitValue pCSSUnit = new PCSSUnitValue(1250.000, "px");
        //        pCSSUnit.setValue(1251.000);
        //        final PCSSNamespaceRule pCSSNameSpace = new PCSSNamespaceRule();
        //        final PLabel label = Element.newPLabel();
        //        label.addClickHandler(e -> label.setText("toto"));

        //        final String cssText = "Black";
        //        pCSSNameSpace.setCssText(cssText);

        //        final PHtmlInput htmlInput = new PHtmlInput();
        //        final PHtmlInput htmlInput2 = new PHtmlInput();
        //        PHtmlBody.getMain().add(htmlInput);
        //        PHtmlBody.getMain().add(htmlInput2);
        //        final PHtmlDiv htmlDiv = new PHtmlDiv();
        //        htmlDiv.add(htmlInput2);
        //        htmlInput2.setValue("let start!");
        //        htmlInput2.setChecked(true);
        //        htmlInput2.setMaxLength(21454526);
        //        final PHtmlButton htmlButton1 = new PHtmlButton();
        //        htmlButton1.setValue("oke, no problem!");
        //        PHtmlBody.getMain().add(htmlDiv);
        //        uiContext.setTerminalDataReceiver((object, instruction) -> System.err.println(object + " : " + instruction));
        //        final PFlowPanel flowPanel = Element.newPFlowPanel();
        //        final PTextBox textBox1 = Element.newPTextBox("Check Enjoy");
        //        PWindow.getMain().add(textBox1);
        //        PWindow.getMain().add(flowPanel);
        //        mainLabel = Element.newPLabel("Can be modified by anybody : ₲ῳ₸");
        //        mainLabel.setAttributeLinkedToValue("data-title");
        //        mainLabel.setTitle("String ASCII");
        //        flowPanel.add(mainLabel);
        //        //        textBox1.setText("Travail!");
        //        final PTextBox textBox2 = Element.newPTextBox("ff");
        //        final PButton buttonCheck2 = Element.newPButton();
        //        flowPanel.add(textBox2);
        //        flowPanel.add(buttonCheck2);

        //       buttonCheck2.addClickHandler(event -> textBox2.setText("abcdefghijkl"));
        if (true) return;
        //        //if (true) return;
        //        final PInput input1 = Element.newPInput("jjjj");
        //        //input1.setText("Enjoy!");
        //        final PInput input2 = Element.newPInput();
        //        final PButton buttonCheck = Element.newPButton();
        //        flowPanel.add(input1);
        //        flowPanel.add(input2);
        //        flowPanel.add(buttonCheck);
        //        input1.ajoutHandler(event -> {
        //            input2.setText(event.getData());
        //            ((PInput) event.getSource()).getData();
        //        });
        //        if (true) return;
        //
        //createReconnectingPanel();
        //
        //        mainLabel = Element.newPLabel("Can be modified by anybody : ₲ῳ₸");
        //        mainLabel.setAttributeLinkedToValue("data-title");
        //        mainLabel.setTitle("String ASCII");
        //        PWindow.getMain().add(mainLabel);
        //
        //        testVisibilityHandler(PWindow.getMain());
        //
        //        testPerf();
        //
        //        if (true) return;
        //
        //        createNewGridSystem();
        //
        //        testPAddon();
        //
        //        createWindow().open();
        //
        //        downloadFile();
        //
        //        createNewEvent();
        //
        //        testUIDelegator();
        //
        //        testNewGrid();
        //
        //        createFunctionalLabel();
        //
        //        PWindow.getMain().add(createGrid());
        //
        //        testPAddon();
        //
        //        PScript.execute(PWindow.getMain(), "alert('coucou Main');");
        //
        //        final PWindow window = createWindow();
        //        window.open();
        //
        //        PWindow.getMain().add(Element.newA());
        //
        //        // PWindow.getMain().add(new PHistory());
        //        // PWindow.getMain().add(new PNotificationManager());
        //        // PWindow.getMain().add(new PSuggestBox());
        //
        //        PWindow.getMain().add(createBlock(createAbsolutePanel()));
        //        // PWindow.getMain().add(createPAddOn().asWidget());
        //        PWindow.getMain().add(Element.newPAnchor());
        //        PWindow.getMain().add(Element.newPAnchor("Anchor"));
        //        PWindow.getMain().add(Element.newPAnchor("Anchor 1", "anchor2"));
        //        PWindow.getMain().add(Element.newPButton());
        //        PWindow.getMain().add(createButton());
        //        PWindow.getMain().add(Element.newPCheckBox());
        //        PWindow.getMain().add(Element.newPCheckBox("Checkbox"));
        //        final PCookies cookies = new PCookies();
        //        cookies.setCookie("Cook", "ies");
        //        PWindow.getMain().add(createDateBox());
        //        PWindow.getMain().add(Element.newPDateBox(new SimpleDateFormat("dd/MM/yyyy")));
        //        PWindow.getMain().add(Element.newPDateBox(Element.newPDatePicker(), new SimpleDateFormat("yyyy/MM/dd")));
        //
        //        final PDateBox dateBox = Element.newPDateBox(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS"), true);
        //        dateBox.addValueChangeHandler(event -> System.err.println(event.getData()));
        //        PWindow.getMain().add(dateBox);
        //
        //        PWindow.getMain().add(Element.newPDatePicker());
        //        PWindow.getMain().add(Element.newPDecoratedPopupPanel(false));
        //        PWindow.getMain().add(Element.newPDecoratedPopupPanel(true));
        //        PWindow.getMain().add(Element.newPDecoratorPanel());
        //        PWindow.getMain().add(Element.newPDialogBox());
        //        PWindow.getMain().add(Element.newPDialogBox(true));
        //        PWindow.getMain().add(Element.newPDisclosurePanel("Disclosure"));
        //        PWindow.getMain().add(createDockLayoutPanel());
        //        final PFrame frame = Element.newPFrame("http://localhost:8081/sample/");
        //        frame.add(Element.newPLabel("Inside the frame"));
        //        PWindow.getMain().add(frame);
        //        PWindow.getMain().add(createPFileUpload());
        //        PWindow.getMain().add(Element.newPFlexTable());
        //        PWindow.getMain().add(createPFlowPanel());
        //        PWindow.getMain().add(Element.newPFocusPanel());
        //        PWindow.getMain().add(Element.newPGrid());
        //        PWindow.getMain().add(Element.newPGrid(2, 3));
        //        PWindow.getMain().add(Element.newPHeaderPanel());
        //        // PWindow.getMain().add(new PHistory());
        //        PWindow.getMain().add(Element.newPHorizontalPanel());
        //        PWindow.getMain().add(Element.newPHTML());
        //        PWindow.getMain().add(Element.newPHTML("Html"));
        //        PWindow.getMain().add(Element.newPHTML("Html 1", true));
        //        PWindow.getMain().add(Element.newPImage()); // FIXME Test with image
        //        PWindow.getMain().add(Element.newPLabel());
        //        PWindow.getMain().add(Element.newPLabel("Label"));
        //        PWindow.getMain().add(Element.newPLayoutPanel());
        //        PWindow.getMain().add(Element.newPListBox());
        //        PWindow.getMain().add(createListBox());
        //        PWindow.getMain().add(Element.newPMenuBar());
        //        PWindow.getMain().add(createMenu());
        //        // PWindow.getMain().add(new PNotificationManager());
        //        PWindow.getMain().add(Element.newPPasswordTextBox());
        //        PWindow.getMain().add(Element.newPPasswordTextBox("Password"));
        //
        //        PWindow.getMain().add(Element.newPPopupPanel());
        //        PWindow.getMain().add(Element.newPPopupPanel(true));
        //
        //        PWindow.getMain().add(Element.newPPushButton(Element.newPImage())); // FIXME Test with image
        //
        //        PWindow.getMain().add(Element.newPRadioButton("RadioLabel"));
        //        PWindow.getMain().add(Element.newPRadioButton("RadioLabel"));
        //        final PRichTextArea richTextArea = Element.newPRichTextArea();
        //        PWindow.getMain().add(richTextArea);
        //        PWindow.getMain().add(Element.newPRichTextToolbar(richTextArea));
        //        PWindow.getMain().add(Element.newPScrollPanel());
        //        PWindow.getMain().add(Element.newPSimpleLayoutPanel());
        //        PWindow.getMain().add(Element.newPSimplePanel());
        //        PWindow.getMain().add(Element.newPSplitLayoutPanel());
        //        PWindow.getMain().add(createStackLayoutPanel());
        //        // PWindow.getMain().add(new PSuggestBox());
        //        PWindow.getMain().add(createTabLayoutPanel());
        //        PWindow.getMain().add(Element.newPTabPanel());
        //        PWindow.getMain().add(Element.newPTextArea());
        //        PWindow.getMain().add(createPTextBox());
        //        PWindow.getMain().add(new PToolbar());
        //        PWindow.getMain().add(createTree());
        //        PWindow.getMain().add(new PTwinListBox<>());
        //        PWindow.getMain().add(Element.newPVerticalPanel());
        //
        //        mainLabel = Element.newPLabel("Label2");
        //        mainLabel.addClickHandler(event -> System.out.println("bbbbb"));
        //        PWindow.getMain().add(mainLabel);
        //
        //        try {
        //            window.add(mainLabel);
        //        } catch (final Exception e) {
        //        }
        //
        //        PWindow.getMain().add(Element.newPLabel("Label3"));
        //
        //        final PLabel label = Element.newPLabel("Label4");
        //
        //        try {
        //            window.add(label);
        //            PWindow.getMain().add(label);
        //        } catch (final Exception e) {
        //        }
        //
        //        PConfirmDialog.show(PWindow.getMain(), "AAA", Element.newPLabel("AA"));
        //
        //        POptionPane.showConfirmDialog(PWindow.getMain(), null, "BBB");

        // uiContext.getHistory().newItem("", false);
    }

    private void testVisibilityHandler(final PWindow window) {
        final PLabel liveVisibility = Element.newPLabel("Live Visibility : Unknown");
        window.add(liveVisibility);

        final PInput input = Element.newPInput("Check Enjoy");

        window.add(input);

        final PButton buttonTest = Element.newPButton("Check Input");
        window.add(buttonTest);

        final PButton button = Element.newPButton("Check visibility!!!");
        window.add(button);

        final PLabel visibilityLabel = Element.newPLabel("Visibility : Unknown");
        window.add(visibilityLabel);

        final PScrollPanel frame = Element.newPScrollPanel();
        frame.setHeight("200px");
        frame.setWidth("300px");
        window.add(frame);

        final PFlowPanel panel = Element.newPFlowPanel();
        panel.setHeight("2000px");
        frame.add(panel);

        final PFlowPanel subPanel = Element.newPFlowPanel();
        subPanel.setStyleProperty("backgroundColor", "red");
        subPanel.setHeight("125px");
        subPanel.setWidth("200px");
        panel.add(subPanel);

        final PLabel label = Element.newPLabel("Increment : " + a++);
        subPanel.add(label);

        PScheduler.scheduleAtFixedRate(() -> {
            a++;
            if (subPanel.isShown() && subPanel.getWindow().isShown()) updateLabel(label, String.valueOf(a));
        }, Duration.ofSeconds(1));

        subPanel.getWindow().addVisibilityHandler(event -> {
            if (event.getData()) {
                System.err.println("Force refresh, because window became visible");
                updateLabel(label, String.valueOf(a));
            } else {
                System.err.println("Window became not visible");
            }
        });

        liveVisibility.setText("Live Visibility : " + subPanel.isShown());
        //visibilityLabel.setText("Visibility : " + subPanel.isShown());
        subPanel.addVisibilityHandler(event -> {
            liveVisibility.setText("Live Visibility : " + event.getData());
            if (event.getData()) {
                System.err.println("Force refresh, because panel became visible");
                updateLabel(label, String.valueOf(a));
            }
        });
        button.addClickHandler(event -> visibilityLabel.setText("Visibility : " + subPanel.isShown()));

    }

    private static void updateLabel(final PLabel label, final String text) {
        System.out.println("Update label " + text);
        label.setText("Increment : " + text);
    }

    private void createFunctionalLabel() {
        final TextFunction textFunction = new TextFunction(args -> {
            System.out.println(args[0] + " " + args[1]);
            return (String) args[0];
        }, "console.log(args[0] + \" \" + args[1]); return args[0];");
        final PFunctionalLabel newPFunctionalLabel = Element.newPFunctionalLabel(textFunction);
        PWindow.getMain().add(newPFunctionalLabel);
        newPFunctionalLabel.setArgs("A", "B");
    }

    public PFlowPanel createPFileUpload() {
        final PFlowPanel panel = Element.newPFlowPanel();
        final PFileUpload fileUpload = Element.newPFileUpload();
        fileUpload.setName("file");
        panel.add(fileUpload);
        fileUpload.addChangeHandler(event -> {
            final PFileUpload pFileUpload = (PFileUpload) event.getSource();
            System.out.println("File name : " + pFileUpload.getFileName());
            System.out.println("File size : " + pFileUpload.getFileSize() + " bytes");
        });
        fileUpload.addStreamHandler((request, response, context) -> {
            try {
                final List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                for (final FileItem item : items) {
                    if (!item.isFormField()) readFileItem(item);
                }
            } catch (final Exception e) {
                e.printStackTrace();
            }
        });
        final PButton button = Element.newPButton("Submit");
        button.addClickHandler(event -> fileUpload.submit());
        panel.add(button);
        return panel;
    }

    private void readFileItem(final FileItem item) throws IOException, FileNotFoundException {
        // Store the uploaded file on the server (don't forget to remove)
        final String fileName = FilenameUtils.getName(item.getName());
        final InputStream fileContent = item.getInputStream();
        final File uploadedFile = File.createTempFile(fileName, "fileUpload");
        IOUtils.copy(fileContent, new FileOutputStream(uploadedFile));
        uploadedFile.deleteOnExit();

        // Read directly the input stream
        final BufferedReader reader = new BufferedReader(new InputStreamReader(item.getInputStream(), "UTF-8"));
        final StringBuilder value = new StringBuilder();
        final char[] buffer = new char[1024];
        for (int length = 0; (length = reader.read(buffer)) > 0;) {
            value.append(buffer, 0, length);
        }
        System.out.println(value.toString());
    }

    private void testPerf() {
        final PWindow w = Element.newPWindow("Window 1", "resizable=yes,location=0,status=0,scrollbars=0");
        final List<PLabel> labels = new ArrayList<>(1000);

        final PButton start = Element.newPButton("Start");
        w.add(start);
        start.addClickHandler(event -> scheduleUpdate(labels));

        for (int i = 0; i < 1000; i++) {
            final PLabel label = Element.newPLabel(counter + "-" + i);
            labels.add(label);
            w.add(label);
        }

        w.open();
    }

    private void scheduleUpdate(final List<PLabel> labels) {
        PScheduler.schedule(() -> {
            int i = 0;
            counter++;
            for (final PLabel label : labels) {
                label.setText(counter + "-" + i);
                i++;
            }
            if (counter < 20) scheduleUpdate(labels);
            else counter = 0;
        }, Duration.ofMillis(20));
    }

    private void createNewGridSystem() {
        //        final DataGrid<Pojo> grid = new DataGrid<>((a, b) -> a.bid.compareTo(b.bid));

        final Configuration<Pojo> configuration = new Configuration<>(Pojo.class);
        //configuration.setFilter(method -> method.getName().contains("COUCOU"));

        final DataGrid<Pojo> grid = new DynamicDataGrid<>(configuration, Comparator.comparing(Pojo::getBid));

        PWindow.getMain().add(grid);

        final Random random = new Random();

        final Map<String, Pojo> map = new HashMap<>();

        for (int i = 0; i < 40; i++) {
            final Pojo pojo = new Pojo();
            pojo.security = "security" + i;
            pojo.classe = "class" + i;
            pojo.bid = random.nextDouble() * i;
            pojo.offer = random.nextDouble() * i;
            pojo.spread = random.nextDouble() * i;
            pojo.coucou = random.nextDouble() * i + "";
            pojo.coucou1 = random.nextDouble() * i + "";
            pojo.coucou2 = random.nextDouble() * i + "";
            pojo.coucou3 = random.nextDouble() * i + "";
            pojo.coucou4 = random.nextDouble() * i + "";
            pojo.coucou5 = random.nextDouble() * i + "";
            pojo.coucou6 = random.nextDouble() * i + "";
            pojo.coucou7 = random.nextDouble() * i + "";
            pojo.coucou8 = random.nextDouble() * i + "";
            pojo.coucou9 = random.nextDouble() * i + "";
            pojo.coucou10 = random.nextDouble() * i + "";
            map.put("security" + i, pojo);
            grid.addData(pojo);
        }

        Txn.get().flush();

        PScheduler.scheduleAtFixedRate(() -> {
            for (int i = 0; i < 40; i++) {
                final Pojo pojo = map.get("security" + i);
                grid.update(pojo, p -> {
                    p.bid = random.nextDouble();
                    p.offer = random.nextDouble();
                    p.spread = random.nextDouble();
                    return p;
                });
            }
        }, Duration.ofMillis(300));
    }

    private void createReconnectingPanel() {
        final PSimplePanel reconnectionPanel = Element.newPSimplePanel();
        reconnectionPanel.setAttribute("id", "reconnection");
        final PSimplePanel reconnectingPanel = Element.newPSimplePanel();
        reconnectingPanel.setAttribute("id", "reconnecting");
        reconnectionPanel.setWidget(reconnectingPanel);
        PWindow.getMain().add(reconnectionPanel);
    }

    private void downloadFile() {
        final PButton downloadImageButton = Element.newPButton("Download Pony image");
        downloadImageButton.addClickHandler(event -> UIContext.get().stackStreamRequest((request, response, uiContext1) -> {
            response.reset();
            response.setContentType("image/png");
            response.setHeader("Content-Disposition", "attachment; filename=pony_image.png");

            try {
                final OutputStream output = response.getOutputStream();
                final InputStream input = getClass().getClassLoader().getResourceAsStream("images/pony.png");

                final byte[] buff = new byte[1024];
                while (input.read(buff) != -1) {
                    output.write(buff);
                }

                output.flush();
                output.close();
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }));
        PWindow.getMain().add(downloadImageButton);
    }

    private void testPAddon() {
        final LoggerAddOn addon = createPAddOn();
        addon.attach(PWindow.getMain());
        addon.log(null);
        addon.log("toto");

        // final PElementAddOn elementAddOn = new PElementAddOn();
        // elementAddOn.setInnerText("Coucou");
        // flowPanel.add(elementAddOn);

        // highChartsStackedColumnAddOn = new HighChartsStackedColumnAddOn();
        // PWindow.getMain().add(highChartsStackedColumnAddOn);
        // highChartsStackedColumnAddOn.setSeries("");

        // final HighChartsStackedColumnAddOn h2 = new
        // HighChartsStackedColumnAddOn();
        // a.add(h2);
        // h2.setSeries("");
        // final PElementAddOn elementAddOn2 = new PElementAddOn();
        // elementAddOn2.setInnerText("Coucou dans window");
        // a.add(elementAddOn2);
    }

    private void testNewGrid() {
        final AtomicInteger i = new AtomicInteger();

        final DataGrid<Integer> grid = new DataGrid<>();

        for (int cpt = 0; cpt < 20; cpt++) {
            final ColumnDescriptor<Integer> column = new ColumnDescriptor<>();
            final PAnchor anchor = Element.newPAnchor("Header " + i.incrementAndGet());
            anchor.addClickHandler(e -> grid.removeColumn(column));
            column.setCellRenderer(new PLabelCellRenderer<>(from -> a + ""));
            column.setHeaderRenderer(() -> anchor);
            grid.addColumnDescriptor(column);
        }
        final PTextBox textBox = Element.newPTextBox();

        //        final PButton add = Element.newPButton("add");
        //        add.addClickHandler(e -> grid.setData(Integer.valueOf(textBox.getText())));
        //        PWindow.getMain().add(add);

        PWindow.getMain().add(textBox);
        PWindow.getMain().add(grid);

        /**
         * PScheduler.scheduleAtFixedRate(() -> { grid.setData((int)
         * (Math.random() * 50)); grid.removeData((int) (Math.random() * 50));
         * grid.removeColumn(grid.getColumns().get((int) (Math.random() *
         * grid.getColumns().size() - 1)));
         *
         * final ColumnDescriptor<Integer> column = new ColumnDescriptor<>();
         * final PAnchor anchor = new PAnchor("Header " + id.incrementAndGet());
         * anchor.addClickHandler(click -> grid.removeColumn(column));
         * column.setCellRenderer(new PLabelCellRenderer<>(from -> (int)
         * (Math.random() * 1000) + "")); column.setHeaderRenderer(() ->
         * anchor); grid.addColumnDescriptor(column); },
         * Duration.ofMillis(2000));
         **/
    }

    private void createNewEvent() {
        final EventHandler<PClickEvent> handler = UIContext.getNewEventBus().subscribe(PClickEvent.class,
            event -> System.err.println("B " + event));
        UIContext.getNewEventBus().post(new PClickEvent(this));
        UIContext.getNewEventBus().post(new PClickEvent(this));
        UIContext.getNewEventBus().unsubscribe(handler);
        UIContext.getNewEventBus().post(new PClickEvent(this));
    }

    private static final class Data {

        protected Integer key;
        protected String value;

        public Data(final Integer key, final String value) {
            this.key = key;
            this.value = value;
        }
    }

    private RefreshableDataGrid<Integer, Data> createGrid() {
        final AbstractGridWidget listView = new GridTableWidget();
        listView.setStyleProperty("table-layout", "fixed");
        final RefreshableDataGrid<Integer, Data> grid = new RefreshableDataGrid<>(listView);

        final DataGridColumnDescriptor<Data, Data> columnDescriptor1 = new DataGridColumnDescriptor<>();
        columnDescriptor1.setCellRenderer(new CellRenderer<UISampleEntryPoint.Data, PLabel>() {

            @Override
            public void update(final Data value, final Cell<Data, PLabel> current) {
                current.getWidget().setText(value.key + "");
            }

            @Override
            public PLabel render(final int row, final Data value) {
                return Element.newPLabel(value.key + "");
            }
        });
        columnDescriptor1.setHeaderCellRenderer(() -> Element.newPLabel("A"));
        columnDescriptor1.setValueProvider(new IdentityValueProvider<>());
        grid.addDataGridColumnDescriptor(columnDescriptor1);
        grid.addDataGridColumnDescriptor(columnDescriptor1);
        grid.addDataGridColumnDescriptor(columnDescriptor1);
        grid.addDataGridColumnDescriptor(columnDescriptor1);
        grid.addDataGridColumnDescriptor(columnDescriptor1);
        grid.addDataGridColumnDescriptor(columnDescriptor1);
        grid.addDataGridColumnDescriptor(columnDescriptor1);

        for (int i = 0; i < 40; i++) {

            final DataGridColumnDescriptor<Data, Data> columnDescriptor3 = new DataGridColumnDescriptor<>();
            columnDescriptor3.setCellRenderer(new CellRenderer<UISampleEntryPoint.Data, PLabel>() {

                @Override
                public void update(final Data value, final Cell<Data, PLabel> current) {
                    current.getWidget().setText(value.value);
                }

                @Override
                public PLabel render(final int row, final Data value) {
                    return Element.newPLabel(value.value);
                }
            });
            columnDescriptor3.setHeaderCellRenderer(() -> Element.newPLabel("B"));
            columnDescriptor3.setValueProvider(new IdentityValueProvider<>());
            grid.addDataGridColumnDescriptor(columnDescriptor3);
        }

        grid.setData(0, 1, new Data(1, "AA"));
        grid.setData(1, 2, new Data(2, "BB"));
        final Data data = new Data(3, "CC");
        grid.setData(2, 3, data);

        final AtomicInteger i = new AtomicInteger();
        PScheduler.scheduleWithFixedDelay(() -> {
            for (int key = 1; key < 50; key++) {
                grid.setData(key - 1, key, new Data(key, "" + i.incrementAndGet()));
            }
        }, Duration.ofSeconds(1), Duration.ofMillis(100));

        return grid;
    }

    private void testUIDelegator() {
        final PLabel a = Element.newPLabel();
        PWindow.getMain().add(a);
        final AtomicInteger ai = new AtomicInteger();
        PScheduler.scheduleAtFixedRate(() -> a.setText("a " + ai.incrementAndGet()), Duration.ofMillis(0), Duration.ofMillis(10));

        final PLabel p = Element.newPLabel();
        PWindow.getMain().add(p);
    }

    private PWindow createWindow() {
        final PWindow w = Element.newPWindow("Window 1", "resizable=yes,location=0,status=0,scrollbars=0");

        // PScript.execute(w, "alert('coucou Window1');");
        PScript.execute(w, "console.log('coucou Window1');");

        final PFlowPanel windowContainer = Element.newPFlowPanel();
        w.add(windowContainer);

        final PLabel child = Element.newPLabel("Window 1");
        child.setText("Modified Window 1");
        windowContainer.add(child);

        final PButton button = Element.newPButton("Modified main label on main window");
        windowContainer.add(button);
        button.addClickHandler(event -> {
            mainLabel.setText("Touched by God : " + child.getWindow());
            PScript.execute(PWindow.getMain(), "alert('coucou');");
            child.setText("Clicked Window 1");
        });
        windowContainer.add(button);

        final AtomicInteger i = new AtomicInteger();

        final PButton button1 = Element.newPButton("Open linked window");
        windowContainer.add(button1);
        button1.addClickHandler(event -> {
            final PWindow newPWindow = Element.newPWindow(w, "Sub Window 1 " + i.incrementAndGet(),
                "resizable=yes,location=0,status=0,scrollbars=0");
            newPWindow.add(Element.newPLabel("Sub window"));
            newPWindow.open();
        });

        final PButton button2 = Element.newPButton("Open not linked window");
        windowContainer.add(button2);
        button2.addClickHandler(event -> {
            final PWindow newPWindow = Element.newPWindow("Not Sub Window 1 " + i.incrementAndGet(),
                "resizable=yes,location=0,status=0,scrollbars=0");
            newPWindow.add(Element.newPLabel("Sub window"));
            newPWindow.open();
        });

        PScheduler.scheduleAtFixedRate(() -> {
            final PLabel label = Element.newPLabel();
            label.setText("Window 1 " + i.incrementAndGet());
            windowContainer.add(label);
            windowContainer.add(Element.newPCheckBox("Checkbox"));
        }, Duration.ofSeconds(1), Duration.ofSeconds(10));

        final PFrame frame = Element.newPFrame("http://localhost:8081/sample/");
        frame.add(Element.newPLabel("Inside the frame"));
        w.add(frame);

        return w;
    }

    @Override
    public void onUserLoggedOut(final UserLoggedOutEvent event) {
        UIContext.get().close();
    }

    private static final PStackLayoutPanel createStackLayoutPanel() {
        final PStackLayoutPanel child = Element.newPStackLayoutPanel(PUnit.CM);
        child.add(Element.newPLabel("Text"), "Text", false, 1.0);
        return child;
    }

    private static final PListBox createListBox() {
        final PListBox pListBox = Element.newPListBox(true);
        pListBox.addItem("A");
        pListBox.addItem("B");
        pListBox.insertItem("C", 1);
        pListBox.addItemsInGroup("sport", "Baseball", "Basketball", "Football", "Hockey", "Water Polo");
        return pListBox;
    }

    private static final PTabLayoutPanel createTabLayoutPanel() {
        final PTabLayoutPanel child = Element.newPTabLayoutPanel();
        child.add(Element.newPLabel("text"), "text");
        return child;
    }

    private static final PMenuBar createMenu() {
        final PMenuBar pMenuBar = Element.newPMenuBar(true);
        pMenuBar.addItem(Element.newPMenuItem("Menu 1", Element.newPMenuBar()));
        pMenuBar.addItem(Element.newPMenuItem("Menu 2", true, Element.newPMenuBar()));
        pMenuBar.addItem(Element.newPMenuItem("Menu 3", () -> System.err.println("Menu click")));
        pMenuBar.addSeparator();
        return pMenuBar;
    }

    private static final PFlowPanel createPFlowPanel() {
        final PFlowPanel panel1 = Element.newPFlowPanel();
        panel1.setAttribute("id", "panel1");
        final PFlowPanel panel2_1 = Element.newPFlowPanel();
        panel2_1.setAttribute("id", "panel2_1");
        final PFlowPanel panel3_1_1 = Element.newPFlowPanel();
        panel3_1_1.setAttribute("id", "panel3_1_1");
        final PFlowPanel panel3_1_2 = Element.newPFlowPanel();
        panel3_1_2.setAttribute("id", "panel3_1_2");
        final PFlowPanel panel2_2 = Element.newPFlowPanel();
        panel2_2.setAttribute("id", "panel2_2");
        final PFlowPanel panel3_2_1 = Element.newPFlowPanel();
        panel3_2_1.setAttribute("id", "panel3_2_1");
        final PFlowPanel panel3_2_2 = Element.newPFlowPanel();
        panel3_2_2.setAttribute("id", "panel3_2_2");

        panel1.add(panel2_1);
        panel2_1.add(panel3_1_1);
        panel2_1.add(panel3_1_2);
        panel1.add(panel2_2);
        panel2_2.add(panel3_2_1);
        panel2_2.add(panel3_2_2);

        return panel1;
    }

    private static final PWidget createBlock(final PWidget child) {
        final PFlowPanel panel = Element.newPFlowPanel();
        panel.add(child);
        return panel;
    }

    private static final PDockLayoutPanel createDockLayoutPanel() {
        final PDockLayoutPanel pDockLayoutPanel = Element.newPDockLayoutPanel(PUnit.CM);
        pDockLayoutPanel.addNorth(Element.newPLabel("LabelDock"), 1.5);
        return pDockLayoutPanel;
    }

    private static final PFlowPanel createDateBox() {
        final PFlowPanel flowPanel = Element.newPFlowPanel();
        final PDateBox dateBox = Element.newPDateBox();
        dateBox.setValue(new Date(0));
        flowPanel.add(dateBox);
        final PButton button = Element.newPButton("reset");
        button.addClickHandler(event -> dateBox.setValue(null));
        flowPanel.add(button);
        return flowPanel;
    }

    private static final LoggerAddOn createPAddOn() {
        final LoggerAddOn labelPAddOn = new LoggerAddOn();
        labelPAddOn.log("addon logger test");

        labelPAddOn.setAjaxHandler((req, resp) -> {
            final String header = req.getHeader("info");

            if (header.equals("Get Data")) {
                resp.setStatus(HttpServletResponse.SC_OK);
                resp.setContentType("application/json");
                resp.getWriter().print("{\"response\": \"" + header + "\"}");
                resp.getWriter().flush();
            } else {
                resp.sendError(500);
            }
        });

        labelPAddOn.setTerminalHandler(event -> System.err.println(event.toString()));

        return labelPAddOn;
    }

    private static final PTextBox createPTextBox() {
        final PTextBox pTextBox = Element.newPTextBox();

        pTextBox.addKeyUpHandler(new PKeyUpHandler() {

            @Override
            public void onKeyUp(final PKeyUpEvent keyUpEvent) {
                PScript.execute(PWindow.getMain(), "alert('" + keyUpEvent + "');");
            }

            @Override
            public PKeyCodes[] getFilteredKeys() {
                return new PKeyCodes[] { PKeyCodes.ENTER };
            }
        });
        return pTextBox;
    }

    private static final PTree createTree() {
        final PTree tree = Element.newPTree();

        final PTreeItem firstFolder = tree.add("First");
        firstFolder.add("2");
        firstFolder.add(0, Element.newPTreeItem("1"));

        firstFolder.setState(true);

        final PTreeItem secondFolder = Element.newPTreeItem("Second");
        final PTreeItem subItem = secondFolder.add(Element.newPTreeItem());
        subItem.setText("3");
        secondFolder.add(Element.newPTreeItem(Element.newPLabel("4")));
        tree.add(secondFolder);

        secondFolder.setSelected(true);

        return tree;
    }

    private static final PAbsolutePanel createAbsolutePanel() {
        final PAbsolutePanel pAbsolutePanel = Element.newPAbsolutePanel();
        pAbsolutePanel.add(Element.newDiv());
        pAbsolutePanel.add(Element.newP());
        return pAbsolutePanel;
    }

    private static final PButton createButton() {
        final PButton pButton = Element.newPButton("Button 1");
        pButton.addClickHandler(handler -> pButton.setText("Button 1 clicked"));
        return pButton;
    }

    class Pojo {

        public String security;
        public String classe;
        public Double bid;
        public Double offer;
        public Double spread;
        public String coucou;
        public String coucou1;
        public String coucou2;
        public String coucou3;
        public String coucou4;
        public String coucou5;
        public String coucou6;
        public String coucou7;
        public String coucou8;
        public String coucou9;
        public String coucou10;

        /**
         * @return the security
         */
        public String getSecurity() {
            return security;
        }

        /**
         * @param security
         *            the security to set
         */
        public void setSecurity(final String security) {
            this.security = security;
        }

        /**
         * @return the classe
         */
        public String getClasse() {
            return classe;
        }

        /**
         * @param classe
         *            the classe to set
         */
        public void setClasse(final String classe) {
            this.classe = classe;
        }

        /**
         * @return the bid
         */
        public Double getBid() {
            return bid;
        }

        /**
         * @param bid
         *            the bid to set
         */
        public void setBid(final Double bid) {
            this.bid = bid;
        }

        /**
         * @return the offer
         */
        public Double getOffer() {
            return offer;
        }

        /**
         * @param offer
         *            the offer to set
         */
        public void setOffer(final Double offer) {
            this.offer = offer;
        }

        /**
         * @return the spread
         */
        public Double getSpread() {
            return spread;
        }

        /**
         * @param spread
         *            the spread to set
         */
        public void setSpread(final Double spread) {
            this.spread = spread;
        }

        /**
         * @return the coucou
         */
        public String getCoucou() {
            return coucou;
        }

        /**
         * @param coucou
         *            the coucou to set
         */
        public void setCoucou(final String coucou) {
            this.coucou = coucou;
        }

        /**
         * @return the coucou1
         */
        public String getCoucou1() {
            return coucou1;
        }

        /**
         * @param coucou1
         *            the coucou1 to set
         */
        public void setCoucou1(final String coucou1) {
            this.coucou1 = coucou1;
        }

        /**
         * @return the coucou2
         */
        public String getCoucou2() {
            return coucou2;
        }

        /**
         * @param coucou2
         *            the coucou2 to set
         */
        public void setCoucou2(final String coucou2) {
            this.coucou2 = coucou2;
        }

        /**
         * @return the coucou3
         */
        public String getCoucou3() {
            return coucou3;
        }

        /**
         * @param coucou3
         *            the coucou3 to set
         */
        public void setCoucou3(final String coucou3) {
            this.coucou3 = coucou3;
        }

        /**
         * @return the coucou4
         */
        public String getCoucou4() {
            return coucou4;
        }

        /**
         * @param coucou4
         *            the coucou4 to set
         */
        public void setCoucou4(final String coucou4) {
            this.coucou4 = coucou4;
        }

    }

}
