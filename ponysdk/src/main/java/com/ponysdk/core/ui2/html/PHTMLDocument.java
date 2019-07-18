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

public class PHTMLDocument extends PDocument {
    private static final Logger log = LoggerFactory.getLogger(PHTMLDocument.class);
     private String fgColor;
     private String linkColor;
     private String vlinkColor;
     private String alinkColor;
     private String bgColor;
     private PHTMLAllCollection all;

    private PHTMLDocument(){
}

    public void setFgColor(final String fgColor)  {
       if (Objects.equals(this.fgColor, fgColor))return;
       this.fgColor = fgColor;
       log.info("fgColor" + fgColor);
       saveUpdateAttribute(PAttributeNames.FG_COLOR,fgColor);
    }
    public void setLinkColor(final String linkColor)  {
       if (Objects.equals(this.linkColor, linkColor))return;
       this.linkColor = linkColor;
       log.info("linkColor" + linkColor);
       saveUpdateAttribute(PAttributeNames.LINK_COLOR,linkColor);
    }
    public void setVlinkColor(final String vlinkColor)  {
       if (Objects.equals(this.vlinkColor, vlinkColor))return;
       this.vlinkColor = vlinkColor;
       log.info("vlinkColor" + vlinkColor);
       saveUpdateAttribute(PAttributeNames.VLINK_COLOR,vlinkColor);
    }
    public void setAlinkColor(final String alinkColor)  {
       if (Objects.equals(this.alinkColor, alinkColor))return;
       this.alinkColor = alinkColor;
       log.info("alinkColor" + alinkColor);
       saveUpdateAttribute(PAttributeNames.ALINK_COLOR,alinkColor);
    }
    public void setBgColor(final String bgColor)  {
       if (Objects.equals(this.bgColor, bgColor))return;
       this.bgColor = bgColor;
       log.info("bgColor" + bgColor);
       saveUpdateAttribute(PAttributeNames.BG_COLOR,bgColor);
    }

    public String getFgColor(){
      return fgColor;
    }
    public String getLinkColor(){
      return linkColor;
    }
    public String getVlinkColor(){
      return vlinkColor;
    }
    public String getAlinkColor(){
      return alinkColor;
    }
    public String getBgColor(){
      return bgColor;
    }
    public PHTMLAllCollection getAll(){
      return all;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_DOCUMENT;
    }


}