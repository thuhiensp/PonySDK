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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PPresentation extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PPresentation.class);
     private PPresentationRequest defaultRequest;
     private PPresentationReceiver receiver;

    public PPresentation() {
      applyInit(widgetNoArgs());
    }

    public void setDefaultRequest(final PPresentationRequest defaultRequest)  {
       if (Objects.equals(this.defaultRequest, defaultRequest))return;
       this.defaultRequest = defaultRequest;
       log.info("defaultRequest" + defaultRequest);
       saveUpdateAttribute(PAttributeNames.DEFAULT_REQUEST,defaultRequest);
    }

    public PPresentationRequest getDefaultRequest(){
      return defaultRequest;
    }
    public PPresentationReceiver getReceiver(){
      return receiver;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.PRESENTATION;
    }


}