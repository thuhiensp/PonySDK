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

public class PHTMLOptGroupElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLOptGroupElement.class);
     private Boolean disabled;
     private String label;

    public PHTMLOptGroupElement() {
      applyInit(widgetNoArgs());
    }

    public void setDisabled(final Boolean disabled)  {
       if (Objects.equals(this.disabled, disabled))return;
       this.disabled = disabled;
       log.info("disabled" + disabled);
       saveUpdateAttribute(PAttributeNames.DISABLED,disabled);
    }
    public void setLabel(final String label)  {
       if (Objects.equals(this.label, label))return;
       this.label = label;
       log.info("label" + label);
       saveUpdateAttribute(PAttributeNames.LABEL,label);
    }

    public Boolean getDisabled(){
      return disabled;
    }
    public String getLabel(){
      return label;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_OPT_GROUP_ELEMENT;
    }


}