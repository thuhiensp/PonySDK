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
package com.ponysdk.core.ui2.encryptedmedia;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.core.PPromise;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PMediaKeySession extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PMediaKeySession.class);
     private String sessionId;
     private Double expiration;
     private PPromise closed;
     private PMediaKeyStatusMap keyStatuses;
     private PEventHandlerNonNull onkeystatuseschange;
     private PEventHandlerNonNull onmessage;

    public PMediaKeySession() {
      applyInit(widgetNoArgs());
    }

    public void setOnkeystatuseschange(final PEventHandlerNonNull onkeystatuseschange, final PEventAttributesName... atrsName)  {
       addHandler(onkeystatuseschange);
       saveUpdateAttributeCallBack(PAttributeNames.ONKEYSTATUSESCHANGE, onkeystatuseschange, atrsName);
    }
    public void setOnmessage(final PEventHandlerNonNull onmessage, final PEventAttributesName... atrsName)  {
       addHandler(onmessage);
       saveUpdateAttributeCallBack(PAttributeNames.ONMESSAGE, onmessage, atrsName);
    }

    public String getSessionId(){
      return sessionId;
    }
    public Double getExpiration(){
      return expiration;
    }
    public PPromise getClosed(){
      return closed;
    }
    public PMediaKeyStatusMap getKeyStatuses(){
      return keyStatuses;
    }
    public PEventHandlerNonNull getOnkeystatuseschange(){
      return onkeystatuseschange;
    }
    public PEventHandlerNonNull getOnmessage(){
      return onmessage;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.MEDIA_KEY_SESSION;
    }


}