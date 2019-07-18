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
package com.ponysdk.core.ui2.indexeddb;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.dom.PDOMException;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public abstract class PIDBRequest extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PIDBRequest.class);
     private Object result;
     private PDOMException error;
     private Object source;
     private PIDBTransaction transaction;
     private PEventHandlerNonNull onsuccess;
     private PEventHandlerNonNull onerror;
     private PIDBRequestReadyState readyState;

    public void setOnsuccess(final PEventHandlerNonNull onsuccess, final PEventAttributesName... atrsName)  {
       addHandler(onsuccess);
       saveUpdateAttributeCallBack(PAttributeNames.ONSUCCESS, onsuccess, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }

    public Object getResult(){
      return result;
    }
    public PDOMException getError(){
      return error;
    }
    public Object getSource(){
      return source;
    }
    public PIDBTransaction getTransaction(){
      return transaction;
    }
    public PEventHandlerNonNull getOnsuccess(){
      return onsuccess;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PIDBRequestReadyState getReadyState(){
      return readyState;
    }


}