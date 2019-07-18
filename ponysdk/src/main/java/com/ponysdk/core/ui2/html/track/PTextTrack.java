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
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PTextTrack extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PTextTrack.class);
     private String label;
     private String language;
     private String id;
     private PTextTrackCueList cues;
     private PTextTrackCueList activeCues;
     private PEventHandlerNonNull oncuechange;
     private PTextTrackKind kind;
     private PTextTrackMode mode;

    public PTextTrack() {
      applyInit(widgetNoArgs());
    }

    public void setOncuechange(final PEventHandlerNonNull oncuechange, final PEventAttributesName... atrsName)  {
       addHandler(oncuechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONCUECHANGE, oncuechange, atrsName);
    }
    public void setMode(final PTextTrackMode mode)  {
       if (Objects.equals(this.mode, mode))return;
       this.mode = mode;
       log.info("mode" + mode);
       saveUpdateAttribute(PAttributeNames.MODE,mode);
    }

    public String getLabel(){
      return label;
    }
    public String getLanguage(){
      return language;
    }
    public String getId(){
      return id;
    }
    public PTextTrackCueList getCues(){
      return cues;
    }
    public PTextTrackCueList getActiveCues(){
      return activeCues;
    }
    public PEventHandlerNonNull getOncuechange(){
      return oncuechange;
    }
    public PTextTrackKind getKind(){
      return kind;
    }
    public PTextTrackMode getMode(){
      return mode;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.TEXT_TRACK;
    }


}