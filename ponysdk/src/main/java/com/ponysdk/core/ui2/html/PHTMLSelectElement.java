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

public class PHTMLSelectElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLSelectElement.class);
     private Boolean autofocus;
     private Boolean disabled;
     private PHTMLFormElement form;
     private Boolean multiple;
     private String name;
     private Boolean required;
     private Double size;
     private String type;
     private PHTMLOptionsCollection options;
     private Double length;
     private PHTMLCollection selectedOptions;
     private Double selectedIndex;
     private String value;
     private Boolean willValidate;
     private PValidityState validity;
     private String validationMessage;
     private PNodeList labels;

    public PHTMLSelectElement() {
      applyInit(widgetNoArgs());
    }

    public void setAutofocus(final Boolean autofocus)  {
       if (Objects.equals(this.autofocus, autofocus))return;
       this.autofocus = autofocus;
       log.info("autofocus" + autofocus);
       saveUpdateAttribute(PAttributeNames.AUTOFOCUS,autofocus);
    }
    public void setDisabled(final Boolean disabled)  {
       if (Objects.equals(this.disabled, disabled))return;
       this.disabled = disabled;
       log.info("disabled" + disabled);
       saveUpdateAttribute(PAttributeNames.DISABLED,disabled);
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
    public void setLength(final Double length)  {
       if (Objects.equals(this.length, length))return;
       this.length = length;
       log.info("length" + length);
       saveUpdateAttribute(PAttributeNames.LENGTH,length);
    }
    public void setSelectedIndex(final Double selectedIndex)  {
       if (Objects.equals(this.selectedIndex, selectedIndex))return;
       this.selectedIndex = selectedIndex;
       log.info("selectedIndex" + selectedIndex);
       saveUpdateAttribute(PAttributeNames.SELECTED_INDEX,selectedIndex);
    }
    public void setValue(final String value)  {
       if (Objects.equals(this.value, value))return;
       this.value = value;
       log.info("value" + value);
       saveUpdateAttribute(PAttributeNames.VALUE,value);
    }

    public Boolean getAutofocus(){
      return autofocus;
    }
    public Boolean getDisabled(){
      return disabled;
    }
    public PHTMLFormElement getForm(){
      return form;
    }
    public Boolean getMultiple(){
      return multiple;
    }
    public String getName(){
      return name;
    }
    public Boolean getRequired(){
      return required;
    }
    public Double getSize(){
      return size;
    }
    public String getType(){
      return type;
    }
    public PHTMLOptionsCollection getOptions(){
      return options;
    }
    public Double getLength(){
      return length;
    }
    public PHTMLCollection getSelectedOptions(){
      return selectedOptions;
    }
    public Double getSelectedIndex(){
      return selectedIndex;
    }
    public String getValue(){
      return value;
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

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_SELECT_ELEMENT;
    }


}