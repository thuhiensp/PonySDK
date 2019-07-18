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
package com.ponysdk.core.ui2.sensor;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PAmbientLightSensor extends PSensor {
     private Double illuminance;

    public PAmbientLightSensor() {
      applyInit(widgetNoArgs());
    }


    public PAmbientLightSensor(PSensorOptions sensorOptions){
      applyInit(widgetWithArgs(), new Object[]{sensorOptions});
    }



    public Double getIlluminance(){
      return illuminance;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.AMBIENT_LIGHT_SENSOR;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.AMBIENT_LIGHT_SENSOR;
    }


}