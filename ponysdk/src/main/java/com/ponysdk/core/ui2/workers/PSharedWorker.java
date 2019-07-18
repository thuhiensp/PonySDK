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
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.dom.PMessagePort;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PSharedWorker extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PSharedWorker.class);
     private PMessagePort port;
     private Double workerStart;
     private PEventHandlerNonNull onerror;

    public PSharedWorker(String scriptURL){
      applyInit(widgetWithArgs(), new Object[]{scriptURL});
    }

    public PSharedWorker(String scriptURL, String name){
      applyInit(widgetWithArgs(), new Object[]{scriptURL, name});
    }


    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }

    public PMessagePort getPort(){
      return port;
    }
    public Double getWorkerStart(){
      return workerStart;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.SHARED_WORKER;
    }


}