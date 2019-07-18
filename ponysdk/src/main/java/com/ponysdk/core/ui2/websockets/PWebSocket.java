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
package com.ponysdk.core.ui2.websockets;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PWebSocket extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PWebSocket.class);
     private String url;
     private Short readyState;
     private Double bufferedAmount;
     private PEventHandlerNonNull onopen;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onclose;
     private String extensions;
     private String protocol;
     private PEventHandlerNonNull onmessage;
     private PBinaryType binaryType;

    public PWebSocket(String url){
      applyInit(widgetWithArgs(), new Object[]{url});
    }

    public PWebSocket(String url, String protocols){
      applyInit(widgetWithArgs(), new Object[]{url, protocols});
    }

    public PWebSocket(String url, String[] protocols){
      applyInit(widgetWithArgs(), new Object[]{url, protocols});
    }


    public void setOnopen(final PEventHandlerNonNull onopen, final PEventAttributesName... atrsName)  {
       addHandler(onopen);
       saveUpdateAttributeCallBack(PAttributeNames.ONOPEN, onopen, atrsName);
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
    public void setBinaryType(final PBinaryType binaryType)  {
       if (Objects.equals(this.binaryType, binaryType))return;
       this.binaryType = binaryType;
       log.info("binaryType" + binaryType);
       saveUpdateAttribute(PAttributeNames.BINARY_TYPE,binaryType);
    }

    public String getUrl(){
      return url;
    }
    public Short getReadyState(){
      return readyState;
    }
    public Double getBufferedAmount(){
      return bufferedAmount;
    }
    public PEventHandlerNonNull getOnopen(){
      return onopen;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnclose(){
      return onclose;
    }
    public String getExtensions(){
      return extensions;
    }
    public String getProtocol(){
      return protocol;
    }
    public PEventHandlerNonNull getOnmessage(){
      return onmessage;
    }
    public PBinaryType getBinaryType(){
      return binaryType;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.WEB_SOCKET;
    }


}