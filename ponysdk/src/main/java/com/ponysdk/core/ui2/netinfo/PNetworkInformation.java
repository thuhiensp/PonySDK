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
package com.ponysdk.core.ui2.netinfo;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PNetworkInformation extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PNetworkInformation.class);
     private Double downlinkMax;
     private PEventHandlerNonNull onchange;
     private PEventHandlerNonNull ontypechange;
     private Double rtt;
     private Double downlink;
     private PConnectionType type;
     private PEffectiveConnectionType effectiveType;

    public PNetworkInformation() {
      applyInit(widgetNoArgs());
    }

    public void setOnchange(final PEventHandlerNonNull onchange, final PEventAttributesName... atrsName)  {
       addHandler(onchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONCHANGE, onchange, atrsName);
    }
    public void setOntypechange(final PEventHandlerNonNull ontypechange, final PEventAttributesName... atrsName)  {
       addHandler(ontypechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONTYPECHANGE, ontypechange, atrsName);
    }

    public Double getDownlinkMax(){
      return downlinkMax;
    }
    public PEventHandlerNonNull getOnchange(){
      return onchange;
    }
    public PEventHandlerNonNull getOntypechange(){
      return ontypechange;
    }
    public Double getRtt(){
      return rtt;
    }
    public Double getDownlink(){
      return downlink;
    }
    public PConnectionType getType(){
      return type;
    }
    public PEffectiveConnectionType getEffectiveType(){
      return effectiveType;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.NETWORK_INFORMATION;
    }


}