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

public class PMutationRecord extends PObject2 {
     private String type;
     private PNode target;
     private PNodeList addedNodes;
     private PNodeList removedNodes;
     private PNode previousSibling;
     private PNode nextSibling;
     private String attributeName;
     private String attributeNamespace;
     private String oldValue;

    public PMutationRecord() {
      applyInit(widgetNoArgs());
    }


    public String getType(){
      return type;
    }
    public PNode getTarget(){
      return target;
    }
    public PNodeList getAddedNodes(){
      return addedNodes;
    }
    public PNodeList getRemovedNodes(){
      return removedNodes;
    }
    public PNode getPreviousSibling(){
      return previousSibling;
    }
    public PNode getNextSibling(){
      return nextSibling;
    }
    public String getAttributeName(){
      return attributeName;
    }
    public String getAttributeNamespace(){
      return attributeNamespace;
    }
    public String getOldValue(){
      return oldValue;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.MUTATION_RECORD;
    }


}