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
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PHTMLImageElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLImageElement.class);
     private String alt;
     private String src;
     private String srcset;
     private String sizes;
     private String crossOrigin;
     private String useMap;
     private Boolean isMap;
     private Double width;
     private Double height;
     private Double naturalWidth;
     private Double naturalHeight;
     private Boolean complete;
     private String currentSrc;
     private String referrerPolicy;
     private String name;
     private String lowsrc;
     private String align;
     private Double hspace;
     private Double vspace;
     private String longDesc;
     private String border;
     private Double x;
     private Double y;

    public PHTMLImageElement() {
      applyInit(widgetNoArgs());
    }


    public PHTMLImageElement(Double width){
      applyInit(widgetWithArgs(), new Object[]{width});
    }

    public PHTMLImageElement(Double width, Double height){
      applyInit(widgetWithArgs(), new Object[]{width, height});
    }


    public void setAlt(final String alt)  {
       if (Objects.equals(this.alt, alt))return;
       this.alt = alt;
       log.info("alt" + alt);
       saveUpdateAttribute(PAttributeNames.ALT,alt);
    }
    public void setSrc(final String src)  {
       if (Objects.equals(this.src, src))return;
       this.src = src;
       log.info("src" + src);
       saveUpdateAttribute(PAttributeNames.SRC,src);
    }
    public void setSrcset(final String srcset)  {
       if (Objects.equals(this.srcset, srcset))return;
       this.srcset = srcset;
       log.info("srcset" + srcset);
       saveUpdateAttribute(PAttributeNames.SRCSET,srcset);
    }
    public void setSizes(final String sizes)  {
       if (Objects.equals(this.sizes, sizes))return;
       this.sizes = sizes;
       log.info("sizes" + sizes);
       saveUpdateAttribute(PAttributeNames.SIZES,sizes);
    }
    public void setCrossOrigin(final String crossOrigin)  {
       if (Objects.equals(this.crossOrigin, crossOrigin))return;
       this.crossOrigin = crossOrigin;
       log.info("crossOrigin" + crossOrigin);
       saveUpdateAttribute(PAttributeNames.CROSS_ORIGIN,crossOrigin);
    }
    public void setUseMap(final String useMap)  {
       if (Objects.equals(this.useMap, useMap))return;
       this.useMap = useMap;
       log.info("useMap" + useMap);
       saveUpdateAttribute(PAttributeNames.USE_MAP,useMap);
    }
    public void setIsMap(final Boolean isMap)  {
       if (Objects.equals(this.isMap, isMap))return;
       this.isMap = isMap;
       log.info("isMap" + isMap);
       saveUpdateAttribute(PAttributeNames.IS_MAP,isMap);
    }
    public void setWidth(final Double width)  {
       if (Objects.equals(this.width, width))return;
       this.width = width;
       log.info("width" + width);
       saveUpdateAttribute(PAttributeNames.WIDTH,width);
    }
    public void setHeight(final Double height)  {
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
    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setLowsrc(final String lowsrc)  {
       if (Objects.equals(this.lowsrc, lowsrc))return;
       this.lowsrc = lowsrc;
       log.info("lowsrc" + lowsrc);
       saveUpdateAttribute(PAttributeNames.LOWSRC,lowsrc);
    }
    public void setAlign(final String align)  {
       if (Objects.equals(this.align, align))return;
       this.align = align;
       log.info("align" + align);
       saveUpdateAttribute(PAttributeNames.ALIGN,align);
    }
    public void setHspace(final Double hspace)  {
       if (Objects.equals(this.hspace, hspace))return;
       this.hspace = hspace;
       log.info("hspace" + hspace);
       saveUpdateAttribute(PAttributeNames.HSPACE,hspace);
    }
    public void setVspace(final Double vspace)  {
       if (Objects.equals(this.vspace, vspace))return;
       this.vspace = vspace;
       log.info("vspace" + vspace);
       saveUpdateAttribute(PAttributeNames.VSPACE,vspace);
    }
    public void setLongDesc(final String longDesc)  {
       if (Objects.equals(this.longDesc, longDesc))return;
       this.longDesc = longDesc;
       log.info("longDesc" + longDesc);
       saveUpdateAttribute(PAttributeNames.LONG_DESC,longDesc);
    }
    public void setBorder(final String border)  {
       if (Objects.equals(this.border, border))return;
       this.border = border;
       log.info("border" + border);
       saveUpdateAttribute(PAttributeNames.BORDER,border);
    }

    public String getAlt(){
      return alt;
    }
    public String getSrc(){
      return src;
    }
    public String getSrcset(){
      return srcset;
    }
    public String getSizes(){
      return sizes;
    }
    public String getCrossOrigin(){
      return crossOrigin;
    }
    public String getUseMap(){
      return useMap;
    }
    public Boolean getIsMap(){
      return isMap;
    }
    public Double getWidth(){
      return width;
    }
    public Double getHeight(){
      return height;
    }
    public Double getNaturalWidth(){
      return naturalWidth;
    }
    public Double getNaturalHeight(){
      return naturalHeight;
    }
    public Boolean getComplete(){
      return complete;
    }
    public String getCurrentSrc(){
      return currentSrc;
    }
    public String getReferrerPolicy(){
      return referrerPolicy;
    }
    public String getName(){
      return name;
    }
    public String getLowsrc(){
      return lowsrc;
    }
    public String getAlign(){
      return align;
    }
    public Double getHspace(){
      return hspace;
    }
    public Double getVspace(){
      return vspace;
    }
    public String getLongDesc(){
      return longDesc;
    }
    public String getBorder(){
      return border;
    }
    public Double getX(){
      return x;
    }
    public Double getY(){
      return y;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_IMAGE_ELEMENT;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.HTML_IMAGE_ELEMENT;
    }


}