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

public class PHTMLOptionElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLOptionElement.class);
     private Boolean disabled;
     private PHTMLFormElement form;
     private String label;
     private Boolean defaultSelected;
     private Boolean selected;
     private String value;
     private String text;
     private Double index;

    public PHTMLOptionElement() {
      applyInit(widgetNoArgs());
    }


    public PHTMLOptionElement(String data){
      applyInit(widgetWithArgs(), new Object[]{data});
    }

    public PHTMLOptionElement(String data, String value){
      applyInit(widgetWithArgs(), new Object[]{data, value});
    }

    public PHTMLOptionElement(String data, String value, Boolean defaultSelected){
      applyInit(widgetWithArgs(), new Object[]{data, value, defaultSelected});
    }

    public PHTMLOptionElement(String data, String value, Boolean defaultSelected, Boolean selected){
      applyInit(widgetWithArgs(), new Object[]{data, value, defaultSelected, selected});
    }


    public void setDisabled(final Boolean disabled)  {
       if (Objects.equals(this.disabled, disabled))return;
       this.disabled = disabled;
       log.info("disabled" + disabled);
       saveUpdateAttribute(PAttributeNames.DISABLED,disabled);
    }
    public void setLabel(final String label)  {
       if (Objects.equals(this.label, label))return;
       this.label = label;
       log.info("label" + label);
       saveUpdateAttribute(PAttributeNames.LABEL,label);
    }
    public void setDefaultSelected(final Boolean defaultSelected)  {
       if (Objects.equals(this.defaultSelected, defaultSelected))return;
       this.defaultSelected = defaultSelected;
       log.info("defaultSelected" + defaultSelected);
       saveUpdateAttribute(PAttributeNames.DEFAULT_SELECTED,defaultSelected);
    }
    public void setSelected(final Boolean selected)  {
       if (Objects.equals(this.selected, selected))return;
       this.selected = selected;
       log.info("selected" + selected);
       saveUpdateAttribute(PAttributeNames.SELECTED,selected);
    }
    public void setValue(final String value)  {
       if (Objects.equals(this.value, value))return;
       this.value = value;
       log.info("value" + value);
       saveUpdateAttribute(PAttributeNames.VALUE,value);
    }
    public void setText(final String text)  {
       if (Objects.equals(this.text, text))return;
       this.text = text;
       log.info("text" + text);
       saveUpdateAttribute(PAttributeNames.TEXT,text);
    }

    public Boolean getDisabled(){
      return disabled;
    }
    public PHTMLFormElement getForm(){
      return form;
    }
    public String getLabel(){
      return label;
    }
    public Boolean getDefaultSelected(){
      return defaultSelected;
    }
    public Boolean getSelected(){
      return selected;
    }
    public String getValue(){
      return value;
    }
    public String getText(){
      return text;
    }
    public Double getIndex(){
      return index;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_OPTION_ELEMENT;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.HTML_OPTION_ELEMENT;
    }


}