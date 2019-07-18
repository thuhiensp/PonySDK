/*
 * Copyright 2019 SmartTrade Technologies
 *     Pony SDK
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
package com.ponysdk.core.ui2.dom;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.animation.PDocumentTimeline;
import com.ponysdk.core.ui2.css.PFontFaceSet;
import com.ponysdk.core.ui2.css.PStyleSheetList;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.frame.PLocation;
import com.ponysdk.core.ui2.frame.PWindow;
import com.ponysdk.core.ui2.html.PHTMLCollection;
import com.ponysdk.core.ui2.html.PHTMLElement;
import com.ponysdk.core.ui2.html.PHTMLHeadElement;
import com.ponysdk.core.ui2.svg.PSVGSVGElement;
import com.ponysdk.core.ui2.uniontype.PHTMLOrSVGScriptElement;

public abstract class PDocument extends PNode {
    private static final Logger log = LoggerFactory.getLogger(PDocument.class);
     private PDOMImplementation implementation;
     private String URL;
     private String documentURI;
     private String origin;
     private String suborigin;
     private String compatMode;
     private String characterSet;
     private String charset;
     private String inputEncoding;
     private String contentType;
     private PDocumentType doctype;
     private PElement documentElement;
     private PElement rootScroller;
     private String xmlEncoding;
     private String xmlVersion;
     private Boolean xmlStandalone;
     private PLocation location;
     private String domain;
     private String referrer;
     private String cookie;
     private String lastModified;
     private String title;
     private String dir;
     private PHTMLElement body;
     private PHTMLHeadElement head;
     private PHTMLCollection images;
     private PHTMLCollection embeds;
     private PHTMLCollection plugins;
     private PHTMLCollection links;
     private PHTMLCollection forms;
     private PHTMLCollection scripts;
     private PHTMLOrSVGScriptElement currentScript;
     private PWindow defaultView;
     private String designMode;
     private PEventHandlerNonNull onreadystatechange;
     private PHTMLCollection anchors;
     private PHTMLCollection applets;
     private String selectedStylesheetSet;
     private String preferredStylesheetSet;
     private PElement scrollingElement;
     private PEventHandlerNonNull onpointerlockchange;
     private PEventHandlerNonNull onpointerlockerror;
     private Boolean hidden;
     private String webkitVisibilityState;
     private Boolean webkitHidden;
     private PEventHandlerNonNull onbeforecopy;
     private PEventHandlerNonNull onbeforecut;
     private PEventHandlerNonNull onbeforepaste;
     private PEventHandlerNonNull oncopy;
     private PEventHandlerNonNull oncut;
     private PEventHandlerNonNull onpaste;
     private PEventHandlerNonNull onsearch;
     private PEventHandlerNonNull onsecuritypolicyviolation;
     private PEventHandlerNonNull onselectionchange;
     private PEventHandlerNonNull onselectstart;
     private PEventHandlerNonNull onwheel;
     private PDocumentTimeline timeline;
     private Boolean fullscreenEnabled;
     private PEventHandlerNonNull onfullscreenchange;
     private PEventHandlerNonNull onfullscreenerror;
     private Boolean webkitIsFullScreen;
     private PElement webkitCurrentFullScreenElement;
     private Boolean webkitFullscreenEnabled;
     private PElement webkitFullscreenElement;
     private PEventHandlerNonNull onwebkitfullscreenchange;
     private PEventHandlerNonNull onwebkitfullscreenerror;
     private PSVGSVGElement rootElement;
     private PEventHandlerNonNull onabort;
     private PEventHandlerNonNull onblur;
     private PEventHandlerNonNull oncancel;
     private PEventHandlerNonNull oncanplay;
     private PEventHandlerNonNull oncanplaythrough;
     private PEventHandlerNonNull onchange;
     private PEventHandlerNonNull onclick;
     private PEventHandlerNonNull onclose;
     private PEventHandlerNonNull oncontextmenu;
     private PEventHandlerNonNull oncuechange;
     private PEventHandlerNonNull ondblclick;
     private PEventHandlerNonNull ondrag;
     private PEventHandlerNonNull ondragend;
     private PEventHandlerNonNull ondragenter;
     private PEventHandlerNonNull ondragleave;
     private PEventHandlerNonNull ondragover;
     private PEventHandlerNonNull ondragstart;
     private PEventHandlerNonNull ondrop;
     private PEventHandlerNonNull ondurationchange;
     private PEventHandlerNonNull onemptied;
     private PEventHandlerNonNull onended;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onfocus;
     private PEventHandlerNonNull oninput;
     private PEventHandlerNonNull oninvalid;
     private PEventHandlerNonNull onkeydown;
     private PEventHandlerNonNull onkeypress;
     private PEventHandlerNonNull onkeyup;
     private PEventHandlerNonNull onload;
     private PEventHandlerNonNull onloadeddata;
     private PEventHandlerNonNull onloadedmetadata;
     private PEventHandlerNonNull onloadstart;
     private PEventHandlerNonNull onmousedown;
     private PEventHandlerNonNull onmouseenter;
     private PEventHandlerNonNull onmouseleave;
     private PEventHandlerNonNull onmousemove;
     private PEventHandlerNonNull onmouseout;
     private PEventHandlerNonNull onmouseover;
     private PEventHandlerNonNull onmouseup;
     private PEventHandlerNonNull onmousewheel;
     private PEventHandlerNonNull onpause;
     private PEventHandlerNonNull onplay;
     private PEventHandlerNonNull onplaying;
     private PEventHandlerNonNull onprogress;
     private PEventHandlerNonNull onratechange;
     private PEventHandlerNonNull onreset;
     private PEventHandlerNonNull onresize;
     private PEventHandlerNonNull onscroll;
     private PEventHandlerNonNull onseeked;
     private PEventHandlerNonNull onseeking;
     private PEventHandlerNonNull onselect;
     private PEventHandlerNonNull onstalled;
     private PEventHandlerNonNull onsubmit;
     private PEventHandlerNonNull onsuspend;
     private PEventHandlerNonNull ontimeupdate;
     private PEventHandlerNonNull ontoggle;
     private PEventHandlerNonNull onvolumechange;
     private PEventHandlerNonNull onwaiting;
     private PEventHandlerNonNull onauxclick;
     private PEventHandlerNonNull ongotpointercapture;
     private PEventHandlerNonNull onlostpointercapture;
     private PEventHandlerNonNull onpointerdown;
     private PEventHandlerNonNull onpointermove;
     private PEventHandlerNonNull onpointerup;
     private PEventHandlerNonNull onpointercancel;
     private PEventHandlerNonNull onpointerover;
     private PEventHandlerNonNull onpointerout;
     private PEventHandlerNonNull onpointerenter;
     private PEventHandlerNonNull onpointerleave;
     private PEventHandlerNonNull ontouchcancel;
     private PEventHandlerNonNull ontouchend;
     private PEventHandlerNonNull ontouchmove;
     private PEventHandlerNonNull ontouchstart;
     private PHTMLCollection children;
     private PElement firstElementChild;
     private PElement lastElementChild;
     private Double childElementCount;
     private PElement activeElement;
     private PStyleSheetList styleSheets;
     private PElement pointerLockElement;
     private PElement fullscreenElement;
     private PFontFaceSet fonts;
     private PDocumentReadyState readyState;
     private PVisibilityState visibilityState;
     private PAddressSpace addressSpace;

    public void setRootScroller(final PElement rootScroller)  {
       if (Objects.equals(this.rootScroller, rootScroller))return;
       this.rootScroller = rootScroller;
       log.info("rootScroller" + rootScroller);
       saveUpdateAttribute(PAttributeNames.ROOT_SCROLLER,rootScroller);
    }
    public void setXmlVersion(final String xmlVersion)  {
       if (Objects.equals(this.xmlVersion, xmlVersion))return;
       this.xmlVersion = xmlVersion;
       log.info("xmlVersion" + xmlVersion);
       saveUpdateAttribute(PAttributeNames.XML_VERSION,xmlVersion);
    }
    public void setXmlStandalone(final Boolean xmlStandalone)  {
       if (Objects.equals(this.xmlStandalone, xmlStandalone))return;
       this.xmlStandalone = xmlStandalone;
       log.info("xmlStandalone" + xmlStandalone);
       saveUpdateAttribute(PAttributeNames.XML_STANDALONE,xmlStandalone);
    }
    public void setDomain(final String domain)  {
       if (Objects.equals(this.domain, domain))return;
       this.domain = domain;
       log.info("domain" + domain);
       saveUpdateAttribute(PAttributeNames.DOMAIN,domain);
    }
    public void setCookie(final String cookie)  {
       if (Objects.equals(this.cookie, cookie))return;
       this.cookie = cookie;
       log.info("cookie" + cookie);
       saveUpdateAttribute(PAttributeNames.COOKIE,cookie);
    }
    public void setTitle(final String title)  {
       if (Objects.equals(this.title, title))return;
       this.title = title;
       log.info("title" + title);
       saveUpdateAttribute(PAttributeNames.TITLE,title);
    }
    public void setDir(final String dir)  {
       if (Objects.equals(this.dir, dir))return;
       this.dir = dir;
       log.info("dir" + dir);
       saveUpdateAttribute(PAttributeNames.DIR,dir);
    }
    public void setBody(final PHTMLElement body)  {
       if (Objects.equals(this.body, body))return;
       this.body = body;
       log.info("body" + body);
       saveUpdateAttribute(PAttributeNames.BODY,body);
    }
    public void setDesignMode(final String designMode)  {
       if (Objects.equals(this.designMode, designMode))return;
       this.designMode = designMode;
       log.info("designMode" + designMode);
       saveUpdateAttribute(PAttributeNames.DESIGN_MODE,designMode);
    }
    public void setOnreadystatechange(final PEventHandlerNonNull onreadystatechange, final PEventAttributesName... atrsName)  {
       addHandler(onreadystatechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONREADYSTATECHANGE, onreadystatechange, atrsName);
    }
    public void setSelectedStylesheetSet(final String selectedStylesheetSet)  {
       if (Objects.equals(this.selectedStylesheetSet, selectedStylesheetSet))return;
       this.selectedStylesheetSet = selectedStylesheetSet;
       log.info("selectedStylesheetSet" + selectedStylesheetSet);
       saveUpdateAttribute(PAttributeNames.SELECTED_STYLESHEET_SET,selectedStylesheetSet);
    }
    public void setOnpointerlockchange(final PEventHandlerNonNull onpointerlockchange, final PEventAttributesName... atrsName)  {
       addHandler(onpointerlockchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOINTERLOCKCHANGE, onpointerlockchange, atrsName);
    }
    public void setOnpointerlockerror(final PEventHandlerNonNull onpointerlockerror, final PEventAttributesName... atrsName)  {
       addHandler(onpointerlockerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOINTERLOCKERROR, onpointerlockerror, atrsName);
    }
    public void setOnbeforecopy(final PEventHandlerNonNull onbeforecopy, final PEventAttributesName... atrsName)  {
       addHandler(onbeforecopy);
       saveUpdateAttributeCallBack(PAttributeNames.ONBEFORECOPY, onbeforecopy, atrsName);
    }
    public void setOnbeforecut(final PEventHandlerNonNull onbeforecut, final PEventAttributesName... atrsName)  {
       addHandler(onbeforecut);
       saveUpdateAttributeCallBack(PAttributeNames.ONBEFORECUT, onbeforecut, atrsName);
    }
    public void setOnbeforepaste(final PEventHandlerNonNull onbeforepaste, final PEventAttributesName... atrsName)  {
       addHandler(onbeforepaste);
       saveUpdateAttributeCallBack(PAttributeNames.ONBEFOREPASTE, onbeforepaste, atrsName);
    }
    public void setOncopy(final PEventHandlerNonNull oncopy, final PEventAttributesName... atrsName)  {
       addHandler(oncopy);
       saveUpdateAttributeCallBack(PAttributeNames.ONCOPY, oncopy, atrsName);
    }
    public void setOncut(final PEventHandlerNonNull oncut, final PEventAttributesName... atrsName)  {
       addHandler(oncut);
       saveUpdateAttributeCallBack(PAttributeNames.ONCUT, oncut, atrsName);
    }
    public void setOnpaste(final PEventHandlerNonNull onpaste, final PEventAttributesName... atrsName)  {
       addHandler(onpaste);
       saveUpdateAttributeCallBack(PAttributeNames.ONPASTE, onpaste, atrsName);
    }
    public void setOnsearch(final PEventHandlerNonNull onsearch, final PEventAttributesName... atrsName)  {
       addHandler(onsearch);
       saveUpdateAttributeCallBack(PAttributeNames.ONSEARCH, onsearch, atrsName);
    }
    public void setOnsecuritypolicyviolation(final PEventHandlerNonNull onsecuritypolicyviolation, final PEventAttributesName... atrsName)  {
       addHandler(onsecuritypolicyviolation);
       saveUpdateAttributeCallBack(PAttributeNames.ONSECURITYPOLICYVIOLATION, onsecuritypolicyviolation, atrsName);
    }
    public void setOnselectionchange(final PEventHandlerNonNull onselectionchange, final PEventAttributesName... atrsName)  {
       addHandler(onselectionchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONSELECTIONCHANGE, onselectionchange, atrsName);
    }
    public void setOnselectstart(final PEventHandlerNonNull onselectstart, final PEventAttributesName... atrsName)  {
       addHandler(onselectstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONSELECTSTART, onselectstart, atrsName);
    }
    public void setOnwheel(final PEventHandlerNonNull onwheel, final PEventAttributesName... atrsName)  {
       addHandler(onwheel);
       saveUpdateAttributeCallBack(PAttributeNames.ONWHEEL, onwheel, atrsName);
    }
    public void setOnfullscreenchange(final PEventHandlerNonNull onfullscreenchange, final PEventAttributesName... atrsName)  {
       addHandler(onfullscreenchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONFULLSCREENCHANGE, onfullscreenchange, atrsName);
    }
    public void setOnfullscreenerror(final PEventHandlerNonNull onfullscreenerror, final PEventAttributesName... atrsName)  {
       addHandler(onfullscreenerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONFULLSCREENERROR, onfullscreenerror, atrsName);
    }
    public void setOnwebkitfullscreenchange(final PEventHandlerNonNull onwebkitfullscreenchange, final PEventAttributesName... atrsName)  {
       addHandler(onwebkitfullscreenchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONWEBKITFULLSCREENCHANGE, onwebkitfullscreenchange, atrsName);
    }
    public void setOnwebkitfullscreenerror(final PEventHandlerNonNull onwebkitfullscreenerror, final PEventAttributesName... atrsName)  {
       addHandler(onwebkitfullscreenerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONWEBKITFULLSCREENERROR, onwebkitfullscreenerror, atrsName);
    }
    public void setOnabort(final PEventHandlerNonNull onabort, final PEventAttributesName... atrsName)  {
       addHandler(onabort);
       saveUpdateAttributeCallBack(PAttributeNames.ONABORT, onabort, atrsName);
    }
    public void setOnblur(final PEventHandlerNonNull onblur, final PEventAttributesName... atrsName)  {
       addHandler(onblur);
       saveUpdateAttributeCallBack(PAttributeNames.ONBLUR, onblur, atrsName);
    }
    public void setOncancel(final PEventHandlerNonNull oncancel, final PEventAttributesName... atrsName)  {
       addHandler(oncancel);
       saveUpdateAttributeCallBack(PAttributeNames.ONCANCEL, oncancel, atrsName);
    }
    public void setOncanplay(final PEventHandlerNonNull oncanplay, final PEventAttributesName... atrsName)  {
       addHandler(oncanplay);
       saveUpdateAttributeCallBack(PAttributeNames.ONCANPLAY, oncanplay, atrsName);
    }
    public void setOncanplaythrough(final PEventHandlerNonNull oncanplaythrough, final PEventAttributesName... atrsName)  {
       addHandler(oncanplaythrough);
       saveUpdateAttributeCallBack(PAttributeNames.ONCANPLAYTHROUGH, oncanplaythrough, atrsName);
    }
    public void setOnchange(final PEventHandlerNonNull onchange, final PEventAttributesName... atrsName)  {
       addHandler(onchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONCHANGE, onchange, atrsName);
    }
    public void setOnclick(final PEventHandlerNonNull onclick, final PEventAttributesName... atrsName)  {
       addHandler(onclick);
       saveUpdateAttributeCallBack(PAttributeNames.ONCLICK, onclick, atrsName);
    }
    public void setOnclose(final PEventHandlerNonNull onclose, final PEventAttributesName... atrsName)  {
       addHandler(onclose);
       saveUpdateAttributeCallBack(PAttributeNames.ONCLOSE, onclose, atrsName);
    }
    public void setOncontextmenu(final PEventHandlerNonNull oncontextmenu, final PEventAttributesName... atrsName)  {
       addHandler(oncontextmenu);
       saveUpdateAttributeCallBack(PAttributeNames.ONCONTEXTMENU, oncontextmenu, atrsName);
    }
    public void setOncuechange(final PEventHandlerNonNull oncuechange, final PEventAttributesName... atrsName)  {
       addHandler(oncuechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONCUECHANGE, oncuechange, atrsName);
    }
    public void setOndblclick(final PEventHandlerNonNull ondblclick, final PEventAttributesName... atrsName)  {
       addHandler(ondblclick);
       saveUpdateAttributeCallBack(PAttributeNames.ONDBLCLICK, ondblclick, atrsName);
    }
    public void setOndrag(final PEventHandlerNonNull ondrag, final PEventAttributesName... atrsName)  {
       addHandler(ondrag);
       saveUpdateAttributeCallBack(PAttributeNames.ONDRAG, ondrag, atrsName);
    }
    public void setOndragend(final PEventHandlerNonNull ondragend, final PEventAttributesName... atrsName)  {
       addHandler(ondragend);
       saveUpdateAttributeCallBack(PAttributeNames.ONDRAGEND, ondragend, atrsName);
    }
    public void setOndragenter(final PEventHandlerNonNull ondragenter, final PEventAttributesName... atrsName)  {
       addHandler(ondragenter);
       saveUpdateAttributeCallBack(PAttributeNames.ONDRAGENTER, ondragenter, atrsName);
    }
    public void setOndragleave(final PEventHandlerNonNull ondragleave, final PEventAttributesName... atrsName)  {
       addHandler(ondragleave);
       saveUpdateAttributeCallBack(PAttributeNames.ONDRAGLEAVE, ondragleave, atrsName);
    }
    public void setOndragover(final PEventHandlerNonNull ondragover, final PEventAttributesName... atrsName)  {
       addHandler(ondragover);
       saveUpdateAttributeCallBack(PAttributeNames.ONDRAGOVER, ondragover, atrsName);
    }
    public void setOndragstart(final PEventHandlerNonNull ondragstart, final PEventAttributesName... atrsName)  {
       addHandler(ondragstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONDRAGSTART, ondragstart, atrsName);
    }
    public void setOndrop(final PEventHandlerNonNull ondrop, final PEventAttributesName... atrsName)  {
       addHandler(ondrop);
       saveUpdateAttributeCallBack(PAttributeNames.ONDROP, ondrop, atrsName);
    }
    public void setOndurationchange(final PEventHandlerNonNull ondurationchange, final PEventAttributesName... atrsName)  {
       addHandler(ondurationchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONDURATIONCHANGE, ondurationchange, atrsName);
    }
    public void setOnemptied(final PEventHandlerNonNull onemptied, final PEventAttributesName... atrsName)  {
       addHandler(onemptied);
       saveUpdateAttributeCallBack(PAttributeNames.ONEMPTIED, onemptied, atrsName);
    }
    public void setOnended(final PEventHandlerNonNull onended, final PEventAttributesName... atrsName)  {
       addHandler(onended);
       saveUpdateAttributeCallBack(PAttributeNames.ONENDED, onended, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnfocus(final PEventHandlerNonNull onfocus, final PEventAttributesName... atrsName)  {
       addHandler(onfocus);
       saveUpdateAttributeCallBack(PAttributeNames.ONFOCUS, onfocus, atrsName);
    }
    public void setOninput(final PEventHandlerNonNull oninput, final PEventAttributesName... atrsName)  {
       addHandler(oninput);
       saveUpdateAttributeCallBack(PAttributeNames.ONINPUT, oninput, atrsName);
    }
    public void setOninvalid(final PEventHandlerNonNull oninvalid, final PEventAttributesName... atrsName)  {
       addHandler(oninvalid);
       saveUpdateAttributeCallBack(PAttributeNames.ONINVALID, oninvalid, atrsName);
    }
    public void setOnkeydown(final PEventHandlerNonNull onkeydown, final PEventAttributesName... atrsName)  {
       addHandler(onkeydown);
       saveUpdateAttributeCallBack(PAttributeNames.ONKEYDOWN, onkeydown, atrsName);
    }
    public void setOnkeypress(final PEventHandlerNonNull onkeypress, final PEventAttributesName... atrsName)  {
       addHandler(onkeypress);
       saveUpdateAttributeCallBack(PAttributeNames.ONKEYPRESS, onkeypress, atrsName);
    }
    public void setOnkeyup(final PEventHandlerNonNull onkeyup, final PEventAttributesName... atrsName)  {
       addHandler(onkeyup);
       saveUpdateAttributeCallBack(PAttributeNames.ONKEYUP, onkeyup, atrsName);
    }
    public void setOnload(final PEventHandlerNonNull onload, final PEventAttributesName... atrsName)  {
       addHandler(onload);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOAD, onload, atrsName);
    }
    public void setOnloadeddata(final PEventHandlerNonNull onloadeddata, final PEventAttributesName... atrsName)  {
       addHandler(onloadeddata);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOADEDDATA, onloadeddata, atrsName);
    }
    public void setOnloadedmetadata(final PEventHandlerNonNull onloadedmetadata, final PEventAttributesName... atrsName)  {
       addHandler(onloadedmetadata);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOADEDMETADATA, onloadedmetadata, atrsName);
    }
    public void setOnloadstart(final PEventHandlerNonNull onloadstart, final PEventAttributesName... atrsName)  {
       addHandler(onloadstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOADSTART, onloadstart, atrsName);
    }
    public void setOnmousedown(final PEventHandlerNonNull onmousedown, final PEventAttributesName... atrsName)  {
       addHandler(onmousedown);
       saveUpdateAttributeCallBack(PAttributeNames.ONMOUSEDOWN, onmousedown, atrsName);
    }
    public void setOnmouseenter(final PEventHandlerNonNull onmouseenter, final PEventAttributesName... atrsName)  {
       addHandler(onmouseenter);
       saveUpdateAttributeCallBack(PAttributeNames.ONMOUSEENTER, onmouseenter, atrsName);
    }
    public void setOnmouseleave(final PEventHandlerNonNull onmouseleave, final PEventAttributesName... atrsName)  {
       addHandler(onmouseleave);
       saveUpdateAttributeCallBack(PAttributeNames.ONMOUSELEAVE, onmouseleave, atrsName);
    }
    public void setOnmousemove(final PEventHandlerNonNull onmousemove, final PEventAttributesName... atrsName)  {
       addHandler(onmousemove);
       saveUpdateAttributeCallBack(PAttributeNames.ONMOUSEMOVE, onmousemove, atrsName);
    }
    public void setOnmouseout(final PEventHandlerNonNull onmouseout, final PEventAttributesName... atrsName)  {
       addHandler(onmouseout);
       saveUpdateAttributeCallBack(PAttributeNames.ONMOUSEOUT, onmouseout, atrsName);
    }
    public void setOnmouseover(final PEventHandlerNonNull onmouseover, final PEventAttributesName... atrsName)  {
       addHandler(onmouseover);
       saveUpdateAttributeCallBack(PAttributeNames.ONMOUSEOVER, onmouseover, atrsName);
    }
    public void setOnmouseup(final PEventHandlerNonNull onmouseup, final PEventAttributesName... atrsName)  {
       addHandler(onmouseup);
       saveUpdateAttributeCallBack(PAttributeNames.ONMOUSEUP, onmouseup, atrsName);
    }
    public void setOnmousewheel(final PEventHandlerNonNull onmousewheel, final PEventAttributesName... atrsName)  {
       addHandler(onmousewheel);
       saveUpdateAttributeCallBack(PAttributeNames.ONMOUSEWHEEL, onmousewheel, atrsName);
    }
    public void setOnpause(final PEventHandlerNonNull onpause, final PEventAttributesName... atrsName)  {
       addHandler(onpause);
       saveUpdateAttributeCallBack(PAttributeNames.ONPAUSE, onpause, atrsName);
    }
    public void setOnplay(final PEventHandlerNonNull onplay, final PEventAttributesName... atrsName)  {
       addHandler(onplay);
       saveUpdateAttributeCallBack(PAttributeNames.ONPLAY, onplay, atrsName);
    }
    public void setOnplaying(final PEventHandlerNonNull onplaying, final PEventAttributesName... atrsName)  {
       addHandler(onplaying);
       saveUpdateAttributeCallBack(PAttributeNames.ONPLAYING, onplaying, atrsName);
    }
    public void setOnprogress(final PEventHandlerNonNull onprogress, final PEventAttributesName... atrsName)  {
       addHandler(onprogress);
       saveUpdateAttributeCallBack(PAttributeNames.ONPROGRESS, onprogress, atrsName);
    }
    public void setOnratechange(final PEventHandlerNonNull onratechange, final PEventAttributesName... atrsName)  {
       addHandler(onratechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONRATECHANGE, onratechange, atrsName);
    }
    public void setOnreset(final PEventHandlerNonNull onreset, final PEventAttributesName... atrsName)  {
       addHandler(onreset);
       saveUpdateAttributeCallBack(PAttributeNames.ONRESET, onreset, atrsName);
    }
    public void setOnresize(final PEventHandlerNonNull onresize, final PEventAttributesName... atrsName)  {
       addHandler(onresize);
       saveUpdateAttributeCallBack(PAttributeNames.ONRESIZE, onresize, atrsName);
    }
    public void setOnscroll(final PEventHandlerNonNull onscroll, final PEventAttributesName... atrsName)  {
       addHandler(onscroll);
       saveUpdateAttributeCallBack(PAttributeNames.ONSCROLL, onscroll, atrsName);
    }
    public void setOnseeked(final PEventHandlerNonNull onseeked, final PEventAttributesName... atrsName)  {
       addHandler(onseeked);
       saveUpdateAttributeCallBack(PAttributeNames.ONSEEKED, onseeked, atrsName);
    }
    public void setOnseeking(final PEventHandlerNonNull onseeking, final PEventAttributesName... atrsName)  {
       addHandler(onseeking);
       saveUpdateAttributeCallBack(PAttributeNames.ONSEEKING, onseeking, atrsName);
    }
    public void setOnselect(final PEventHandlerNonNull onselect, final PEventAttributesName... atrsName)  {
       addHandler(onselect);
       saveUpdateAttributeCallBack(PAttributeNames.ONSELECT, onselect, atrsName);
    }
    public void setOnstalled(final PEventHandlerNonNull onstalled, final PEventAttributesName... atrsName)  {
       addHandler(onstalled);
       saveUpdateAttributeCallBack(PAttributeNames.ONSTALLED, onstalled, atrsName);
    }
    public void setOnsubmit(final PEventHandlerNonNull onsubmit, final PEventAttributesName... atrsName)  {
       addHandler(onsubmit);
       saveUpdateAttributeCallBack(PAttributeNames.ONSUBMIT, onsubmit, atrsName);
    }
    public void setOnsuspend(final PEventHandlerNonNull onsuspend, final PEventAttributesName... atrsName)  {
       addHandler(onsuspend);
       saveUpdateAttributeCallBack(PAttributeNames.ONSUSPEND, onsuspend, atrsName);
    }
    public void setOntimeupdate(final PEventHandlerNonNull ontimeupdate, final PEventAttributesName... atrsName)  {
       addHandler(ontimeupdate);
       saveUpdateAttributeCallBack(PAttributeNames.ONTIMEUPDATE, ontimeupdate, atrsName);
    }
    public void setOntoggle(final PEventHandlerNonNull ontoggle, final PEventAttributesName... atrsName)  {
       addHandler(ontoggle);
       saveUpdateAttributeCallBack(PAttributeNames.ONTOGGLE, ontoggle, atrsName);
    }
    public void setOnvolumechange(final PEventHandlerNonNull onvolumechange, final PEventAttributesName... atrsName)  {
       addHandler(onvolumechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONVOLUMECHANGE, onvolumechange, atrsName);
    }
    public void setOnwaiting(final PEventHandlerNonNull onwaiting, final PEventAttributesName... atrsName)  {
       addHandler(onwaiting);
       saveUpdateAttributeCallBack(PAttributeNames.ONWAITING, onwaiting, atrsName);
    }
    public void setOnauxclick(final PEventHandlerNonNull onauxclick, final PEventAttributesName... atrsName)  {
       addHandler(onauxclick);
       saveUpdateAttributeCallBack(PAttributeNames.ONAUXCLICK, onauxclick, atrsName);
    }
    public void setOngotpointercapture(final PEventHandlerNonNull ongotpointercapture, final PEventAttributesName... atrsName)  {
       addHandler(ongotpointercapture);
       saveUpdateAttributeCallBack(PAttributeNames.ONGOTPOINTERCAPTURE, ongotpointercapture, atrsName);
    }
    public void setOnlostpointercapture(final PEventHandlerNonNull onlostpointercapture, final PEventAttributesName... atrsName)  {
       addHandler(onlostpointercapture);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOSTPOINTERCAPTURE, onlostpointercapture, atrsName);
    }
    public void setOnpointerdown(final PEventHandlerNonNull onpointerdown, final PEventAttributesName... atrsName)  {
       addHandler(onpointerdown);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOINTERDOWN, onpointerdown, atrsName);
    }
    public void setOnpointermove(final PEventHandlerNonNull onpointermove, final PEventAttributesName... atrsName)  {
       addHandler(onpointermove);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOINTERMOVE, onpointermove, atrsName);
    }
    public void setOnpointerup(final PEventHandlerNonNull onpointerup, final PEventAttributesName... atrsName)  {
       addHandler(onpointerup);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOINTERUP, onpointerup, atrsName);
    }
    public void setOnpointercancel(final PEventHandlerNonNull onpointercancel, final PEventAttributesName... atrsName)  {
       addHandler(onpointercancel);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOINTERCANCEL, onpointercancel, atrsName);
    }
    public void setOnpointerover(final PEventHandlerNonNull onpointerover, final PEventAttributesName... atrsName)  {
       addHandler(onpointerover);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOINTEROVER, onpointerover, atrsName);
    }
    public void setOnpointerout(final PEventHandlerNonNull onpointerout, final PEventAttributesName... atrsName)  {
       addHandler(onpointerout);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOINTEROUT, onpointerout, atrsName);
    }
    public void setOnpointerenter(final PEventHandlerNonNull onpointerenter, final PEventAttributesName... atrsName)  {
       addHandler(onpointerenter);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOINTERENTER, onpointerenter, atrsName);
    }
    public void setOnpointerleave(final PEventHandlerNonNull onpointerleave, final PEventAttributesName... atrsName)  {
       addHandler(onpointerleave);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOINTERLEAVE, onpointerleave, atrsName);
    }
    public void setOntouchcancel(final PEventHandlerNonNull ontouchcancel, final PEventAttributesName... atrsName)  {
       addHandler(ontouchcancel);
       saveUpdateAttributeCallBack(PAttributeNames.ONTOUCHCANCEL, ontouchcancel, atrsName);
    }
    public void setOntouchend(final PEventHandlerNonNull ontouchend, final PEventAttributesName... atrsName)  {
       addHandler(ontouchend);
       saveUpdateAttributeCallBack(PAttributeNames.ONTOUCHEND, ontouchend, atrsName);
    }
    public void setOntouchmove(final PEventHandlerNonNull ontouchmove, final PEventAttributesName... atrsName)  {
       addHandler(ontouchmove);
       saveUpdateAttributeCallBack(PAttributeNames.ONTOUCHMOVE, ontouchmove, atrsName);
    }
    public void setOntouchstart(final PEventHandlerNonNull ontouchstart, final PEventAttributesName... atrsName)  {
       addHandler(ontouchstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONTOUCHSTART, ontouchstart, atrsName);
    }

    public PDOMImplementation getImplementation(){
      return implementation;
    }
    public String getURL(){
      return URL;
    }
    public String getDocumentURI(){
      return documentURI;
    }
    public String getOrigin(){
      return origin;
    }
    public String getSuborigin(){
      return suborigin;
    }
    public String getCompatMode(){
      return compatMode;
    }
    public String getCharacterSet(){
      return characterSet;
    }
    public String getCharset(){
      return charset;
    }
    public String getInputEncoding(){
      return inputEncoding;
    }
    public String getContentType(){
      return contentType;
    }
    public PDocumentType getDoctype(){
      return doctype;
    }
    public PElement getDocumentElement(){
      return documentElement;
    }
    public PElement getRootScroller(){
      return rootScroller;
    }
    public String getXmlEncoding(){
      return xmlEncoding;
    }
    public String getXmlVersion(){
      return xmlVersion;
    }
    public Boolean getXmlStandalone(){
      return xmlStandalone;
    }
    public PLocation getLocation(){
      return location;
    }
    public String getDomain(){
      return domain;
    }
    public String getReferrer(){
      return referrer;
    }
    public String getCookie(){
      return cookie;
    }
    public String getLastModified(){
      return lastModified;
    }
    public String getTitle(){
      return title;
    }
    public String getDir(){
      return dir;
    }
    public PHTMLElement getBody(){
      return body;
    }
    public PHTMLHeadElement getHead(){
      return head;
    }
    public PHTMLCollection getImages(){
      return images;
    }
    public PHTMLCollection getEmbeds(){
      return embeds;
    }
    public PHTMLCollection getPlugins(){
      return plugins;
    }
    public PHTMLCollection getLinks(){
      return links;
    }
    public PHTMLCollection getForms(){
      return forms;
    }
    public PHTMLCollection getScripts(){
      return scripts;
    }
    public PHTMLOrSVGScriptElement getCurrentScript(){
      return currentScript;
    }
    public PWindow getDefaultView(){
      return defaultView;
    }
    public String getDesignMode(){
      return designMode;
    }
    public PEventHandlerNonNull getOnreadystatechange(){
      return onreadystatechange;
    }
    public PHTMLCollection getAnchors(){
      return anchors;
    }
    public PHTMLCollection getApplets(){
      return applets;
    }
    public String getSelectedStylesheetSet(){
      return selectedStylesheetSet;
    }
    public String getPreferredStylesheetSet(){
      return preferredStylesheetSet;
    }
    public PElement getScrollingElement(){
      return scrollingElement;
    }
    public PEventHandlerNonNull getOnpointerlockchange(){
      return onpointerlockchange;
    }
    public PEventHandlerNonNull getOnpointerlockerror(){
      return onpointerlockerror;
    }
    public Boolean getHidden(){
      return hidden;
    }
    public String getWebkitVisibilityState(){
      return webkitVisibilityState;
    }
    public Boolean getWebkitHidden(){
      return webkitHidden;
    }
    public PEventHandlerNonNull getOnbeforecopy(){
      return onbeforecopy;
    }
    public PEventHandlerNonNull getOnbeforecut(){
      return onbeforecut;
    }
    public PEventHandlerNonNull getOnbeforepaste(){
      return onbeforepaste;
    }
    public PEventHandlerNonNull getOncopy(){
      return oncopy;
    }
    public PEventHandlerNonNull getOncut(){
      return oncut;
    }
    public PEventHandlerNonNull getOnpaste(){
      return onpaste;
    }
    public PEventHandlerNonNull getOnsearch(){
      return onsearch;
    }
    public PEventHandlerNonNull getOnsecuritypolicyviolation(){
      return onsecuritypolicyviolation;
    }
    public PEventHandlerNonNull getOnselectionchange(){
      return onselectionchange;
    }
    public PEventHandlerNonNull getOnselectstart(){
      return onselectstart;
    }
    public PEventHandlerNonNull getOnwheel(){
      return onwheel;
    }
    public PDocumentTimeline getTimeline(){
      return timeline;
    }
    public Boolean getFullscreenEnabled(){
      return fullscreenEnabled;
    }
    public PEventHandlerNonNull getOnfullscreenchange(){
      return onfullscreenchange;
    }
    public PEventHandlerNonNull getOnfullscreenerror(){
      return onfullscreenerror;
    }
    public Boolean getWebkitIsFullScreen(){
      return webkitIsFullScreen;
    }
    public PElement getWebkitCurrentFullScreenElement(){
      return webkitCurrentFullScreenElement;
    }
    public Boolean getWebkitFullscreenEnabled(){
      return webkitFullscreenEnabled;
    }
    public PElement getWebkitFullscreenElement(){
      return webkitFullscreenElement;
    }
    public PEventHandlerNonNull getOnwebkitfullscreenchange(){
      return onwebkitfullscreenchange;
    }
    public PEventHandlerNonNull getOnwebkitfullscreenerror(){
      return onwebkitfullscreenerror;
    }
    public PSVGSVGElement getRootElement(){
      return rootElement;
    }
    public PEventHandlerNonNull getOnabort(){
      return onabort;
    }
    public PEventHandlerNonNull getOnblur(){
      return onblur;
    }
    public PEventHandlerNonNull getOncancel(){
      return oncancel;
    }
    public PEventHandlerNonNull getOncanplay(){
      return oncanplay;
    }
    public PEventHandlerNonNull getOncanplaythrough(){
      return oncanplaythrough;
    }
    public PEventHandlerNonNull getOnchange(){
      return onchange;
    }
    public PEventHandlerNonNull getOnclick(){
      return onclick;
    }
    public PEventHandlerNonNull getOnclose(){
      return onclose;
    }
    public PEventHandlerNonNull getOncontextmenu(){
      return oncontextmenu;
    }
    public PEventHandlerNonNull getOncuechange(){
      return oncuechange;
    }
    public PEventHandlerNonNull getOndblclick(){
      return ondblclick;
    }
    public PEventHandlerNonNull getOndrag(){
      return ondrag;
    }
    public PEventHandlerNonNull getOndragend(){
      return ondragend;
    }
    public PEventHandlerNonNull getOndragenter(){
      return ondragenter;
    }
    public PEventHandlerNonNull getOndragleave(){
      return ondragleave;
    }
    public PEventHandlerNonNull getOndragover(){
      return ondragover;
    }
    public PEventHandlerNonNull getOndragstart(){
      return ondragstart;
    }
    public PEventHandlerNonNull getOndrop(){
      return ondrop;
    }
    public PEventHandlerNonNull getOndurationchange(){
      return ondurationchange;
    }
    public PEventHandlerNonNull getOnemptied(){
      return onemptied;
    }
    public PEventHandlerNonNull getOnended(){
      return onended;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnfocus(){
      return onfocus;
    }
    public PEventHandlerNonNull getOninput(){
      return oninput;
    }
    public PEventHandlerNonNull getOninvalid(){
      return oninvalid;
    }
    public PEventHandlerNonNull getOnkeydown(){
      return onkeydown;
    }
    public PEventHandlerNonNull getOnkeypress(){
      return onkeypress;
    }
    public PEventHandlerNonNull getOnkeyup(){
      return onkeyup;
    }
    public PEventHandlerNonNull getOnload(){
      return onload;
    }
    public PEventHandlerNonNull getOnloadeddata(){
      return onloadeddata;
    }
    public PEventHandlerNonNull getOnloadedmetadata(){
      return onloadedmetadata;
    }
    public PEventHandlerNonNull getOnloadstart(){
      return onloadstart;
    }
    public PEventHandlerNonNull getOnmousedown(){
      return onmousedown;
    }
    public PEventHandlerNonNull getOnmouseenter(){
      return onmouseenter;
    }
    public PEventHandlerNonNull getOnmouseleave(){
      return onmouseleave;
    }
    public PEventHandlerNonNull getOnmousemove(){
      return onmousemove;
    }
    public PEventHandlerNonNull getOnmouseout(){
      return onmouseout;
    }
    public PEventHandlerNonNull getOnmouseover(){
      return onmouseover;
    }
    public PEventHandlerNonNull getOnmouseup(){
      return onmouseup;
    }
    public PEventHandlerNonNull getOnmousewheel(){
      return onmousewheel;
    }
    public PEventHandlerNonNull getOnpause(){
      return onpause;
    }
    public PEventHandlerNonNull getOnplay(){
      return onplay;
    }
    public PEventHandlerNonNull getOnplaying(){
      return onplaying;
    }
    public PEventHandlerNonNull getOnprogress(){
      return onprogress;
    }
    public PEventHandlerNonNull getOnratechange(){
      return onratechange;
    }
    public PEventHandlerNonNull getOnreset(){
      return onreset;
    }
    public PEventHandlerNonNull getOnresize(){
      return onresize;
    }
    public PEventHandlerNonNull getOnscroll(){
      return onscroll;
    }
    public PEventHandlerNonNull getOnseeked(){
      return onseeked;
    }
    public PEventHandlerNonNull getOnseeking(){
      return onseeking;
    }
    public PEventHandlerNonNull getOnselect(){
      return onselect;
    }
    public PEventHandlerNonNull getOnstalled(){
      return onstalled;
    }
    public PEventHandlerNonNull getOnsubmit(){
      return onsubmit;
    }
    public PEventHandlerNonNull getOnsuspend(){
      return onsuspend;
    }
    public PEventHandlerNonNull getOntimeupdate(){
      return ontimeupdate;
    }
    public PEventHandlerNonNull getOntoggle(){
      return ontoggle;
    }
    public PEventHandlerNonNull getOnvolumechange(){
      return onvolumechange;
    }
    public PEventHandlerNonNull getOnwaiting(){
      return onwaiting;
    }
    public PEventHandlerNonNull getOnauxclick(){
      return onauxclick;
    }
    public PEventHandlerNonNull getOngotpointercapture(){
      return ongotpointercapture;
    }
    public PEventHandlerNonNull getOnlostpointercapture(){
      return onlostpointercapture;
    }
    public PEventHandlerNonNull getOnpointerdown(){
      return onpointerdown;
    }
    public PEventHandlerNonNull getOnpointermove(){
      return onpointermove;
    }
    public PEventHandlerNonNull getOnpointerup(){
      return onpointerup;
    }
    public PEventHandlerNonNull getOnpointercancel(){
      return onpointercancel;
    }
    public PEventHandlerNonNull getOnpointerover(){
      return onpointerover;
    }
    public PEventHandlerNonNull getOnpointerout(){
      return onpointerout;
    }
    public PEventHandlerNonNull getOnpointerenter(){
      return onpointerenter;
    }
    public PEventHandlerNonNull getOnpointerleave(){
      return onpointerleave;
    }
    public PEventHandlerNonNull getOntouchcancel(){
      return ontouchcancel;
    }
    public PEventHandlerNonNull getOntouchend(){
      return ontouchend;
    }
    public PEventHandlerNonNull getOntouchmove(){
      return ontouchmove;
    }
    public PEventHandlerNonNull getOntouchstart(){
      return ontouchstart;
    }
    public PHTMLCollection getChildren(){
      return children;
    }
    public PElement getFirstElementChild(){
      return firstElementChild;
    }
    public PElement getLastElementChild(){
      return lastElementChild;
    }
    public Double getChildElementCount(){
      return childElementCount;
    }
    public PElement getActiveElement(){
      return activeElement;
    }
    public PStyleSheetList getStyleSheets(){
      return styleSheets;
    }
    public PElement getPointerLockElement(){
      return pointerLockElement;
    }
    public PElement getFullscreenElement(){
      return fullscreenElement;
    }
    public PFontFaceSet getFonts(){
      return fonts;
    }
    public PDocumentReadyState getReadyState(){
      return readyState;
    }
    public PVisibilityState getVisibilityState(){
      return visibilityState;
    }
    public PAddressSpace getAddressSpace(){
      return addressSpace;
    }


}