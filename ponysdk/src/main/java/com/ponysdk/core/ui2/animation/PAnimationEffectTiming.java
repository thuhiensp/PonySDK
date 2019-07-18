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
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.uniontype.PDoubleOrString;

public class PAnimationEffectTiming extends PAnimationEffectTimingReadOnly {
    private static final Logger log = LoggerFactory.getLogger(PAnimationEffectTiming.class);
     private Double delay;
     private Double endDelay;
     private String fill;
     private Double iterationStart;
     private Double iterations;
     private PDoubleOrString duration;
     private String easing;
     private PPlaybackDirection direction;

    public PAnimationEffectTiming() {
      applyInit(widgetNoArgs());
    }

    public void setDelay(final Double delay)  {
       if (Objects.equals(this.delay, delay))return;
       this.delay = delay;
       log.info("delay" + delay);
       saveUpdateAttribute(PAttributeNames.DELAY,delay);
    }
    public void setEndDelay(final Double endDelay)  {
       if (Objects.equals(this.endDelay, endDelay))return;
       this.endDelay = endDelay;
       log.info("endDelay" + endDelay);
       saveUpdateAttribute(PAttributeNames.END_DELAY,endDelay);
    }
    public void setFill(final String fill)  {
       if (Objects.equals(this.fill, fill))return;
       this.fill = fill;
       log.info("fill" + fill);
       saveUpdateAttribute(PAttributeNames.FILL,fill);
    }
    public void setIterationStart(final Double iterationStart)  {
       if (Objects.equals(this.iterationStart, iterationStart))return;
       this.iterationStart = iterationStart;
       log.info("iterationStart" + iterationStart);
       saveUpdateAttribute(PAttributeNames.ITERATION_START,iterationStart);
    }
    public void setIterations(final Double iterations)  {
       if (Objects.equals(this.iterations, iterations))return;
       this.iterations = iterations;
       log.info("iterations" + iterations);
       saveUpdateAttribute(PAttributeNames.ITERATIONS,iterations);
    }
    public void setDuration(final PDoubleOrString duration)  {
       if (Objects.equals(this.duration, duration))return;
       this.duration = duration;
       log.info("duration" + duration);
       saveUpdateAttribute(PAttributeNames.DURATION,duration);
    }
    public void setEasing(final String easing)  {
       if (Objects.equals(this.easing, easing))return;
       this.easing = easing;
       log.info("easing" + easing);
       saveUpdateAttribute(PAttributeNames.EASING,easing);
    }
    public void setDirection(final PPlaybackDirection direction)  {
       if (Objects.equals(this.direction, direction))return;
       this.direction = direction;
       log.info("direction" + direction);
       saveUpdateAttribute(PAttributeNames.DIRECTION,direction);
    }

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

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.ANIMATION_EFFECT_TIMING;
    }


}