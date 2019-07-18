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
package com.ponysdk.core.ui2.svg;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PSVGPolygonElement extends PSVGGeometryElement {
     private PSVGPointList points;
     private PSVGPointList animatedPoints;

    public PSVGPolygonElement() {
      applyInit(widgetNoArgs());
    }


    public PSVGPointList getPoints(){
      return points;
    }
    public PSVGPointList getAnimatedPoints(){
      return animatedPoints;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVG_POLYGON_ELEMENT;
    }


}