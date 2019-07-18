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

public class PConvolverNode extends PAudioNode {
    private static final Logger log = LoggerFactory.getLogger(PConvolverNode.class);
     private PAudioBuffer buffer;
     private Boolean normalize;

    public PConvolverNode(PBaseAudioContext context){
      applyInit(widgetWithArgs(), new Object[]{context});
    }

    public PConvolverNode(PBaseAudioContext context, PConvolverOptions options){
      applyInit(widgetWithArgs(), new Object[]{context, options});
    }


    public void setBuffer(final PAudioBuffer buffer)  {
       if (Objects.equals(this.buffer, buffer))return;
       this.buffer = buffer;
       log.info("buffer" + buffer);
       saveUpdateAttribute(PAttributeNames.BUFFER,buffer);
    }
    public void setNormalize(final Boolean normalize)  {
       if (Objects.equals(this.normalize, normalize))return;
       this.normalize = normalize;
       log.info("normalize" + normalize);
       saveUpdateAttribute(PAttributeNames.NORMALIZE,normalize);
    }

    public PAudioBuffer getBuffer(){
      return buffer;
    }
    public Boolean getNormalize(){
      return normalize;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.CONVOLVER_NODE;
    }


}