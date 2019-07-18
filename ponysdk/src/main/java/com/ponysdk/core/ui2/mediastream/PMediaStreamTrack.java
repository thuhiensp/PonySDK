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
package com.ponysdk.core.ui2.mediastream;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public abstract class PMediaStreamTrack extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PMediaStreamTrack.class);
     private String kind;
     private String id;
     private String label;
     private Boolean enabled;
     private Boolean muted;
     private PEventHandlerNonNull onmute;
     private PEventHandlerNonNull onunmute;
     private PEventHandlerNonNull onended;
     private String contentHint;
     private PMediaStreamTrackState readyState;

    public void setEnabled(final Boolean enabled)  {
       if (Objects.equals(this.enabled, enabled))return;
       this.enabled = enabled;
       log.info("enabled" + enabled);
       saveUpdateAttribute(PAttributeNames.ENABLED,enabled);
    }
    public void setOnmute(final PEventHandlerNonNull onmute, final PEventAttributesName... atrsName)  {
       addHandler(onmute);
       saveUpdateAttributeCallBack(PAttributeNames.ONMUTE, onmute, atrsName);
    }
    public void setOnunmute(final PEventHandlerNonNull onunmute, final PEventAttributesName... atrsName)  {
       addHandler(onunmute);
       saveUpdateAttributeCallBack(PAttributeNames.ONUNMUTE, onunmute, atrsName);
    }
    public void setOnended(final PEventHandlerNonNull onended, final PEventAttributesName... atrsName)  {
       addHandler(onended);
       saveUpdateAttributeCallBack(PAttributeNames.ONENDED, onended, atrsName);
    }
    public void setContentHint(final String contentHint)  {
       if (Objects.equals(this.contentHint, contentHint))return;
       this.contentHint = contentHint;
       log.info("contentHint" + contentHint);
       saveUpdateAttribute(PAttributeNames.CONTENT_HINT,contentHint);
    }

    public String getKind(){
      return kind;
    }
    public String getId(){
      return id;
    }
    public String getLabel(){
      return label;
    }
    public Boolean getEnabled(){
      return enabled;
    }
    public Boolean getMuted(){
      return muted;
    }
    public PEventHandlerNonNull getOnmute(){
      return onmute;
    }
    public PEventHandlerNonNull getOnunmute(){
      return onunmute;
    }
    public PEventHandlerNonNull getOnended(){
      return onended;
    }
    public String getContentHint(){
      return contentHint;
    }
    public PMediaStreamTrackState getReadyState(){
      return readyState;
    }


}