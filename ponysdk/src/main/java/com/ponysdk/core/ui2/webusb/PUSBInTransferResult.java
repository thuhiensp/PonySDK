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
import com.ponysdk.core.ui2.core.PDataView;
import com.ponysdk.core.ui2.core.PDataView;

public class PUSBInTransferResult extends PObject2 {
     private PDataView data;
     private PUSBTransferStatus status;

    public PUSBInTransferResult(PUSBTransferStatus status){
      applyInit(widgetWithArgs(), new Object[]{status});
    }

    public PUSBInTransferResult(PUSBTransferStatus status, PDataView data){
      applyInit(widgetWithArgs(), new Object[]{status, data});
    }



    public PDataView getData(){
      return data;
    }
    public PUSBTransferStatus getStatus(){
      return status;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.USB_IN_TRANSFER_RESULT;
    }


}