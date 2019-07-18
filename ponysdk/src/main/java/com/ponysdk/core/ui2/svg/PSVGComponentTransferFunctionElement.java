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

public abstract class PSVGComponentTransferFunctionElement extends PSVGElement {
     private PSVGAnimatedEnumeration type;
     private PSVGAnimatedNumberList tableValues;
     private PSVGAnimatedNumber slope;
     private PSVGAnimatedNumber intercept;
     private PSVGAnimatedNumber amplitude;
     private PSVGAnimatedNumber exponent;
     private PSVGAnimatedNumber offset;


    public PSVGAnimatedEnumeration getType(){
      return type;
    }
    public PSVGAnimatedNumberList getTableValues(){
      return tableValues;
    }
    public PSVGAnimatedNumber getSlope(){
      return slope;
    }
    public PSVGAnimatedNumber getIntercept(){
      return intercept;
    }
    public PSVGAnimatedNumber getAmplitude(){
      return amplitude;
    }
    public PSVGAnimatedNumber getExponent(){
      return exponent;
    }
    public PSVGAnimatedNumber getOffset(){
      return offset;
    }


}