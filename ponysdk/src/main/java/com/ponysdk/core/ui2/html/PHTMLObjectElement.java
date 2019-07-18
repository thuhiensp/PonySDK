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

public class PHTMLObjectElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLObjectElement.class);
     private String data;
     private String type;
     private String name;
     private String useMap;
     private PHTMLFormElement form;
     private String width;
     private String height;
     private PDocument contentDocument;
     private PWindow contentWindow;
     private Boolean willValidate;
     private PValidityState validity;
     private String validationMessage;
     private String align;
     private String archive;
     private String code;
     private Boolean declare;
     private Double hspace;
     private String standby;
     private Double vspace;
     private String codeBase;
     private String codeType;
     private String border;

    public PHTMLObjectElement() {
      applyInit(widgetNoArgs());
    }

    public void setData(final String data)  {
       if (Objects.equals(this.data, data))return;
       this.data = data;
       log.info("data" + data);
       saveUpdateAttribute(PAttributeNames.DATA,data);
    }
    public void setType(final String type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
    }
    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setUseMap(final String useMap)  {
       if (Objects.equals(this.useMap, useMap))return;
       this.useMap = useMap;
       log.info("useMap" + useMap);
       saveUpdateAttribute(PAttributeNames.USE_MAP,useMap);
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
    public void setAlign(final String align)  {
       if (Objects.equals(this.align, align))return;
       this.align = align;
       log.info("align" + align);
       saveUpdateAttribute(PAttributeNames.ALIGN,align);
    }
    public void setArchive(final String archive)  {
       if (Objects.equals(this.archive, archive))return;
       this.archive = archive;
       log.info("archive" + archive);
       saveUpdateAttribute(PAttributeNames.ARCHIVE,archive);
    }
    public void setCode(final String code)  {
       if (Objects.equals(this.code, code))return;
       this.code = code;
       log.info("code" + code);
       saveUpdateAttribute(PAttributeNames.CODE,code);
    }
    public void setDeclare(final Boolean declare)  {
       if (Objects.equals(this.declare, declare))return;
       this.declare = declare;
       log.info("declare" + declare);
       saveUpdateAttribute(PAttributeNames.DECLARE,declare);
    }
    public void setHspace(final Double hspace)  {
       if (Objects.equals(this.hspace, hspace))return;
       this.hspace = hspace;
       log.info("hspace" + hspace);
       saveUpdateAttribute(PAttributeNames.HSPACE,hspace);
    }
    public void setStandby(final String standby)  {
       if (Objects.equals(this.standby, standby))return;
       this.standby = standby;
       log.info("standby" + standby);
       saveUpdateAttribute(PAttributeNames.STANDBY,standby);
    }
    public void setVspace(final Double vspace)  {
       if (Objects.equals(this.vspace, vspace))return;
       this.vspace = vspace;
       log.info("vspace" + vspace);
       saveUpdateAttribute(PAttributeNames.VSPACE,vspace);
    }
    public void setCodeBase(final String codeBase)  {
       if (Objects.equals(this.codeBase, codeBase))return;
       this.codeBase = codeBase;
       log.info("codeBase" + codeBase);
       saveUpdateAttribute(PAttributeNames.CODE_BASE,codeBase);
    }
    public void setCodeType(final String codeType)  {
       if (Objects.equals(this.codeType, codeType))return;
       this.codeType = codeType;
       log.info("codeType" + codeType);
       saveUpdateAttribute(PAttributeNames.CODE_TYPE,codeType);
    }
    public void setBorder(final String border)  {
       if (Objects.equals(this.border, border))return;
       this.border = border;
       log.info("border" + border);
       saveUpdateAttribute(PAttributeNames.BORDER,border);
    }

    public String getData(){
      return data;
    }
    public String getType(){
      return type;
    }
    public String getName(){
      return name;
    }
    public String getUseMap(){
      return useMap;
    }
    public PHTMLFormElement getForm(){
      return form;
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
    public Boolean getWillValidate(){
      return willValidate;
    }
    public PValidityState getValidity(){
      return validity;
    }
    public String getValidationMessage(){
      return validationMessage;
    }
    public String getAlign(){
      return align;
    }
    public String getArchive(){
      return archive;
    }
    public String getCode(){
      return code;
    }
    public Boolean getDeclare(){
      return declare;
    }
    public Double getHspace(){
      return hspace;
    }
    public String getStandby(){
      return standby;
    }
    public Double getVspace(){
      return vspace;
    }
    public String getCodeBase(){
      return codeBase;
    }
    public String getCodeType(){
      return codeType;
    }
    public String getBorder(){
      return border;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_OBJECT_ELEMENT;
    }


}