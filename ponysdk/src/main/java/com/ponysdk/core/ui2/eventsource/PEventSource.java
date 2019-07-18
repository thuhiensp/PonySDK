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
package com.ponysdk.core.ui2.eventsource;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PEventSource extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PEventSource.class);
     private String url;
     private Boolean withCredentials;
     private Short readyState;
     private PEventHandlerNonNull onopen;
     private PEventHandlerNonNull onmessage;
     private PEventHandlerNonNull onerror;

    public PEventSource(String url){
      applyInit(widgetWithArgs(), new Object[]{url});
    }

    public PEventSource(String url, PEventSourceInit eventSourceInitDict){
      applyInit(widgetWithArgs(), new Object[]{url, eventSourceInitDict});
    }


    public void setOnopen(final PEventHandlerNonNull onopen, final PEventAttributesName... atrsName)  {
       addHandler(onopen);
       saveUpdateAttributeCallBack(PAttributeNames.ONOPEN, onopen, atrsName);
    }
    public void setOnmessage(final PEventHandlerNonNull onmessage, final PEventAttributesName... atrsName)  {
       addHandler(onmessage);
       saveUpdateAttributeCallBack(PAttributeNames.ONMESSAGE, onmessage, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }

    public String getUrl(){
      return url;
    }
    public Boolean getWithCredentials(){
      return withCredentials;
    }
    public Short getReadyState(){
      return readyState;
    }
    public PEventHandlerNonNull getOnopen(){
      return onopen;
    }
    public PEventHandlerNonNull getOnmessage(){
      return onmessage;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.EVENT_SOURCE;
    }


}