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
package com.ponysdk.core.ui2.animation;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.core.PPromise;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PAnimation extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PAnimation.class);
     private PAnimationEffectReadOnly effect;
     private PAnimationTimeline timeline;
     private Double startTime;
     private Double currentTime;
     private Double playbackRate;
     private String id;
     private PEventHandlerNonNull onfinish;
     private PEventHandlerNonNull oncancel;
     private PPromise<PAnimation> finished;
     private PPromise<PAnimation> ready;
     private PAnimationPlayState playState;

    public PAnimation() {
      applyInit(widgetNoArgs());
    }


    public PAnimation(PAnimationEffectReadOnly effect){
      applyInit(widgetWithArgs(), new Object[]{effect});
    }

    public PAnimation(PAnimationEffectReadOnly effect, PAnimationTimeline timeline){
      applyInit(widgetWithArgs(), new Object[]{effect, timeline});
    }


    public void setEffect(final PAnimationEffectReadOnly effect)  {
       if (Objects.equals(this.effect, effect))return;
       this.effect = effect;
       log.info("effect" + effect);
       saveUpdateAttribute(PAttributeNames.EFFECT,effect);
    }
    public void setStartTime(final Double startTime)  {
       if (Objects.equals(this.startTime, startTime))return;
       this.startTime = startTime;
       log.info("startTime" + startTime);
       saveUpdateAttribute(PAttributeNames.START_TIME,startTime);
    }
    public void setCurrentTime(final Double currentTime)  {
       if (Objects.equals(this.currentTime, currentTime))return;
       this.currentTime = currentTime;
       log.info("currentTime" + currentTime);
       saveUpdateAttribute(PAttributeNames.CURRENT_TIME,currentTime);
    }
    public void setPlaybackRate(final Double playbackRate)  {
       if (Objects.equals(this.playbackRate, playbackRate))return;
       this.playbackRate = playbackRate;
       log.info("playbackRate" + playbackRate);
       saveUpdateAttribute(PAttributeNames.PLAYBACK_RATE,playbackRate);
    }
    public void setId(final String id)  {
       if (Objects.equals(this.id, id))return;
       this.id = id;
       log.info("id" + id);
       saveUpdateAttribute(PAttributeNames.ID,id);
    }
    public void setOnfinish(final PEventHandlerNonNull onfinish, final PEventAttributesName... atrsName)  {
       addHandler(onfinish);
       saveUpdateAttributeCallBack(PAttributeNames.ONFINISH, onfinish, atrsName);
    }
    public void setOncancel(final PEventHandlerNonNull oncancel, final PEventAttributesName... atrsName)  {
       addHandler(oncancel);
       saveUpdateAttributeCallBack(PAttributeNames.ONCANCEL, oncancel, atrsName);
    }

    public PAnimationEffectReadOnly getEffect(){
      return effect;
    }
    public PAnimationTimeline getTimeline(){
      return timeline;
    }
    public Double getStartTime(){
      return startTime;
    }
    public Double getCurrentTime(){
      return currentTime;
    }
    public Double getPlaybackRate(){
      return playbackRate;
    }
    public String getId(){
      return id;
    }
    public PEventHandlerNonNull getOnfinish(){
      return onfinish;
    }
    public PEventHandlerNonNull getOncancel(){
      return oncancel;
    }
    public PPromise<PAnimation> getFinished(){
      return finished;
    }
    public PPromise<PAnimation> getReady(){
      return ready;
    }
    public PAnimationPlayState getPlayState(){
      return playState;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.ANIMATION;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.ANIMATION;
    }


}