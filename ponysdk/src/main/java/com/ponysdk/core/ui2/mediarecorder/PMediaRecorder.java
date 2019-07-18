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
package com.ponysdk.core.ui2.mediarecorder;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;
import com.ponysdk.core.ui2.mediastream.PMediaStream;
import com.ponysdk.core.ui2.mediastream.PMediaStream;

public class PMediaRecorder extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PMediaRecorder.class);
     private PMediaStream stream;
     private String mimeType;
     private PEventHandlerNonNull onstart;
     private PEventHandlerNonNull onstop;
     private PEventHandlerNonNull ondataavailable;
     private PEventHandlerNonNull onpause;
     private PEventHandlerNonNull onresume;
     private PEventHandlerNonNull onerror;
     private Double videoBitsPerSecond;
     private Double audioBitsPerSecond;
     private PRecordingState state;

    public PMediaRecorder(PMediaStream stream){
      applyInit(widgetWithArgs(), new Object[]{stream});
    }

    public PMediaRecorder(PMediaStream stream, PMediaRecorderOptions options){
      applyInit(widgetWithArgs(), new Object[]{stream, options});
    }


    public void setOnstart(final PEventHandlerNonNull onstart, final PEventAttributesName... atrsName)  {
       addHandler(onstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONSTART, onstart, atrsName);
    }
    public void setOnstop(final PEventHandlerNonNull onstop, final PEventAttributesName... atrsName)  {
       addHandler(onstop);
       saveUpdateAttributeCallBack(PAttributeNames.ONSTOP, onstop, atrsName);
    }
    public void setOndataavailable(final PEventHandlerNonNull ondataavailable, final PEventAttributesName... atrsName)  {
       addHandler(ondataavailable);
       saveUpdateAttributeCallBack(PAttributeNames.ONDATAAVAILABLE, ondataavailable, atrsName);
    }
    public void setOnpause(final PEventHandlerNonNull onpause, final PEventAttributesName... atrsName)  {
       addHandler(onpause);
       saveUpdateAttributeCallBack(PAttributeNames.ONPAUSE, onpause, atrsName);
    }
    public void setOnresume(final PEventHandlerNonNull onresume, final PEventAttributesName... atrsName)  {
       addHandler(onresume);
       saveUpdateAttributeCallBack(PAttributeNames.ONRESUME, onresume, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }

    public PMediaStream getStream(){
      return stream;
    }
    public String getMimeType(){
      return mimeType;
    }
    public PEventHandlerNonNull getOnstart(){
      return onstart;
    }
    public PEventHandlerNonNull getOnstop(){
      return onstop;
    }
    public PEventHandlerNonNull getOndataavailable(){
      return ondataavailable;
    }
    public PEventHandlerNonNull getOnpause(){
      return onpause;
    }
    public PEventHandlerNonNull getOnresume(){
      return onresume;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public Double getVideoBitsPerSecond(){
      return videoBitsPerSecond;
    }
    public Double getAudioBitsPerSecond(){
      return audioBitsPerSecond;
    }
    public PRecordingState getState(){
      return state;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.MEDIA_RECORDER;
    }


}