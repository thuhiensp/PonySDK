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
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PIntersectionObserver extends PObject2 {
     private PElement root;
     private String rootMargin;
     private Double[] thresholds;

    public PIntersectionObserver(PIntersectionObserverCallback callback){
      applyInit(widgetWithArgs(), new Object[]{callback});
    }

    public PIntersectionObserver(PIntersectionObserverCallback callback, PIntersectionObserverInit options){
      applyInit(widgetWithArgs(), new Object[]{callback, options});
    }



    public PElement getRoot(){
      return root;
    }
    public String getRootMargin(){
      return rootMargin;
    }
    public Double[] getThresholds(){
      return thresholds;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.INTERSECTION_OBSERVER;
    }


}