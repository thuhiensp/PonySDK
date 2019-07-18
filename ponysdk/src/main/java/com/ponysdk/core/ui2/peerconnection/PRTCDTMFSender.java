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
package com.ponysdk.core.ui2.peerconnection;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;
import com.ponysdk.core.ui2.mediastream.PMediaStreamTrack;

public class PRTCDTMFSender extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PRTCDTMFSender.class);
     private Boolean canInsertDTMF;
     private PMediaStreamTrack track;
     private String toneBuffer;
     private Double duration;
     private Double interToneGap;
     private PEventHandlerNonNull ontonechange;

    public PRTCDTMFSender() {
      applyInit(widgetNoArgs());
    }

    public void setOntonechange(final PEventHandlerNonNull ontonechange, final PEventAttributesName... atrsName)  {
       addHandler(ontonechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONTONECHANGE, ontonechange, atrsName);
    }

    public Boolean getCanInsertDTMF(){
      return canInsertDTMF;
    }
    public PMediaStreamTrack getTrack(){
      return track;
    }
    public String getToneBuffer(){
      return toneBuffer;
    }
    public Double getDuration(){
      return duration;
    }
    public Double getInterToneGap(){
      return interToneGap;
    }
    public PEventHandlerNonNull getOntonechange(){
      return ontonechange;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.RTCDTMF_SENDER;
    }


}