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
package com.ponysdk.core.ui2.html;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.server.application.UIContext;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;

public class PHTMLBodyElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLBodyElement.class);
    private static final String CANONICAL_NAME = PHTMLBodyElement.class.getCanonicalName();
     private String text;
     private String link;
     private String vLink;
     private String aLink;
     private String bgColor;
     private String background;
     private PEventHandlerNonNull onorientationchange;
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

     public static PHTMLBodyElement getMain() {
          PHTMLBodyElement body = UIContext.get().getAttribute(CANONICAL_NAME);
            if (body == null) {
                  body = new PHTMLBodyElement();
                  UIContext.get().setAttribute(CANONICAL_NAME, body);
            }
            return body;
    }
    public PHTMLBodyElement() {
      applyInit(widgetNoArgs());
    }

    public void setText(final String text)  {
       if (Objects.equals(this.text, text))return;
       this.text = text;
       log.info("text" + text);
       saveUpdateAttribute(PAttributeNames.TEXT,text);
    }
    public void setLink(final String link)  {
       if (Objects.equals(this.link, link))return;
       this.link = link;
       log.info("link" + link);
       saveUpdateAttribute(PAttributeNames.LINK,link);
    }
    public void setVLink(final String vLink)  {
       if (Objects.equals(this.vLink, vLink))return;
       this.vLink = vLink;
       log.info("vLink" + vLink);
       saveUpdateAttribute(PAttributeNames.V_LINK,vLink);
    }
    public void setALink(final String aLink)  {
       if (Objects.equals(this.aLink, aLink))return;
       this.aLink = aLink;
       log.info("aLink" + aLink);
       saveUpdateAttribute(PAttributeNames.A_LINK,aLink);
    }
    public void setBgColor(final String bgColor)  {
       if (Objects.equals(this.bgColor, bgColor))return;
       this.bgColor = bgColor;
       log.info("bgColor" + bgColor);
       saveUpdateAttribute(PAttributeNames.BG_COLOR,bgColor);
    }
    public void setBackground(final String background)  {
       if (Objects.equals(this.background, background))return;
       this.background = background;
       log.info("background" + background);
       saveUpdateAttribute(PAttributeNames.BACKGROUND,background);
    }
    public void setOnorientationchange(final PEventHandlerNonNull onorientationchange, final PEventAttributesName... atrsName)  {
       addHandler(onorientationchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONORIENTATIONCHANGE, onorientationchange, atrsName);
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

    public String getText(){
      return text;
    }
    public String getLink(){
      return link;
    }
    public String getVLink(){
      return vLink;
    }
    public String getALink(){
      return aLink;
    }
    public String getBgColor(){
      return bgColor;
    }
    public String getBackground(){
      return background;
    }
    public PEventHandlerNonNull getOnorientationchange(){
      return onorientationchange;
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
      return PLeafTypeNoArgs.HTML_BODY_ELEMENT;
    }


}