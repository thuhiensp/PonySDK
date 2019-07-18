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
package com.ponysdk.core.ui2.credentialmanager;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PFederatedCredential extends PCredential {
     private String provider;
     private String protocol;
     private String name;
     private String iconURL;

    public PFederatedCredential(PFederatedCredentialInit data){
      applyInit(widgetWithArgs(), new Object[]{data});
    }



    public String getProvider(){
      return provider;
    }
    public String getProtocol(){
      return protocol;
    }
    public String getName(){
      return name;
    }
    public String getIconURL(){
      return iconURL;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.FEDERATED_CREDENTIAL;
    }


}