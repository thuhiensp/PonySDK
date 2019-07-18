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
package com.ponysdk.core.ui2.editing;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.dom.PNode;

public class PSelection extends PObject2 {
     private PNode anchorNode;
     private Double anchorOffset;
     private PNode focusNode;
     private Double focusOffset;
     private Boolean isCollapsed;
     private Double rangeCount;
     private String type;
     private PNode baseNode;
     private Double baseOffset;
     private PNode extentNode;
     private Double extentOffset;

    public PSelection() {
      applyInit(widgetNoArgs());
    }


    public PNode getAnchorNode(){
      return anchorNode;
    }
    public Double getAnchorOffset(){
      return anchorOffset;
    }
    public PNode getFocusNode(){
      return focusNode;
    }
    public Double getFocusOffset(){
      return focusOffset;
    }
    public Boolean getIsCollapsed(){
      return isCollapsed;
    }
    public Double getRangeCount(){
      return rangeCount;
    }
    public String getType(){
      return type;
    }
    public PNode getBaseNode(){
      return baseNode;
    }
    public Double getBaseOffset(){
      return baseOffset;
    }
    public PNode getExtentNode(){
      return extentNode;
    }
    public Double getExtentOffset(){
      return extentOffset;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SELECTION;
    }


}