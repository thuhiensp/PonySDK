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

public class PHTMLTableCellElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLTableCellElement.class);
     private Double colSpan;
     private Double rowSpan;
     private String headers;
     private Double cellIndex;
     private String align;
     private String axis;
     private String height;
     private String width;
     private String ch;
     private String chOff;
     private Boolean noWrap;
     private String vAlign;
     private String bgColor;
     private String abbr;
     private String scope;

    public PHTMLTableCellElement() {
      applyInit(widgetNoArgs());
    }

    public void setColSpan(final Double colSpan)  {
       if (Objects.equals(this.colSpan, colSpan))return;
       this.colSpan = colSpan;
       log.info("colSpan" + colSpan);
       saveUpdateAttribute(PAttributeNames.COL_SPAN,colSpan);
    }
    public void setRowSpan(final Double rowSpan)  {
       if (Objects.equals(this.rowSpan, rowSpan))return;
       this.rowSpan = rowSpan;
       log.info("rowSpan" + rowSpan);
       saveUpdateAttribute(PAttributeNames.ROW_SPAN,rowSpan);
    }
    public void setHeaders(final String headers)  {
       if (Objects.equals(this.headers, headers))return;
       this.headers = headers;
       log.info("headers" + headers);
       saveUpdateAttribute(PAttributeNames.HEADERS,headers);
    }
    public void setAlign(final String align)  {
       if (Objects.equals(this.align, align))return;
       this.align = align;
       log.info("align" + align);
       saveUpdateAttribute(PAttributeNames.ALIGN,align);
    }
    public void setAxis(final String axis)  {
       if (Objects.equals(this.axis, axis))return;
       this.axis = axis;
       log.info("axis" + axis);
       saveUpdateAttribute(PAttributeNames.AXIS,axis);
    }
    public void setHeight(final String height)  {
       if (Objects.equals(this.height, height))return;
       this.height = height;
       log.info("height" + height);
       saveUpdateAttribute(PAttributeNames.HEIGHT,height);
    }
    public void setWidth(final String width)  {
       if (Objects.equals(this.width, width))return;
       this.width = width;
       log.info("width" + width);
       saveUpdateAttribute(PAttributeNames.WIDTH,width);
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
    public void setNoWrap(final Boolean noWrap)  {
       if (Objects.equals(this.noWrap, noWrap))return;
       this.noWrap = noWrap;
       log.info("noWrap" + noWrap);
       saveUpdateAttribute(PAttributeNames.NO_WRAP,noWrap);
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
    public void setAbbr(final String abbr)  {
       if (Objects.equals(this.abbr, abbr))return;
       this.abbr = abbr;
       log.info("abbr" + abbr);
       saveUpdateAttribute(PAttributeNames.ABBR,abbr);
    }
    public void setScope(final String scope)  {
       if (Objects.equals(this.scope, scope))return;
       this.scope = scope;
       log.info("scope" + scope);
       saveUpdateAttribute(PAttributeNames.SCOPE,scope);
    }

    public Double getColSpan(){
      return colSpan;
    }
    public Double getRowSpan(){
      return rowSpan;
    }
    public String getHeaders(){
      return headers;
    }
    public Double getCellIndex(){
      return cellIndex;
    }
    public String getAlign(){
      return align;
    }
    public String getAxis(){
      return axis;
    }
    public String getHeight(){
      return height;
    }
    public String getWidth(){
      return width;
    }
    public String getCh(){
      return ch;
    }
    public String getChOff(){
      return chOff;
    }
    public Boolean getNoWrap(){
      return noWrap;
    }
    public String getVAlign(){
      return vAlign;
    }
    public String getBgColor(){
      return bgColor;
    }
    public String getAbbr(){
      return abbr;
    }
    public String getScope(){
      return scope;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_TABLE_CELL_ELEMENT;
    }


}