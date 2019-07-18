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
package com.ponysdk.core.ui2.dom;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PURLUtilsReadOnly extends PObject2 {
     private String href;
     private String origin;
     private String protocol;
     private String host;
     private String hostname;
     private String port;
     private String pathname;
     private String search;
     private String hash;

    public PURLUtilsReadOnly() {
      applyInit(widgetNoArgs());
    }


    public String getHref(){
      return href;
    }
    public String getOrigin(){
      return origin;
    }
    public String getProtocol(){
      return protocol;
    }
    public String getHost(){
      return host;
    }
    public String getHostname(){
      return hostname;
    }
    public String getPort(){
      return port;
    }
    public String getPathname(){
      return pathname;
    }
    public String getSearch(){
      return search;
    }
    public String getHash(){
      return hash;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.URL_UTILS_READ_ONLY;
    }


}