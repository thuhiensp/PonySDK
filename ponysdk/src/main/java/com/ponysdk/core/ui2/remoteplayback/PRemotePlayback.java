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
package com.ponysdk.core.ui2.remoteplayback;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PRemotePlayback extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PRemotePlayback.class);
     private PEventHandlerNonNull onconnecting;
     private PEventHandlerNonNull onconnect;
     private PEventHandlerNonNull ondisconnect;
     private PRemotePlaybackState state;

    public PRemotePlayback() {
      applyInit(widgetNoArgs());
    }

    public void setOnconnecting(final PEventHandlerNonNull onconnecting, final PEventAttributesName... atrsName)  {
       addHandler(onconnecting);
       saveUpdateAttributeCallBack(PAttributeNames.ONCONNECTING, onconnecting, atrsName);
    }
    public void setOnconnect(final PEventHandlerNonNull onconnect, final PEventAttributesName... atrsName)  {
       addHandler(onconnect);
       saveUpdateAttributeCallBack(PAttributeNames.ONCONNECT, onconnect, atrsName);
    }
    public void setOndisconnect(final PEventHandlerNonNull ondisconnect, final PEventAttributesName... atrsName)  {
       addHandler(ondisconnect);
       saveUpdateAttributeCallBack(PAttributeNames.ONDISCONNECT, ondisconnect, atrsName);
    }

    public PEventHandlerNonNull getOnconnecting(){
      return onconnecting;
    }
    public PEventHandlerNonNull getOnconnect(){
      return onconnect;
    }
    public PEventHandlerNonNull getOndisconnect(){
      return ondisconnect;
    }
    public PRemotePlaybackState getState(){
      return state;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.REMOTE_PLAYBACK;
    }


}