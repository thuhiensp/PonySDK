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

public class PHTMLMetaElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLMetaElement.class);
     private String name;
     private String httpEquiv;
     private String content;
     private String scheme;

    public PHTMLMetaElement() {
      applyInit(widgetNoArgs());
    }

    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setHttpEquiv(final String httpEquiv)  {
       if (Objects.equals(this.httpEquiv, httpEquiv))return;
       this.httpEquiv = httpEquiv;
       log.info("httpEquiv" + httpEquiv);
       saveUpdateAttribute(PAttributeNames.HTTP_EQUIV,httpEquiv);
    }
    public void setContent(final String content)  {
       if (Objects.equals(this.content, content))return;
       this.content = content;
       log.info("content" + content);
       saveUpdateAttribute(PAttributeNames.CONTENT,content);
    }
    public void setScheme(final String scheme)  {
       if (Objects.equals(this.scheme, scheme))return;
       this.scheme = scheme;
       log.info("scheme" + scheme);
       saveUpdateAttribute(PAttributeNames.SCHEME,scheme);
    }

    public String getName(){
      return name;
    }
    public String getHttpEquiv(){
      return httpEquiv;
    }
    public String getContent(){
      return content;
    }
    public String getScheme(){
      return scheme;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_META_ELEMENT;
    }


}