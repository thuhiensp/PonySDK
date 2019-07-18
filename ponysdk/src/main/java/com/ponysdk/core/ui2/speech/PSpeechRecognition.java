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
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;
import com.ponysdk.core.ui2.mediastream.PMediaStreamTrack;

public class PSpeechRecognition extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PSpeechRecognition.class);
     private PSpeechGrammarList grammars;
     private String lang;
     private Boolean continuous;
     private Boolean interimResults;
     private Double maxAlternatives;
     private PMediaStreamTrack audioTrack;
     private PEventHandlerNonNull onaudiostart;
     private PEventHandlerNonNull onsoundstart;
     private PEventHandlerNonNull onspeechstart;
     private PEventHandlerNonNull onspeechend;
     private PEventHandlerNonNull onsoundend;
     private PEventHandlerNonNull onaudioend;
     private PEventHandlerNonNull onresult;
     private PEventHandlerNonNull onnomatch;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onstart;
     private PEventHandlerNonNull onend;

    public PSpeechRecognition() {
      applyInit(widgetNoArgs());
    }



    public void setGrammars(final PSpeechGrammarList grammars)  {
       if (Objects.equals(this.grammars, grammars))return;
       this.grammars = grammars;
       log.info("grammars" + grammars);
       saveUpdateAttribute(PAttributeNames.GRAMMARS,grammars);
    }
    public void setLang(final String lang)  {
       if (Objects.equals(this.lang, lang))return;
       this.lang = lang;
       log.info("lang" + lang);
       saveUpdateAttribute(PAttributeNames.LANG,lang);
    }
    public void setContinuous(final Boolean continuous)  {
       if (Objects.equals(this.continuous, continuous))return;
       this.continuous = continuous;
       log.info("continuous" + continuous);
       saveUpdateAttribute(PAttributeNames.CONTINUOUS,continuous);
    }
    public void setInterimResults(final Boolean interimResults)  {
       if (Objects.equals(this.interimResults, interimResults))return;
       this.interimResults = interimResults;
       log.info("interimResults" + interimResults);
       saveUpdateAttribute(PAttributeNames.INTERIM_RESULTS,interimResults);
    }
    public void setMaxAlternatives(final Double maxAlternatives)  {
       if (Objects.equals(this.maxAlternatives, maxAlternatives))return;
       this.maxAlternatives = maxAlternatives;
       log.info("maxAlternatives" + maxAlternatives);
       saveUpdateAttribute(PAttributeNames.MAX_ALTERNATIVES,maxAlternatives);
    }
    public void setAudioTrack(final PMediaStreamTrack audioTrack)  {
       if (Objects.equals(this.audioTrack, audioTrack))return;
       this.audioTrack = audioTrack;
       log.info("audioTrack" + audioTrack);
       saveUpdateAttribute(PAttributeNames.AUDIO_TRACK,audioTrack);
    }
    public void setOnaudiostart(final PEventHandlerNonNull onaudiostart, final PEventAttributesName... atrsName)  {
       addHandler(onaudiostart);
       saveUpdateAttributeCallBack(PAttributeNames.ONAUDIOSTART, onaudiostart, atrsName);
    }
    public void setOnsoundstart(final PEventHandlerNonNull onsoundstart, final PEventAttributesName... atrsName)  {
       addHandler(onsoundstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONSOUNDSTART, onsoundstart, atrsName);
    }
    public void setOnspeechstart(final PEventHandlerNonNull onspeechstart, final PEventAttributesName... atrsName)  {
       addHandler(onspeechstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONSPEECHSTART, onspeechstart, atrsName);
    }
    public void setOnspeechend(final PEventHandlerNonNull onspeechend, final PEventAttributesName... atrsName)  {
       addHandler(onspeechend);
       saveUpdateAttributeCallBack(PAttributeNames.ONSPEECHEND, onspeechend, atrsName);
    }
    public void setOnsoundend(final PEventHandlerNonNull onsoundend, final PEventAttributesName... atrsName)  {
       addHandler(onsoundend);
       saveUpdateAttributeCallBack(PAttributeNames.ONSOUNDEND, onsoundend, atrsName);
    }
    public void setOnaudioend(final PEventHandlerNonNull onaudioend, final PEventAttributesName... atrsName)  {
       addHandler(onaudioend);
       saveUpdateAttributeCallBack(PAttributeNames.ONAUDIOEND, onaudioend, atrsName);
    }
    public void setOnresult(final PEventHandlerNonNull onresult, final PEventAttributesName... atrsName)  {
       addHandler(onresult);
       saveUpdateAttributeCallBack(PAttributeNames.ONRESULT, onresult, atrsName);
    }
    public void setOnnomatch(final PEventHandlerNonNull onnomatch, final PEventAttributesName... atrsName)  {
       addHandler(onnomatch);
       saveUpdateAttributeCallBack(PAttributeNames.ONNOMATCH, onnomatch, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnstart(final PEventHandlerNonNull onstart, final PEventAttributesName... atrsName)  {
       addHandler(onstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONSTART, onstart, atrsName);
    }
    public void setOnend(final PEventHandlerNonNull onend, final PEventAttributesName... atrsName)  {
       addHandler(onend);
       saveUpdateAttributeCallBack(PAttributeNames.ONEND, onend, atrsName);
    }

    public PSpeechGrammarList getGrammars(){
      return grammars;
    }
    public String getLang(){
      return lang;
    }
    public Boolean getContinuous(){
      return continuous;
    }
    public Boolean getInterimResults(){
      return interimResults;
    }
    public Double getMaxAlternatives(){
      return maxAlternatives;
    }
    public PMediaStreamTrack getAudioTrack(){
      return audioTrack;
    }
    public PEventHandlerNonNull getOnaudiostart(){
      return onaudiostart;
    }
    public PEventHandlerNonNull getOnsoundstart(){
      return onsoundstart;
    }
    public PEventHandlerNonNull getOnspeechstart(){
      return onspeechstart;
    }
    public PEventHandlerNonNull getOnspeechend(){
      return onspeechend;
    }
    public PEventHandlerNonNull getOnsoundend(){
      return onsoundend;
    }
    public PEventHandlerNonNull getOnaudioend(){
      return onaudioend;
    }
    public PEventHandlerNonNull getOnresult(){
      return onresult;
    }
    public PEventHandlerNonNull getOnnomatch(){
      return onnomatch;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnstart(){
      return onstart;
    }
    public PEventHandlerNonNull getOnend(){
      return onend;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SPEECH_RECOGNITION;
    }


}