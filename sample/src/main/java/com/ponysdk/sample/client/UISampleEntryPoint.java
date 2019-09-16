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

import com.ponysdk.core.server.application.UIContext;
import com.ponysdk.core.ui.main.EntryPoint;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PHTMLAnchorElement;
import com.ponysdk.core.ui2.PHTMLAreaElement;
import com.ponysdk.core.ui2.PHTMLBRElement;
import com.ponysdk.core.ui2.PHTMLBodyElement;
import com.ponysdk.core.ui2.PHTMLButtonElement;
import com.ponysdk.core.ui2.PHTMLDivElement;
import com.ponysdk.core.ui2.PHTMLH2Element;
import com.ponysdk.core.ui2.PHTMLImageElement;
import com.ponysdk.core.ui2.PHTMLInputElement;
import com.ponysdk.core.ui2.PHTMLLabelElement;
import com.ponysdk.core.ui2.PHTMLMapElement;
import com.ponysdk.core.ui2.PHTMLSourceElement;
import com.ponysdk.core.ui2.PHTMLSpanElement;
import com.ponysdk.core.ui2.PHTMLTableElement;
import com.ponysdk.core.ui2.PHTMLTableRowElement;
import com.ponysdk.core.ui2.PHTMLTextAreaElement;
import com.ponysdk.core.ui2.PHTMLThElement;
import com.ponysdk.core.ui2.PHTMLTrackElement;
import com.ponysdk.core.ui2.PHTMLVideoElement;
import com.ponysdk.core.ui2.PMouseEvent;
import com.ponysdk.core.ui2.PSVGAnimateElement;
import com.ponysdk.core.ui2.PSVGCircleElement;
import com.ponysdk.core.ui2.PSVGPolygonElement;
import com.ponysdk.core.ui2.PSVGRectElement;
import com.ponysdk.core.ui2.PSVGSVGElement;
import com.ponysdk.core.ui2.PVTTCue;
import com.ponysdk.core.ui2.PWheelEvent;
import com.ponysdk.core.ui2.PWindow2;
import com.ponysdk.sample.client.event.UserLoggedOutEvent;
import com.ponysdk.sample.client.event.UserLoggedOutHandler;

public class UISampleEntryPoint implements EntryPoint, UserLoggedOutHandler {

    @Override
    public void start(final UIContext uiContext) {

        final PHTMLBodyElement pBody = PWindow2.getMain().getBody();

        final PHTMLH2Element pH2 = new PHTMLH2Element();
        final PHTMLSpanElement pSpan0 = new PHTMLSpanElement();
        final PHTMLLabelElement pLabel0 = new PHTMLLabelElement();
        final PHTMLBRElement pBr0 = new PHTMLBRElement();
        final PHTMLBRElement pBr1 = new PHTMLBRElement();
        final PHTMLBRElement pBr2 = new PHTMLBRElement();
        final PHTMLBRElement pBr3 = new PHTMLBRElement();
        final PHTMLBRElement pBr5 = new PHTMLBRElement();

        final PHTMLInputElement pInput0 = new PHTMLInputElement();

        final PHTMLLabelElement pLabel1 = new PHTMLLabelElement();
        final PHTMLInputElement pInput1 = new PHTMLInputElement();

        final PHTMLTextAreaElement pTextArea2 = new PHTMLTextAreaElement();

        final PHTMLImageElement pImage = new PHTMLImageElement();

        final PHTMLAnchorElement pAnchor = new PHTMLAnchorElement();

        final PHTMLBRElement pBr4 = new PHTMLBRElement();

        final PHTMLInputElement pInput4 = new PHTMLInputElement();

        final PHTMLVideoElement pVideo = new PHTMLVideoElement();

        final PHTMLSourceElement pSource = new PHTMLSourceElement();

        final PHTMLTableElement pTable = new PHTMLTableElement();
        final PHTMLTableRowElement pRow1 = new PHTMLTableRowElement();

        final PHTMLThElement pTh1 = new PHTMLThElement();

        final PHTMLThElement pTh2 = new PHTMLThElement();

        final PHTMLThElement pTh3 = new PHTMLThElement();

        final PHTMLTableRowElement pRow2 = new PHTMLTableRowElement();

        final PHTMLThElement pTh4 = new PHTMLThElement();

        final PHTMLThElement pTh5 = new PHTMLThElement();

        final PHTMLThElement pTh6 = new PHTMLThElement();

        final PHTMLButtonElement pButton1 = new PHTMLButtonElement();

        final PHTMLInputElement pInput3 = new PHTMLInputElement();

        final PHTMLDivElement pDiv1 = new PHTMLDivElement();

        final PHTMLMapElement pMap = new PHTMLMapElement();
        final PHTMLAreaElement pArea1 = new PHTMLAreaElement();
        final PHTMLAreaElement pArea2 = new PHTMLAreaElement();

        pMap.setName("infographic");
        pArea1.setShape("circle");
        pArea1.setCoords("75,75,75");
        pArea1.setHref("https://www.smart-trade.net/");

        pArea2.setShape("circle");
        pArea2.setCoords("475,75,75");
        pArea2.setHref("https://www.linkedin.com/company/smart-trade-technologies");

        pTh2.setInnerHTML("LastName");

        pTh1.setInnerHTML("FirstName");

        pTh3.setInnerHTML("Age");

        pTh4.setInnerHTML("Jill");

        pTh5.setInnerHTML("Smith");

        pTh6.setInnerHTML("50");

        pInput4.setValue("I am an input. Mouse up me. You will se a video.");
        pButton1.setInnerHTML("I am a nice button, wheel on me!");
        pLabel1.setInnerHTML("KO");
        pInput1.setType("radio");

        pLabel0.setInnerHTML("OK");
        pInput0.setType("radio");
        pH2.setInnerHTML("This is a first demo of stage Pony by Hien Le, tutor Amine Bagdouri.");
        pSpan0.setInnerHTML("What do you think about this version of PonySDK? ");
        pImage.setUseMap("#infographic");
        pImage.setSrc("https://singledealerplatforms.files.wordpress.com/2015/07/new-html5-spotstream-gui.png");
        pImage.setAlt("MDN infographic");

        pAnchor.setHref("https://heycam.github.io/webidl/");
        pAnchor.setTitle("Titre du lien");
        pAnchor.setInnerHTML(
            "I am a Anchor element HTML. Click me, you see the page web idl, the source we used for generate our project.");

        pVideo.setControls(true);
        pVideo.setWidth(250.00);

        pTable.add(pRow1);
        pTable.add(pRow2);

        pRow1.add(pTh1);
        pRow1.add(pTh2);
        pRow1.add(pTh3);
        pRow2.add(pTh4);
        pRow2.add(pTh5);
        pRow2.add(pTh6);

        final PHTMLTextAreaElement pTextArea = new PHTMLTextAreaElement();

        //final PHTMLBodyElement pBodyxxx = new PHTMLBodyElement();

        //        final PHTMLButtonElement pButtonxxx = new PHTMLButtonElement();
        //        pBodyxxx.add(pButtonxxx);
        //        pBodyxxx.setId("newBody");
        // PWindow2.getMain().getHtml().add(pBodyxxx);
        pBody.add(pH2);
        pBody.add(pBr0);
        pBody.add(pSpan0);
        pBody.add(pBr5);
        pBody.add(pLabel0);
        pBody.add(pInput0);
        pBody.add(pBr1);
        pBody.add(pLabel1);
        pBody.add(pInput1);
        pBody.add(pBr2);
        pBody.add(pDiv1);
        pBody.add(pAnchor);
        pBody.add(pBr3);
        pBody.add(pInput4);
        pBody.add(pBr4);
        pBody.add(pButton1);
        pBody.add(pMap);
        pBody.add(pTable);
        pBody.add(pTextArea);

        pTextArea.setAttribute("style", "overflow-y: scroll; height:400px;");
        pMap.add(pArea1);
        pMap.add(pArea2);

        pVideo.add(pSource);
        pSource.setSrc("https://interactive-examples.mdn.mozilla.net/media/examples/flower.webm");
        pSource.setType("video/webm");

        pTextArea.setValue("the second baby of pmap is " + pMap.getChildren(1) + "\n" + "hihihaah");

        //        pInput4.setOnchange(event -> {
        //            pBody.add(pTable);
        //            // pInput4.setValue("type of evvent:  " + event.getType());
        //        });

        pButton1.setOnwheel(event -> {
            pBody.add(pBr0);
            pBody.add(pTextArea2);
            pBody.add(pImage);
            pTextArea2.setRows(2.5);
            //pTextArea2.setInnerHTML("\u00e9");
            pTextArea2.setInnerHTML("\u00e9"
                    + "You click on area EURUSD of the image, you see a cercle. Do same thing on area USDJPY. Back in the old days a computer had a single CPU, and was only capable of executing a single program at a time. Later came multitasking which meant that computers could execute multiple programs (AKA tasks or processes) at the same time. It wasn't really \"at the same time\" though. The single CPU was shared between the programs. The operating system would switch between the programs running, executing each of them for a little while before switching.\n"
                    + "\n"
                    + "Along with multitasking came new challenges for software developers. Programs can no longer assume to have all the CPU time available, nor all memory or any other computer resources. A \"good citizen\" program should release all resources it is no longer using, so other programs can use them."
                    + "Dans les locaux de l'Union nationale des propriétaires immobiliers (UNPI), où les appels des adhérents se multiplient ces dernières semaines, on assure que l'ampleur du phénomène est particulièrement marquée cette année. « Nous recevons beaucoup plus d'appels et de courriers que les autres années, note Christophe Demerson, le président de l'UNPI. Certains propriétaires ne comprennent pas l'augmentation prévue car ils n'ont fait aucuns travaux depuis des années ! »"
                    + ((PWheelEvent) event).getPath()[1].getClass().getCanonicalName());

        }, PEventAttributesName.PATH);

        pInput4.setOnmouseup(event -> {
            pBody.add(pVideo);
            pInput4.setValue("event ClientX:" + ((PMouseEvent) event).getClientX() + ((PMouseEvent) event).getType());
        }, PEventAttributesName.CLIENTX, PEventAttributesName.TYPE, PEventAttributesName.PATH);

        pInput0.setOnclick(event -> {
            pLabel0.setInnerHTML("Thank you for your apreciation");
            pLabel1.setInnerHTML("");
        });

        pInput1.setOnclick(event -> {
            pLabel1.setInnerHTML("Thank you, we will improve it.");
            pLabel0.setInnerHTML("");
        });

        pMap.setName("infographic");

        pInput3.setValue("Report to do");
        pDiv1.setTitle("PonySDK");
        final PHTMLBodyElement body = new PHTMLBodyElement();
        PWindow2.getMain().getHtml().add(body);

        final PHTMLInputElement pInput5 = new PHTMLInputElement();
        pInput5.setValue("Report to finish before 15/08");

        final PVTTCue pCue = new PVTTCue(2.0, 3.0, "\u00e9" + " Cool text to be displayed");
        final PHTMLVideoElement pVideo1 = new PHTMLVideoElement();
        final PHTMLSourceElement pSource1 = new PHTMLSourceElement();
        pSource1.setSrc("http://media.w3.org/2010/05/sintel/trailer.mp4");
        pSource1.setType("video/mp4");
        final PHTMLTrackElement pTrack1 = new PHTMLTrackElement();
        pTrack1.setSrc("sintel.vtt");
        pTrack1.setKind("captions");
        pTrack1.setLabel("English");
        pTrack1.setSrclang("en");
        pTrack1.setDefault(true);
        pBody.add(pVideo1);
        pVideo1.add(pSource1);
        pVideo1.setControls(true);
        pVideo1.setWidth(500.00);
        pVideo1.add(pTrack1);

        pCue.attach(PWindow2.getMain());

        //final PWebSocket ws = new PWebSocket("ws://echo.websocket.org");

        final PWindow2 myWindow0 = new PWindow2();

        final PHTMLButtonElement pButton = new PHTMLButtonElement();
        pBody.add(pButton);
        pButton.setInnerHTML("click me to open un nouveau window");
        myWindow0.getBody().add(pInput3);
        myWindow0.open();
        //ws.attach(myWindow0);

        final PWindow2 myWindow1 = new PWindow2(myWindow0);
        myWindow1.getBody().add(pInput5);
        myWindow1.open();
        pButton.setOnclick(event -> {
            myWindow0.open();
            pInput3.setValue("Oke, it is not problem");
        });

        //        pTable.setOnclick(event -> {
        //            pCaption.setInnerHTML("Table of good employed");
        //            pTable.setCaption(pCaption);
        //
        //        });
        //        pRow1.click();

        pBody.contains(result -> {
            pInput4.setValue("can i get result" + result.toString());
        }, pButton);

        //        pAnimate.getStartTime(result -> pInput4.setValue("can i get result: " + result.toString()));
        //        pAnimate.getCurrentTime(result -> pInput3.setValue("ok, it is not problem" + result));
        pInput4.remove1();
        pInput4.remove1();
        pInput4.remove1();
        pTable.remove1();

        //        final PHTMLTableCaptionElement pCaption = new PHTMLTableCaptionElement();
        //        pCaption.setInnerHTML("Table of employed");
        //        pCaption.attach(PWindow2.getMain());
        //        pTable.setCaption(pCaption);

        final PSVGSVGElement pSvg = new PSVGSVGElement();
        pBody.add(pSvg);
        final PSVGRectElement pSvgRect = new PSVGRectElement();
        final PSVGCircleElement pSvgCircle = new PSVGCircleElement();
        pSvg.add(pSvgRect);
        pSvg.add(pSvgCircle);
        pSvgRect.setAttributeNS("", "x", "0");
        pSvgRect.setAttributeNS("", "y", "0");
        pSvgRect.setAttributeNS("", "width", "300");
        pSvgRect.setAttributeNS("", "height", "100");
        pSvgRect.setAttributeNS("", "stroke", "black");
        pSvgRect.setAttributeNS("", "stroke-width", "1");
        pSvgCircle.setAttributeNS("", "cx", "0");
        pSvgCircle.setAttributeNS("", "cy", "50");
        pSvgCircle.setAttributeNS("", "r", "15");
        pSvgCircle.setAttributeNS("", "fill", "green");
        pSvgCircle.setAttributeNS("", "stroke", "none");
        final PSVGAnimateElement pAnimate = new PSVGAnimateElement();
        pSvgCircle.add(pAnimate);
        pAnimate.setAttributeNS("", "attributeName", "cx");
        pAnimate.setAttributeNS("", "from", "5");
        pAnimate.setAttributeNS("", "to", "100");
        // pAnimate.setAttributeNS("", "begin", "0s");
        pAnimate.setAttributeNS("", "dur", "10s");
        pAnimate.setAttributeNS("", "fill", "remove");
        pAnimate.setAttributeNS("", "repeatCount", "indefinite");

        final PSVGPolygonElement polygon = new PSVGPolygonElement();
        pSvg.add(polygon);
        pSvg.setAttributeNS("", "width", "300");
        pSvg.setAttributeNS("", "height", "200");
        polygon.setAttributeNS("", "points", "100,10 40,198 190,78 10,78 160,198");
        polygon.setAttributeNS("", "style", "fill:lime;stroke:purple;stroke-width:5;fill-rule:evenodd;");
    }

    @Override
    public void onUserLoggedOut(final UserLoggedOutEvent event) {
    }
}

//    private void testVisibilityHandler(final PWindow window) {
//        final PLabel liveVisibility = Element.newPLabel("Live Visibility : Unknown");
//        window.add(liveVisibility);
//
//        final PInput input = Element.newPInput("Check Enjoy");
//
//        window.add(input);
//
//        final PButton buttonTest = Element.newPButton("Check Input");
//        window.add(buttonTest);
//
//        final PButton button = Element.newPButton("Check visibility!!!");
//        window.add(button);
//
//        final PLabel visibilityLabel = Element.newPLabel("Visibility : Unknown");
//        window.add(visibilityLabel);
//
//        final PScrollPanel frame = Element.newPScrollPanel();
//        frame.setHeight("200px");
//        frame.setWidth("300px");
//        window.add(frame);
//
//        final PFlowPanel panel = Element.newPFlowPanel();
//        panel.setHeight("2000px");
//        frame.add(panel);
//
//        final PFlowPanel subPanel = Element.newPFlowPanel();
//        subPanel.setStyleProperty("backgroundColor", "red");
//        subPanel.setHeight("125px");
//        subPanel.setWidth("200px");
//        panel.add(subPanel);
//
//        final PLabel label = Element.newPLabel("Increment : " + a++);
//        subPanel.add(label);
//
//        PScheduler.scheduleAtFixedRate(() -> {
//            a++;
//            if (subPanel.isShown() && subPanel.getWindow().isShown()) updateLabel(label, String.valueOf(a));
//        }, Duration.ofSeconds(1));
//
//        subPanel.getWindow().addVisibilityHandler(event -> {
//            if (event.getData()) {
//                System.err.println("Force refresh, because window became visible");
//                updateLabel(label, String.valueOf(a));
//            } else {
//                System.err.println("Window became not visible");
//            }
//        });
//
//        liveVisibility.setText("Live Visibility : " + subPanel.isShown());
//        //visibilityLabel.setText("Visibility : " + subPanel.isShown());
//        subPanel.addVisibilityHandler(event -> {
//            liveVisibility.setText("Live Visibility : " + event.getData());
//            if (event.getData()) {
//                System.err.println("Force refresh, because panel became visible");
//                updateLabel(label, String.valueOf(a));
//            }
//        });
//        button.addClickHandler(event -> visibilityLabel.setText("Visibility : " + subPanel.isShown()));
//
//    }
//
//    private static void updateLabel(final PLabel label, final String text) {
//        System.out.println("Update label " + text);
//        label.setText("Increment : " + text);
//    }
//
//    private void createFunctionalLabel() {
//        final TextFunction textFunction = new TextFunction(args -> {
//            System.out.println(args[0] + " " + args[1]);
//            return (String) args[0];
//        }, "console.log(args[0] + \" \" + args[1]); return args[0];");
//        final PFunctionalLabel newPFunctionalLabel = Element.newPFunctionalLabel(textFunction);
//        PWindow.getMain().add(newPFunctionalLabel);
//        newPFunctionalLabel.setArgs("A", "B");
//    }
//
//    public PFlowPanel createPFileUpload() {
//        final PFlowPanel panel = Element.newPFlowPanel();
//        final PFileUpload fileUpload = Element.newPFileUpload();
//        fileUpload.setName("file");
//        panel.add(fileUpload);
//        fileUpload.addChangeHandler(event -> {
//            final PFileUpload pFileUpload = (PFileUpload) event.getSource();
//            System.out.println("File name : " + pFileUpload.getFileName());
//            System.out.println("File size : " + pFileUpload.getFileSize() + " bytes");
//        });
//        fileUpload.addStreamHandler((request, response, context) -> {
//            try {
//                final List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
//                for (final FileItem item : items) {
//                    if (!item.isFormField()) readFileItem(item);
//                }
//            } catch (final Exception e) {
//                e.printStackTrace();
//            }
//        });
//        final PButton button = Element.newPButton("Submit");
//        button.addClickHandler(event -> fileUpload.submit());
//        panel.add(button);
//        return panel;
//    }
//
//    private void readFileItem(final FileItem item) throws IOException, FileNotFoundException {
//        // Store the uploaded file on the server (don't forget to remove)
//        final String fileName = FilenameUtils.getName(item.getName());
//        final InputStream fileContent = item.getInputStream();
//        final File uploadedFile = File.createTempFile(fileName, "fileUpload");
//        IOUtils.copy(fileContent, new FileOutputStream(uploadedFile));
//        uploadedFile.deleteOnExit();
//
//        // Read directly the input stream
//        final BufferedReader reader = new BufferedReader(new InputStreamReader(item.getInputStream(), "UTF-8"));
//        final StringBuilder value = new StringBuilder();
//        final char[] buffer = new char[1024];
//        for (int length = 0; (length = reader.read(buffer)) > 0;) {
//            value.append(buffer, 0, length);
//        }
//        System.out.println(value.toString());
//    }
//
//    private void testPerf() {
//        final PWindow w = Element.newPWindow("Window 1", "resizable=yes,location=0,status=0,scrollbars=0");
//        final List<PLabel> labels = new ArrayList<>(1000);
//
//        final PButton start = Element.newPButton("Start");
//        w.add(start);
//        start.addClickHandler(event -> scheduleUpdate(labels));
//
//        for (int i = 0; i < 1000; i++) {
//            final PLabel label = Element.newPLabel(counter + "-" + i);
//            labels.add(label);
//            w.add(label);
//        }
//
//        w.open();
//    }
//
//    private void scheduleUpdate(final List<PLabel> labels) {
//        PScheduler.schedule(() -> {
//            int i = 0;
//            counter++;
//            for (final PLabel label : labels) {
//                label.setText(counter + "-" + i);
//                i++;
//            }
//            if (counter < 20) scheduleUpdate(labels);
//            else counter = 0;
//        }, Duration.ofMillis(20));
//    }
//
//    private void createNewGridSystem() {
//        //        final DataGrid<Pojo> grid = new DataGrid<>((a, b) -> a.bid.compareTo(b.bid));
//
//        final Configuration<Pojo> configuration = new Configuration<>(Pojo.class);
//        //configuration.setFilter(method -> method.getName().contains("COUCOU"));
//
//        final DataGrid<Pojo> grid = new DynamicDataGrid<>(configuration, Comparator.comparing(Pojo::getBid));
//
//        PWindow.getMain().add(grid);
//
//        final Random random = new Random();
//
//        final Map<String, Pojo> map = new HashMap<>();
//
//        for (int i = 0; i < 40; i++) {
//            final Pojo pojo = new Pojo();
//            pojo.security = "security" + i;
//            pojo.classe = "class" + i;
//            pojo.bid = random.nextDouble() * i;
//            pojo.offer = random.nextDouble() * i;
//            pojo.spread = random.nextDouble() * i;
//            pojo.coucou = random.nextDouble() * i + "";
//            pojo.coucou1 = random.nextDouble() * i + "";
//            pojo.coucou2 = random.nextDouble() * i + "";
//            pojo.coucou3 = random.nextDouble() * i + "";
//            pojo.coucou4 = random.nextDouble() * i + "";
//            pojo.coucou5 = random.nextDouble() * i + "";
//            pojo.coucou6 = random.nextDouble() * i + "";
//            pojo.coucou7 = random.nextDouble() * i + "";
//            pojo.coucou8 = random.nextDouble() * i + "";
//            pojo.coucou9 = random.nextDouble() * i + "";
//            pojo.coucou10 = random.nextDouble() * i + "";
//            map.put("security" + i, pojo);
//            grid.addData(pojo);
//        }
//
//        Txn.get().flush();
//
//        PScheduler.scheduleAtFixedRate(() -> {
//            for (int i = 0; i < 40; i++) {
//                final Pojo pojo = map.get("security" + i);
//                grid.update(pojo, p -> {
//                    p.bid = random.nextDouble();
//                    p.offer = random.nextDouble();
//                    p.spread = random.nextDouble();
//                    return p;
//                });
//            }
//        }, Duration.ofMillis(300));
//    }
//
//    private void createReconnectingPanel() {
//        final PSimplePanel reconnectionPanel = Element.newPSimplePanel();
//        reconnectionPanel.setAttribute("id", "reconnection");
//        final PSimplePanel reconnectingPanel = Element.newPSimplePanel();
//        reconnectingPanel.setAttribute("id", "reconnecting");
//        reconnectionPanel.setWidget(reconnectingPanel);
//        PWindow.getMain().add(reconnectionPanel);
//    }
//
//    private void downloadFile() {
//        final PButton downloadImageButton = Element.newPButton("Download Pony image");
//        downloadImageButton.addClickHandler(event -> UIContext.get().stackStreamRequest((request, response, uiContext1) -> {
//            response.reset();
//            response.setContentType("image/png");
//            response.setHeader("Content-Disposition", "attachment; filename=pony_image.png");
//
//            try {
//                final OutputStream output = response.getOutputStream();
//                final InputStream input = getClass().getClassLoader().getResourceAsStream("images/pony.png");
//
//                final byte[] buff = new byte[1024];
//                while (input.read(buff) != -1) {
//                    output.write(buff);
//                }
//
//                output.flush();
//                output.close();
//            } catch (final IOException e) {
//                e.printStackTrace();
//            }
//        }));
//        PWindow.getMain().add(downloadImageButton);
//    }
//
//    private void testPAddon() {
//        final LoggerAddOn addon = createPAddOn();
//        addon.attach(PWindow.getMain());
//        addon.log(null);
//        addon.log("toto");
//
//        // final PElementAddOn elementAddOn = new PElementAddOn();
//        // elementAddOn.setInnerText("Coucou");
//        // flowPanel.add(elementAddOn);
//
//        // highChartsStackedColumnAddOn = new HighChartsStackedColumnAddOn();
//        // PWindow.getMain().add(highChartsStackedColumnAddOn);
//        // highChartsStackedColumnAddOn.setSeries("");
//
//        // final HighChartsStackedColumnAddOn h2 = new
//        // HighChartsStackedColumnAddOn();
//        // a.add(h2);
//        // h2.setSeries("");
//        // final PElementAddOn elementAddOn2 = new PElementAddOn();
//        // elementAddOn2.setInnerText("Coucou dans window");
//        // a.add(elementAddOn2);
//    }
//
//    private void testNewGrid() {
//        final AtomicInteger i = new AtomicInteger();
//
//        final DataGrid<Integer> grid = new DataGrid<>();
//
//        for (int cpt = 0; cpt < 20; cpt++) {
//            final ColumnDescriptor<Integer> column = new ColumnDescriptor<>();
//            final PAnchor anchor = Element.newPAnchor("Header " + i.incrementAndGet());
//            anchor.addClickHandler(e -> grid.removeColumn(column));
//            column.setCellRenderer(new PLabelCellRenderer<>(from -> a + ""));
//            column.setHeaderRenderer(() -> anchor);
//            grid.addColumnDescriptor(column);
//        }
//        final PTextBox textBox = Element.newPTextBox();
//
//        //        final PButton add = Element.newPButton("add");
//        //        add.addClickHandler(e -> grid.setData(Integer.valueOf(textBox.getText())));
//        //        PWindow.getMain().add(add);
//
//        PWindow.getMain().add(textBox);
//        PWindow.getMain().add(grid);
//
//        /**
//         * PScheduler.scheduleAtFixedRate(() -> { grid.setData((int)
//         * (Math.random() * 50)); grid.removeData((int) (Math.random() * 50));
//         * grid.removeColumn(grid.getColumns().get((int) (Math.random() *
//         * grid.getColumns().size() - 1)));
//         *
//         * final ColumnDescriptor<Integer> column = new ColumnDescriptor<>();
//         * final PAnchor anchor = new PAnchor("Header " + id.incrementAndGet());
//         * anchor.addClickHandler(click -> grid.removeColumn(column));
//         * column.setCellRenderer(new PLabelCellRenderer<>(from -> (int)
//         * (Math.random() * 1000) + "")); column.setHeaderRenderer(() ->
//         * anchor); grid.addColumnDescriptor(column); },
//         * Duration.ofMillis(2000));
//         **/
//    }
//
//    private void createNewEvent() {
//        final EventHandler<PClickEvent> handler = UIContext.getNewEventBus().subscribe(PClickEvent.class,
//            event -> System.err.println("B " + event));
//        UIContext.getNewEventBus().post(new PClickEvent(this));
//        UIContext.getNewEventBus().post(new PClickEvent(this));
//        UIContext.getNewEventBus().unsubscribe(handler);
//        UIContext.getNewEventBus().post(new PClickEvent(this));
//    }
//
//    private static final class Data {
//
//        protected Integer key;
//        protected String value;
//
//        public Data(final Integer key, final String value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//
//    private RefreshableDataGrid<Integer, Data> createGrid() {
//        final AbstractGridWidget listView = new GridTableWidget();
//        listView.setStyleProperty("table-layout", "fixed");
//        final RefreshableDataGrid<Integer, Data> grid = new RefreshableDataGrid<>(listView);
//
//        final DataGridColumnDescriptor<Data, Data> columnDescriptor1 = new DataGridColumnDescriptor<>();
//        columnDescriptor1.setCellRenderer(new CellRenderer<UISampleEntryPoint.Data, PLabel>() {
//
//            @Override
//            public void update(final Data value, final Cell<Data, PLabel> current) {
//                current.getWidget().setText(value.key + "");
//            }
//
//            @Override
//            public PLabel render(final int row, final Data value) {
//                return Element.newPLabel(value.key + "");
//            }
//        });
//        columnDescriptor1.setHeaderCellRenderer(() -> Element.newPLabel("A"));
//        columnDescriptor1.setValueProvider(new IdentityValueProvider<>());
//        grid.addDataGridColumnDescriptor(columnDescriptor1);
//        grid.addDataGridColumnDescriptor(columnDescriptor1);
//        grid.addDataGridColumnDescriptor(columnDescriptor1);
//        grid.addDataGridColumnDescriptor(columnDescriptor1);
//        grid.addDataGridColumnDescriptor(columnDescriptor1);
//        grid.addDataGridColumnDescriptor(columnDescriptor1);
//        grid.addDataGridColumnDescriptor(columnDescriptor1);
//
//        for (int i = 0; i < 40; i++) {
//
//            final DataGridColumnDescriptor<Data, Data> columnDescriptor3 = new DataGridColumnDescriptor<>();
//            columnDescriptor3.setCellRenderer(new CellRenderer<UISampleEntryPoint.Data, PLabel>() {
//
//                @Override
//                public void update(final Data value, final Cell<Data, PLabel> current) {
//                    current.getWidget().setText(value.value);
//                }
//
//                @Override
//                public PLabel render(final int row, final Data value) {
//                    return Element.newPLabel(value.value);
//                }
//            });
//            columnDescriptor3.setHeaderCellRenderer(() -> Element.newPLabel("B"));
//            columnDescriptor3.setValueProvider(new IdentityValueProvider<>());
//            grid.addDataGridColumnDescriptor(columnDescriptor3);
//        }
//
//        grid.setData(0, 1, new Data(1, "AA"));
//        grid.setData(1, 2, new Data(2, "BB"));
//        final Data data = new Data(3, "CC");
//        grid.setData(2, 3, data);
//
//        final AtomicInteger i = new AtomicInteger();
//        PScheduler.scheduleWithFixedDelay(() -> {
//            for (int key = 1; key < 50; key++) {
//                grid.setData(key - 1, key, new Data(key, "" + i.incrementAndGet()));
//            }
//        }, Duration.ofSeconds(1), Duration.ofMillis(100));
//
//        return grid;
//    }
//
//    private void testUIDelegator() {
//        final PLabel a = Element.newPLabel();
//        PWindow.getMain().add(a);
//        final AtomicInteger ai = new AtomicInteger();
//        PScheduler.scheduleAtFixedRate(() -> a.setText("a " + ai.incrementAndGet()), Duration.ofMillis(0), Duration.ofMillis(10));
//
//        final PLabel p = Element.newPLabel();
//        PWindow.getMain().add(p);
//    }
//
//    private PWindow createWindow() {
//        final PWindow w = Element.newPWindow("Window 1", "resizable=yes,location=0,status=0,scrollbars=0");
//
//        // PScript.execute(w, "alert('coucou Window1');");
//        PScript.execute(w, "console.log('coucou Window1');");
//
//        final PFlowPanel windowContainer = Element.newPFlowPanel();
//        w.add(windowContainer);
//
//        final PLabel child = Element.newPLabel("Window 1");
//        child.setText("Modified Window 1");
//        windowContainer.add(child);
//
//        final PButton button = Element.newPButton("Modified main label on main window");
//        windowContainer.add(button);
//        button.addClickHandler(event -> {
//            mainLabel.setText("Touched by God : " + child.getWindow());
//            PScript.execute(PWindow.getMain(), "alert('coucou');");
//            child.setText("Clicked Window 1");
//        });
//        windowContainer.add(button);
//
//        final AtomicInteger i = new AtomicInteger();
//
//        final PButton button1 = Element.newPButton("Open linked window");
//        windowContainer.add(button1);
//        button1.addClickHandler(event -> {
//            final PWindow newPWindow = Element.newPWindow(w, "Sub Window 1 " + i.incrementAndGet(),
//                "resizable=yes,location=0,status=0,scrollbars=0");
//            newPWindow.add(Element.newPLabel("Sub window"));
//            newPWindow.open();
//        });
//
//        final PButton button2 = Element.newPButton("Open not linked window");
//        windowContainer.add(button2);
//        button2.addClickHandler(event -> {
//            final PWindow newPWindow = Element.newPWindow("Not Sub Window 1 " + i.incrementAndGet(),
//                "resizable=yes,location=0,status=0,scrollbars=0");
//            newPWindow.add(Element.newPLabel("Sub window"));
//            newPWindow.open();
//        });
//
//        PScheduler.scheduleAtFixedRate(() -> {
//            final PLabel label = Element.newPLabel();
//            label.setText("Window 1 " + i.incrementAndGet());
//            windowContainer.add(label);
//            windowContainer.add(Element.newPCheckBox("Checkbox"));
//        }, Duration.ofSeconds(1), Duration.ofSeconds(10));
//
//        final PFrame frame = Element.newPFrame("http://localhost:8081/sample/");
//        frame.add(Element.newPLabel("Inside the frame"));
//        w.add(frame);
//
//        return w;
//    }
//
//    @Override
//    public void onUserLoggedOut(final UserLoggedOutEvent event) {
//        UIContext.get().close();
//    }
//
//    private static final PStackLayoutPanel createStackLayoutPanel() {
//        final PStackLayoutPanel child = Element.newPStackLayoutPanel(PUnit.CM);
//        child.add(Element.newPLabel("Text"), "Text", false, 1.0);
//        return child;
//    }
//
//    private static final PListBox createListBox() {
//        final PListBox pListBox = Element.newPListBox(true);
//        pListBox.addItem("A");
//        pListBox.addItem("B");
//        pListBox.insertItem("C", 1);
//        pListBox.addItemsInGroup("sport", "Baseball", "Basketball", "Football", "Hockey", "Water Polo");
//        return pListBox;
//    }
//
//    private static final PTabLayoutPanel createTabLayoutPanel() {
//        final PTabLayoutPanel child = Element.newPTabLayoutPanel();
//        child.add(Element.newPLabel("text"), "text");
//        return child;
//    }
//
//    private static final PMenuBar createMenu() {
//        final PMenuBar pMenuBar = Element.newPMenuBar(true);
//        pMenuBar.addItem(Element.newPMenuItem("Menu 1", Element.newPMenuBar()));
//        pMenuBar.addItem(Element.newPMenuItem("Menu 2", true, Element.newPMenuBar()));
//        pMenuBar.addItem(Element.newPMenuItem("Menu 3", () -> System.err.println("Menu click")));
//        pMenuBar.addSeparator();
//        return pMenuBar;
//    }
//
//    private static final PFlowPanel createPFlowPanel() {
//        final PFlowPanel panel1 = Element.newPFlowPanel();
//        panel1.setAttribute("id", "panel1");
//        final PFlowPanel panel2_1 = Element.newPFlowPanel();
//        panel2_1.setAttribute("id", "panel2_1");
//        final PFlowPanel panel3_1_1 = Element.newPFlowPanel();
//        panel3_1_1.setAttribute("id", "panel3_1_1");
//        final PFlowPanel panel3_1_2 = Element.newPFlowPanel();
//        panel3_1_2.setAttribute("id", "panel3_1_2");
//        final PFlowPanel panel2_2 = Element.newPFlowPanel();
//        panel2_2.setAttribute("id", "panel2_2");
//        final PFlowPanel panel3_2_1 = Element.newPFlowPanel();
//        panel3_2_1.setAttribute("id", "panel3_2_1");
//        final PFlowPanel panel3_2_2 = Element.newPFlowPanel();
//        panel3_2_2.setAttribute("id", "panel3_2_2");
//
//        panel1.add(panel2_1);
//        panel2_1.add(panel3_1_1);
//        panel2_1.add(panel3_1_2);
//        panel1.add(panel2_2);
//        panel2_2.add(panel3_2_1);
//        panel2_2.add(panel3_2_2);
//
//        return panel1;
//    }
//
//    private static final PWidget createBlock(final PWidget child) {
//        final PFlowPanel panel = Element.newPFlowPanel();
//        panel.add(child);
//        return panel;
//    }
//
//    private static final PDockLayoutPanel createDockLayoutPanel() {
//        final PDockLayoutPanel pDockLayoutPanel = Element.newPDockLayoutPanel(PUnit.CM);
//        pDockLayoutPanel.addNorth(Element.newPLabel("LabelDock"), 1.5);
//        return pDockLayoutPanel;
//    }
//
//    private static final PFlowPanel createDateBox() {
//        final PFlowPanel flowPanel = Element.newPFlowPanel();
//        final PDateBox dateBox = Element.newPDateBox();
//        dateBox.setValue(new Date(0));
//        flowPanel.add(dateBox);
//        final PButton button = Element.newPButton("reset");
//        button.addClickHandler(event -> dateBox.setValue(null));
//        flowPanel.add(button);
//        return flowPanel;
//    }
//
//    private static final LoggerAddOn createPAddOn() {
//        final LoggerAddOn labelPAddOn = new LoggerAddOn();
//        labelPAddOn.log("addon logger test");
//
//        labelPAddOn.setAjaxHandler((req, resp) -> {
//            final String header = req.getHeader("info");
//
//            if (header.equals("Get Data")) {
//                resp.setStatus(HttpServletResponse.SC_OK);
//                resp.setContentType("application/json");
//                resp.getWriter().print("{\"response\": \"" + header + "\"}");
//                resp.getWriter().flush();
//            } else {
//                resp.sendError(500);
//            }
//        });
//
//        labelPAddOn.setTerminalHandler(event -> System.err.println(event.toString()));
//
//        return labelPAddOn;
//    }
//
//    private static final PTextBox createPTextBox() {
//        final PTextBox pTextBox = Element.newPTextBox();
//
//        pTextBox.addKeyUpHandler(new PKeyUpHandler() {
//
//            @Override
//            public void onKeyUp(final PKeyUpEvent keyUpEvent) {
//                PScript.execute(PWindow.getMain(), "alert('" + keyUpEvent + "');");
//            }
//
//            @Override
//            public PKeyCodes[] getFilteredKeys() {
//                return new PKeyCodes[] { PKeyCodes.ENTER };
//            }
//        });
//        return pTextBox;
//    }
//
//    private static final PTree createTree() {
//        final PTree tree = Element.newPTree();
//
//        final PTreeItem firstFolder = tree.add("First");
//        firstFolder.add("2");
//        firstFolder.add(0, Element.newPTreeItem("1"));
//
//        firstFolder.setState(true);
//
//        final PTreeItem secondFolder = Element.newPTreeItem("Second");
//        final PTreeItem subItem = secondFolder.add(Element.newPTreeItem());
//        subItem.setText("3");
//        secondFolder.add(Element.newPTreeItem(Element.newPLabel("4")));
//        tree.add(secondFolder);
//
//        secondFolder.setSelected(true);
//
//        return tree;
//    }
//
//    private static final PAbsolutePanel createAbsolutePanel() {
//        final PAbsolutePanel pAbsolutePanel = Element.newPAbsolutePanel();
//        pAbsolutePanel.add(Element.newDiv());
//        pAbsolutePanel.add(Element.newP());
//        return pAbsolutePanel;
//    }
//
//    private static final PButton createButton() {
//        final PButton pButton = Element.newPButton("Button 1");
//        pButton.addClickHandler(handler -> pButton.setText("Button 1 clicked"));
//        return pButton;
//    }
//
//    class Pojo {
//
//        public String security;
//        public String classe;
//        public Double bid;
//        public Double offer;
//        public Double spread;
//        public String coucou;
//        public String coucou1;
//        public String coucou2;
//        public String coucou3;
//        public String coucou4;
//        public String coucou5;
//        public String coucou6;
//        public String coucou7;
//        public String coucou8;
//        public String coucou9;
//        public String coucou10;
//
//        /**
//         * @return the security
//         */
//        public String getSecurity() {
//            return security;
//        }
//
//        /**
//         * @param security
//         *            the security to set
//         */
//        public void setSecurity(final String security) {
//            this.security = security;
//        }
//
//        /**
//         * @return the classe
//         */
//        public String getClasse() {
//            return classe;
//        }
//
//        /**
//         * @param classe
//         *            the classe to set
//         */
//        public void setClasse(final String classe) {
//            this.classe = classe;
//        }
//
//        /**
//         * @return the bid
//         */
//        public Double getBid() {
//            return bid;
//        }
//
//        /**
//         * @param bid
//         *            the bid to set
//         */
//        public void setBid(final Double bid) {
//            this.bid = bid;
//        }
//
//        /**
//         * @return the offer
//         */
//        public Double getOffer() {
//            return offer;
//        }
//
//        /**
//         * @param offer
//         *            the offer to set
//         */
//        public void setOffer(final Double offer) {
//            this.offer = offer;
//        }
//
//        /**
//         * @return the spread
//         */
//        public Double getSpread() {
//            return spread;
//        }
//
//        /**
//         * @param spread
//         *            the spread to set
//         */
//        public void setSpread(final Double spread) {
//            this.spread = spread;
//        }
//
//        /**
//         * @return the coucou
//         */
//        public String getCoucou() {
//            return coucou;
//        }
//
//        /**
//         * @param coucou
//         *            the coucou to set
//         */
//        public void setCoucou(final String coucou) {
//            this.coucou = coucou;
//        }
//
//        /**
//         * @return the coucou1
//         */
//        public String getCoucou1() {
//            return coucou1;
//        }
//
//        /**
//         * @param coucou1
//         *            the coucou1 to set
//         */
//        public void setCoucou1(final String coucou1) {
//            this.coucou1 = coucou1;
//        }
//
//        /**
//         * @return the coucou2
//         */
//        public String getCoucou2() {
//            return coucou2;
//        }
//
//        /**
//         * @param coucou2
//         *            the coucou2 to set
//         */
//        public void setCoucou2(final String coucou2) {
//            this.coucou2 = coucou2;
//        }
//
//        /**
//         * @return the coucou3
//         */
//        public String getCoucou3() {
//            return coucou3;
//        }
//
//        /**
//         * @param coucou3
//         *            the coucou3 to set
//         */
//        public void setCoucou3(final String coucou3) {
//            this.coucou3 = coucou3;
//        }
//
//        /**
//         * @return the coucou4
//         */
//        public String getCoucou4() {
//            return coucou4;
//        }
//
//        /**
//         * @param coucou4
//         *            the coucou4 to set
//         */
//        public void setCoucou4(final String coucou4) {
//            this.coucou4 = coucou4;
//        }
//
//    }

//        for (int index = 0; index < PHTMLBodyElement.getMain().getChildren().size(); index++) {
//            log.info("list of children of Body is" + PHTMLBodyElement.getMain().getChildren().get(index).toString());
//        }

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