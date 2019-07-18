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

public class PHTMLTableRowElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLTableRowElement.class);
     private Double rowIndex;
     private Double sectionRowIndex;
     private PHTMLCollection cells;
     private String align;
     private String ch;
     private String chOff;
     private String vAlign;
     private String bgColor;

    public PHTMLTableRowElement() {
      applyInit(widgetNoArgs());
    }

    public void setAlign(final String align)  {
       if (Objects.equals(this.align, align))return;
       this.align = align;
       log.info("align" + align);
       saveUpdateAttribute(PAttributeNames.ALIGN,align);
    }
    public void setCh(final String ch)  {
       if (Objects.equals(this.ch, ch))return;
       this.ch = ch;
       log.info("ch" + ch);
       saveUpdateAttribute(PAttributeNames.CH,ch);
    }
    public void setChOff(final String chOff)  {
       if (Objects.equals(this.chOff, chOff))return;
       this.chOff = chOff;
       log.info("chOff" + chOff);
       saveUpdateAttribute(PAttributeNames.CH_OFF,chOff);
    }
    public void setVAlign(final String vAlign)  {
       if (Objects.equals(this.vAlign, vAlign))return;
       this.vAlign = vAlign;
       log.info("vAlign" + vAlign);
       saveUpdateAttribute(PAttributeNames.V_ALIGN,vAlign);
    }
    public void setBgColor(final String bgColor)  {
       if (Objects.equals(this.bgColor, bgColor))return;
       this.bgColor = bgColor;
       log.info("bgColor" + bgColor);
       saveUpdateAttribute(PAttributeNames.BG_COLOR,bgColor);
    }

    public Double getRowIndex(){
      return rowIndex;
    }
    public Double getSectionRowIndex(){
      return sectionRowIndex;
    }
    public PHTMLCollection getCells(){
      return cells;
    }
    public String getAlign(){
      return align;
    }
    public String getCh(){
      return ch;
    }
    public String getChOff(){
      return chOff;
    }
    public String getVAlign(){
      return vAlign;
    }
    public String getBgColor(){
      return bgColor;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_TABLE_ROW_ELEMENT;
    }


}