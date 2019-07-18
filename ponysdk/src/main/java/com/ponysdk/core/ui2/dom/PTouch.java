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
package com.ponysdk.core.ui2.dom;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PTouch extends PObject2 {
     private Double identifier;
     private PEventTarget target;
     private Double screenX;
     private Double screenY;
     private Double clientX;
     private Double clientY;
     private Double pageX;
     private Double pageY;
     private Double radiusX;
     private Double radiusY;
     private Double rotationAngle;
     private Double force;
     private String region;

    public PTouch(PTouchInit initDict){
      applyInit(widgetWithArgs(), new Object[]{initDict});
    }



    public Double getIdentifier(){
      return identifier;
    }
    public PEventTarget getTarget(){
      return target;
    }
    public Double getScreenX(){
      return screenX;
    }
    public Double getScreenY(){
      return screenY;
    }
    public Double getClientX(){
      return clientX;
    }
    public Double getClientY(){
      return clientY;
    }
    public Double getPageX(){
      return pageX;
    }
    public Double getPageY(){
      return pageY;
    }
    public Double getRadiusX(){
      return radiusX;
    }
    public Double getRadiusY(){
      return radiusY;
    }
    public Double getRotationAngle(){
      return rotationAngle;
    }
    public Double getForce(){
      return force;
    }
    public String getRegion(){
      return region;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.TOUCH;
    }


}