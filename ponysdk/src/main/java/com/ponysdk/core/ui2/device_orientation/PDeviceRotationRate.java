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
package com.ponysdk.core.ui2.device_orientation;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PDeviceRotationRate extends PObject2 {
     private Double alpha;
     private Double beta;
     private Double gamma;

    public PDeviceRotationRate() {
      applyInit(widgetNoArgs());
    }


    public Double getAlpha(){
      return alpha;
    }
    public Double getBeta(){
      return beta;
    }
    public Double getGamma(){
      return gamma;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.DEVICE_ROTATION_RATE;
    }


}