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
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PRTCSessionDescription extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PRTCSessionDescription.class);
     private String sdp;
     private PRTCSdpType type;

    public PRTCSessionDescription() {
      applyInit(widgetNoArgs());
    }


    public PRTCSessionDescription(PRTCSessionDescriptionInit descriptionInitDict){
      applyInit(widgetWithArgs(), new Object[]{descriptionInitDict});
    }


    public void setSdp(final String sdp)  {
       if (Objects.equals(this.sdp, sdp))return;
       this.sdp = sdp;
       log.info("sdp" + sdp);
       saveUpdateAttribute(PAttributeNames.SDP,sdp);
    }
    public void setType(final PRTCSdpType type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
    }

    public String getSdp(){
      return sdp;
    }
    public PRTCSdpType getType(){
      return type;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.RTC_SESSION_DESCRIPTION;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.RTC_SESSION_DESCRIPTION;
    }


}