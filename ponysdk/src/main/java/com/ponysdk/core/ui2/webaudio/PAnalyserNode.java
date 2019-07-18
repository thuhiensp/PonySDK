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
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PAnalyserNode extends PAudioNode {
    private static final Logger log = LoggerFactory.getLogger(PAnalyserNode.class);
     private Double fftSize;
     private Double frequencyBinCount;
     private Double minDecibels;
     private Double maxDecibels;
     private Double smoothingTimeConstant;

    public PAnalyserNode(PBaseAudioContext context){
      applyInit(widgetWithArgs(), new Object[]{context});
    }

    public PAnalyserNode(PBaseAudioContext context, PAnalyserOptions options){
      applyInit(widgetWithArgs(), new Object[]{context, options});
    }


    public void setFftSize(final Double fftSize)  {
       if (Objects.equals(this.fftSize, fftSize))return;
       this.fftSize = fftSize;
       log.info("fftSize" + fftSize);
       saveUpdateAttribute(PAttributeNames.FFT_SIZE,fftSize);
    }
    public void setMinDecibels(final Double minDecibels)  {
       if (Objects.equals(this.minDecibels, minDecibels))return;
       this.minDecibels = minDecibels;
       log.info("minDecibels" + minDecibels);
       saveUpdateAttribute(PAttributeNames.MIN_DECIBELS,minDecibels);
    }
    public void setMaxDecibels(final Double maxDecibels)  {
       if (Objects.equals(this.maxDecibels, maxDecibels))return;
       this.maxDecibels = maxDecibels;
       log.info("maxDecibels" + maxDecibels);
       saveUpdateAttribute(PAttributeNames.MAX_DECIBELS,maxDecibels);
    }
    public void setSmoothingTimeConstant(final Double smoothingTimeConstant)  {
       if (Objects.equals(this.smoothingTimeConstant, smoothingTimeConstant))return;
       this.smoothingTimeConstant = smoothingTimeConstant;
       log.info("smoothingTimeConstant" + smoothingTimeConstant);
       saveUpdateAttribute(PAttributeNames.SMOOTHING_TIME_CONSTANT,smoothingTimeConstant);
    }

    public Double getFftSize(){
      return fftSize;
    }
    public Double getFrequencyBinCount(){
      return frequencyBinCount;
    }
    public Double getMinDecibels(){
      return minDecibels;
    }
    public Double getMaxDecibels(){
      return maxDecibels;
    }
    public Double getSmoothingTimeConstant(){
      return smoothingTimeConstant;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.ANALYSER_NODE;
    }


}