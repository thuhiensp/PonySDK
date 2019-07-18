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

public class PIntersectionObserverEntry extends PObject2 {
     private Double time;
     private PClientRect rootBounds;
     private PClientRect boundingClientRect;
     private PClientRect intersectionRect;
     private Boolean isIntersecting;
     private Double intersectionRatio;
     private PElement target;

    public PIntersectionObserverEntry() {
      applyInit(widgetNoArgs());
    }


    public Double getTime(){
      return time;
    }
    public PClientRect getRootBounds(){
      return rootBounds;
    }
    public PClientRect getBoundingClientRect(){
      return boundingClientRect;
    }
    public PClientRect getIntersectionRect(){
      return intersectionRect;
    }
    public Boolean getIsIntersecting(){
      return isIntersecting;
    }
    public Double getIntersectionRatio(){
      return intersectionRatio;
    }
    public PElement getTarget(){
      return target;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.INTERSECTION_OBSERVER_ENTRY;
    }


}