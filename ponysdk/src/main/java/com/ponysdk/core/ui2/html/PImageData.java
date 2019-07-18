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
package com.ponysdk.core.ui2.html;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.core.PUint8ClampedArray;
import com.ponysdk.core.ui2.uniontype.PImageDataArray;
import com.ponysdk.core.ui2.core.PUint8ClampedArray;

public class PImageData extends PObject2 {
     private Double width;
     private Double height;
     private PUint8ClampedArray data;
     private PImageDataArray dataUnion;

    public PImageData(Double sw, Double sh){
      applyInit(widgetWithArgs(), new Object[]{sw, sh});
    }

    public PImageData(PUint8ClampedArray data, Double sw){
      applyInit(widgetWithArgs(), new Object[]{data, sw});
    }

    public PImageData(PUint8ClampedArray data, Double sw, Double sh){
      applyInit(widgetWithArgs(), new Object[]{data, sw, sh});
    }



    public Double getWidth(){
      return width;
    }
    public Double getHeight(){
      return height;
    }
    public PUint8ClampedArray getData(){
      return data;
    }
    public PImageDataArray getDataUnion(){
      return dataUnion;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.IMAGE_DATA;
    }


}