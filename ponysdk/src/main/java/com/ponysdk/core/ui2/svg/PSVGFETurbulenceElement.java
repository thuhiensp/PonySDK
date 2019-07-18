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

public class PSVGFETurbulenceElement extends PSVGElement {
     private PSVGAnimatedNumber baseFrequencyX;
     private PSVGAnimatedNumber baseFrequencyY;
     private PSVGAnimatedInteger numOctaves;
     private PSVGAnimatedNumber seed;
     private PSVGAnimatedEnumeration stitchTiles;
     private PSVGAnimatedEnumeration type;
     private PSVGAnimatedLength x;
     private PSVGAnimatedLength y;
     private PSVGAnimatedLength width;
     private PSVGAnimatedLength height;
     private PSVGAnimatedString result;

    public PSVGFETurbulenceElement() {
      applyInit(widgetNoArgs());
    }


    public PSVGAnimatedNumber getBaseFrequencyX(){
      return baseFrequencyX;
    }
    public PSVGAnimatedNumber getBaseFrequencyY(){
      return baseFrequencyY;
    }
    public PSVGAnimatedInteger getNumOctaves(){
      return numOctaves;
    }
    public PSVGAnimatedNumber getSeed(){
      return seed;
    }
    public PSVGAnimatedEnumeration getStitchTiles(){
      return stitchTiles;
    }
    public PSVGAnimatedEnumeration getType(){
      return type;
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
    public PSVGAnimatedString getResult(){
      return result;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVGFE_TURBULENCE_ELEMENT;
    }


}