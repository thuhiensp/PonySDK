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

public class PGamepad extends PObject2 {
     private String id;
     private Double index;
     private Boolean connected;
     private Double timestamp;
     private String mapping;
     private Double[] axes;
     private PGamepadButton[] buttons;
     private PGamepadPose pose;
     private Double displayId;
     private PGamepadHand hand;

    public PGamepad() {
      applyInit(widgetNoArgs());
    }


    public String getId(){
      return id;
    }
    public Double getIndex(){
      return index;
    }
    public Boolean getConnected(){
      return connected;
    }
    public Double getTimestamp(){
      return timestamp;
    }
    public String getMapping(){
      return mapping;
    }
    public Double[] getAxes(){
      return axes;
    }
    public PGamepadButton[] getButtons(){
      return buttons;
    }
    public PGamepadPose getPose(){
      return pose;
    }
    public Double getDisplayId(){
      return displayId;
    }
    public PGamepadHand getHand(){
      return hand;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.GAMEPAD;
    }


}