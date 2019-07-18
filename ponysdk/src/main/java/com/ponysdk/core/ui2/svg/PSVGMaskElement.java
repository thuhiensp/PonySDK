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

public class PSVGMaskElement extends PSVGElement {
     private PSVGAnimatedEnumeration maskUnits;
     private PSVGAnimatedEnumeration maskContentUnits;
     private PSVGAnimatedLength x;
     private PSVGAnimatedLength y;
     private PSVGAnimatedLength width;
     private PSVGAnimatedLength height;
     private PSVGStringList requiredExtensions;
     private PSVGStringList systemLanguage;

    public PSVGMaskElement() {
      applyInit(widgetNoArgs());
    }


    public PSVGAnimatedEnumeration getMaskUnits(){
      return maskUnits;
    }
    public PSVGAnimatedEnumeration getMaskContentUnits(){
      return maskContentUnits;
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
    public PSVGStringList getRequiredExtensions(){
      return requiredExtensions;
    }
    public PSVGStringList getSystemLanguage(){
      return systemLanguage;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVG_MASK_ELEMENT;
    }


}