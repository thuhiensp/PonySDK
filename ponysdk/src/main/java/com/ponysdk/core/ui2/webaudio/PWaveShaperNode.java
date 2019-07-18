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
import com.ponysdk.core.ui2.core.PFloat32Array;

public class PWaveShaperNode extends PAudioNode {
    private static final Logger log = LoggerFactory.getLogger(PWaveShaperNode.class);
     private PFloat32Array curve;
     private POverSampleType oversample;

    public PWaveShaperNode(PBaseAudioContext context){
      applyInit(widgetWithArgs(), new Object[]{context});
    }

    public PWaveShaperNode(PBaseAudioContext context, PWaveShaperOptions options){
      applyInit(widgetWithArgs(), new Object[]{context, options});
    }


    public void setCurve(final PFloat32Array curve)  {
       if (Objects.equals(this.curve, curve))return;
       this.curve = curve;
       log.info("curve" + curve);
       saveUpdateAttribute(PAttributeNames.CURVE,curve);
    }
    public void setOversample(final POverSampleType oversample)  {
       if (Objects.equals(this.oversample, oversample))return;
       this.oversample = oversample;
       log.info("oversample" + oversample);
       saveUpdateAttribute(PAttributeNames.OVERSAMPLE,oversample);
    }

    public PFloat32Array getCurve(){
      return curve;
    }
    public POverSampleType getOversample(){
      return oversample;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.WAVE_SHAPER_NODE;
    }


}