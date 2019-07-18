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

public class PHTMLFormElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLFormElement.class);
     private String acceptCharset;
     private String action;
     private String autocomplete;
     private String enctype;
     private String encoding;
     private String method;
     private String name;
     private Boolean noValidate;
     private String target;
     private PHTMLFormControlsCollection elements;
     private Double length;

    public PHTMLFormElement() {
      applyInit(widgetNoArgs());
    }

    public void setAcceptCharset(final String acceptCharset)  {
       if (Objects.equals(this.acceptCharset, acceptCharset))return;
       this.acceptCharset = acceptCharset;
       log.info("acceptCharset" + acceptCharset);
       saveUpdateAttribute(PAttributeNames.ACCEPT_CHARSET,acceptCharset);
    }
    public void setAction(final String action)  {
       if (Objects.equals(this.action, action))return;
       this.action = action;
       log.info("action" + action);
       saveUpdateAttribute(PAttributeNames.ACTION,action);
    }
    public void setAutocomplete(final String autocomplete)  {
       if (Objects.equals(this.autocomplete, autocomplete))return;
       this.autocomplete = autocomplete;
       log.info("autocomplete" + autocomplete);
       saveUpdateAttribute(PAttributeNames.AUTOCOMPLETE,autocomplete);
    }
    public void setEnctype(final String enctype)  {
       if (Objects.equals(this.enctype, enctype))return;
       this.enctype = enctype;
       log.info("enctype" + enctype);
       saveUpdateAttribute(PAttributeNames.ENCTYPE,enctype);
    }
    public void setEncoding(final String encoding)  {
       if (Objects.equals(this.encoding, encoding))return;
       this.encoding = encoding;
       log.info("encoding" + encoding);
       saveUpdateAttribute(PAttributeNames.ENCODING,encoding);
    }
    public void setMethod(final String method)  {
       if (Objects.equals(this.method, method))return;
       this.method = method;
       log.info("method" + method);
       saveUpdateAttribute(PAttributeNames.METHOD,method);
    }
    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setNoValidate(final Boolean noValidate)  {
       if (Objects.equals(this.noValidate, noValidate))return;
       this.noValidate = noValidate;
       log.info("noValidate" + noValidate);
       saveUpdateAttribute(PAttributeNames.NO_VALIDATE,noValidate);
    }
    public void setTarget(final String target)  {
       if (Objects.equals(this.target, target))return;
       this.target = target;
       log.info("target" + target);
       saveUpdateAttribute(PAttributeNames.TARGET,target);
    }

    public String getAcceptCharset(){
      return acceptCharset;
    }
    public String getAction(){
      return action;
    }
    public String getAutocomplete(){
      return autocomplete;
    }
    public String getEnctype(){
      return enctype;
    }
    public String getEncoding(){
      return encoding;
    }
    public String getMethod(){
      return method;
    }
    public String getName(){
      return name;
    }
    public Boolean getNoValidate(){
      return noValidate;
    }
    public String getTarget(){
      return target;
    }
    public PHTMLFormControlsCollection getElements(){
      return elements;
    }
    public Double getLength(){
      return length;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_FORM_ELEMENT;
    }


}