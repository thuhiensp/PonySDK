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
package com.ponysdk.core.ui2.css;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PCSSStyleDeclaration extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PCSSStyleDeclaration.class);
     private String cssText;
     private Double length;
     private PCSSRule parentRule;
     private String cssFloat;

    public PCSSStyleDeclaration() {
      applyInit(widgetNoArgs());
    }

    public void setCssText(final String cssText)  {
       if (Objects.equals(this.cssText, cssText))return;
       this.cssText = cssText;
       log.info("cssText" + cssText);
       saveUpdateAttribute(PAttributeNames.CSS_TEXT,cssText);
    }
    public void setCssFloat(final String cssFloat)  {
       if (Objects.equals(this.cssFloat, cssFloat))return;
       this.cssFloat = cssFloat;
       log.info("cssFloat" + cssFloat);
       saveUpdateAttribute(PAttributeNames.CSS_FLOAT,cssFloat);
    }

    public String getCssText(){
      return cssText;
    }
    public Double getLength(){
      return length;
    }
    public PCSSRule getParentRule(){
      return parentRule;
    }
    public String getCssFloat(){
      return cssFloat;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.CSS_STYLE_DECLARATION;
    }


}