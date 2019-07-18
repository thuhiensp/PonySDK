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

public class PHTMLScriptElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLScriptElement.class);
     private String src;
     private String type;
     private Boolean noModule;
     private String charset;
     private Boolean async;
     private Boolean defer;
     private String crossOrigin;
     private String text;
     private String event;
     private String htmlFor;
     private String integrity;

    public PHTMLScriptElement() {
      applyInit(widgetNoArgs());
    }

    public void setSrc(final String src)  {
       if (Objects.equals(this.src, src))return;
       this.src = src;
       log.info("src" + src);
       saveUpdateAttribute(PAttributeNames.SRC,src);
    }
    public void setType(final String type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
    }
    public void setNoModule(final Boolean noModule)  {
       if (Objects.equals(this.noModule, noModule))return;
       this.noModule = noModule;
       log.info("noModule" + noModule);
       saveUpdateAttribute(PAttributeNames.NO_MODULE,noModule);
    }
    public void setCharset(final String charset)  {
       if (Objects.equals(this.charset, charset))return;
       this.charset = charset;
       log.info("charset" + charset);
       saveUpdateAttribute(PAttributeNames.CHARSET,charset);
    }
    public void setAsync(final Boolean async)  {
       if (Objects.equals(this.async, async))return;
       this.async = async;
       log.info("async" + async);
       saveUpdateAttribute(PAttributeNames.ASYNC,async);
    }
    public void setDefer(final Boolean defer)  {
       if (Objects.equals(this.defer, defer))return;
       this.defer = defer;
       log.info("defer" + defer);
       saveUpdateAttribute(PAttributeNames.DEFER,defer);
    }
    public void setCrossOrigin(final String crossOrigin)  {
       if (Objects.equals(this.crossOrigin, crossOrigin))return;
       this.crossOrigin = crossOrigin;
       log.info("crossOrigin" + crossOrigin);
       saveUpdateAttribute(PAttributeNames.CROSS_ORIGIN,crossOrigin);
    }
    public void setText(final String text)  {
       if (Objects.equals(this.text, text))return;
       this.text = text;
       log.info("text" + text);
       saveUpdateAttribute(PAttributeNames.TEXT,text);
    }
    public void setEvent(final String event)  {
       if (Objects.equals(this.event, event))return;
       this.event = event;
       log.info("event" + event);
       saveUpdateAttribute(PAttributeNames.EVENT,event);
    }
    public void setHtmlFor(final String htmlFor)  {
       if (Objects.equals(this.htmlFor, htmlFor))return;
       this.htmlFor = htmlFor;
       log.info("htmlFor" + htmlFor);
       saveUpdateAttribute(PAttributeNames.HTML_FOR,htmlFor);
    }
    public void setIntegrity(final String integrity)  {
       if (Objects.equals(this.integrity, integrity))return;
       this.integrity = integrity;
       log.info("integrity" + integrity);
       saveUpdateAttribute(PAttributeNames.INTEGRITY,integrity);
    }

    public String getSrc(){
      return src;
    }
    public String getType(){
      return type;
    }
    public Boolean getNoModule(){
      return noModule;
    }
    public String getCharset(){
      return charset;
    }
    public Boolean getAsync(){
      return async;
    }
    public Boolean getDefer(){
      return defer;
    }
    public String getCrossOrigin(){
      return crossOrigin;
    }
    public String getText(){
      return text;
    }
    public String getEvent(){
      return event;
    }
    public String getHtmlFor(){
      return htmlFor;
    }
    public String getIntegrity(){
      return integrity;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_SCRIPT_ELEMENT;
    }


}