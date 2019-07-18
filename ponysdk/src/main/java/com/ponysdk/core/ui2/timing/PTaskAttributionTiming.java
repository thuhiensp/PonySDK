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
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PTaskAttributionTiming extends PPerformanceEntry {
     private String containerType;
     private String containerSrc;
     private String containerId;
     private String containerName;

    public PTaskAttributionTiming() {
      applyInit(widgetNoArgs());
    }


    public String getContainerType(){
      return containerType;
    }
    public String getContainerSrc(){
      return containerSrc;
    }
    public String getContainerId(){
      return containerId;
    }
    public String getContainerName(){
      return containerName;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.TASK_ATTRIBUTION_TIMING;
    }


}