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
package com.ponysdk.core.ui2.mediasource;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PMediaSource extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PMediaSource.class);
     private PSourceBufferList sourceBuffers;
     private PSourceBufferList activeSourceBuffers;
     private Double duration;
     private PEventHandlerNonNull onsourceopen;
     private PEventHandlerNonNull onsourceended;
     private PEventHandlerNonNull onsourceclose;
     private String readyState;

    public PMediaSource() {
      applyInit(widgetNoArgs());
    }



    public void setDuration(final Double duration)  {
       if (Objects.equals(this.duration, duration))return;
       this.duration = duration;
       log.info("duration" + duration);
       saveUpdateAttribute(PAttributeNames.DURATION,duration);
    }
    public void setOnsourceopen(final PEventHandlerNonNull onsourceopen, final PEventAttributesName... atrsName)  {
       addHandler(onsourceopen);
       saveUpdateAttributeCallBack(PAttributeNames.ONSOURCEOPEN, onsourceopen, atrsName);
    }
    public void setOnsourceended(final PEventHandlerNonNull onsourceended, final PEventAttributesName... atrsName)  {
       addHandler(onsourceended);
       saveUpdateAttributeCallBack(PAttributeNames.ONSOURCEENDED, onsourceended, atrsName);
    }
    public void setOnsourceclose(final PEventHandlerNonNull onsourceclose, final PEventAttributesName... atrsName)  {
       addHandler(onsourceclose);
       saveUpdateAttributeCallBack(PAttributeNames.ONSOURCECLOSE, onsourceclose, atrsName);
    }

    public PSourceBufferList getSourceBuffers(){
      return sourceBuffers;
    }
    public PSourceBufferList getActiveSourceBuffers(){
      return activeSourceBuffers;
    }
    public Double getDuration(){
      return duration;
    }
    public PEventHandlerNonNull getOnsourceopen(){
      return onsourceopen;
    }
    public PEventHandlerNonNull getOnsourceended(){
      return onsourceended;
    }
    public PEventHandlerNonNull getOnsourceclose(){
      return onsourceclose;
    }
    public String getReadyState(){
      return readyState;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.MEDIA_SOURCE;
    }


}