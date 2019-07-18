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

public abstract class PCSSRule extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PCSSRule.class);
     private Short type;
     private String cssText;
     private PCSSRule parentRule;
     private PCSSStyleSheet parentStyleSheet;

    public void setCssText(final String cssText)  {
       if (Objects.equals(this.cssText, cssText))return;
       this.cssText = cssText;
       log.info("cssText" + cssText);
       saveUpdateAttribute(PAttributeNames.CSS_TEXT,cssText);
    }

    public Short getType(){
      return type;
    }
    public String getCssText(){
      return cssText;
    }
    public PCSSRule getParentRule(){
      return parentRule;
    }
    public PCSSStyleSheet getParentStyleSheet(){
      return parentStyleSheet;
    }


}