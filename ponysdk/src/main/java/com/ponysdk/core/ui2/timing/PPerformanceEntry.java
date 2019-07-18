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

public abstract class PPerformanceEntry extends PObject2 {
     private String name;
     private String entryType;
     private Double startTime;
     private Double duration;


    public String getName(){
      return name;
    }
    public String getEntryType(){
      return entryType;
    }
    public Double getStartTime(){
      return startTime;
    }
    public Double getDuration(){
      return duration;
    }


}