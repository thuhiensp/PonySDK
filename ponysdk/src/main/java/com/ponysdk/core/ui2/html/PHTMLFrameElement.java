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
import com.ponysdk.core.ui2.dom.PDocument;
import com.ponysdk.core.ui2.frame.PWindow;

public class PHTMLFrameElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLFrameElement.class);
     private String name;
     private String scrolling;
     private String src;
     private String frameBorder;
     private String longDesc;
     private Boolean noResize;
     private PDocument contentDocument;
     private PWindow contentWindow;
     private String marginHeight;
     private String marginWidth;

    public PHTMLFrameElement() {
      applyInit(widgetNoArgs());
    }

    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setScrolling(final String scrolling)  {
       if (Objects.equals(this.scrolling, scrolling))return;
       this.scrolling = scrolling;
       log.info("scrolling" + scrolling);
       saveUpdateAttribute(PAttributeNames.SCROLLING,scrolling);
    }
    public void setSrc(final String src)  {
       if (Objects.equals(this.src, src))return;
       this.src = src;
       log.info("src" + src);
       saveUpdateAttribute(PAttributeNames.SRC,src);
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
    public void setNoResize(final Boolean noResize)  {
       if (Objects.equals(this.noResize, noResize))return;
       this.noResize = noResize;
       log.info("noResize" + noResize);
       saveUpdateAttribute(PAttributeNames.NO_RESIZE,noResize);
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

    public String getName(){
      return name;
    }
    public String getScrolling(){
      return scrolling;
    }
    public String getSrc(){
      return src;
    }
    public String getFrameBorder(){
      return frameBorder;
    }
    public String getLongDesc(){
      return longDesc;
    }
    public Boolean getNoResize(){
      return noResize;
    }
    public PDocument getContentDocument(){
      return contentDocument;
    }
    public PWindow getContentWindow(){
      return contentWindow;
    }
    public String getMarginHeight(){
      return marginHeight;
    }
    public String getMarginWidth(){
      return marginWidth;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_FRAME_ELEMENT;
    }


}