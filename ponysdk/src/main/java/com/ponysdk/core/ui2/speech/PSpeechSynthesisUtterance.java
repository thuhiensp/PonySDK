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
package com.ponysdk.core.ui2.speech;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PSpeechSynthesisUtterance extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PSpeechSynthesisUtterance.class);
     private String text;
     private String lang;
     private PSpeechSynthesisVoice voice;
     private Double volume;
     private Double rate;
     private Double pitch;
     private PEventHandlerNonNull onstart;
     private PEventHandlerNonNull onend;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onpause;
     private PEventHandlerNonNull onresume;
     private PEventHandlerNonNull onmark;
     private PEventHandlerNonNull onboundary;

    public PSpeechSynthesisUtterance() {
      applyInit(widgetNoArgs());
    }


    public PSpeechSynthesisUtterance(String text){
      applyInit(widgetWithArgs(), new Object[]{text});
    }


    public void setText(final String text)  {
       if (Objects.equals(this.text, text))return;
       this.text = text;
       log.info("text" + text);
       saveUpdateAttribute(PAttributeNames.TEXT,text);
    }
    public void setLang(final String lang)  {
       if (Objects.equals(this.lang, lang))return;
       this.lang = lang;
       log.info("lang" + lang);
       saveUpdateAttribute(PAttributeNames.LANG,lang);
    }
    public void setVoice(final PSpeechSynthesisVoice voice)  {
       if (Objects.equals(this.voice, voice))return;
       this.voice = voice;
       log.info("voice" + voice);
       saveUpdateAttribute(PAttributeNames.VOICE,voice);
    }
    public void setVolume(final Double volume)  {
       if (Objects.equals(this.volume, volume))return;
       this.volume = volume;
       log.info("volume" + volume);
       saveUpdateAttribute(PAttributeNames.VOLUME,volume);
    }
    public void setRate(final Double rate)  {
       if (Objects.equals(this.rate, rate))return;
       this.rate = rate;
       log.info("rate" + rate);
       saveUpdateAttribute(PAttributeNames.RATE,rate);
    }
    public void setPitch(final Double pitch)  {
       if (Objects.equals(this.pitch, pitch))return;
       this.pitch = pitch;
       log.info("pitch" + pitch);
       saveUpdateAttribute(PAttributeNames.PITCH,pitch);
    }
    public void setOnstart(final PEventHandlerNonNull onstart, final PEventAttributesName... atrsName)  {
       addHandler(onstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONSTART, onstart, atrsName);
    }
    public void setOnend(final PEventHandlerNonNull onend, final PEventAttributesName... atrsName)  {
       addHandler(onend);
       saveUpdateAttributeCallBack(PAttributeNames.ONEND, onend, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnpause(final PEventHandlerNonNull onpause, final PEventAttributesName... atrsName)  {
       addHandler(onpause);
       saveUpdateAttributeCallBack(PAttributeNames.ONPAUSE, onpause, atrsName);
    }
    public void setOnresume(final PEventHandlerNonNull onresume, final PEventAttributesName... atrsName)  {
       addHandler(onresume);
       saveUpdateAttributeCallBack(PAttributeNames.ONRESUME, onresume, atrsName);
    }
    public void setOnmark(final PEventHandlerNonNull onmark, final PEventAttributesName... atrsName)  {
       addHandler(onmark);
       saveUpdateAttributeCallBack(PAttributeNames.ONMARK, onmark, atrsName);
    }
    public void setOnboundary(final PEventHandlerNonNull onboundary, final PEventAttributesName... atrsName)  {
       addHandler(onboundary);
       saveUpdateAttributeCallBack(PAttributeNames.ONBOUNDARY, onboundary, atrsName);
    }

    public String getText(){
      return text;
    }
    public String getLang(){
      return lang;
    }
    public PSpeechSynthesisVoice getVoice(){
      return voice;
    }
    public Double getVolume(){
      return volume;
    }
    public Double getRate(){
      return rate;
    }
    public Double getPitch(){
      return pitch;
    }
    public PEventHandlerNonNull getOnstart(){
      return onstart;
    }
    public PEventHandlerNonNull getOnend(){
      return onend;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnpause(){
      return onpause;
    }
    public PEventHandlerNonNull getOnresume(){
      return onresume;
    }
    public PEventHandlerNonNull getOnmark(){
      return onmark;
    }
    public PEventHandlerNonNull getOnboundary(){
      return onboundary;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SPEECH_SYNTHESIS_UTTERANCE;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.SPEECH_SYNTHESIS_UTTERANCE;
    }


}