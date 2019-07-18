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

public class PHTMLFieldSetElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLFieldSetElement.class);
     private Boolean disabled;
     private PHTMLFormElement form;
     private String name;
     private String type;
     private PHTMLCollection elements;
     private Boolean willValidate;
     private PValidityState validity;
     private String validationMessage;

    public PHTMLFieldSetElement() {
      applyInit(widgetNoArgs());
    }

    public void setDisabled(final Boolean disabled)  {
       if (Objects.equals(this.disabled, disabled))return;
       this.disabled = disabled;
       log.info("disabled" + disabled);
       saveUpdateAttribute(PAttributeNames.DISABLED,disabled);
    }
    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }

    public Boolean getDisabled(){
      return disabled;
    }
    public PHTMLFormElement getForm(){
      return form;
    }
    public String getName(){
      return name;
    }
    public String getType(){
      return type;
    }
    public PHTMLCollection getElements(){
      return elements;
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

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_FIELD_SET_ELEMENT;
    }


}