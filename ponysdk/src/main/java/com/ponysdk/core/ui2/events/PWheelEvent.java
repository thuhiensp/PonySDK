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
package com.ponysdk.core.ui2.events;
import com.ponysdk.core.ui2.PEventAttributesName;
import java.util.HashMap;
import java.util.Map;
import com.ponysdk.core.ui2.dom.PNode;
import com.ponysdk.core.ui2.frame.PWindow;
import com.ponysdk.core.ui2.input.PInputDeviceCapabilities;

public class PWheelEvent extends PMouseEvent {
    public PWheelEvent(final Map<PEventAttributesName, Object> mapValueByAttributeName){
       super(mapValueByAttributeName);
    }

    public Object getDeltaX(){
      return get(PEventAttributesName.DELTAX);
    }
    public Object getDeltaY(){
      return get(PEventAttributesName.DELTAY);
    }
    public Object getDeltaZ(){
      return get(PEventAttributesName.DELTAZ);
    }
    public Object getDeltaMode(){
      return get(PEventAttributesName.DELTA_MODE);
    }
    public Object getWheelDeltaX(){
      return get(PEventAttributesName.WHEEL_DELTAX);
    }
    public Object getWheelDeltaY(){
      return get(PEventAttributesName.WHEEL_DELTAY);
    }
    public Object getWheelDelta(){
      return get(PEventAttributesName.WHEEL_DELTA);
    }


}