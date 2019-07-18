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
import com.ponysdk.core.ui2.frame.PWindow;
import com.ponysdk.core.ui2.input.PInputDeviceCapabilities;

public class PKeyboardEvent extends PUIEvent {
    public PKeyboardEvent(final Map<PEventAttributesName, Object> mapValueByAttributeName){
       super(mapValueByAttributeName);
    }

    public Object getKey(){
      return get(PEventAttributesName.KEY);
    }
    public Object getCode(){
      return get(PEventAttributesName.CODE);
    }
    public Object getLocation(){
      return get(PEventAttributesName.LOCATION);
    }
    public Object getCtrlKey(){
      return get(PEventAttributesName.CTRL_KEY);
    }
    public Object getShiftKey(){
      return get(PEventAttributesName.SHIFT_KEY);
    }
    public Object getAltKey(){
      return get(PEventAttributesName.ALT_KEY);
    }
    public Object getMetaKey(){
      return get(PEventAttributesName.META_KEY);
    }
    public Object getRepeat(){
      return get(PEventAttributesName.REPEAT);
    }
    public Object getIsComposing(){
      return get(PEventAttributesName.IS_COMPOSING);
    }
    public Object getCharCode(){
      return get(PEventAttributesName.CHAR_CODE);
    }
    public Object getKeyCode(){
      return get(PEventAttributesName.KEY_CODE);
    }


}