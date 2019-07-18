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
import com.ponysdk.core.ui2.dom.PNode;
import com.ponysdk.core.ui2.uniontype.PHTMLOptionsUnion;

public class PHTMLOptionsCollection extends PHTMLBaseCollection<PNode,PHTMLOptionsUnion> {
    private static final Logger log = LoggerFactory.getLogger(PHTMLOptionsCollection.class);
     private Double selectedIndex;
     private Double length;

    public PHTMLOptionsCollection() {
      applyInit(widgetNoArgs());
    }

    public void setSelectedIndex(final Double selectedIndex)  {
       if (Objects.equals(this.selectedIndex, selectedIndex))return;
       this.selectedIndex = selectedIndex;
       log.info("selectedIndex" + selectedIndex);
       saveUpdateAttribute(PAttributeNames.SELECTED_INDEX,selectedIndex);
    }
    public void setLength(final Double length)  {
       if (Objects.equals(this.length, length))return;
       this.length = length;
       log.info("length" + length);
       saveUpdateAttribute(PAttributeNames.LENGTH,length);
    }

    public Double getSelectedIndex(){
      return selectedIndex;
    }
    public Double getLength(){
      return length;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_OPTIONS_COLLECTION;
    }


}