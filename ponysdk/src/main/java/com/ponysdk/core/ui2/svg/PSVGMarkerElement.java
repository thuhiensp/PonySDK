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

public class PSVGMarkerElement extends PSVGElement {
     private PSVGAnimatedLength refX;
     private PSVGAnimatedLength refY;
     private PSVGAnimatedEnumeration markerUnits;
     private PSVGAnimatedLength markerWidth;
     private PSVGAnimatedLength markerHeight;
     private PSVGAnimatedEnumeration orientType;
     private PSVGAnimatedAngle orientAngle;
     private PSVGAnimatedRect viewBox;
     private PSVGAnimatedPreserveAspectRatio preserveAspectRatio;

    public PSVGMarkerElement() {
      applyInit(widgetNoArgs());
    }


    public PSVGAnimatedLength getRefX(){
      return refX;
    }
    public PSVGAnimatedLength getRefY(){
      return refY;
    }
    public PSVGAnimatedEnumeration getMarkerUnits(){
      return markerUnits;
    }
    public PSVGAnimatedLength getMarkerWidth(){
      return markerWidth;
    }
    public PSVGAnimatedLength getMarkerHeight(){
      return markerHeight;
    }
    public PSVGAnimatedEnumeration getOrientType(){
      return orientType;
    }
    public PSVGAnimatedAngle getOrientAngle(){
      return orientAngle;
    }
    public PSVGAnimatedRect getViewBox(){
      return viewBox;
    }
    public PSVGAnimatedPreserveAspectRatio getPreserveAspectRatio(){
      return preserveAspectRatio;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVG_MARKER_ELEMENT;
    }


}