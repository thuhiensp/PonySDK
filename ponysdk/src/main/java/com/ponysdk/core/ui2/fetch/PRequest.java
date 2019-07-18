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
package com.ponysdk.core.ui2.fetch;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.core.PJsObject;

public class PRequest extends PObject2 {
     private String method;
     private String url;
     private PHeaders headers;
     private String referrer;
     private String integrity;
     private Boolean bodyUsed;
     private PReferrerPolicy referrerPolicy;
     private PRequestMode mode;
     private PRequestCredentials credentials;
     private PRequestCache cache;
     private PRequestRedirect redirect;

    public PRequest(PRequest input){
      applyInit(widgetWithArgs(), new Object[]{input});
    }

    public PRequest(PRequest input, PJsObject requestInitDict){
      applyInit(widgetWithArgs(), new Object[]{input, requestInitDict});
    }

    public PRequest(String input){
      applyInit(widgetWithArgs(), new Object[]{input});
    }

    public PRequest(String input, PJsObject requestInitDict){
      applyInit(widgetWithArgs(), new Object[]{input, requestInitDict});
    }



    public String getMethod(){
      return method;
    }
    public String getUrl(){
      return url;
    }
    public PHeaders getHeaders(){
      return headers;
    }
    public String getReferrer(){
      return referrer;
    }
    public String getIntegrity(){
      return integrity;
    }
    public Boolean getBodyUsed(){
      return bodyUsed;
    }
    public PReferrerPolicy getReferrerPolicy(){
      return referrerPolicy;
    }
    public PRequestMode getMode(){
      return mode;
    }
    public PRequestCredentials getCredentials(){
      return credentials;
    }
    public PRequestCache getCache(){
      return cache;
    }
    public PRequestRedirect getRedirect(){
      return redirect;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.REQUEST;
    }


}