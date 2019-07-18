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
package com.ponysdk.core.ui2.webusb;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PUSBDevice extends PObject2 {
     private Byte usbVersionMajor;
     private Byte usbVersionMinor;
     private Byte usbVersionSubminor;
     private Byte deviceClass;
     private Byte deviceSubclass;
     private Byte deviceProtocol;
     private Short vendorId;
     private Short productId;
     private Byte deviceVersionMajor;
     private Byte deviceVersionMinor;
     private Byte deviceVersionSubminor;
     private String manufacturerName;
     private String productName;
     private String serialNumber;
     private PUSBConfiguration configuration;
     private PUSBConfiguration[] configurations;
     private Boolean opened;

    public PUSBDevice() {
      applyInit(widgetNoArgs());
    }


    public Byte getUsbVersionMajor(){
      return usbVersionMajor;
    }
    public Byte getUsbVersionMinor(){
      return usbVersionMinor;
    }
    public Byte getUsbVersionSubminor(){
      return usbVersionSubminor;
    }
    public Byte getDeviceClass(){
      return deviceClass;
    }
    public Byte getDeviceSubclass(){
      return deviceSubclass;
    }
    public Byte getDeviceProtocol(){
      return deviceProtocol;
    }
    public Short getVendorId(){
      return vendorId;
    }
    public Short getProductId(){
      return productId;
    }
    public Byte getDeviceVersionMajor(){
      return deviceVersionMajor;
    }
    public Byte getDeviceVersionMinor(){
      return deviceVersionMinor;
    }
    public Byte getDeviceVersionSubminor(){
      return deviceVersionSubminor;
    }
    public String getManufacturerName(){
      return manufacturerName;
    }
    public String getProductName(){
      return productName;
    }
    public String getSerialNumber(){
      return serialNumber;
    }
    public PUSBConfiguration getConfiguration(){
      return configuration;
    }
    public PUSBConfiguration[] getConfigurations(){
      return configurations;
    }
    public Boolean getOpened(){
      return opened;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.USB_DEVICE;
    }


}