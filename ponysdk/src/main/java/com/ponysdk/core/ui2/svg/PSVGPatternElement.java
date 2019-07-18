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

public class PSVGPatternElement extends PSVGElement {
     private PSVGAnimatedEnumeration patternUnits;
     private PSVGAnimatedEnumeration patternContentUnits;
     private PSVGAnimatedTransformList patternTransform;
     private PSVGAnimatedLength x;
     private PSVGAnimatedLength y;
     private PSVGAnimatedLength width;
     private PSVGAnimatedLength height;
     private PSVGAnimatedRect viewBox;
     private PSVGAnimatedPreserveAspectRatio preserveAspectRatio;
     private PSVGAnimatedString href;
     private PSVGStringList requiredExtensions;
     private PSVGStringList systemLanguage;

    public PSVGPatternElement() {
      applyInit(widgetNoArgs());
    }


    public PSVGAnimatedEnumeration getPatternUnits(){
      return patternUnits;
    }
    public PSVGAnimatedEnumeration getPatternContentUnits(){
      return patternContentUnits;
    }
    public PSVGAnimatedTransformList getPatternTransform(){
      return patternTransform;
    }
    public PSVGAnimatedLength getX(){
      return x;
    }
    public PSVGAnimatedLength getY(){
      return y;
    }
    public PSVGAnimatedLength getWidth(){
      return width;
    }
    public PSVGAnimatedLength getHeight(){
      return height;
    }
    public PSVGAnimatedRect getViewBox(){
      return viewBox;
    }
    public PSVGAnimatedPreserveAspectRatio getPreserveAspectRatio(){
      return preserveAspectRatio;
    }
    public PSVGAnimatedString getHref(){
      return href;
    }
    public PSVGStringList getRequiredExtensions(){
      return requiredExtensions;
    }
    public PSVGStringList getSystemLanguage(){
      return systemLanguage;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVG_PATTERN_ELEMENT;
    }


}