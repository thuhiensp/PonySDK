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
package com.ponysdk.core.ui2.gamepad;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.core.PFloat32Array;

public class PGamepadPose extends PObject2 {
     private Boolean hasOrientation;
     private Boolean hasPosition;
     private PFloat32Array position;
     private PFloat32Array linearVelocity;
     private PFloat32Array linearAcceleration;
     private PFloat32Array orientation;
     private PFloat32Array angularVelocity;
     private PFloat32Array angularAcceleration;

    public PGamepadPose() {
      applyInit(widgetNoArgs());
    }


    public Boolean getHasOrientation(){
      return hasOrientation;
    }
    public Boolean getHasPosition(){
      return hasPosition;
    }
    public PFloat32Array getPosition(){
      return position;
    }
    public PFloat32Array getLinearVelocity(){
      return linearVelocity;
    }
    public PFloat32Array getLinearAcceleration(){
      return linearAcceleration;
    }
    public PFloat32Array getOrientation(){
      return orientation;
    }
    public PFloat32Array getAngularVelocity(){
      return angularVelocity;
    }
    public PFloat32Array getAngularAcceleration(){
      return angularAcceleration;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.GAMEPAD_POSE;
    }


}