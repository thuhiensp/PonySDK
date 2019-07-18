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
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PResponse extends PObject2 {
     private String url;
     private Boolean redirected;
     private Short status;
     private Boolean ok;
     private String statusText;
     private PHeaders headers;
     private Object body;
     private Boolean bodyUsed;
     private PResponseType type;

    public PResponse() {
      applyInit(widgetNoArgs());
    }


    public PResponse(Object body){
      applyInit(widgetWithArgs(), new Object[]{body});
    }

    public PResponse(Object body, PResponseInit init){
      applyInit(widgetWithArgs(), new Object[]{body, init});
    }



    public String getUrl(){
      return url;
    }
    public Boolean getRedirected(){
      return redirected;
    }
    public Short getStatus(){
      return status;
    }
    public Boolean getOk(){
      return ok;
    }
    public String getStatusText(){
      return statusText;
    }
    public PHeaders getHeaders(){
      return headers;
    }
    public Object getBody(){
      return body;
    }
    public Boolean getBodyUsed(){
      return bodyUsed;
    }
    public PResponseType getType(){
      return type;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.RESPONSE;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.RESPONSE;
    }


}