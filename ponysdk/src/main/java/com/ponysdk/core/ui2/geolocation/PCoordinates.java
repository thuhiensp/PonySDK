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
package com.ponysdk.core.ui2.geolocation;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PCoordinates extends PObject2 {
     private Double latitude;
     private Double longitude;
     private Double altitude;
     private Double accuracy;
     private Double altitudeAccuracy;
     private Double heading;
     private Double speed;

    public PCoordinates() {
      applyInit(widgetNoArgs());
    }


    public Double getLatitude(){
      return latitude;
    }
    public Double getLongitude(){
      return longitude;
    }
    public Double getAltitude(){
      return altitude;
    }
    public Double getAccuracy(){
      return accuracy;
    }
    public Double getAltitudeAccuracy(){
      return altitudeAccuracy;
    }
    public Double getHeading(){
      return heading;
    }
    public Double getSpeed(){
      return speed;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.COORDINATES;
    }


}