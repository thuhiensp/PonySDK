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
package com.ponysdk.core.ui2.mediasession;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PMediaSession extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PMediaSession.class);
     private PMediaMetadata metadata;
     private PMediaSessionPlaybackState playbackState;

    public PMediaSession() {
      applyInit(widgetNoArgs());
    }

    public void setMetadata(final PMediaMetadata metadata)  {
       if (Objects.equals(this.metadata, metadata))return;
       this.metadata = metadata;
       log.info("metadata" + metadata);
       saveUpdateAttribute(PAttributeNames.METADATA,metadata);
    }
    public void setPlaybackState(final PMediaSessionPlaybackState playbackState)  {
       if (Objects.equals(this.playbackState, playbackState))return;
       this.playbackState = playbackState;
       log.info("playbackState" + playbackState);
       saveUpdateAttribute(PAttributeNames.PLAYBACK_STATE,playbackState);
    }

    public PMediaMetadata getMetadata(){
      return metadata;
    }
    public PMediaSessionPlaybackState getPlaybackState(){
      return playbackState;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.MEDIA_SESSION;
    }


}