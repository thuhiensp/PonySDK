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

public class PNodeIterator extends PObject2 {
     private PNode root;
     private PNode referenceNode;
     private Boolean pointerBeforeReferenceNode;
     private Double whatToShow;
     private PNodeFilter filter;

    public PNodeIterator() {
      applyInit(widgetNoArgs());
    }


    public PNode getRoot(){
      return root;
    }
    public PNode getReferenceNode(){
      return referenceNode;
    }
    public Boolean getPointerBeforeReferenceNode(){
      return pointerBeforeReferenceNode;
    }
    public Double getWhatToShow(){
      return whatToShow;
    }
    public PNodeFilter getFilter(){
      return filter;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.NODE_ITERATOR;
    }


}