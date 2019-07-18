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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PRTCIceCandidate extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PRTCIceCandidate.class);
     private String candidate;
     private String sdpMid;
     private Short sdpMLineIndex;

    public PRTCIceCandidate(PRTCIceCandidateInit candidateInitDict){
      applyInit(widgetWithArgs(), new Object[]{candidateInitDict});
    }


    public void setCandidate(final String candidate)  {
       if (Objects.equals(this.candidate, candidate))return;
       this.candidate = candidate;
       log.info("candidate" + candidate);
       saveUpdateAttribute(PAttributeNames.CANDIDATE,candidate);
    }
    public void setSdpMid(final String sdpMid)  {
       if (Objects.equals(this.sdpMid, sdpMid))return;
       this.sdpMid = sdpMid;
       log.info("sdpMid" + sdpMid);
       saveUpdateAttribute(PAttributeNames.SDP_MID,sdpMid);
    }
    public void setSdpMLineIndex(final Short sdpMLineIndex)  {
       if (Objects.equals(this.sdpMLineIndex, sdpMLineIndex))return;
       this.sdpMLineIndex = sdpMLineIndex;
       log.info("sdpMLineIndex" + sdpMLineIndex);
       saveUpdateAttribute(PAttributeNames.SDPM_LINE_INDEX,sdpMLineIndex);
    }

    public String getCandidate(){
      return candidate;
    }
    public String getSdpMid(){
      return sdpMid;
    }
    public Short getSdpMLineIndex(){
      return sdpMLineIndex;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.RTC_ICE_CANDIDATE;
    }


}