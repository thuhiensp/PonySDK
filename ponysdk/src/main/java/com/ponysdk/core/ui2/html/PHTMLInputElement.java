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
import com.ponysdk.core.ui2.core.PDate;
import com.ponysdk.core.ui2.dom.PNodeList;
import com.ponysdk.core.ui2.fileapi.PFileList;
import com.ponysdk.core.ui2.filesystem.PEntry;

public class PHTMLInputElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLInputElement.class);
     private String accept;
     private String alt;
     private String autocomplete;
     private Boolean autofocus;
     private Boolean defaultChecked;
     private Boolean checked;
     private String dirName;
     private Boolean disabled;
     private PHTMLFormElement form;
     private PFileList files;
     private String formAction;
     private String formEnctype;
     private String formMethod;
     private Boolean formNoValidate;
     private String formTarget;
     private Double height;
     private Boolean indeterminate;
     private PHTMLElement list;
     private String max;
     private Double maxLength;
     private String min;
     private Double minLength;
     private Boolean multiple;
     private String name;
     private String pattern;
     private String placeholder;
     private Boolean readOnly;
     private Boolean required;
     private Double size;
     private String src;
     private String step;
     private String type;
     private String defaultValue;
     private String value;
     private PDate valueAsDate;
     private Double valueAsNumber;
     private Double width;
     private Boolean willValidate;
     private PValidityState validity;
     private String validationMessage;
     private PNodeList labels;
     private Double selectionStart;
     private Double selectionEnd;
     private String selectionDirection;
     private String align;
     private String useMap;
     private String autocapitalize;
     private String capture;
     private Boolean webkitdirectory;
     private Boolean incremental;
     private PEntry[] webkitEntries;

    public PHTMLInputElement() {
      applyInit(widgetNoArgs());
    }

    public void setAccept(final String accept)  {
       if (Objects.equals(this.accept, accept))return;
       this.accept = accept;
       log.info("accept" + accept);
       saveUpdateAttribute(PAttributeNames.ACCEPT,accept);
    }
    public void setAlt(final String alt)  {
       if (Objects.equals(this.alt, alt))return;
       this.alt = alt;
       log.info("alt" + alt);
       saveUpdateAttribute(PAttributeNames.ALT,alt);
    }
    public void setAutocomplete(final String autocomplete)  {
       if (Objects.equals(this.autocomplete, autocomplete))return;
       this.autocomplete = autocomplete;
       log.info("autocomplete" + autocomplete);
       saveUpdateAttribute(PAttributeNames.AUTOCOMPLETE,autocomplete);
    }
    public void setAutofocus(final Boolean autofocus)  {
       if (Objects.equals(this.autofocus, autofocus))return;
       this.autofocus = autofocus;
       log.info("autofocus" + autofocus);
       saveUpdateAttribute(PAttributeNames.AUTOFOCUS,autofocus);
    }
    public void setDefaultChecked(final Boolean defaultChecked)  {
       if (Objects.equals(this.defaultChecked, defaultChecked))return;
       this.defaultChecked = defaultChecked;
       log.info("defaultChecked" + defaultChecked);
       saveUpdateAttribute(PAttributeNames.DEFAULT_CHECKED,defaultChecked);
    }
    public void setChecked(final Boolean checked)  {
       if (Objects.equals(this.checked, checked))return;
       this.checked = checked;
       log.info("checked" + checked);
       saveUpdateAttribute(PAttributeNames.CHECKED,checked);
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
    public void setFiles(final PFileList files)  {
       if (Objects.equals(this.files, files))return;
       this.files = files;
       log.info("files" + files);
       saveUpdateAttribute(PAttributeNames.FILES,files);
    }
    public void setFormAction(final String formAction)  {
       if (Objects.equals(this.formAction, formAction))return;
       this.formAction = formAction;
       log.info("formAction" + formAction);
       saveUpdateAttribute(PAttributeNames.FORM_ACTION,formAction);
    }
    public void setFormEnctype(final String formEnctype)  {
       if (Objects.equals(this.formEnctype, formEnctype))return;
       this.formEnctype = formEnctype;
       log.info("formEnctype" + formEnctype);
       saveUpdateAttribute(PAttributeNames.FORM_ENCTYPE,formEnctype);
    }
    public void setFormMethod(final String formMethod)  {
       if (Objects.equals(this.formMethod, formMethod))return;
       this.formMethod = formMethod;
       log.info("formMethod" + formMethod);
       saveUpdateAttribute(PAttributeNames.FORM_METHOD,formMethod);
    }
    public void setFormNoValidate(final Boolean formNoValidate)  {
       if (Objects.equals(this.formNoValidate, formNoValidate))return;
       this.formNoValidate = formNoValidate;
       log.info("formNoValidate" + formNoValidate);
       saveUpdateAttribute(PAttributeNames.FORM_NO_VALIDATE,formNoValidate);
    }
    public void setFormTarget(final String formTarget)  {
       if (Objects.equals(this.formTarget, formTarget))return;
       this.formTarget = formTarget;
       log.info("formTarget" + formTarget);
       saveUpdateAttribute(PAttributeNames.FORM_TARGET,formTarget);
    }
    public void setHeight(final Double height)  {
       if (Objects.equals(this.height, height))return;
       this.height = height;
       log.info("height" + height);
       saveUpdateAttribute(PAttributeNames.HEIGHT,height);
    }
    public void setIndeterminate(final Boolean indeterminate)  {
       if (Objects.equals(this.indeterminate, indeterminate))return;
       this.indeterminate = indeterminate;
       log.info("indeterminate" + indeterminate);
       saveUpdateAttribute(PAttributeNames.INDETERMINATE,indeterminate);
    }
    public void setMax(final String max)  {
       if (Objects.equals(this.max, max))return;
       this.max = max;
       log.info("max" + max);
       saveUpdateAttribute(PAttributeNames.MAX,max);
    }
    public void setMaxLength(final Double maxLength)  {
       if (Objects.equals(this.maxLength, maxLength))return;
       this.maxLength = maxLength;
       log.info("maxLength" + maxLength);
       saveUpdateAttribute(PAttributeNames.MAX_LENGTH,maxLength);
    }
    public void setMin(final String min)  {
       if (Objects.equals(this.min, min))return;
       this.min = min;
       log.info("min" + min);
       saveUpdateAttribute(PAttributeNames.MIN,min);
    }
    public void setMinLength(final Double minLength)  {
       if (Objects.equals(this.minLength, minLength))return;
       this.minLength = minLength;
       log.info("minLength" + minLength);
       saveUpdateAttribute(PAttributeNames.MIN_LENGTH,minLength);
    }
    public void setMultiple(final Boolean multiple)  {
       if (Objects.equals(this.multiple, multiple))return;
       this.multiple = multiple;
       log.info("multiple" + multiple);
       saveUpdateAttribute(PAttributeNames.MULTIPLE,multiple);
    }
    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setPattern(final String pattern)  {
       if (Objects.equals(this.pattern, pattern))return;
       this.pattern = pattern;
       log.info("pattern" + pattern);
       saveUpdateAttribute(PAttributeNames.PATTERN,pattern);
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
    public void setSize(final Double size)  {
       if (Objects.equals(this.size, size))return;
       this.size = size;
       log.info("size" + size);
       saveUpdateAttribute(PAttributeNames.SIZE,size);
    }
    public void setSrc(final String src)  {
       if (Objects.equals(this.src, src))return;
       this.src = src;
       log.info("src" + src);
       saveUpdateAttribute(PAttributeNames.SRC,src);
    }
    public void setStep(final String step)  {
       if (Objects.equals(this.step, step))return;
       this.step = step;
       log.info("step" + step);
       saveUpdateAttribute(PAttributeNames.STEP,step);
    }
    public void setType(final String type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
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
    public void setValueAsDate(final PDate valueAsDate)  {
       if (Objects.equals(this.valueAsDate, valueAsDate))return;
       this.valueAsDate = valueAsDate;
       log.info("valueAsDate" + valueAsDate);
       saveUpdateAttribute(PAttributeNames.VALUE_AS_DATE,valueAsDate);
    }
    public void setValueAsNumber(final Double valueAsNumber)  {
       if (Objects.equals(this.valueAsNumber, valueAsNumber))return;
       this.valueAsNumber = valueAsNumber;
       log.info("valueAsNumber" + valueAsNumber);
       saveUpdateAttribute(PAttributeNames.VALUE_AS_NUMBER,valueAsNumber);
    }
    public void setWidth(final Double width)  {
       if (Objects.equals(this.width, width))return;
       this.width = width;
       log.info("width" + width);
       saveUpdateAttribute(PAttributeNames.WIDTH,width);
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
    public void setAlign(final String align)  {
       if (Objects.equals(this.align, align))return;
       this.align = align;
       log.info("align" + align);
       saveUpdateAttribute(PAttributeNames.ALIGN,align);
    }
    public void setUseMap(final String useMap)  {
       if (Objects.equals(this.useMap, useMap))return;
       this.useMap = useMap;
       log.info("useMap" + useMap);
       saveUpdateAttribute(PAttributeNames.USE_MAP,useMap);
    }
    public void setAutocapitalize(final String autocapitalize)  {
       if (Objects.equals(this.autocapitalize, autocapitalize))return;
       this.autocapitalize = autocapitalize;
       log.info("autocapitalize" + autocapitalize);
       saveUpdateAttribute(PAttributeNames.AUTOCAPITALIZE,autocapitalize);
    }
    public void setCapture(final String capture)  {
       if (Objects.equals(this.capture, capture))return;
       this.capture = capture;
       log.info("capture" + capture);
       saveUpdateAttribute(PAttributeNames.CAPTURE,capture);
    }
    public void setWebkitdirectory(final Boolean webkitdirectory)  {
       if (Objects.equals(this.webkitdirectory, webkitdirectory))return;
       this.webkitdirectory = webkitdirectory;
       log.info("webkitdirectory" + webkitdirectory);
       saveUpdateAttribute(PAttributeNames.WEBKITDIRECTORY,webkitdirectory);
    }
    public void setIncremental(final Boolean incremental)  {
       if (Objects.equals(this.incremental, incremental))return;
       this.incremental = incremental;
       log.info("incremental" + incremental);
       saveUpdateAttribute(PAttributeNames.INCREMENTAL,incremental);
    }

    public String getAccept(){
      return accept;
    }
    public String getAlt(){
      return alt;
    }
    public String getAutocomplete(){
      return autocomplete;
    }
    public Boolean getAutofocus(){
      return autofocus;
    }
    public Boolean getDefaultChecked(){
      return defaultChecked;
    }
    public Boolean getChecked(){
      return checked;
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
    public PFileList getFiles(){
      return files;
    }
    public String getFormAction(){
      return formAction;
    }
    public String getFormEnctype(){
      return formEnctype;
    }
    public String getFormMethod(){
      return formMethod;
    }
    public Boolean getFormNoValidate(){
      return formNoValidate;
    }
    public String getFormTarget(){
      return formTarget;
    }
    public Double getHeight(){
      return height;
    }
    public Boolean getIndeterminate(){
      return indeterminate;
    }
    public PHTMLElement getList(){
      return list;
    }
    public String getMax(){
      return max;
    }
    public Double getMaxLength(){
      return maxLength;
    }
    public String getMin(){
      return min;
    }
    public Double getMinLength(){
      return minLength;
    }
    public Boolean getMultiple(){
      return multiple;
    }
    public String getName(){
      return name;
    }
    public String getPattern(){
      return pattern;
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
    public Double getSize(){
      return size;
    }
    public String getSrc(){
      return src;
    }
    public String getStep(){
      return step;
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
    public PDate getValueAsDate(){
      return valueAsDate;
    }
    public Double getValueAsNumber(){
      return valueAsNumber;
    }
    public Double getWidth(){
      return width;
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
    public String getAlign(){
      return align;
    }
    public String getUseMap(){
      return useMap;
    }
    public String getAutocapitalize(){
      return autocapitalize;
    }
    public String getCapture(){
      return capture;
    }
    public Boolean getWebkitdirectory(){
      return webkitdirectory;
    }
    public Boolean getIncremental(){
      return incremental;
    }
    public PEntry[] getWebkitEntries(){
      return webkitEntries;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_INPUT_ELEMENT;
    }


}