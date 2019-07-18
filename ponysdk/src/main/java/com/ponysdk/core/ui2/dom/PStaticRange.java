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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PStaticRange extends PObject2 {
     private PNode startContainer;
     private Double startOffset;
     private PNode endContainer;
     private Double endOffset;
     private Boolean collapsed;

    public PStaticRange() {
      applyInit(widgetNoArgs());
    }


    public PNode getStartContainer(){
      return startContainer;
    }
    public Double getStartOffset(){
      return startOffset;
    }
    public PNode getEndContainer(){
      return endContainer;
    }
    public Double getEndOffset(){
      return endOffset;
    }
    public Boolean getCollapsed(){
      return collapsed;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.STATIC_RANGE;
    }


}