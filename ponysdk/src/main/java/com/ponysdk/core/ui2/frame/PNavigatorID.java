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
package com.ponysdk.core.ui2.frame;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PNavigatorID extends PObject2 {
     private String appCodeName;
     private String appName;
     private String appVersion;
     private String platform;
     private String product;
     private String userAgent;

    public PNavigatorID() {
      applyInit(widgetNoArgs());
    }


    public String getAppCodeName(){
      return appCodeName;
    }
    public String getAppName(){
      return appName;
    }
    public String getAppVersion(){
      return appVersion;
    }
    public String getPlatform(){
      return platform;
    }
    public String getProduct(){
      return product;
    }
    public String getUserAgent(){
      return userAgent;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.NAVIGATORID;
    }


}