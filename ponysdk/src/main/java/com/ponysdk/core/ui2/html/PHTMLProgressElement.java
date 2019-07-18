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

public class PHTMLProgressElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLProgressElement.class);
     private Double value;
     private Double max;
     private Double position;
     private PNodeList labels;

    public PHTMLProgressElement() {
      applyInit(widgetNoArgs());
    }

    public void setValue(final Double value)  {
       if (Objects.equals(this.value, value))return;
       this.value = value;
       log.info("value" + value);
       saveUpdateAttribute(PAttributeNames.VALUE,value);
    }
    public void setMax(final Double max)  {
       if (Objects.equals(this.max, max))return;
       this.max = max;
       log.info("max" + max);
       saveUpdateAttribute(PAttributeNames.MAX,max);
    }

    public Double getValue(){
      return value;
    }
    public Double getMax(){
      return max;
    }
    public Double getPosition(){
      return position;
    }
    public PNodeList getLabels(){
      return labels;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_PROGRESS_ELEMENT;
    }


}