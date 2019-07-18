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

public class PHTMLParamElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLParamElement.class);
     private String name;
     private String value;
     private String type;
     private String valueType;

    public PHTMLParamElement() {
      applyInit(widgetNoArgs());
    }

    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setValue(final String value)  {
       if (Objects.equals(this.value, value))return;
       this.value = value;
       log.info("value" + value);
       saveUpdateAttribute(PAttributeNames.VALUE,value);
    }
    public void setType(final String type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
    }
    public void setValueType(final String valueType)  {
       if (Objects.equals(this.valueType, valueType))return;
       this.valueType = valueType;
       log.info("valueType" + valueType);
       saveUpdateAttribute(PAttributeNames.VALUE_TYPE,valueType);
    }

    public String getName(){
      return name;
    }
    public String getValue(){
      return value;
    }
    public String getType(){
      return type;
    }
    public String getValueType(){
      return valueType;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_PARAM_ELEMENT;
    }


}