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
package  com.ponysdk.core.ui2;
import com.ponysdk.core.model.ServerToClientModel;
import com.ponysdk.core.writer.ModelWriter;
import com.ponysdk.core.server.application.UIContext;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
public class PRTCSessionDescription extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PRTCSessionDescription.class);
    public PRTCSessionDescription() {
    }


    public PRTCSessionDescription(PRTCSessionDescriptionInit descriptionInitDict){
      super(descriptionInitDict);
    }


    public void setSdp(final String sdp)  {
       setAttribute(PAttributeNames.SDP, sdp);
       log.info("sdp" + sdp);
    }
    public void setType(final PRTCSdpType type)  {
       setAttribute(PAttributeNames.TYPE_PENUM, type);
       log.info("type" + type);
    }

    public String getSdp(){
      return (String) getAttribute(PAttributeNames.SDP);
    }
    public PRTCSdpType getType(){
      return (PRTCSdpType) getAttribute(PAttributeNames.TYPE_PENUM);
    }

    @Override
    protected PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.RTC_SESSION_DESCRIPTION;
    }

    @Override
    protected PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.RTC_SESSION_DESCRIPTION;
    }


    
}