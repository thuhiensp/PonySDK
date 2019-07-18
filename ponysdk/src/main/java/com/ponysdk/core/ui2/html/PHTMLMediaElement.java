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
package com.ponysdk.core.ui2.html;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.dom.PDOMTokenList;
import com.ponysdk.core.ui2.encryptedmedia.PMediaKeys;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.html.media.PMediaError;
import com.ponysdk.core.ui2.html.track.PAudioTrackList;
import com.ponysdk.core.ui2.html.track.PTextTrackList;
import com.ponysdk.core.ui2.html.track.PVideoTrackList;
import com.ponysdk.core.ui2.mediastream.PMediaStream;
import com.ponysdk.core.ui2.remoteplayback.PRemotePlayback;

public abstract class PHTMLMediaElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLMediaElement.class);
     private PMediaError error;
     private String src;
     private String currentSrc;
     private String crossOrigin;
     private Short networkState;
     private String preload;
     private PTimeRanges buffered;
     private Short readyState;
     private Boolean seeking;
     private Double currentTime;
     private Double duration;
     private Boolean paused;
     private Double defaultPlaybackRate;
     private Double playbackRate;
     private PTimeRanges played;
     private PTimeRanges seekable;
     private Boolean ended;
     private Boolean autoplay;
     private Boolean loop;
     private Boolean controls;
     private PDOMTokenList controlsList;
     private Double volume;
     private Boolean muted;
     private Boolean defaultMuted;
     private PAudioTrackList audioTracks;
     private PVideoTrackList videoTracks;
     private PTextTrackList textTracks;
     private Double webkitAudioDecodedByteCount;
     private Double webkitVideoDecodedByteCount;
     private String sinkId;
     private PMediaKeys mediaKeys;
     private PEventHandlerNonNull onencrypted;
     private PEventHandlerNonNull onwaitingforkey;
     private PRemotePlayback remote;
     private Boolean disableRemotePlayback;
     private PMediaStream srcObject;

    public void setSrc(final String src)  {
       if (Objects.equals(this.src, src))return;
       this.src = src;
       log.info("src" + src);
       saveUpdateAttribute(PAttributeNames.SRC,src);
    }
    public void setCrossOrigin(final String crossOrigin)  {
       if (Objects.equals(this.crossOrigin, crossOrigin))return;
       this.crossOrigin = crossOrigin;
       log.info("crossOrigin" + crossOrigin);
       saveUpdateAttribute(PAttributeNames.CROSS_ORIGIN,crossOrigin);
    }
    public void setPreload(final String preload)  {
       if (Objects.equals(this.preload, preload))return;
       this.preload = preload;
       log.info("preload" + preload);
       saveUpdateAttribute(PAttributeNames.PRELOAD,preload);
    }
    public void setCurrentTime(final Double currentTime)  {
       if (Objects.equals(this.currentTime, currentTime))return;
       this.currentTime = currentTime;
       log.info("currentTime" + currentTime);
       saveUpdateAttribute(PAttributeNames.CURRENT_TIME,currentTime);
    }
    public void setDefaultPlaybackRate(final Double defaultPlaybackRate)  {
       if (Objects.equals(this.defaultPlaybackRate, defaultPlaybackRate))return;
       this.defaultPlaybackRate = defaultPlaybackRate;
       log.info("defaultPlaybackRate" + defaultPlaybackRate);
       saveUpdateAttribute(PAttributeNames.DEFAULT_PLAYBACK_RATE,defaultPlaybackRate);
    }
    public void setPlaybackRate(final Double playbackRate)  {
       if (Objects.equals(this.playbackRate, playbackRate))return;
       this.playbackRate = playbackRate;
       log.info("playbackRate" + playbackRate);
       saveUpdateAttribute(PAttributeNames.PLAYBACK_RATE,playbackRate);
    }
    public void setAutoplay(final Boolean autoplay)  {
       if (Objects.equals(this.autoplay, autoplay))return;
       this.autoplay = autoplay;
       log.info("autoplay" + autoplay);
       saveUpdateAttribute(PAttributeNames.AUTOPLAY,autoplay);
    }
    public void setLoop(final Boolean loop)  {
       if (Objects.equals(this.loop, loop))return;
       this.loop = loop;
       log.info("loop" + loop);
       saveUpdateAttribute(PAttributeNames.LOOP,loop);
    }
    public void setControls(final Boolean controls)  {
       if (Objects.equals(this.controls, controls))return;
       this.controls = controls;
       log.info("controls" + controls);
       saveUpdateAttribute(PAttributeNames.CONTROLS,controls);
    }
    public void setVolume(final Double volume)  {
       if (Objects.equals(this.volume, volume))return;
       this.volume = volume;
       log.info("volume" + volume);
       saveUpdateAttribute(PAttributeNames.VOLUME,volume);
    }
    public void setMuted(final Boolean muted)  {
       if (Objects.equals(this.muted, muted))return;
       this.muted = muted;
       log.info("muted" + muted);
       saveUpdateAttribute(PAttributeNames.MUTED,muted);
    }
    public void setDefaultMuted(final Boolean defaultMuted)  {
       if (Objects.equals(this.defaultMuted, defaultMuted))return;
       this.defaultMuted = defaultMuted;
       log.info("defaultMuted" + defaultMuted);
       saveUpdateAttribute(PAttributeNames.DEFAULT_MUTED,defaultMuted);
    }
    public void setOnencrypted(final PEventHandlerNonNull onencrypted, final PEventAttributesName... atrsName)  {
       addHandler(onencrypted);
       saveUpdateAttributeCallBack(PAttributeNames.ONENCRYPTED, onencrypted, atrsName);
    }
    public void setOnwaitingforkey(final PEventHandlerNonNull onwaitingforkey, final PEventAttributesName... atrsName)  {
       addHandler(onwaitingforkey);
       saveUpdateAttributeCallBack(PAttributeNames.ONWAITINGFORKEY, onwaitingforkey, atrsName);
    }
    public void setDisableRemotePlayback(final Boolean disableRemotePlayback)  {
       if (Objects.equals(this.disableRemotePlayback, disableRemotePlayback))return;
       this.disableRemotePlayback = disableRemotePlayback;
       log.info("disableRemotePlayback" + disableRemotePlayback);
       saveUpdateAttribute(PAttributeNames.DISABLE_REMOTE_PLAYBACK,disableRemotePlayback);
    }
    public void setSrcObject(final PMediaStream srcObject)  {
       if (Objects.equals(this.srcObject, srcObject))return;
       this.srcObject = srcObject;
       log.info("srcObject" + srcObject);
       saveUpdateAttribute(PAttributeNames.SRC_OBJECT,srcObject);
    }

    public PMediaError getError(){
      return error;
    }
    public String getSrc(){
      return src;
    }
    public String getCurrentSrc(){
      return currentSrc;
    }
    public String getCrossOrigin(){
      return crossOrigin;
    }
    public Short getNetworkState(){
      return networkState;
    }
    public String getPreload(){
      return preload;
    }
    public PTimeRanges getBuffered(){
      return buffered;
    }
    public Short getReadyState(){
      return readyState;
    }
    public Boolean getSeeking(){
      return seeking;
    }
    public Double getCurrentTime(){
      return currentTime;
    }
    public Double getDuration(){
      return duration;
    }
    public Boolean getPaused(){
      return paused;
    }
    public Double getDefaultPlaybackRate(){
      return defaultPlaybackRate;
    }
    public Double getPlaybackRate(){
      return playbackRate;
    }
    public PTimeRanges getPlayed(){
      return played;
    }
    public PTimeRanges getSeekable(){
      return seekable;
    }
    public Boolean getEnded(){
      return ended;
    }
    public Boolean getAutoplay(){
      return autoplay;
    }
    public Boolean getLoop(){
      return loop;
    }
    public Boolean getControls(){
      return controls;
    }
    public PDOMTokenList getControlsList(){
      return controlsList;
    }
    public Double getVolume(){
      return volume;
    }
    public Boolean getMuted(){
      return muted;
    }
    public Boolean getDefaultMuted(){
      return defaultMuted;
    }
    public PAudioTrackList getAudioTracks(){
      return audioTracks;
    }
    public PVideoTrackList getVideoTracks(){
      return videoTracks;
    }
    public PTextTrackList getTextTracks(){
      return textTracks;
    }
    public Double getWebkitAudioDecodedByteCount(){
      return webkitAudioDecodedByteCount;
    }
    public Double getWebkitVideoDecodedByteCount(){
      return webkitVideoDecodedByteCount;
    }
    public String getSinkId(){
      return sinkId;
    }
    public PMediaKeys getMediaKeys(){
      return mediaKeys;
    }
    public PEventHandlerNonNull getOnencrypted(){
      return onencrypted;
    }
    public PEventHandlerNonNull getOnwaitingforkey(){
      return onwaitingforkey;
    }
    public PRemotePlayback getRemote(){
      return remote;
    }
    public Boolean getDisableRemotePlayback(){
      return disableRemotePlayback;
    }
    public PMediaStream getSrcObject(){
      return srcObject;
    }


}