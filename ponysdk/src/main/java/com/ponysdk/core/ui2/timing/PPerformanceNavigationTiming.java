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

public class PPerformanceNavigationTiming extends PPerformanceResourceTiming {
     private Double unloadEventStart;
     private Double unloadEventEnd;
     private Double domInteractive;
     private Double domContentLoadedEventStart;
     private Double domContentLoadedEventEnd;
     private Double domComplete;
     private Double loadEventStart;
     private Double loadEventEnd;
     private Short redirectCount;
     private PNavigationType type;

    public PPerformanceNavigationTiming() {
      applyInit(widgetNoArgs());
    }


    public Double getUnloadEventStart(){
      return unloadEventStart;
    }
    public Double getUnloadEventEnd(){
      return unloadEventEnd;
    }
    public Double getDomInteractive(){
      return domInteractive;
    }
    public Double getDomContentLoadedEventStart(){
      return domContentLoadedEventStart;
    }
    public Double getDomContentLoadedEventEnd(){
      return domContentLoadedEventEnd;
    }
    public Double getDomComplete(){
      return domComplete;
    }
    public Double getLoadEventStart(){
      return loadEventStart;
    }
    public Double getLoadEventEnd(){
      return loadEventEnd;
    }
    public Short getRedirectCount(){
      return redirectCount;
    }
    public PNavigationType getType(){
      return type;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.PERFORMANCE_NAVIGATION_TIMING;
    }


}