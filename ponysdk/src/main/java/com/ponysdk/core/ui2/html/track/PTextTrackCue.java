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
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public abstract class PTextTrackCue extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PTextTrackCue.class);
     private PTextTrack track;
     private String id;
     private Double startTime;
     private Double endTime;
     private Boolean pauseOnExit;
     private PEventHandlerNonNull onenter;
     private PEventHandlerNonNull onexit;

    public void setId(final String id)  {
       if (Objects.equals(this.id, id))return;
       this.id = id;
       log.info("id" + id);
       saveUpdateAttribute(PAttributeNames.ID,id);
    }
    public void setStartTime(final Double startTime)  {
       if (Objects.equals(this.startTime, startTime))return;
       this.startTime = startTime;
       log.info("startTime" + startTime);
       saveUpdateAttribute(PAttributeNames.START_TIME,startTime);
    }
    public void setEndTime(final Double endTime)  {
       if (Objects.equals(this.endTime, endTime))return;
       this.endTime = endTime;
       log.info("endTime" + endTime);
       saveUpdateAttribute(PAttributeNames.END_TIME,endTime);
    }
    public void setPauseOnExit(final Boolean pauseOnExit)  {
       if (Objects.equals(this.pauseOnExit, pauseOnExit))return;
       this.pauseOnExit = pauseOnExit;
       log.info("pauseOnExit" + pauseOnExit);
       saveUpdateAttribute(PAttributeNames.PAUSE_ON_EXIT,pauseOnExit);
    }
    public void setOnenter(final PEventHandlerNonNull onenter, final PEventAttributesName... atrsName)  {
       addHandler(onenter);
       saveUpdateAttributeCallBack(PAttributeNames.ONENTER, onenter, atrsName);
    }
    public void setOnexit(final PEventHandlerNonNull onexit, final PEventAttributesName... atrsName)  {
       addHandler(onexit);
       saveUpdateAttributeCallBack(PAttributeNames.ONEXIT, onexit, atrsName);
    }

    public PTextTrack getTrack(){
      return track;
    }
    public String getId(){
      return id;
    }
    public Double getStartTime(){
      return startTime;
    }
    public Double getEndTime(){
      return endTime;
    }
    public Boolean getPauseOnExit(){
      return pauseOnExit;
    }
    public PEventHandlerNonNull getOnenter(){
      return onenter;
    }
    public PEventHandlerNonNull getOnexit(){
      return onexit;
    }


}