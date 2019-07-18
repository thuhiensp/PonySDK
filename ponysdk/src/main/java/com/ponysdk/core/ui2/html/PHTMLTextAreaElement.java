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
import com.ponysdk.core.ui2.dom.PNodeList;

public class PHTMLTextAreaElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLTextAreaElement.class);
     private Boolean autofocus;
     private Double cols;
     private String dirName;
     private Boolean disabled;
     private PHTMLFormElement form;
     private Double maxLength;
     private Double minLength;
     private String name;
     private String placeholder;
     private Boolean readOnly;
     private Boolean required;
     private Double rows;
     private String wrap;
     private String type;
     private String defaultValue;
     private String value;
     private Double textLength;
     private Boolean willValidate;
     private PValidityState validity;
     private String validationMessage;
     private PNodeList labels;
     private Double selectionStart;
     private Double selectionEnd;
     private String selectionDirection;
     private String autocapitalize;

    public PHTMLTextAreaElement() {
      applyInit(widgetNoArgs());
    }

    public void setAutofocus(final Boolean autofocus)  {
       if (Objects.equals(this.autofocus, autofocus))return;
       this.autofocus = autofocus;
       log.info("autofocus" + autofocus);
       saveUpdateAttribute(PAttributeNames.AUTOFOCUS,autofocus);
    }
    public void setCols(final Double cols)  {
       if (Objects.equals(this.cols, cols))return;
       this.cols = cols;
       log.info("cols" + cols);
       saveUpdateAttribute(PAttributeNames.COLS,cols);
    }
    public void setDirName(final String dirName)  {
       if (Objects.equals(this.dirName, dirName))return;
       this.dirName = dirName;
       log.info("dirName" + dirName);
       saveUpdateAttribute(PAttributeNames.DIR_NAME,dirName);
    }
    public void setDisabled(final Boolean disabled)  {
       if (Objects.equals(this.disabled, disabled))return;
       this.disabled = disabled;
       log.info("disabled" + disabled);
       saveUpdateAttribute(PAttributeNames.DISABLED,disabled);
    }
    public void setMaxLength(final Double maxLength)  {
       if (Objects.equals(this.maxLength, maxLength))return;
       this.maxLength = maxLength;
       log.info("maxLength" + maxLength);
       saveUpdateAttribute(PAttributeNames.MAX_LENGTH,maxLength);
    }
    public void setMinLength(final Double minLength)  {
       if (Objects.equals(this.minLength, minLength))return;
       this.minLength = minLength;
       log.info("minLength" + minLength);
       saveUpdateAttribute(PAttributeNames.MIN_LENGTH,minLength);
    }
    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setPlaceholder(final String placeholder)  {
       if (Objects.equals(this.placeholder, placeholder))return;
       this.placeholder = placeholder;
       log.info("placeholder" + placeholder);
       saveUpdateAttribute(PAttributeNames.PLACEHOLDER,placeholder);
    }
    public void setReadOnly(final Boolean readOnly)  {
       if (Objects.equals(this.readOnly, readOnly))return;
       this.readOnly = readOnly;
       log.info("readOnly" + readOnly);
       saveUpdateAttribute(PAttributeNames.READ_ONLY,readOnly);
    }
    public void setRequired(final Boolean required)  {
       if (Objects.equals(this.required, required))return;
       this.required = required;
       log.info("required" + required);
       saveUpdateAttribute(PAttributeNames.REQUIRED,required);
    }
    public void setRows(final Double rows)  {
       if (Objects.equals(this.rows, rows))return;
       this.rows = rows;
       log.info("rows" + rows);
       saveUpdateAttribute(PAttributeNames.ROWS,rows);
    }
    public void setWrap(final String wrap)  {
       if (Objects.equals(this.wrap, wrap))return;
       this.wrap = wrap;
       log.info("wrap" + wrap);
       saveUpdateAttribute(PAttributeNames.WRAP,wrap);
    }
    public void setDefaultValue(final String defaultValue)  {
       if (Objects.equals(this.defaultValue, defaultValue))return;
       this.defaultValue = defaultValue;
       log.info("defaultValue" + defaultValue);
       saveUpdateAttribute(PAttributeNames.DEFAULT_VALUE,defaultValue);
    }
    public void setValue(final String value)  {
       if (Objects.equals(this.value, value))return;
       this.value = value;
       log.info("value" + value);
       saveUpdateAttribute(PAttributeNames.VALUE,value);
    }
    public void setSelectionStart(final Double selectionStart)  {
       if (Objects.equals(this.selectionStart, selectionStart))return;
       this.selectionStart = selectionStart;
       log.info("selectionStart" + selectionStart);
       saveUpdateAttribute(PAttributeNames.SELECTION_START,selectionStart);
    }
    public void setSelectionEnd(final Double selectionEnd)  {
       if (Objects.equals(this.selectionEnd, selectionEnd))return;
       this.selectionEnd = selectionEnd;
       log.info("selectionEnd" + selectionEnd);
       saveUpdateAttribute(PAttributeNames.SELECTION_END,selectionEnd);
    }
    public void setSelectionDirection(final String selectionDirection)  {
       if (Objects.equals(this.selectionDirection, selectionDirection))return;
       this.selectionDirection = selectionDirection;
       log.info("selectionDirection" + selectionDirection);
       saveUpdateAttribute(PAttributeNames.SELECTION_DIRECTION,selectionDirection);
    }
    public void setAutocapitalize(final String autocapitalize)  {
       if (Objects.equals(this.autocapitalize, autocapitalize))return;
       this.autocapitalize = autocapitalize;
       log.info("autocapitalize" + autocapitalize);
       saveUpdateAttribute(PAttributeNames.AUTOCAPITALIZE,autocapitalize);
    }

    public Boolean getAutofocus(){
      return autofocus;
    }
    public Double getCols(){
      return cols;
    }
    public String getDirName(){
      return dirName;
    }
    public Boolean getDisabled(){
      return disabled;
    }
    public PHTMLFormElement getForm(){
      return form;
    }
    public Double getMaxLength(){
      return maxLength;
    }
    public Double getMinLength(){
      return minLength;
    }
    public String getName(){
      return name;
    }
    public String getPlaceholder(){
      return placeholder;
    }
    public Boolean getReadOnly(){
      return readOnly;
    }
    public Boolean getRequired(){
      return required;
    }
    public Double getRows(){
      return rows;
    }
    public String getWrap(){
      return wrap;
    }
    public String getType(){
      return type;
    }
    public String getDefaultValue(){
      return defaultValue;
    }
    public String getValue(){
      return value;
    }
    public Double getTextLength(){
      return textLength;
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
    public PNodeList getLabels(){
      return labels;
    }
    public Double getSelectionStart(){
      return selectionStart;
    }
    public Double getSelectionEnd(){
      return selectionEnd;
    }
    public String getSelectionDirection(){
      return selectionDirection;
    }
    public String getAutocapitalize(){
      return autocapitalize;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_TEXT_AREA_ELEMENT;
    }


}