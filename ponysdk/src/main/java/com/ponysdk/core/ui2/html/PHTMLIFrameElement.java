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
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.dom.PDOMTokenList;
import com.ponysdk.core.ui2.dom.PDocument;
import com.ponysdk.core.ui2.frame.PWindow;

public class PHTMLIFrameElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLIFrameElement.class);
     private String src;
     private String srcdoc;
     private String name;
     private PDOMTokenList sandbox;
     private Boolean allowFullscreen;
     private String width;
     private String height;
     private PDocument contentDocument;
     private PWindow contentWindow;
     private String referrerPolicy;
     private String csp;
     private PDOMTokenList allow;
     private String align;
     private String scrolling;
     private String frameBorder;
     private String longDesc;
     private String marginHeight;
     private String marginWidth;

    public PHTMLIFrameElement() {
      applyInit(widgetNoArgs());
    }

    public void setSrc(final String src)  {
       if (Objects.equals(this.src, src))return;
       this.src = src;
       log.info("src" + src);
       saveUpdateAttribute(PAttributeNames.SRC,src);
    }
    public void setSrcdoc(final String srcdoc)  {
       if (Objects.equals(this.srcdoc, srcdoc))return;
       this.srcdoc = srcdoc;
       log.info("srcdoc" + srcdoc);
       saveUpdateAttribute(PAttributeNames.SRCDOC,srcdoc);
    }
    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setAllowFullscreen(final Boolean allowFullscreen)  {
       if (Objects.equals(this.allowFullscreen, allowFullscreen))return;
       this.allowFullscreen = allowFullscreen;
       log.info("allowFullscreen" + allowFullscreen);
       saveUpdateAttribute(PAttributeNames.ALLOW_FULLSCREEN,allowFullscreen);
    }
    public void setWidth(final String width)  {
       if (Objects.equals(this.width, width))return;
       this.width = width;
       log.info("width" + width);
       saveUpdateAttribute(PAttributeNames.WIDTH,width);
    }
    public void setHeight(final String height)  {
       if (Objects.equals(this.height, height))return;
       this.height = height;
       log.info("height" + height);
       saveUpdateAttribute(PAttributeNames.HEIGHT,height);
    }
    public void setReferrerPolicy(final String referrerPolicy)  {
       if (Objects.equals(this.referrerPolicy, referrerPolicy))return;
       this.referrerPolicy = referrerPolicy;
       log.info("referrerPolicy" + referrerPolicy);
       saveUpdateAttribute(PAttributeNames.REFERRER_POLICY,referrerPolicy);
    }
    public void setCsp(final String csp)  {
       if (Objects.equals(this.csp, csp))return;
       this.csp = csp;
       log.info("csp" + csp);
       saveUpdateAttribute(PAttributeNames.CSP,csp);
    }
    public void setAlign(final String align)  {
       if (Objects.equals(this.align, align))return;
       this.align = align;
       log.info("align" + align);
       saveUpdateAttribute(PAttributeNames.ALIGN,align);
    }
    public void setScrolling(final String scrolling)  {
       if (Objects.equals(this.scrolling, scrolling))return;
       this.scrolling = scrolling;
       log.info("scrolling" + scrolling);
       saveUpdateAttribute(PAttributeNames.SCROLLING,scrolling);
    }
    public void setFrameBorder(final String frameBorder)  {
       if (Objects.equals(this.frameBorder, frameBorder))return;
       this.frameBorder = frameBorder;
       log.info("frameBorder" + frameBorder);
       saveUpdateAttribute(PAttributeNames.FRAME_BORDER,frameBorder);
    }
    public void setLongDesc(final String longDesc)  {
       if (Objects.equals(this.longDesc, longDesc))return;
       this.longDesc = longDesc;
       log.info("longDesc" + longDesc);
       saveUpdateAttribute(PAttributeNames.LONG_DESC,longDesc);
    }
    public void setMarginHeight(final String marginHeight)  {
       if (Objects.equals(this.marginHeight, marginHeight))return;
       this.marginHeight = marginHeight;
       log.info("marginHeight" + marginHeight);
       saveUpdateAttribute(PAttributeNames.MARGIN_HEIGHT,marginHeight);
    }
    public void setMarginWidth(final String marginWidth)  {
       if (Objects.equals(this.marginWidth, marginWidth))return;
       this.marginWidth = marginWidth;
       log.info("marginWidth" + marginWidth);
       saveUpdateAttribute(PAttributeNames.MARGIN_WIDTH,marginWidth);
    }

    public String getSrc(){
      return src;
    }
    public String getSrcdoc(){
      return srcdoc;
    }
    public String getName(){
      return name;
    }
    public PDOMTokenList getSandbox(){
      return sandbox;
    }
    public Boolean getAllowFullscreen(){
      return allowFullscreen;
    }
    public String getWidth(){
      return width;
    }
    public String getHeight(){
      return height;
    }
    public PDocument getContentDocument(){
      return contentDocument;
    }
    public PWindow getContentWindow(){
      return contentWindow;
    }
    public String getReferrerPolicy(){
      return referrerPolicy;
    }
    public String getCsp(){
      return csp;
    }
    public PDOMTokenList getAllow(){
      return allow;
    }
    public String getAlign(){
      return align;
    }
    public String getScrolling(){
      return scrolling;
    }
    public String getFrameBorder(){
      return frameBorder;
    }
    public String getLongDesc(){
      return longDesc;
    }
    public String getMarginHeight(){
      return marginHeight;
    }
    public String getMarginWidth(){
      return marginWidth;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTMLI_FRAME_ELEMENT;
    }


}