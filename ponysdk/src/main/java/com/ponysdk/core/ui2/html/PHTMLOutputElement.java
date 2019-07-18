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
import com.ponysdk.core.ui2.dom.PDOMTokenList;
import com.ponysdk.core.ui2.dom.PNodeList;

public class PHTMLOutputElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLOutputElement.class);
     private PDOMTokenList htmlFor;
     private PHTMLFormElement form;
     private String name;
     private String type;
     private String defaultValue;
     private String value;
     private Boolean willValidate;
     private PValidityState validity;
     private String validationMessage;
     private PNodeList labels;

    public PHTMLOutputElement() {
      applyInit(widgetNoArgs());
    }

    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
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

    public PDOMTokenList getHtmlFor(){
      return htmlFor;
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
    public String getDefaultValue(){
      return defaultValue;
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
      return PLeafTypeNoArgs.HTML_OUTPUT_ELEMENT;
    }


}