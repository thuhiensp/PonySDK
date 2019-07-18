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
package com.ponysdk.core.ui2.presentation;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;
import com.ponysdk.core.ui2.websockets.PBinaryType;

public class PPresentationConnection extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PPresentationConnection.class);
     private String id;
     private String url;
     private PEventHandlerNonNull onconnect;
     private PEventHandlerNonNull onclose;
     private PEventHandlerNonNull onterminate;
     private PEventHandlerNonNull onmessage;
     private PPresentationConnectionState state;
     private PBinaryType binaryType;

    public PPresentationConnection() {
      applyInit(widgetNoArgs());
    }

    public void setOnconnect(final PEventHandlerNonNull onconnect, final PEventAttributesName... atrsName)  {
       addHandler(onconnect);
       saveUpdateAttributeCallBack(PAttributeNames.ONCONNECT, onconnect, atrsName);
    }
    public void setOnclose(final PEventHandlerNonNull onclose, final PEventAttributesName... atrsName)  {
       addHandler(onclose);
       saveUpdateAttributeCallBack(PAttributeNames.ONCLOSE, onclose, atrsName);
    }
    public void setOnterminate(final PEventHandlerNonNull onterminate, final PEventAttributesName... atrsName)  {
       addHandler(onterminate);
       saveUpdateAttributeCallBack(PAttributeNames.ONTERMINATE, onterminate, atrsName);
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

    public String getId(){
      return id;
    }
    public String getUrl(){
      return url;
    }
    public PEventHandlerNonNull getOnconnect(){
      return onconnect;
    }
    public PEventHandlerNonNull getOnclose(){
      return onclose;
    }
    public PEventHandlerNonNull getOnterminate(){
      return onterminate;
    }
    public PEventHandlerNonNull getOnmessage(){
      return onmessage;
    }
    public PPresentationConnectionState getState(){
      return state;
    }
    public PBinaryType getBinaryType(){
      return binaryType;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.PRESENTATION_CONNECTION;
    }


}