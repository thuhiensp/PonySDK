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
import com.ponysdk.core.ui2.clipboard.PDataTransfer;
import com.ponysdk.core.ui2.dom.PNode;
import com.ponysdk.core.ui2.frame.PWindow;
import com.ponysdk.core.ui2.input.PInputDeviceCapabilities;

public class PDragEvent extends PMouseEvent {
    public PDragEvent(final Map<PEventAttributesName, Object> mapValueByAttributeName){
       super(mapValueByAttributeName);
    }

    public PDataTransfer getDataTransfer(){
      return (PDataTransfer) get(PEventAttributesName.DATA_TRANSFER);
    }


}