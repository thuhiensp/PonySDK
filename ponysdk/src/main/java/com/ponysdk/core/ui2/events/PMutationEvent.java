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
package com.ponysdk.core.ui2.events;
import com.ponysdk.core.ui2.PEventAttributesName;
import java.util.HashMap;
import java.util.Map;
import com.ponysdk.core.ui2.dom.PNode;

public class PMutationEvent extends PEvent {
    public PMutationEvent(final Map<PEventAttributesName, Object> mapValueByAttributeName){
       super(mapValueByAttributeName);
    }

    public PNode getRelatedNode(){
      return (PNode) get(PEventAttributesName.RELATED_NODE);
    }
    public Object getPrevValue(){
      return get(PEventAttributesName.PREV_VALUE);
    }
    public Object getNewValue(){
      return get(PEventAttributesName.NEW_VALUE);
    }
    public Object getAttrName(){
      return get(PEventAttributesName.ATTR_NAME);
    }
    public Object getAttrChange(){
      return get(PEventAttributesName.ATTR_CHANGE);
    }


}