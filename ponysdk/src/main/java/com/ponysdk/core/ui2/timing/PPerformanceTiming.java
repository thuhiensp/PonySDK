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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PPerformanceTiming extends PObject2 {
     private Double navigationStart;
     private Double unloadEventStart;
     private Double unloadEventEnd;
     private Double redirectStart;
     private Double redirectEnd;
     private Double fetchStart;
     private Double domainLookupStart;
     private Double domainLookupEnd;
     private Double connectStart;
     private Double connectEnd;
     private Double secureConnectionStart;
     private Double requestStart;
     private Double responseStart;
     private Double responseEnd;
     private Double domLoading;
     private Double domInteractive;
     private Double domContentLoadedEventStart;
     private Double domContentLoadedEventEnd;
     private Double domComplete;
     private Double loadEventStart;
     private Double loadEventEnd;

    public PPerformanceTiming() {
      applyInit(widgetNoArgs());
    }


    public Double getNavigationStart(){
      return navigationStart;
    }
    public Double getUnloadEventStart(){
      return unloadEventStart;
    }
    public Double getUnloadEventEnd(){
      return unloadEventEnd;
    }
    public Double getRedirectStart(){
      return redirectStart;
    }
    public Double getRedirectEnd(){
      return redirectEnd;
    }
    public Double getFetchStart(){
      return fetchStart;
    }
    public Double getDomainLookupStart(){
      return domainLookupStart;
    }
    public Double getDomainLookupEnd(){
      return domainLookupEnd;
    }
    public Double getConnectStart(){
      return connectStart;
    }
    public Double getConnectEnd(){
      return connectEnd;
    }
    public Double getSecureConnectionStart(){
      return secureConnectionStart;
    }
    public Double getRequestStart(){
      return requestStart;
    }
    public Double getResponseStart(){
      return responseStart;
    }
    public Double getResponseEnd(){
      return responseEnd;
    }
    public Double getDomLoading(){
      return domLoading;
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

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.PERFORMANCE_TIMING;
    }


}