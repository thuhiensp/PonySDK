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

public class PBiquadFilterNode extends PAudioNode {
    private static final Logger log = LoggerFactory.getLogger(PBiquadFilterNode.class);
     private PAudioParam frequency;
     private PAudioParam detune;
     private PAudioParam Q;
     private PAudioParam gain;
     private PBiquadFilterType type;

    public PBiquadFilterNode(PBaseAudioContext context){
      applyInit(widgetWithArgs(), new Object[]{context});
    }

    public PBiquadFilterNode(PBaseAudioContext context, PBiquadFilterOptions options){
      applyInit(widgetWithArgs(), new Object[]{context, options});
    }


    public void setType(final PBiquadFilterType type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
    }

    public PAudioParam getFrequency(){
      return frequency;
    }
    public PAudioParam getDetune(){
      return detune;
    }
    public PAudioParam getQ(){
      return Q;
    }
    public PAudioParam getGain(){
      return gain;
    }
    public PBiquadFilterType getType(){
      return type;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.BIQUAD_FILTER_NODE;
    }


}