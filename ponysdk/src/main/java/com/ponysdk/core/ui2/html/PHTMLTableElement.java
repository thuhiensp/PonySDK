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

public class PHTMLTableElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLTableElement.class);
     private PHTMLTableCaptionElement caption;
     private PHTMLTableSectionElement tHead;
     private PHTMLTableSectionElement tFoot;
     private PHTMLCollection tBodies;
     private PHTMLCollection rows;
     private String align;
     private String border;
     private String frame;
     private String rules;
     private String summary;
     private String width;
     private String bgColor;
     private String cellPadding;
     private String cellSpacing;

    public PHTMLTableElement() {
      applyInit(widgetNoArgs());
    }

    public void setCaption(final PHTMLTableCaptionElement caption)  {
       if (Objects.equals(this.caption, caption))return;
       this.caption = caption;
       log.info("caption" + caption);
       saveUpdateAttribute(PAttributeNames.CAPTION,caption);
    }
    public void setTHead(final PHTMLTableSectionElement tHead)  {
       if (Objects.equals(this.tHead, tHead))return;
       this.tHead = tHead;
       log.info("tHead" + tHead);
       saveUpdateAttribute(PAttributeNames.T_HEAD,tHead);
    }
    public void setTFoot(final PHTMLTableSectionElement tFoot)  {
       if (Objects.equals(this.tFoot, tFoot))return;
       this.tFoot = tFoot;
       log.info("tFoot" + tFoot);
       saveUpdateAttribute(PAttributeNames.T_FOOT,tFoot);
    }
    public void setAlign(final String align)  {
       if (Objects.equals(this.align, align))return;
       this.align = align;
       log.info("align" + align);
       saveUpdateAttribute(PAttributeNames.ALIGN,align);
    }
    public void setBorder(final String border)  {
       if (Objects.equals(this.border, border))return;
       this.border = border;
       log.info("border" + border);
       saveUpdateAttribute(PAttributeNames.BORDER,border);
    }
    public void setFrame(final String frame)  {
       if (Objects.equals(this.frame, frame))return;
       this.frame = frame;
       log.info("frame" + frame);
       saveUpdateAttribute(PAttributeNames.FRAME,frame);
    }
    public void setRules(final String rules)  {
       if (Objects.equals(this.rules, rules))return;
       this.rules = rules;
       log.info("rules" + rules);
       saveUpdateAttribute(PAttributeNames.RULES,rules);
    }
    public void setSummary(final String summary)  {
       if (Objects.equals(this.summary, summary))return;
       this.summary = summary;
       log.info("summary" + summary);
       saveUpdateAttribute(PAttributeNames.SUMMARY,summary);
    }
    public void setWidth(final String width)  {
       if (Objects.equals(this.width, width))return;
       this.width = width;
       log.info("width" + width);
       saveUpdateAttribute(PAttributeNames.WIDTH,width);
    }
    public void setBgColor(final String bgColor)  {
       if (Objects.equals(this.bgColor, bgColor))return;
       this.bgColor = bgColor;
       log.info("bgColor" + bgColor);
       saveUpdateAttribute(PAttributeNames.BG_COLOR,bgColor);
    }
    public void setCellPadding(final String cellPadding)  {
       if (Objects.equals(this.cellPadding, cellPadding))return;
       this.cellPadding = cellPadding;
       log.info("cellPadding" + cellPadding);
       saveUpdateAttribute(PAttributeNames.CELL_PADDING,cellPadding);
    }
    public void setCellSpacing(final String cellSpacing)  {
       if (Objects.equals(this.cellSpacing, cellSpacing))return;
       this.cellSpacing = cellSpacing;
       log.info("cellSpacing" + cellSpacing);
       saveUpdateAttribute(PAttributeNames.CELL_SPACING,cellSpacing);
    }

    public PHTMLTableCaptionElement getCaption(){
      return caption;
    }
    public PHTMLTableSectionElement getTHead(){
      return tHead;
    }
    public PHTMLTableSectionElement getTFoot(){
      return tFoot;
    }
    public PHTMLCollection getTBodies(){
      return tBodies;
    }
    public PHTMLCollection getRows(){
      return rows;
    }
    public String getAlign(){
      return align;
    }
    public String getBorder(){
      return border;
    }
    public String getFrame(){
      return frame;
    }
    public String getRules(){
      return rules;
    }
    public String getSummary(){
      return summary;
    }
    public String getWidth(){
      return width;
    }
    public String getBgColor(){
      return bgColor;
    }
    public String getCellPadding(){
      return cellPadding;
    }
    public String getCellSpacing(){
      return cellSpacing;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_TABLE_ELEMENT;
    }


}