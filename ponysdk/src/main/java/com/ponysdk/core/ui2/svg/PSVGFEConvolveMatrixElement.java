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

public class PSVGFEConvolveMatrixElement extends PSVGElement {
     private PSVGAnimatedString in1;
     private PSVGAnimatedInteger orderX;
     private PSVGAnimatedInteger orderY;
     private PSVGAnimatedNumberList kernelMatrix;
     private PSVGAnimatedNumber divisor;
     private PSVGAnimatedNumber bias;
     private PSVGAnimatedInteger targetX;
     private PSVGAnimatedInteger targetY;
     private PSVGAnimatedEnumeration edgeMode;
     private PSVGAnimatedNumber kernelUnitLengthX;
     private PSVGAnimatedNumber kernelUnitLengthY;
     private PSVGAnimatedBoolean preserveAlpha;
     private PSVGAnimatedLength x;
     private PSVGAnimatedLength y;
     private PSVGAnimatedLength width;
     private PSVGAnimatedLength height;
     private PSVGAnimatedString result;

    public PSVGFEConvolveMatrixElement() {
      applyInit(widgetNoArgs());
    }


    public PSVGAnimatedString getIn1(){
      return in1;
    }
    public PSVGAnimatedInteger getOrderX(){
      return orderX;
    }
    public PSVGAnimatedInteger getOrderY(){
      return orderY;
    }
    public PSVGAnimatedNumberList getKernelMatrix(){
      return kernelMatrix;
    }
    public PSVGAnimatedNumber getDivisor(){
      return divisor;
    }
    public PSVGAnimatedNumber getBias(){
      return bias;
    }
    public PSVGAnimatedInteger getTargetX(){
      return targetX;
    }
    public PSVGAnimatedInteger getTargetY(){
      return targetY;
    }
    public PSVGAnimatedEnumeration getEdgeMode(){
      return edgeMode;
    }
    public PSVGAnimatedNumber getKernelUnitLengthX(){
      return kernelUnitLengthX;
    }
    public PSVGAnimatedNumber getKernelUnitLengthY(){
      return kernelUnitLengthY;
    }
    public PSVGAnimatedBoolean getPreserveAlpha(){
      return preserveAlpha;
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
      return PLeafTypeNoArgs.SVGFE_CONVOLVE_MATRIX_ELEMENT;
    }


}