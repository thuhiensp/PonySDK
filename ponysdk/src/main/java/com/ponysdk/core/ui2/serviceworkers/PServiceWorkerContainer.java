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
import com.ponysdk.core.ui2.core.PPromise;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PServiceWorkerContainer extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PServiceWorkerContainer.class);
     private PServiceWorker controller;
     private PPromise<PServiceWorkerRegistration> ready;
     private PEventHandlerNonNull oncontrollerchange;
     private PEventHandlerNonNull onmessage;

    public PServiceWorkerContainer() {
      applyInit(widgetNoArgs());
    }

    public void setOncontrollerchange(final PEventHandlerNonNull oncontrollerchange, final PEventAttributesName... atrsName)  {
       addHandler(oncontrollerchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONCONTROLLERCHANGE, oncontrollerchange, atrsName);
    }
    public void setOnmessage(final PEventHandlerNonNull onmessage, final PEventAttributesName... atrsName)  {
       addHandler(onmessage);
       saveUpdateAttributeCallBack(PAttributeNames.ONMESSAGE, onmessage, atrsName);
    }

    public PServiceWorker getController(){
      return controller;
    }
    public PPromise<PServiceWorkerRegistration> getReady(){
      return ready;
    }
    public PEventHandlerNonNull getOncontrollerchange(){
      return oncontrollerchange;
    }
    public PEventHandlerNonNull getOnmessage(){
      return onmessage;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SERVICE_WORKER_CONTAINER;
    }


}