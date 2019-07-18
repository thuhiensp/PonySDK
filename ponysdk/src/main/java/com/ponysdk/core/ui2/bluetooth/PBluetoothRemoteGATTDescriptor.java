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
package com.ponysdk.core.ui2.bluetooth;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.core.PDataView;

public class PBluetoothRemoteGATTDescriptor extends PObject2 {
     private PBluetoothRemoteGATTCharacteristic characteristic;
     private String uuid;
     private PDataView value;

    public PBluetoothRemoteGATTDescriptor() {
      applyInit(widgetNoArgs());
    }


    public PBluetoothRemoteGATTCharacteristic getCharacteristic(){
      return characteristic;
    }
    public String getUuid(){
      return uuid;
    }
    public PDataView getValue(){
      return value;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.BLUETOOTH_REMOTEGATT_DESCRIPTOR;
    }


}