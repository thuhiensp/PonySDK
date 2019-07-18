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

public class PSVGEllipseElement extends PSVGGeometryElement {
     private PSVGAnimatedLength cx;
     private PSVGAnimatedLength cy;
     private PSVGAnimatedLength rx;
     private PSVGAnimatedLength ry;

    public PSVGEllipseElement() {
      applyInit(widgetNoArgs());
    }


    public PSVGAnimatedLength getCx(){
      return cx;
    }
    public PSVGAnimatedLength getCy(){
      return cy;
    }
    public PSVGAnimatedLength getRx(){
      return rx;
    }
    public PSVGAnimatedLength getRy(){
      return ry;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVG_ELLIPSE_ELEMENT;
    }


}