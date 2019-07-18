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
package com.ponysdk.core.ui2.frame;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.cachestorage.PCacheStorage;
import com.ponysdk.core.ui2.core.PJSONImpl;
import com.ponysdk.core.ui2.crypto.PCrypto;
import com.ponysdk.core.ui2.css.PStyleMedia;
import com.ponysdk.core.ui2.dom.PDocument;
import com.ponysdk.core.ui2.dom.PElement;
import com.ponysdk.core.ui2.dom.PMutationObserver;
import com.ponysdk.core.ui2.dom.PURL;
import com.ponysdk.core.ui2.events.PAnimationEvent;
import com.ponysdk.core.ui2.events.PEvent;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;
import com.ponysdk.core.ui2.events.PTransitionEvent;
import com.ponysdk.core.ui2.geometry.PDOMMatrix;
import com.ponysdk.core.ui2.html.custom.PCustomElementRegistry;
import com.ponysdk.core.ui2.indexeddb.PIDBFactory;
import com.ponysdk.core.ui2.loader.appcache.PApplicationCache;
import com.ponysdk.core.ui2.mediastream.PMediaStream;
import com.ponysdk.core.ui2.peerconnection.PRTCPeerConnection;
import com.ponysdk.core.ui2.quota.PDeprecatedStorageInfo;
import com.ponysdk.core.ui2.speech.PSpeechGrammar;
import com.ponysdk.core.ui2.speech.PSpeechGrammarList;
import com.ponysdk.core.ui2.speech.PSpeechRecognition;
import com.ponysdk.core.ui2.speech.PSpeechRecognitionError;
import com.ponysdk.core.ui2.speech.PSpeechRecognitionEvent;
import com.ponysdk.core.ui2.speech.PSpeechSynthesis;
import com.ponysdk.core.ui2.storage.PStorage;
import com.ponysdk.core.ui2.timing.PPerformance;
import com.ponysdk.core.ui2.workers.PWorklet;

public class PWindow extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PWindow.class);
     private PWindow window;
     private PWindow self;
     private PDocument document;
     private String origin;
     private String name;
     private PLocation location;
     private PHistory history;
     private PBarProp locationbar;
     private PBarProp menubar;
     private PBarProp personalbar;
     private PBarProp scrollbars;
     private PBarProp statusbar;
     private PBarProp toolbar;
     private String status;
     private Boolean closed;
     private PWindow frames;
     private Double length;
     private PWindow top;
     private PWindow opener;
     private PWindow parent;
     private PElement frameElement;
     private PNavigator navigator;
     private PApplicationCache applicationCache;
     private PCustomElementRegistry customElements;
     private PExternal external;
     private PScreen screen;
     private Double innerWidth;
     private Double innerHeight;
     private Double scrollX;
     private Double pageXOffset;
     private Double scrollY;
     private Double pageYOffset;
     private PVisualViewport visualViewport;
     private Double screenX;
     private Double screenY;
     private Double outerWidth;
     private Double outerHeight;
     private Double devicePixelRatio;
     private PConsole console;
     private PEventHandlerNonNull onorientationchange;
     private Double orientation;
     private PNavigator clientInformation;
     private PEvent event;
     private Boolean offscreenBuffering;
     private Double screenLeft;
     private Double screenTop;
     private String defaultStatus;
     private String defaultstatus;
     private PStyleMedia styleMedia;
     private PTransitionEvent WebKitTransitionEvent;
     private PAnimationEvent WebKitAnimationEvent;
     private PURL webkitURL;
     private PMutationObserver WebKitMutationObserver;
     private PEventHandlerNonNull onanimationend;
     private PEventHandlerNonNull onanimationiteration;
     private PEventHandlerNonNull onanimationstart;
     private PEventHandlerNonNull onsearch;
     private PEventHandlerNonNull ontransitionend;
     private PEventHandlerNonNull onwebkitanimationend;
     private PEventHandlerNonNull onwebkitanimationiteration;
     private PEventHandlerNonNull onwebkitanimationstart;
     private PEventHandlerNonNull onwebkittransitionend;
     private PEventHandlerNonNull onwheel;
     private Boolean isSecureContext;
     private PDOMMatrix WebKitCSSMatrix;
     private PEventHandlerNonNull onappinstalled;
     private PEventHandlerNonNull onbeforeinstallprompt;
     private PCacheStorage caches;
     private PWorklet animationWorklet;
     private PJSONImpl JSON;
     private PCrypto crypto;
     private PWorklet paintWorklet;
     private PEventHandlerNonNull ondevicemotion;
     private PEventHandlerNonNull ondeviceorientation;
     private PEventHandlerNonNull ondeviceorientationabsolute;
     private PIDBFactory indexedDB;
     private PMediaStream webkitMediaStream;
     private PRTCPeerConnection webkitRTCPeerConnection;
     private PDeprecatedStorageInfo webkitStorageInfo;
     private PSpeechGrammar webkitSpeechGrammar;
     private PSpeechGrammarList webkitSpeechGrammarList;
     private PSpeechRecognition webkitSpeechRecognition;
     private PSpeechRecognitionError webkitSpeechRecognitionError;
     private PSpeechRecognitionEvent webkitSpeechRecognitionEvent;
     private PSpeechSynthesis speechSynthesis;
     private PStorage sessionStorage;
     private PStorage localStorage;
     private PPerformance performance;
     private PWorklet audioWorklet;
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
     private PEventHandlerNonNull onbeforeunload;
     private PEventHandlerNonNull onhashchange;
     private PEventHandlerNonNull onlanguagechange;
     private PEventHandlerNonNull onmessage;
     private PEventHandlerNonNull onmessageerror;
     private PEventHandlerNonNull onoffline;
     private PEventHandlerNonNull ononline;
     private PEventHandlerNonNull onpagehide;
     private PEventHandlerNonNull onpageshow;
     private PEventHandlerNonNull onpopstate;
     private PEventHandlerNonNull onrejectionhandled;
     private PEventHandlerNonNull onstorage;
     private PEventHandlerNonNull onunhandledrejection;
     private PEventHandlerNonNull onunload;

    public PWindow() {
      applyInit(widgetNoArgs());
    }

    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setStatus(final String status)  {
       if (Objects.equals(this.status, status))return;
       this.status = status;
       log.info("status" + status);
       saveUpdateAttribute(PAttributeNames.STATUS,status);
    }
    public void setOpener(final PWindow opener)  {
       if (Objects.equals(this.opener, opener))return;
       this.opener = opener;
       log.info("opener" + opener);
       saveUpdateAttribute(PAttributeNames.OPENER,opener);
    }
    public void setOnorientationchange(final PEventHandlerNonNull onorientationchange, final PEventAttributesName... atrsName)  {
       addHandler(onorientationchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONORIENTATIONCHANGE, onorientationchange, atrsName);
    }
    public void setEvent(final PEvent event)  {
       if (Objects.equals(this.event, event))return;
       this.event = event;
       log.info("event" + event);
       saveUpdateAttribute(PAttributeNames.EVENT,event);
    }
    public void setDefaultStatus(final String defaultStatus)  {
       if (Objects.equals(this.defaultStatus, defaultStatus))return;
       this.defaultStatus = defaultStatus;
       log.info("defaultStatus" + defaultStatus);
       saveUpdateAttribute(PAttributeNames.DEFAULT_STATUS,defaultStatus);
    }
    public void setDefaultstatus(final String defaultstatus)  {
       if (Objects.equals(this.defaultstatus, defaultstatus))return;
       this.defaultstatus = defaultstatus;
       log.info("defaultstatus" + defaultstatus);
       saveUpdateAttribute(PAttributeNames.DEFAULTSTATUS,defaultstatus);
    }
    public void setWebKitTransitionEvent(final PTransitionEvent WebKitTransitionEvent)  {
       if (Objects.equals(this.WebKitTransitionEvent, WebKitTransitionEvent))return;
       this.WebKitTransitionEvent = WebKitTransitionEvent;
       log.info("WebKitTransitionEvent" + WebKitTransitionEvent);
       saveUpdateAttribute(PAttributeNames.WEB_KIT_TRANSITION_EVENT,WebKitTransitionEvent);
    }
    public void setWebKitAnimationEvent(final PAnimationEvent WebKitAnimationEvent)  {
       if (Objects.equals(this.WebKitAnimationEvent, WebKitAnimationEvent))return;
       this.WebKitAnimationEvent = WebKitAnimationEvent;
       log.info("WebKitAnimationEvent" + WebKitAnimationEvent);
       saveUpdateAttribute(PAttributeNames.WEB_KIT_ANIMATION_EVENT,WebKitAnimationEvent);
    }
    public void setWebkitURL(final PURL webkitURL)  {
       if (Objects.equals(this.webkitURL, webkitURL))return;
       this.webkitURL = webkitURL;
       log.info("webkitURL" + webkitURL);
       saveUpdateAttribute(PAttributeNames.WEBKITURL,webkitURL);
    }
    public void setWebKitMutationObserver(final PMutationObserver WebKitMutationObserver)  {
       if (Objects.equals(this.WebKitMutationObserver, WebKitMutationObserver))return;
       this.WebKitMutationObserver = WebKitMutationObserver;
       log.info("WebKitMutationObserver" + WebKitMutationObserver);
       saveUpdateAttribute(PAttributeNames.WEB_KIT_MUTATION_OBSERVER,WebKitMutationObserver);
    }
    public void setOnanimationend(final PEventHandlerNonNull onanimationend, final PEventAttributesName... atrsName)  {
       addHandler(onanimationend);
       saveUpdateAttributeCallBack(PAttributeNames.ONANIMATIONEND, onanimationend, atrsName);
    }
    public void setOnanimationiteration(final PEventHandlerNonNull onanimationiteration, final PEventAttributesName... atrsName)  {
       addHandler(onanimationiteration);
       saveUpdateAttributeCallBack(PAttributeNames.ONANIMATIONITERATION, onanimationiteration, atrsName);
    }
    public void setOnanimationstart(final PEventHandlerNonNull onanimationstart, final PEventAttributesName... atrsName)  {
       addHandler(onanimationstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONANIMATIONSTART, onanimationstart, atrsName);
    }
    public void setOnsearch(final PEventHandlerNonNull onsearch, final PEventAttributesName... atrsName)  {
       addHandler(onsearch);
       saveUpdateAttributeCallBack(PAttributeNames.ONSEARCH, onsearch, atrsName);
    }
    public void setOntransitionend(final PEventHandlerNonNull ontransitionend, final PEventAttributesName... atrsName)  {
       addHandler(ontransitionend);
       saveUpdateAttributeCallBack(PAttributeNames.ONTRANSITIONEND, ontransitionend, atrsName);
    }
    public void setOnwebkitanimationend(final PEventHandlerNonNull onwebkitanimationend, final PEventAttributesName... atrsName)  {
       addHandler(onwebkitanimationend);
       saveUpdateAttributeCallBack(PAttributeNames.ONWEBKITANIMATIONEND, onwebkitanimationend, atrsName);
    }
    public void setOnwebkitanimationiteration(final PEventHandlerNonNull onwebkitanimationiteration, final PEventAttributesName... atrsName)  {
       addHandler(onwebkitanimationiteration);
       saveUpdateAttributeCallBack(PAttributeNames.ONWEBKITANIMATIONITERATION, onwebkitanimationiteration, atrsName);
    }
    public void setOnwebkitanimationstart(final PEventHandlerNonNull onwebkitanimationstart, final PEventAttributesName... atrsName)  {
       addHandler(onwebkitanimationstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONWEBKITANIMATIONSTART, onwebkitanimationstart, atrsName);
    }
    public void setOnwebkittransitionend(final PEventHandlerNonNull onwebkittransitionend, final PEventAttributesName... atrsName)  {
       addHandler(onwebkittransitionend);
       saveUpdateAttributeCallBack(PAttributeNames.ONWEBKITTRANSITIONEND, onwebkittransitionend, atrsName);
    }
    public void setOnwheel(final PEventHandlerNonNull onwheel, final PEventAttributesName... atrsName)  {
       addHandler(onwheel);
       saveUpdateAttributeCallBack(PAttributeNames.ONWHEEL, onwheel, atrsName);
    }
    public void setWebKitCSSMatrix(final PDOMMatrix WebKitCSSMatrix)  {
       if (Objects.equals(this.WebKitCSSMatrix, WebKitCSSMatrix))return;
       this.WebKitCSSMatrix = WebKitCSSMatrix;
       log.info("WebKitCSSMatrix" + WebKitCSSMatrix);
       saveUpdateAttribute(PAttributeNames.WEB_KITCSS_MATRIX,WebKitCSSMatrix);
    }
    public void setOnappinstalled(final PEventHandlerNonNull onappinstalled, final PEventAttributesName... atrsName)  {
       addHandler(onappinstalled);
       saveUpdateAttributeCallBack(PAttributeNames.ONAPPINSTALLED, onappinstalled, atrsName);
    }
    public void setOnbeforeinstallprompt(final PEventHandlerNonNull onbeforeinstallprompt, final PEventAttributesName... atrsName)  {
       addHandler(onbeforeinstallprompt);
       saveUpdateAttributeCallBack(PAttributeNames.ONBEFOREINSTALLPROMPT, onbeforeinstallprompt, atrsName);
    }
    public void setOndevicemotion(final PEventHandlerNonNull ondevicemotion, final PEventAttributesName... atrsName)  {
       addHandler(ondevicemotion);
       saveUpdateAttributeCallBack(PAttributeNames.ONDEVICEMOTION, ondevicemotion, atrsName);
    }
    public void setOndeviceorientation(final PEventHandlerNonNull ondeviceorientation, final PEventAttributesName... atrsName)  {
       addHandler(ondeviceorientation);
       saveUpdateAttributeCallBack(PAttributeNames.ONDEVICEORIENTATION, ondeviceorientation, atrsName);
    }
    public void setOndeviceorientationabsolute(final PEventHandlerNonNull ondeviceorientationabsolute, final PEventAttributesName... atrsName)  {
       addHandler(ondeviceorientationabsolute);
       saveUpdateAttributeCallBack(PAttributeNames.ONDEVICEORIENTATIONABSOLUTE, ondeviceorientationabsolute, atrsName);
    }
    public void setWebkitMediaStream(final PMediaStream webkitMediaStream)  {
       if (Objects.equals(this.webkitMediaStream, webkitMediaStream))return;
       this.webkitMediaStream = webkitMediaStream;
       log.info("webkitMediaStream" + webkitMediaStream);
       saveUpdateAttribute(PAttributeNames.WEBKIT_MEDIA_STREAM,webkitMediaStream);
    }
    public void setWebkitRTCPeerConnection(final PRTCPeerConnection webkitRTCPeerConnection)  {
       if (Objects.equals(this.webkitRTCPeerConnection, webkitRTCPeerConnection))return;
       this.webkitRTCPeerConnection = webkitRTCPeerConnection;
       log.info("webkitRTCPeerConnection" + webkitRTCPeerConnection);
       saveUpdateAttribute(PAttributeNames.WEBKITRTC_PEER_CONNECTION,webkitRTCPeerConnection);
    }
    public void setWebkitSpeechGrammar(final PSpeechGrammar webkitSpeechGrammar)  {
       if (Objects.equals(this.webkitSpeechGrammar, webkitSpeechGrammar))return;
       this.webkitSpeechGrammar = webkitSpeechGrammar;
       log.info("webkitSpeechGrammar" + webkitSpeechGrammar);
       saveUpdateAttribute(PAttributeNames.WEBKIT_SPEECH_GRAMMAR,webkitSpeechGrammar);
    }
    public void setWebkitSpeechGrammarList(final PSpeechGrammarList webkitSpeechGrammarList)  {
       if (Objects.equals(this.webkitSpeechGrammarList, webkitSpeechGrammarList))return;
       this.webkitSpeechGrammarList = webkitSpeechGrammarList;
       log.info("webkitSpeechGrammarList" + webkitSpeechGrammarList);
       saveUpdateAttribute(PAttributeNames.WEBKIT_SPEECH_GRAMMAR_LIST,webkitSpeechGrammarList);
    }
    public void setWebkitSpeechRecognition(final PSpeechRecognition webkitSpeechRecognition)  {
       if (Objects.equals(this.webkitSpeechRecognition, webkitSpeechRecognition))return;
       this.webkitSpeechRecognition = webkitSpeechRecognition;
       log.info("webkitSpeechRecognition" + webkitSpeechRecognition);
       saveUpdateAttribute(PAttributeNames.WEBKIT_SPEECH_RECOGNITION,webkitSpeechRecognition);
    }
    public void setWebkitSpeechRecognitionError(final PSpeechRecognitionError webkitSpeechRecognitionError)  {
       if (Objects.equals(this.webkitSpeechRecognitionError, webkitSpeechRecognitionError))return;
       this.webkitSpeechRecognitionError = webkitSpeechRecognitionError;
       log.info("webkitSpeechRecognitionError" + webkitSpeechRecognitionError);
       saveUpdateAttribute(PAttributeNames.WEBKIT_SPEECH_RECOGNITION_ERROR,webkitSpeechRecognitionError);
    }
    public void setWebkitSpeechRecognitionEvent(final PSpeechRecognitionEvent webkitSpeechRecognitionEvent)  {
       if (Objects.equals(this.webkitSpeechRecognitionEvent, webkitSpeechRecognitionEvent))return;
       this.webkitSpeechRecognitionEvent = webkitSpeechRecognitionEvent;
       log.info("webkitSpeechRecognitionEvent" + webkitSpeechRecognitionEvent);
       saveUpdateAttribute(PAttributeNames.WEBKIT_SPEECH_RECOGNITION_EVENT,webkitSpeechRecognitionEvent);
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
    public void setOnbeforeunload(final PEventHandlerNonNull onbeforeunload, final PEventAttributesName... atrsName)  {
       addHandler(onbeforeunload);
       saveUpdateAttributeCallBack(PAttributeNames.ONBEFOREUNLOAD, onbeforeunload, atrsName);
    }
    public void setOnhashchange(final PEventHandlerNonNull onhashchange, final PEventAttributesName... atrsName)  {
       addHandler(onhashchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONHASHCHANGE, onhashchange, atrsName);
    }
    public void setOnlanguagechange(final PEventHandlerNonNull onlanguagechange, final PEventAttributesName... atrsName)  {
       addHandler(onlanguagechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONLANGUAGECHANGE, onlanguagechange, atrsName);
    }
    public void setOnmessage(final PEventHandlerNonNull onmessage, final PEventAttributesName... atrsName)  {
       addHandler(onmessage);
       saveUpdateAttributeCallBack(PAttributeNames.ONMESSAGE, onmessage, atrsName);
    }
    public void setOnmessageerror(final PEventHandlerNonNull onmessageerror, final PEventAttributesName... atrsName)  {
       addHandler(onmessageerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONMESSAGEERROR, onmessageerror, atrsName);
    }
    public void setOnoffline(final PEventHandlerNonNull onoffline, final PEventAttributesName... atrsName)  {
       addHandler(onoffline);
       saveUpdateAttributeCallBack(PAttributeNames.ONOFFLINE, onoffline, atrsName);
    }
    public void setOnonline(final PEventHandlerNonNull ononline, final PEventAttributesName... atrsName)  {
       addHandler(ononline);
       saveUpdateAttributeCallBack(PAttributeNames.ONONLINE, ononline, atrsName);
    }
    public void setOnpagehide(final PEventHandlerNonNull onpagehide, final PEventAttributesName... atrsName)  {
       addHandler(onpagehide);
       saveUpdateAttributeCallBack(PAttributeNames.ONPAGEHIDE, onpagehide, atrsName);
    }
    public void setOnpageshow(final PEventHandlerNonNull onpageshow, final PEventAttributesName... atrsName)  {
       addHandler(onpageshow);
       saveUpdateAttributeCallBack(PAttributeNames.ONPAGESHOW, onpageshow, atrsName);
    }
    public void setOnpopstate(final PEventHandlerNonNull onpopstate, final PEventAttributesName... atrsName)  {
       addHandler(onpopstate);
       saveUpdateAttributeCallBack(PAttributeNames.ONPOPSTATE, onpopstate, atrsName);
    }
    public void setOnrejectionhandled(final PEventHandlerNonNull onrejectionhandled, final PEventAttributesName... atrsName)  {
       addHandler(onrejectionhandled);
       saveUpdateAttributeCallBack(PAttributeNames.ONREJECTIONHANDLED, onrejectionhandled, atrsName);
    }
    public void setOnstorage(final PEventHandlerNonNull onstorage, final PEventAttributesName... atrsName)  {
       addHandler(onstorage);
       saveUpdateAttributeCallBack(PAttributeNames.ONSTORAGE, onstorage, atrsName);
    }
    public void setOnunhandledrejection(final PEventHandlerNonNull onunhandledrejection, final PEventAttributesName... atrsName)  {
       addHandler(onunhandledrejection);
       saveUpdateAttributeCallBack(PAttributeNames.ONUNHANDLEDREJECTION, onunhandledrejection, atrsName);
    }
    public void setOnunload(final PEventHandlerNonNull onunload, final PEventAttributesName... atrsName)  {
       addHandler(onunload);
       saveUpdateAttributeCallBack(PAttributeNames.ONUNLOAD, onunload, atrsName);
    }

    public PWindow getWindow(){
      return window;
    }
    public PWindow getSelf(){
      return self;
    }
    public PDocument getDocument(){
      return document;
    }
    public String getOrigin(){
      return origin;
    }
    public String getName(){
      return name;
    }
    public PLocation getLocation(){
      return location;
    }
    public PHistory getHistory(){
      return history;
    }
    public PBarProp getLocationbar(){
      return locationbar;
    }
    public PBarProp getMenubar(){
      return menubar;
    }
    public PBarProp getPersonalbar(){
      return personalbar;
    }
    public PBarProp getScrollbars(){
      return scrollbars;
    }
    public PBarProp getStatusbar(){
      return statusbar;
    }
    public PBarProp getToolbar(){
      return toolbar;
    }
    public String getStatus(){
      return status;
    }
    public Boolean getClosed(){
      return closed;
    }
    public PWindow getFrames(){
      return frames;
    }
    public Double getLength(){
      return length;
    }
    public PWindow getTop(){
      return top;
    }
    public PWindow getOpener(){
      return opener;
    }
    public PWindow getParent(){
      return parent;
    }
    public PElement getFrameElement(){
      return frameElement;
    }
    public PNavigator getNavigator(){
      return navigator;
    }
    public PApplicationCache getApplicationCache(){
      return applicationCache;
    }
    public PCustomElementRegistry getCustomElements(){
      return customElements;
    }
    public PExternal getExternal(){
      return external;
    }
    public PScreen getScreen(){
      return screen;
    }
    public Double getInnerWidth(){
      return innerWidth;
    }
    public Double getInnerHeight(){
      return innerHeight;
    }
    public Double getScrollX(){
      return scrollX;
    }
    public Double getPageXOffset(){
      return pageXOffset;
    }
    public Double getScrollY(){
      return scrollY;
    }
    public Double getPageYOffset(){
      return pageYOffset;
    }
    public PVisualViewport getVisualViewport(){
      return visualViewport;
    }
    public Double getScreenX(){
      return screenX;
    }
    public Double getScreenY(){
      return screenY;
    }
    public Double getOuterWidth(){
      return outerWidth;
    }
    public Double getOuterHeight(){
      return outerHeight;
    }
    public Double getDevicePixelRatio(){
      return devicePixelRatio;
    }
    public PConsole getConsole(){
      return console;
    }
    public PEventHandlerNonNull getOnorientationchange(){
      return onorientationchange;
    }
    public Double getOrientation(){
      return orientation;
    }
    public PNavigator getClientInformation(){
      return clientInformation;
    }
    public PEvent getEvent(){
      return event;
    }
    public Boolean getOffscreenBuffering(){
      return offscreenBuffering;
    }
    public Double getScreenLeft(){
      return screenLeft;
    }
    public Double getScreenTop(){
      return screenTop;
    }
    public String getDefaultStatus(){
      return defaultStatus;
    }
    public String getDefaultstatus(){
      return defaultstatus;
    }
    public PStyleMedia getStyleMedia(){
      return styleMedia;
    }
    public PTransitionEvent getWebKitTransitionEvent(){
      return WebKitTransitionEvent;
    }
    public PAnimationEvent getWebKitAnimationEvent(){
      return WebKitAnimationEvent;
    }
    public PURL getWebkitURL(){
      return webkitURL;
    }
    public PMutationObserver getWebKitMutationObserver(){
      return WebKitMutationObserver;
    }
    public PEventHandlerNonNull getOnanimationend(){
      return onanimationend;
    }
    public PEventHandlerNonNull getOnanimationiteration(){
      return onanimationiteration;
    }
    public PEventHandlerNonNull getOnanimationstart(){
      return onanimationstart;
    }
    public PEventHandlerNonNull getOnsearch(){
      return onsearch;
    }
    public PEventHandlerNonNull getOntransitionend(){
      return ontransitionend;
    }
    public PEventHandlerNonNull getOnwebkitanimationend(){
      return onwebkitanimationend;
    }
    public PEventHandlerNonNull getOnwebkitanimationiteration(){
      return onwebkitanimationiteration;
    }
    public PEventHandlerNonNull getOnwebkitanimationstart(){
      return onwebkitanimationstart;
    }
    public PEventHandlerNonNull getOnwebkittransitionend(){
      return onwebkittransitionend;
    }
    public PEventHandlerNonNull getOnwheel(){
      return onwheel;
    }
    public Boolean getIsSecureContext(){
      return isSecureContext;
    }
    public PDOMMatrix getWebKitCSSMatrix(){
      return WebKitCSSMatrix;
    }
    public PEventHandlerNonNull getOnappinstalled(){
      return onappinstalled;
    }
    public PEventHandlerNonNull getOnbeforeinstallprompt(){
      return onbeforeinstallprompt;
    }
    public PCacheStorage getCaches(){
      return caches;
    }
    public PWorklet getAnimationWorklet(){
      return animationWorklet;
    }
    public PJSONImpl getJSON(){
      return JSON;
    }
    public PCrypto getCrypto(){
      return crypto;
    }
    public PWorklet getPaintWorklet(){
      return paintWorklet;
    }
    public PEventHandlerNonNull getOndevicemotion(){
      return ondevicemotion;
    }
    public PEventHandlerNonNull getOndeviceorientation(){
      return ondeviceorientation;
    }
    public PEventHandlerNonNull getOndeviceorientationabsolute(){
      return ondeviceorientationabsolute;
    }
    public PIDBFactory getIndexedDB(){
      return indexedDB;
    }
    public PMediaStream getWebkitMediaStream(){
      return webkitMediaStream;
    }
    public PRTCPeerConnection getWebkitRTCPeerConnection(){
      return webkitRTCPeerConnection;
    }
    public PDeprecatedStorageInfo getWebkitStorageInfo(){
      return webkitStorageInfo;
    }
    public PSpeechGrammar getWebkitSpeechGrammar(){
      return webkitSpeechGrammar;
    }
    public PSpeechGrammarList getWebkitSpeechGrammarList(){
      return webkitSpeechGrammarList;
    }
    public PSpeechRecognition getWebkitSpeechRecognition(){
      return webkitSpeechRecognition;
    }
    public PSpeechRecognitionError getWebkitSpeechRecognitionError(){
      return webkitSpeechRecognitionError;
    }
    public PSpeechRecognitionEvent getWebkitSpeechRecognitionEvent(){
      return webkitSpeechRecognitionEvent;
    }
    public PSpeechSynthesis getSpeechSynthesis(){
      return speechSynthesis;
    }
    public PStorage getSessionStorage(){
      return sessionStorage;
    }
    public PStorage getLocalStorage(){
      return localStorage;
    }
    public PPerformance getPerformance(){
      return performance;
    }
    public PWorklet getAudioWorklet(){
      return audioWorklet;
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
    public PEventHandlerNonNull getOnbeforeunload(){
      return onbeforeunload;
    }
    public PEventHandlerNonNull getOnhashchange(){
      return onhashchange;
    }
    public PEventHandlerNonNull getOnlanguagechange(){
      return onlanguagechange;
    }
    public PEventHandlerNonNull getOnmessage(){
      return onmessage;
    }
    public PEventHandlerNonNull getOnmessageerror(){
      return onmessageerror;
    }
    public PEventHandlerNonNull getOnoffline(){
      return onoffline;
    }
    public PEventHandlerNonNull getOnonline(){
      return ononline;
    }
    public PEventHandlerNonNull getOnpagehide(){
      return onpagehide;
    }
    public PEventHandlerNonNull getOnpageshow(){
      return onpageshow;
    }
    public PEventHandlerNonNull getOnpopstate(){
      return onpopstate;
    }
    public PEventHandlerNonNull getOnrejectionhandled(){
      return onrejectionhandled;
    }
    public PEventHandlerNonNull getOnstorage(){
      return onstorage;
    }
    public PEventHandlerNonNull getOnunhandledrejection(){
      return onunhandledrejection;
    }
    public PEventHandlerNonNull getOnunload(){
      return onunload;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.WINDOW;
    }


}