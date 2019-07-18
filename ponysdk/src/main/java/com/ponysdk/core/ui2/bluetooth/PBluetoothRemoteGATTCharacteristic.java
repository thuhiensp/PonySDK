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
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.core.PDataView;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PBluetoothRemoteGATTCharacteristic extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PBluetoothRemoteGATTCharacteristic.class);
     private PBluetoothRemoteGATTService service;
     private String uuid;
     private PBluetoothCharacteristicProperties properties;
     private PDataView value;
     private PEventHandlerNonNull oncharacteristicvaluechanged;

    public PBluetoothRemoteGATTCharacteristic() {
      applyInit(widgetNoArgs());
    }

    public void setOncharacteristicvaluechanged(final PEventHandlerNonNull oncharacteristicvaluechanged, final PEventAttributesName... atrsName)  {
       addHandler(oncharacteristicvaluechanged);
       saveUpdateAttributeCallBack(PAttributeNames.ONCHARACTERISTICVALUECHANGED, oncharacteristicvaluechanged, atrsName);
    }

    public PBluetoothRemoteGATTService getService(){
      return service;
    }
    public String getUuid(){
      return uuid;
    }
    public PBluetoothCharacteristicProperties getProperties(){
      return properties;
    }
    public PDataView getValue(){
      return value;
    }
    public PEventHandlerNonNull getOncharacteristicvaluechanged(){
      return oncharacteristicvaluechanged;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.BLUETOOTH_REMOTEGATT_CHARACTERISTIC;
    }


}