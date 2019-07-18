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
import com.ponysdk.core.ui2.html.PTimeRanges;
import com.ponysdk.core.ui2.html.track.PAudioTrackList;
import com.ponysdk.core.ui2.html.track.PVideoTrackList;

public class PSourceBuffer extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PSourceBuffer.class);
     private Boolean updating;
     private PTimeRanges buffered;
     private Double timestampOffset;
     private PAudioTrackList audioTracks;
     private PVideoTrackList videoTracks;
     private Double appendWindowStart;
     private Double appendWindowEnd;
     private PEventHandlerNonNull onupdatestart;
     private PEventHandlerNonNull onupdate;
     private PEventHandlerNonNull onupdateend;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onabort;
     private PTrackDefaultList trackDefaults;
     private PAppendMode mode;

    public PSourceBuffer() {
      applyInit(widgetNoArgs());
    }

    public void setTimestampOffset(final Double timestampOffset)  {
       if (Objects.equals(this.timestampOffset, timestampOffset))return;
       this.timestampOffset = timestampOffset;
       log.info("timestampOffset" + timestampOffset);
       saveUpdateAttribute(PAttributeNames.TIMESTAMP_OFFSET,timestampOffset);
    }
    public void setAppendWindowStart(final Double appendWindowStart)  {
       if (Objects.equals(this.appendWindowStart, appendWindowStart))return;
       this.appendWindowStart = appendWindowStart;
       log.info("appendWindowStart" + appendWindowStart);
       saveUpdateAttribute(PAttributeNames.APPEND_WINDOW_START,appendWindowStart);
    }
    public void setAppendWindowEnd(final Double appendWindowEnd)  {
       if (Objects.equals(this.appendWindowEnd, appendWindowEnd))return;
       this.appendWindowEnd = appendWindowEnd;
       log.info("appendWindowEnd" + appendWindowEnd);
       saveUpdateAttribute(PAttributeNames.APPEND_WINDOW_END,appendWindowEnd);
    }
    public void setOnupdatestart(final PEventHandlerNonNull onupdatestart, final PEventAttributesName... atrsName)  {
       addHandler(onupdatestart);
       saveUpdateAttributeCallBack(PAttributeNames.ONUPDATESTART, onupdatestart, atrsName);
    }
    public void setOnupdate(final PEventHandlerNonNull onupdate, final PEventAttributesName... atrsName)  {
       addHandler(onupdate);
       saveUpdateAttributeCallBack(PAttributeNames.ONUPDATE, onupdate, atrsName);
    }
    public void setOnupdateend(final PEventHandlerNonNull onupdateend, final PEventAttributesName... atrsName)  {
       addHandler(onupdateend);
       saveUpdateAttributeCallBack(PAttributeNames.ONUPDATEEND, onupdateend, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnabort(final PEventHandlerNonNull onabort, final PEventAttributesName... atrsName)  {
       addHandler(onabort);
       saveUpdateAttributeCallBack(PAttributeNames.ONABORT, onabort, atrsName);
    }
    public void setTrackDefaults(final PTrackDefaultList trackDefaults)  {
       if (Objects.equals(this.trackDefaults, trackDefaults))return;
       this.trackDefaults = trackDefaults;
       log.info("trackDefaults" + trackDefaults);
       saveUpdateAttribute(PAttributeNames.TRACK_DEFAULTS,trackDefaults);
    }
    public void setMode(final PAppendMode mode)  {
       if (Objects.equals(this.mode, mode))return;
       this.mode = mode;
       log.info("mode" + mode);
       saveUpdateAttribute(PAttributeNames.MODE,mode);
    }

    public Boolean getUpdating(){
      return updating;
    }
    public PTimeRanges getBuffered(){
      return buffered;
    }
    public Double getTimestampOffset(){
      return timestampOffset;
    }
    public PAudioTrackList getAudioTracks(){
      return audioTracks;
    }
    public PVideoTrackList getVideoTracks(){
      return videoTracks;
    }
    public Double getAppendWindowStart(){
      return appendWindowStart;
    }
    public Double getAppendWindowEnd(){
      return appendWindowEnd;
    }
    public PEventHandlerNonNull getOnupdatestart(){
      return onupdatestart;
    }
    public PEventHandlerNonNull getOnupdate(){
      return onupdate;
    }
    public PEventHandlerNonNull getOnupdateend(){
      return onupdateend;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnabort(){
      return onabort;
    }
    public PTrackDefaultList getTrackDefaults(){
      return trackDefaults;
    }
    public PAppendMode getMode(){
      return mode;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SOURCE_BUFFER;
    }


}