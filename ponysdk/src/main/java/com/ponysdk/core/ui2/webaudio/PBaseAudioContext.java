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
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public abstract class PBaseAudioContext extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PBaseAudioContext.class);
     private PAudioDestinationNode destination;
     private Double currentTime;
     private Double sampleRate;
     private PAudioListener listener;
     private PEventHandlerNonNull onstatechange;
     private PAudioContextState state;

    public void setOnstatechange(final PEventHandlerNonNull onstatechange, final PEventAttributesName... atrsName)  {
       addHandler(onstatechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONSTATECHANGE, onstatechange, atrsName);
    }

    public PAudioDestinationNode getDestination(){
      return destination;
    }
    public Double getCurrentTime(){
      return currentTime;
    }
    public Double getSampleRate(){
      return sampleRate;
    }
    public PAudioListener getListener(){
      return listener;
    }
    public PEventHandlerNonNull getOnstatechange(){
      return onstatechange;
    }
    public PAudioContextState getState(){
      return state;
    }


}