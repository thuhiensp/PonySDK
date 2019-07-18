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
package com.ponysdk.core.ui2.peerconnection;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;
import com.ponysdk.core.ui2.core.PJsObject;

public class PRTCPeerConnection extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PRTCPeerConnection.class);
     private PRTCSessionDescription localDescription;
     private PRTCSessionDescription remoteDescription;
     private PEventHandlerNonNull onnegotiationneeded;
     private PEventHandlerNonNull onicecandidate;
     private PEventHandlerNonNull onsignalingstatechange;
     private PEventHandlerNonNull oniceconnectionstatechange;
     private PEventHandlerNonNull onicegatheringstatechange;
     private PEventHandlerNonNull ondatachannel;
     private PEventHandlerNonNull onaddstream;
     private PEventHandlerNonNull onremovestream;
     private PRTCSignalingState signalingState;
     private PRTCIceGatheringState iceGatheringState;
     private PRTCIceConnectionState iceConnectionState;

    public PRTCPeerConnection() {
      applyInit(widgetNoArgs());
    }


    public PRTCPeerConnection(PRTCConfiguration configuration){
      applyInit(widgetWithArgs(), new Object[]{configuration});
    }

    public PRTCPeerConnection(PRTCConfiguration configuration, PJsObject mediaConstraints){
      applyInit(widgetWithArgs(), new Object[]{configuration, mediaConstraints});
    }


    public void setOnnegotiationneeded(final PEventHandlerNonNull onnegotiationneeded, final PEventAttributesName... atrsName)  {
       addHandler(onnegotiationneeded);
       saveUpdateAttributeCallBack(PAttributeNames.ONNEGOTIATIONNEEDED, onnegotiationneeded, atrsName);
    }
    public void setOnicecandidate(final PEventHandlerNonNull onicecandidate, final PEventAttributesName... atrsName)  {
       addHandler(onicecandidate);
       saveUpdateAttributeCallBack(PAttributeNames.ONICECANDIDATE, onicecandidate, atrsName);
    }
    public void setOnsignalingstatechange(final PEventHandlerNonNull onsignalingstatechange, final PEventAttributesName... atrsName)  {
       addHandler(onsignalingstatechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONSIGNALINGSTATECHANGE, onsignalingstatechange, atrsName);
    }
    public void setOniceconnectionstatechange(final PEventHandlerNonNull oniceconnectionstatechange, final PEventAttributesName... atrsName)  {
       addHandler(oniceconnectionstatechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONICECONNECTIONSTATECHANGE, oniceconnectionstatechange, atrsName);
    }
    public void setOnicegatheringstatechange(final PEventHandlerNonNull onicegatheringstatechange, final PEventAttributesName... atrsName)  {
       addHandler(onicegatheringstatechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONICEGATHERINGSTATECHANGE, onicegatheringstatechange, atrsName);
    }
    public void setOndatachannel(final PEventHandlerNonNull ondatachannel, final PEventAttributesName... atrsName)  {
       addHandler(ondatachannel);
       saveUpdateAttributeCallBack(PAttributeNames.ONDATACHANNEL, ondatachannel, atrsName);
    }
    public void setOnaddstream(final PEventHandlerNonNull onaddstream, final PEventAttributesName... atrsName)  {
       addHandler(onaddstream);
       saveUpdateAttributeCallBack(PAttributeNames.ONADDSTREAM, onaddstream, atrsName);
    }
    public void setOnremovestream(final PEventHandlerNonNull onremovestream, final PEventAttributesName... atrsName)  {
       addHandler(onremovestream);
       saveUpdateAttributeCallBack(PAttributeNames.ONREMOVESTREAM, onremovestream, atrsName);
    }

    public PRTCSessionDescription getLocalDescription(){
      return localDescription;
    }
    public PRTCSessionDescription getRemoteDescription(){
      return remoteDescription;
    }
    public PEventHandlerNonNull getOnnegotiationneeded(){
      return onnegotiationneeded;
    }
    public PEventHandlerNonNull getOnicecandidate(){
      return onicecandidate;
    }
    public PEventHandlerNonNull getOnsignalingstatechange(){
      return onsignalingstatechange;
    }
    public PEventHandlerNonNull getOniceconnectionstatechange(){
      return oniceconnectionstatechange;
    }
    public PEventHandlerNonNull getOnicegatheringstatechange(){
      return onicegatheringstatechange;
    }
    public PEventHandlerNonNull getOndatachannel(){
      return ondatachannel;
    }
    public PEventHandlerNonNull getOnaddstream(){
      return onaddstream;
    }
    public PEventHandlerNonNull getOnremovestream(){
      return onremovestream;
    }
    public PRTCSignalingState getSignalingState(){
      return signalingState;
    }
    public PRTCIceGatheringState getIceGatheringState(){
      return iceGatheringState;
    }
    public PRTCIceConnectionState getIceConnectionState(){
      return iceConnectionState;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.RTC_PEER_CONNECTION;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.RTC_PEER_CONNECTION;
    }


}