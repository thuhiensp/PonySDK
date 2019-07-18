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
package com.ponysdk.core.ui2.html.track;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.mediasource.PSourceBuffer;

public class PAudioTrack extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PAudioTrack.class);
     private String id;
     private String kind;
     private String label;
     private String language;
     private Boolean enabled;
     private PSourceBuffer sourceBuffer;

    public PAudioTrack() {
      applyInit(widgetNoArgs());
    }

    public void setEnabled(final Boolean enabled)  {
       if (Objects.equals(this.enabled, enabled))return;
       this.enabled = enabled;
       log.info("enabled" + enabled);
       saveUpdateAttribute(PAttributeNames.ENABLED,enabled);
    }

    public String getId(){
      return id;
    }
    public String getKind(){
      return kind;
    }
    public String getLabel(){
      return label;
    }
    public String getLanguage(){
      return language;
    }
    public Boolean getEnabled(){
      return enabled;
    }
    public PSourceBuffer getSourceBuffer(){
      return sourceBuffer;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.AUDIO_TRACK;
    }


}