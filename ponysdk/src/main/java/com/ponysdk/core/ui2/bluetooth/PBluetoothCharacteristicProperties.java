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

public class PBluetoothCharacteristicProperties extends PObject2 {
     private Boolean broadcast;
     private Boolean read;
     private Boolean writeWithoutResponse;
     private Boolean write;
     private Boolean notify;
     private Boolean indicate;
     private Boolean authenticatedSignedWrites;
     private Boolean reliableWrite;
     private Boolean writableAuxiliaries;

    public PBluetoothCharacteristicProperties() {
      applyInit(widgetNoArgs());
    }


    public Boolean getBroadcast(){
      return broadcast;
    }
    public Boolean getRead(){
      return read;
    }
    public Boolean getWriteWithoutResponse(){
      return writeWithoutResponse;
    }
    public Boolean getWrite(){
      return write;
    }
    public Boolean getNotify(){
      return notify;
    }
    public Boolean getIndicate(){
      return indicate;
    }
    public Boolean getAuthenticatedSignedWrites(){
      return authenticatedSignedWrites;
    }
    public Boolean getReliableWrite(){
      return reliableWrite;
    }
    public Boolean getWritableAuxiliaries(){
      return writableAuxiliaries;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.BLUETOOTH_CHARACTERISTIC_PROPERTIES;
    }


}