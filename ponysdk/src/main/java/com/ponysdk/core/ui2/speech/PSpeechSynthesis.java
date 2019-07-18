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
package com.ponysdk.core.ui2.speech;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PSpeechSynthesis extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PSpeechSynthesis.class);
     private Boolean pending;
     private Boolean speaking;
     private Boolean paused;
     private PEventHandlerNonNull onvoiceschanged;

    public PSpeechSynthesis() {
      applyInit(widgetNoArgs());
    }

    public void setOnvoiceschanged(final PEventHandlerNonNull onvoiceschanged, final PEventAttributesName... atrsName)  {
       addHandler(onvoiceschanged);
       saveUpdateAttributeCallBack(PAttributeNames.ONVOICESCHANGED, onvoiceschanged, atrsName);
    }

    public Boolean getPending(){
      return pending;
    }
    public Boolean getSpeaking(){
      return speaking;
    }
    public Boolean getPaused(){
      return paused;
    }
    public PEventHandlerNonNull getOnvoiceschanged(){
      return onvoiceschanged;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SPEECH_SYNTHESIS;
    }


}