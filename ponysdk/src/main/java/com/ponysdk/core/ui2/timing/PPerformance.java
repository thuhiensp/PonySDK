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
package com.ponysdk.core.ui2.timing;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PPerformance extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PPerformance.class);
     private PEventHandlerNonNull onresourcetimingbufferfull;
     private PPerformanceTiming timing;
     private PPerformanceNavigation navigation;
     private PMemoryInfo memory;

    public PPerformance() {
      applyInit(widgetNoArgs());
    }

    public void setOnresourcetimingbufferfull(final PEventHandlerNonNull onresourcetimingbufferfull, final PEventAttributesName... atrsName)  {
       addHandler(onresourcetimingbufferfull);
       saveUpdateAttributeCallBack(PAttributeNames.ONRESOURCETIMINGBUFFERFULL, onresourcetimingbufferfull, atrsName);
    }

    public PEventHandlerNonNull getOnresourcetimingbufferfull(){
      return onresourcetimingbufferfull;
    }
    public PPerformanceTiming getTiming(){
      return timing;
    }
    public PPerformanceNavigation getNavigation(){
      return navigation;
    }
    public PMemoryInfo getMemory(){
      return memory;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.PERFORMANCE;
    }


}