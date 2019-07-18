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
package com.ponysdk.core.ui2.xml;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.dom.PNode;

public class PXPathResult extends PObject2 {
     private Short resultType;
     private Double numberValue;
     private String stringValue;
     private Boolean booleanValue;
     private PNode singleNodeValue;
     private Boolean invalidIteratorState;
     private Double snapshotLength;

    public PXPathResult() {
      applyInit(widgetNoArgs());
    }


    public Short getResultType(){
      return resultType;
    }
    public Double getNumberValue(){
      return numberValue;
    }
    public String getStringValue(){
      return stringValue;
    }
    public Boolean getBooleanValue(){
      return booleanValue;
    }
    public PNode getSingleNodeValue(){
      return singleNodeValue;
    }
    public Boolean getInvalidIteratorState(){
      return invalidIteratorState;
    }
    public Double getSnapshotLength(){
      return snapshotLength;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.X_PATH_RESULT;
    }


}