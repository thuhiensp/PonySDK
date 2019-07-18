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
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.dom.PDOMException;
import com.ponysdk.core.ui2.dom.PDOMStringList;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PIDBTransaction extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PIDBTransaction.class);
     private PDOMStringList objectStoreNames;
     private PIDBDatabase db;
     private PDOMException error;
     private PEventHandlerNonNull onabort;
     private PEventHandlerNonNull oncomplete;
     private PEventHandlerNonNull onerror;
     private PIDBTransactionMode mode;

    public PIDBTransaction() {
      applyInit(widgetNoArgs());
    }

    public void setOnabort(final PEventHandlerNonNull onabort, final PEventAttributesName... atrsName)  {
       addHandler(onabort);
       saveUpdateAttributeCallBack(PAttributeNames.ONABORT, onabort, atrsName);
    }
    public void setOncomplete(final PEventHandlerNonNull oncomplete, final PEventAttributesName... atrsName)  {
       addHandler(oncomplete);
       saveUpdateAttributeCallBack(PAttributeNames.ONCOMPLETE, oncomplete, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }

    public PDOMStringList getObjectStoreNames(){
      return objectStoreNames;
    }
    public PIDBDatabase getDb(){
      return db;
    }
    public PDOMException getError(){
      return error;
    }
    public PEventHandlerNonNull getOnabort(){
      return onabort;
    }
    public PEventHandlerNonNull getOncomplete(){
      return oncomplete;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PIDBTransactionMode getMode(){
      return mode;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.IDB_TRANSACTION;
    }


}