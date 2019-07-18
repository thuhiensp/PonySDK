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

public class PInt16Array extends PArrayBufferView {
     private Double length;

    public PInt16Array(Double length){
      applyInit(widgetWithArgs(), new Object[]{length});
    }

    public PInt16Array(PInt16Array array){
      applyInit(widgetWithArgs(), new Object[]{array});
    }

    public PInt16Array(Short[] array){
      applyInit(widgetWithArgs(), new Object[]{array});
    }

    public PInt16Array(PArrayBuffer buffer){
      applyInit(widgetWithArgs(), new Object[]{buffer});
    }

    public PInt16Array(PArrayBuffer buffer, Double byteOffset){
      applyInit(widgetWithArgs(), new Object[]{buffer, byteOffset});
    }

    public PInt16Array(PArrayBuffer buffer, Double byteOffset, Double length){
      applyInit(widgetWithArgs(), new Object[]{buffer, byteOffset, length});
    }



    public Double getLength(){
      return length;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.INT16_ARRAY;
    }


}