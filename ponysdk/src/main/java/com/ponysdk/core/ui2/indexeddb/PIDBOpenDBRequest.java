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
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;

public class PIDBOpenDBRequest extends PIDBRequest {
    private static final Logger log = LoggerFactory.getLogger(PIDBOpenDBRequest.class);
     private PEventHandlerNonNull onblocked;
     private PEventHandlerNonNull onupgradeneeded;

    public PIDBOpenDBRequest() {
      applyInit(widgetNoArgs());
    }

    public void setOnblocked(final PEventHandlerNonNull onblocked, final PEventAttributesName... atrsName)  {
       addHandler(onblocked);
       saveUpdateAttributeCallBack(PAttributeNames.ONBLOCKED, onblocked, atrsName);
    }
    public void setOnupgradeneeded(final PEventHandlerNonNull onupgradeneeded, final PEventAttributesName... atrsName)  {
       addHandler(onupgradeneeded);
       saveUpdateAttributeCallBack(PAttributeNames.ONUPGRADENEEDED, onupgradeneeded, atrsName);
    }

    public PEventHandlerNonNull getOnblocked(){
      return onblocked;
    }
    public PEventHandlerNonNull getOnupgradeneeded(){
      return onupgradeneeded;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.IDB_OPENDB_REQUEST;
    }


}