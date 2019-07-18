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

public class PUSBInterface extends PObject2 {
     private Byte interfaceNumber;
     private PUSBAlternateInterface alternate;
     private PUSBAlternateInterface[] alternates;
     private Boolean claimed;

    public PUSBInterface(PUSBConfiguration configuration, Byte interfaceNumber){
      applyInit(widgetWithArgs(), new Object[]{configuration, interfaceNumber});
    }



    public Byte getInterfaceNumber(){
      return interfaceNumber;
    }
    public PUSBAlternateInterface getAlternate(){
      return alternate;
    }
    public PUSBAlternateInterface[] getAlternates(){
      return alternates;
    }
    public Boolean getClaimed(){
      return claimed;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.USB_INTERFACE;
    }


}