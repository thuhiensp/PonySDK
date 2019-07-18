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
package com.ponysdk.core.ui2.webaudio;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PAudioListener extends PObject2 {
     private PAudioParam positionX;
     private PAudioParam positionY;
     private PAudioParam positionZ;
     private PAudioParam forwardX;
     private PAudioParam forwardY;
     private PAudioParam forwardZ;
     private PAudioParam upX;
     private PAudioParam upY;
     private PAudioParam upZ;

    public PAudioListener() {
      applyInit(widgetNoArgs());
    }


    public PAudioParam getPositionX(){
      return positionX;
    }
    public PAudioParam getPositionY(){
      return positionY;
    }
    public PAudioParam getPositionZ(){
      return positionZ;
    }
    public PAudioParam getForwardX(){
      return forwardX;
    }
    public PAudioParam getForwardY(){
      return forwardY;
    }
    public PAudioParam getForwardZ(){
      return forwardZ;
    }
    public PAudioParam getUpX(){
      return upX;
    }
    public PAudioParam getUpY(){
      return upY;
    }
    public PAudioParam getUpZ(){
      return upZ;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.AUDIO_LISTENER;
    }


}