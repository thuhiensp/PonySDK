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
package com.ponysdk.core.ui2.core;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PFloat64Array extends PArrayBufferView {
     private Double length;

    public PFloat64Array(Double length){
      applyInit(widgetWithArgs(), new Object[]{length});
    }

    public PFloat64Array(PFloat64Array array){
      applyInit(widgetWithArgs(), new Object[]{array});
    }

    public PFloat64Array(Double[] array){
      applyInit(widgetWithArgs(), new Object[]{array});
    }

    public PFloat64Array(PArrayBuffer buffer){
      applyInit(widgetWithArgs(), new Object[]{buffer});
    }

    public PFloat64Array(PArrayBuffer buffer, Double byteOffset){
      applyInit(widgetWithArgs(), new Object[]{buffer, byteOffset});
    }

    public PFloat64Array(PArrayBuffer buffer, Double byteOffset, Double length){
      applyInit(widgetWithArgs(), new Object[]{buffer, byteOffset, length});
    }



    public Double getLength(){
      return length;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.FLOAT64_ARRAY;
    }


}