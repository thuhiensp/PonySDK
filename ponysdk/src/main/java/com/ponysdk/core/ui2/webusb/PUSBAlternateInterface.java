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
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PUSBAlternateInterface extends PObject2 {
     private Byte alternateSetting;
     private Byte interfaceClass;
     private Byte interfaceSubclass;
     private Byte interfaceProtocol;
     private String interfaceName;
     private PUSBEndpoint[] endpoints;

    public PUSBAlternateInterface(PUSBInterface deviceInterface, Byte alternateSetting){
      applyInit(widgetWithArgs(), new Object[]{deviceInterface, alternateSetting});
    }



    public Byte getAlternateSetting(){
      return alternateSetting;
    }
    public Byte getInterfaceClass(){
      return interfaceClass;
    }
    public Byte getInterfaceSubclass(){
      return interfaceSubclass;
    }
    public Byte getInterfaceProtocol(){
      return interfaceProtocol;
    }
    public String getInterfaceName(){
      return interfaceName;
    }
    public PUSBEndpoint[] getEndpoints(){
      return endpoints;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.USB_ALTERNATE_INTERFACE;
    }


}