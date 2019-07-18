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
package com.ponysdk.core.ui2.webaudio;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.events.PEventTarget;

public abstract class PAudioNode extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PAudioNode.class);
     private PBaseAudioContext context;
     private Double numberOfInputs;
     private Double numberOfOutputs;
     private Double channelCount;
     private PChannelCountMode channelCountMode;
     private PChannelInterpretation channelInterpretation;

    public void setChannelCount(final Double channelCount)  {
       if (Objects.equals(this.channelCount, channelCount))return;
       this.channelCount = channelCount;
       log.info("channelCount" + channelCount);
       saveUpdateAttribute(PAttributeNames.CHANNEL_COUNT,channelCount);
    }
    public void setChannelCountMode(final PChannelCountMode channelCountMode)  {
       if (Objects.equals(this.channelCountMode, channelCountMode))return;
       this.channelCountMode = channelCountMode;
       log.info("channelCountMode" + channelCountMode);
       saveUpdateAttribute(PAttributeNames.CHANNEL_COUNT_MODE,channelCountMode);
    }
    public void setChannelInterpretation(final PChannelInterpretation channelInterpretation)  {
       if (Objects.equals(this.channelInterpretation, channelInterpretation))return;
       this.channelInterpretation = channelInterpretation;
       log.info("channelInterpretation" + channelInterpretation);
       saveUpdateAttribute(PAttributeNames.CHANNEL_INTERPRETATION,channelInterpretation);
    }

    public PBaseAudioContext getContext(){
      return context;
    }
    public Double getNumberOfInputs(){
      return numberOfInputs;
    }
    public Double getNumberOfOutputs(){
      return numberOfOutputs;
    }
    public Double getChannelCount(){
      return channelCount;
    }
    public PChannelCountMode getChannelCountMode(){
      return channelCountMode;
    }
    public PChannelInterpretation getChannelInterpretation(){
      return channelInterpretation;
    }


}