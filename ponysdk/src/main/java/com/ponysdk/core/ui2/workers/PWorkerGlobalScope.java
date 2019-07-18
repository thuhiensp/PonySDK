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
package com.ponysdk.core.ui2.workers;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.cachestorage.PCacheStorage;
import com.ponysdk.core.ui2.crypto.PCrypto;
import com.ponysdk.core.ui2.dom.PAddressSpace;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;
import com.ponysdk.core.ui2.frame.PConsole;
import com.ponysdk.core.ui2.indexeddb.PIDBFactory;
import com.ponysdk.core.ui2.timing.PWorkerPerformance;

public abstract class PWorkerGlobalScope extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PWorkerGlobalScope.class);
     private PWorkerGlobalScope self;
     private PWorkerLocation location;
     private PEventHandlerNonNull onerror;
     private PWorkerNavigator navigator;
     private PConsole console;
     private PEventHandlerNonNull onrejectionhandled;
     private PEventHandlerNonNull onunhandledrejection;
     private Boolean isSecureContext;
     private String origin;
     private PCacheStorage caches;
     private PCrypto crypto;
     private PIDBFactory indexedDB;
     private PWorkerPerformance performance;
     private PAddressSpace addressSpace;

    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnrejectionhandled(final PEventHandlerNonNull onrejectionhandled, final PEventAttributesName... atrsName)  {
       addHandler(onrejectionhandled);
       saveUpdateAttributeCallBack(PAttributeNames.ONREJECTIONHANDLED, onrejectionhandled, atrsName);
    }
    public void setOnunhandledrejection(final PEventHandlerNonNull onunhandledrejection, final PEventAttributesName... atrsName)  {
       addHandler(onunhandledrejection);
       saveUpdateAttributeCallBack(PAttributeNames.ONUNHANDLEDREJECTION, onunhandledrejection, atrsName);
    }

    public PWorkerGlobalScope getSelf(){
      return self;
    }
    public PWorkerLocation getLocation(){
      return location;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PWorkerNavigator getNavigator(){
      return navigator;
    }
    public PConsole getConsole(){
      return console;
    }
    public PEventHandlerNonNull getOnrejectionhandled(){
      return onrejectionhandled;
    }
    public PEventHandlerNonNull getOnunhandledrejection(){
      return onunhandledrejection;
    }
    public Boolean getIsSecureContext(){
      return isSecureContext;
    }
    public String getOrigin(){
      return origin;
    }
    public PCacheStorage getCaches(){
      return caches;
    }
    public PCrypto getCrypto(){
      return crypto;
    }
    public PIDBFactory getIndexedDB(){
      return indexedDB;
    }
    public PWorkerPerformance getPerformance(){
      return performance;
    }
    public PAddressSpace getAddressSpace(){
      return addressSpace;
    }


}