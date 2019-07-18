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
package com.ponysdk.core.ui2.battery;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PBatteryManager extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PBatteryManager.class);
     private Boolean charging;
     private Double chargingTime;
     private Double dischargingTime;
     private Double level;
     private PEventHandlerNonNull onchargingchange;
     private PEventHandlerNonNull onchargingtimechange;
     private PEventHandlerNonNull ondischargingtimechange;
     private PEventHandlerNonNull onlevelchange;

    public PBatteryManager() {
      applyInit(widgetNoArgs());
    }

    public void setOnchargingchange(final PEventHandlerNonNull onchargingchange, final PEventAttributesName... atrsName)  {
       addHandler(onchargingchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONCHARGINGCHANGE, onchargingchange, atrsName);
    }
    public void setOnchargingtimechange(final PEventHandlerNonNull onchargingtimechange, final PEventAttributesName... atrsName)  {
       addHandler(onchargingtimechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONCHARGINGTIMECHANGE, onchargingtimechange, atrsName);
    }
    public void setOndischargingtimechange(final PEventHandlerNonNull ondischargingtimechange, final PEventAttributesName... atrsName)  {
       addHandler(ondischargingtimechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONDISCHARGINGTIMECHANGE, ondischargingtimechange, atrsName);
    }
    public void setOnlevelchange(final PEventHandlerNonNull onlevelchange, final PEventAttributesName... atrsName)  {
       addHandler(onlevelchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONLEVELCHANGE, onlevelchange, atrsName);
    }

    public Boolean getCharging(){
      return charging;
    }
    public Double getChargingTime(){
      return chargingTime;
    }
    public Double getDischargingTime(){
      return dischargingTime;
    }
    public Double getLevel(){
      return level;
    }
    public PEventHandlerNonNull getOnchargingchange(){
      return onchargingchange;
    }
    public PEventHandlerNonNull getOnchargingtimechange(){
      return onchargingtimechange;
    }
    public PEventHandlerNonNull getOndischargingtimechange(){
      return ondischargingtimechange;
    }
    public PEventHandlerNonNull getOnlevelchange(){
      return onlevelchange;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.BATTERY_MANAGER;
    }


}