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

public abstract class PPerformanceResourceTiming extends PPerformanceEntry {
     private String initiatorType;
     private String nextHopProtocol;
     private Double workerStart;
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
     private Double transferSize;
     private Double encodedBodySize;
     private Double decodedBodySize;
     private PPerformanceServerTiming[] serverTiming;


    public String getInitiatorType(){
      return initiatorType;
    }
    public String getNextHopProtocol(){
      return nextHopProtocol;
    }
    public Double getWorkerStart(){
      return workerStart;
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
    public Double getTransferSize(){
      return transferSize;
    }
    public Double getEncodedBodySize(){
      return encodedBodySize;
    }
    public Double getDecodedBodySize(){
      return decodedBodySize;
    }
    public PPerformanceServerTiming[] getServerTiming(){
      return serverTiming;
    }


}