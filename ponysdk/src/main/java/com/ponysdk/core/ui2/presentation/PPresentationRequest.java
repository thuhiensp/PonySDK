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
package com.ponysdk.core.ui2.presentation;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PPresentationRequest extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PPresentationRequest.class);
     private PEventHandlerNonNull onconnectionavailable;

    public PPresentationRequest(String url){
      applyInit(widgetWithArgs(), new Object[]{url});
    }

    public PPresentationRequest(String[] urls){
      applyInit(widgetWithArgs(), new Object[]{urls});
    }


    public void setOnconnectionavailable(final PEventHandlerNonNull onconnectionavailable, final PEventAttributesName... atrsName)  {
       addHandler(onconnectionavailable);
       saveUpdateAttributeCallBack(PAttributeNames.ONCONNECTIONAVAILABLE, onconnectionavailable, atrsName);
    }

    public PEventHandlerNonNull getOnconnectionavailable(){
      return onconnectionavailable;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.PRESENTATION_REQUEST;
    }


}