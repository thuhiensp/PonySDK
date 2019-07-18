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
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PRTCDataChannel extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PRTCDataChannel.class);
     private String label;
     private Boolean ordered;
     private Short maxRetransmitTime;
     private Short maxRetransmits;
     private String protocol;
     private Boolean negotiated;
     private Short id;
     private Double bufferedAmount;
     private Double bufferedAmountLowThreshold;
     private PEventHandlerNonNull onopen;
     private PEventHandlerNonNull onbufferedamountlow;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onclose;
     private PEventHandlerNonNull onmessage;
     private String binaryType;
     private Boolean reliable;
     private PRTCDataChannelState readyState;

    public PRTCDataChannel() {
      applyInit(widgetNoArgs());
    }

    public void setBufferedAmountLowThreshold(final Double bufferedAmountLowThreshold)  {
       if (Objects.equals(this.bufferedAmountLowThreshold, bufferedAmountLowThreshold))return;
       this.bufferedAmountLowThreshold = bufferedAmountLowThreshold;
       log.info("bufferedAmountLowThreshold" + bufferedAmountLowThreshold);
       saveUpdateAttribute(PAttributeNames.BUFFERED_AMOUNT_LOW_THRESHOLD,bufferedAmountLowThreshold);
    }
    public void setOnopen(final PEventHandlerNonNull onopen, final PEventAttributesName... atrsName)  {
       addHandler(onopen);
       saveUpdateAttributeCallBack(PAttributeNames.ONOPEN, onopen, atrsName);
    }
    public void setOnbufferedamountlow(final PEventHandlerNonNull onbufferedamountlow, final PEventAttributesName... atrsName)  {
       addHandler(onbufferedamountlow);
       saveUpdateAttributeCallBack(PAttributeNames.ONBUFFEREDAMOUNTLOW, onbufferedamountlow, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnclose(final PEventHandlerNonNull onclose, final PEventAttributesName... atrsName)  {
       addHandler(onclose);
       saveUpdateAttributeCallBack(PAttributeNames.ONCLOSE, onclose, atrsName);
    }
    public void setOnmessage(final PEventHandlerNonNull onmessage, final PEventAttributesName... atrsName)  {
       addHandler(onmessage);
       saveUpdateAttributeCallBack(PAttributeNames.ONMESSAGE, onmessage, atrsName);
    }
    public void setBinaryType(final String binaryType)  {
       if (Objects.equals(this.binaryType, binaryType))return;
       this.binaryType = binaryType;
       log.info("binaryType" + binaryType);
       saveUpdateAttribute(PAttributeNames.BINARY_TYPE,binaryType);
    }

    public String getLabel(){
      return label;
    }
    public Boolean getOrdered(){
      return ordered;
    }
    public Short getMaxRetransmitTime(){
      return maxRetransmitTime;
    }
    public Short getMaxRetransmits(){
      return maxRetransmits;
    }
    public String getProtocol(){
      return protocol;
    }
    public Boolean getNegotiated(){
      return negotiated;
    }
    public Short getId(){
      return id;
    }
    public Double getBufferedAmount(){
      return bufferedAmount;
    }
    public Double getBufferedAmountLowThreshold(){
      return bufferedAmountLowThreshold;
    }
    public PEventHandlerNonNull getOnopen(){
      return onopen;
    }
    public PEventHandlerNonNull getOnbufferedamountlow(){
      return onbufferedamountlow;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnclose(){
      return onclose;
    }
    public PEventHandlerNonNull getOnmessage(){
      return onmessage;
    }
    public String getBinaryType(){
      return binaryType;
    }
    public Boolean getReliable(){
      return reliable;
    }
    public PRTCDataChannelState getReadyState(){
      return readyState;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.RTC_DATA_CHANNEL;
    }


}