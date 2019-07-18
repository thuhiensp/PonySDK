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
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PDynamicsCompressorNode extends PAudioNode {
     private PAudioParam threshold;
     private PAudioParam knee;
     private PAudioParam ratio;
     private Double reduction;
     private PAudioParam attack;
     private PAudioParam release;

    public PDynamicsCompressorNode(PBaseAudioContext context){
      applyInit(widgetWithArgs(), new Object[]{context});
    }

    public PDynamicsCompressorNode(PBaseAudioContext context, PDynamicsCompressorOptions options){
      applyInit(widgetWithArgs(), new Object[]{context, options});
    }



    public PAudioParam getThreshold(){
      return threshold;
    }
    public PAudioParam getKnee(){
      return knee;
    }
    public PAudioParam getRatio(){
      return ratio;
    }
    public Double getReduction(){
      return reduction;
    }
    public PAudioParam getAttack(){
      return attack;
    }
    public PAudioParam getRelease(){
      return release;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.DYNAMICS_COMPRESSOR_NODE;
    }


}