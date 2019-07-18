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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PAccessibleNodeList extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PAccessibleNodeList.class);
     private Double length;

    public PAccessibleNodeList() {
      applyInit(widgetNoArgs());
    }


    public PAccessibleNodeList(PAccessibleNode[] nodes){
      applyInit(widgetWithArgs(), new Object[]{nodes});
    }


    public void setLength(final Double length)  {
       if (Objects.equals(this.length, length))return;
       this.length = length;
       log.info("length" + length);
       saveUpdateAttribute(PAttributeNames.LENGTH,length);
    }

    public Double getLength(){
      return length;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.ACCESSIBLE_NODE_LIST;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.ACCESSIBLE_NODE_LIST;
    }


}