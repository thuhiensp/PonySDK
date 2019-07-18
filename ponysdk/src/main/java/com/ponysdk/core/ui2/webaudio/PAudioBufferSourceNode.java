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
package com.ponysdk.core.ui2.webaudio;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PAudioBufferSourceNode extends PAudioScheduledSourceNode {
    private static final Logger log = LoggerFactory.getLogger(PAudioBufferSourceNode.class);
     private PAudioBuffer buffer;
     private PAudioParam playbackRate;
     private PAudioParam detune;
     private Boolean loop;
     private Double loopStart;
     private Double loopEnd;

    public PAudioBufferSourceNode(PBaseAudioContext context){
      applyInit(widgetWithArgs(), new Object[]{context});
    }

    public PAudioBufferSourceNode(PBaseAudioContext context, PAudioBufferSourceOptions options){
      applyInit(widgetWithArgs(), new Object[]{context, options});
    }


    public void setBuffer(final PAudioBuffer buffer)  {
       if (Objects.equals(this.buffer, buffer))return;
       this.buffer = buffer;
       log.info("buffer" + buffer);
       saveUpdateAttribute(PAttributeNames.BUFFER,buffer);
    }
    public void setLoop(final Boolean loop)  {
       if (Objects.equals(this.loop, loop))return;
       this.loop = loop;
       log.info("loop" + loop);
       saveUpdateAttribute(PAttributeNames.LOOP,loop);
    }
    public void setLoopStart(final Double loopStart)  {
       if (Objects.equals(this.loopStart, loopStart))return;
       this.loopStart = loopStart;
       log.info("loopStart" + loopStart);
       saveUpdateAttribute(PAttributeNames.LOOP_START,loopStart);
    }
    public void setLoopEnd(final Double loopEnd)  {
       if (Objects.equals(this.loopEnd, loopEnd))return;
       this.loopEnd = loopEnd;
       log.info("loopEnd" + loopEnd);
       saveUpdateAttribute(PAttributeNames.LOOP_END,loopEnd);
    }

    public PAudioBuffer getBuffer(){
      return buffer;
    }
    public PAudioParam getPlaybackRate(){
      return playbackRate;
    }
    public PAudioParam getDetune(){
      return detune;
    }
    public Boolean getLoop(){
      return loop;
    }
    public Double getLoopStart(){
      return loopStart;
    }
    public Double getLoopEnd(){
      return loopEnd;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.AUDIO_BUFFER_SOURCE_NODE;
    }


}