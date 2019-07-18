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
package com.ponysdk.core.ui2.animation;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.uniontype.PDoubleOrString;

public abstract class PAnimationEffectTimingReadOnly extends PObject2 {
     private Double delay;
     private Double endDelay;
     private String fill;
     private Double iterationStart;
     private Double iterations;
     private PDoubleOrString duration;
     private String easing;
     private PPlaybackDirection direction;


    public Double getDelay(){
      return delay;
    }
    public Double getEndDelay(){
      return endDelay;
    }
    public String getFill(){
      return fill;
    }
    public Double getIterationStart(){
      return iterationStart;
    }
    public Double getIterations(){
      return iterations;
    }
    public PDoubleOrString getDuration(){
      return duration;
    }
    public String getEasing(){
      return easing;
    }
    public PPlaybackDirection getDirection(){
      return direction;
    }


}