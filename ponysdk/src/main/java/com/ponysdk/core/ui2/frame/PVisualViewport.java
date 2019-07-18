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
package com.ponysdk.core.ui2.frame;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PVisualViewport extends PEventTarget {
     private Double offsetLeft;
     private Double offsetTop;
     private Double pageLeft;
     private Double pageTop;
     private Double width;
     private Double height;
     private Double scale;

    public PVisualViewport() {
      applyInit(widgetNoArgs());
    }


    public Double getOffsetLeft(){
      return offsetLeft;
    }
    public Double getOffsetTop(){
      return offsetTop;
    }
    public Double getPageLeft(){
      return pageLeft;
    }
    public Double getPageTop(){
      return pageTop;
    }
    public Double getWidth(){
      return width;
    }
    public Double getHeight(){
      return height;
    }
    public Double getScale(){
      return scale;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.VISUAL_VIEWPORT;
    }


}