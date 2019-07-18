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

public class PHTMLButtonElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLButtonElement.class);
     private Boolean autofocus;
     private Boolean disabled;
     private PHTMLFormElement form;
     private String formAction;
     private String formEnctype;
     private String formMethod;
     private Boolean formNoValidate;
     private String formTarget;
     private String name;
     private String type;
     private String value;
     private Boolean willValidate;
     private PValidityState validity;
     private String validationMessage;
     private PNodeList labels;

    public PHTMLButtonElement() {
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
    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setType(final String type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
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
    public String getName(){
      return name;
    }
    public String getType(){
      return type;
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
      return PLeafTypeNoArgs.HTML_BUTTON_ELEMENT;
    }


}