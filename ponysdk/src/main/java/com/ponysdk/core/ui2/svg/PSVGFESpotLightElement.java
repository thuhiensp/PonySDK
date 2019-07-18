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

public class PSVGFESpotLightElement extends PSVGElement {
     private PSVGAnimatedNumber x;
     private PSVGAnimatedNumber y;
     private PSVGAnimatedNumber z;
     private PSVGAnimatedNumber pointsAtX;
     private PSVGAnimatedNumber pointsAtY;
     private PSVGAnimatedNumber pointsAtZ;
     private PSVGAnimatedNumber specularExponent;
     private PSVGAnimatedNumber limitingConeAngle;

    public PSVGFESpotLightElement() {
      applyInit(widgetNoArgs());
    }


    public PSVGAnimatedNumber getX(){
      return x;
    }
    public PSVGAnimatedNumber getY(){
      return y;
    }
    public PSVGAnimatedNumber getZ(){
      return z;
    }
    public PSVGAnimatedNumber getPointsAtX(){
      return pointsAtX;
    }
    public PSVGAnimatedNumber getPointsAtY(){
      return pointsAtY;
    }
    public PSVGAnimatedNumber getPointsAtZ(){
      return pointsAtZ;
    }
    public PSVGAnimatedNumber getSpecularExponent(){
      return specularExponent;
    }
    public PSVGAnimatedNumber getLimitingConeAngle(){
      return limitingConeAngle;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVGFE_SPOT_LIGHT_ELEMENT;
    }


}