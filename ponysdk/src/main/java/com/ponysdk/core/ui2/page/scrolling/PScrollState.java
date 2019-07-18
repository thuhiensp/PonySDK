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
package com.ponysdk.core.ui2.page.scrolling;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PScrollState extends PObject2 {
     private Double deltaX;
     private Double deltaY;
     private Double positionX;
     private Double positionY;
     private Double velocityX;
     private Double velocityY;
     private Boolean isBeginning;
     private Boolean inInertialPhase;
     private Boolean isEnding;
     private Boolean shouldPropagate;
     private Boolean fromUserInput;
     private Boolean isDirectManipulation;
     private Double deltaGranularity;

    public PScrollState() {
      applyInit(widgetNoArgs());
    }


    public PScrollState(PScrollStateInit scrollStateInit){
      applyInit(widgetWithArgs(), new Object[]{scrollStateInit});
    }



    public Double getDeltaX(){
      return deltaX;
    }
    public Double getDeltaY(){
      return deltaY;
    }
    public Double getPositionX(){
      return positionX;
    }
    public Double getPositionY(){
      return positionY;
    }
    public Double getVelocityX(){
      return velocityX;
    }
    public Double getVelocityY(){
      return velocityY;
    }
    public Boolean getIsBeginning(){
      return isBeginning;
    }
    public Boolean getInInertialPhase(){
      return inInertialPhase;
    }
    public Boolean getIsEnding(){
      return isEnding;
    }
    public Boolean getShouldPropagate(){
      return shouldPropagate;
    }
    public Boolean getFromUserInput(){
      return fromUserInput;
    }
    public Boolean getIsDirectManipulation(){
      return isDirectManipulation;
    }
    public Double getDeltaGranularity(){
      return deltaGranularity;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SCROLL_STATE;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.SCROLL_STATE;
    }


}