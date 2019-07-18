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
package com.ponysdk.core.ui2.serviceworkers;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.background_fetch.PBackgroundFetchManager;
import com.ponysdk.core.ui2.background_sync.PSyncManager;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;
import com.ponysdk.core.ui2.push_messaging.PPushManager;

public class PServiceWorkerRegistration extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PServiceWorkerRegistration.class);
     private PServiceWorker installing;
     private PServiceWorker waiting;
     private PServiceWorker active;
     private PNavigationPreloadManager navigationPreload;
     private String scope;
     private PEventHandlerNonNull onupdatefound;
     private PBackgroundFetchManager backgroundFetch;
     private PSyncManager sync;
     private PPushManager pushManager;

    public PServiceWorkerRegistration() {
      applyInit(widgetNoArgs());
    }

    public void setOnupdatefound(final PEventHandlerNonNull onupdatefound, final PEventAttributesName... atrsName)  {
       addHandler(onupdatefound);
       saveUpdateAttributeCallBack(PAttributeNames.ONUPDATEFOUND, onupdatefound, atrsName);
    }

    public PServiceWorker getInstalling(){
      return installing;
    }
    public PServiceWorker getWaiting(){
      return waiting;
    }
    public PServiceWorker getActive(){
      return active;
    }
    public PNavigationPreloadManager getNavigationPreload(){
      return navigationPreload;
    }
    public String getScope(){
      return scope;
    }
    public PEventHandlerNonNull getOnupdatefound(){
      return onupdatefound;
    }
    public PBackgroundFetchManager getBackgroundFetch(){
      return backgroundFetch;
    }
    public PSyncManager getSync(){
      return sync;
    }
    public PPushManager getPushManager(){
      return pushManager;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SERVICE_WORKER_REGISTRATION;
    }


}