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
package com.ponysdk.core.ui2.dom;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PAttr extends PNode {
    private static final Logger log = LoggerFactory.getLogger(PAttr.class);
     private String namespaceURI;
     private String prefix;
     private String localName;
     private String name;
     private String value;
     private PElement ownerElement;
     private Boolean specified;

    public PAttr() {
      applyInit(widgetNoArgs());
    }

    public void setValue(final String value)  {
       if (Objects.equals(this.value, value))return;
       this.value = value;
       log.info("value" + value);
       saveUpdateAttribute(PAttributeNames.VALUE,value);
    }

    public String getNamespaceURI(){
      return namespaceURI;
    }
    public String getPrefix(){
      return prefix;
    }
    public String getLocalName(){
      return localName;
    }
    public String getName(){
      return name;
    }
    public String getValue(){
      return value;
    }
    public PElement getOwnerElement(){
      return ownerElement;
    }
    public Boolean getSpecified(){
      return specified;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.ATTR;
    }


}