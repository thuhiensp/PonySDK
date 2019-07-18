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
package com.ponysdk.core.ui2.mediastream;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PMediaStream extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PMediaStream.class);
     private String id;
     private Boolean active;
     private PEventHandlerNonNull onaddtrack;
     private PEventHandlerNonNull onremovetrack;
     private PEventHandlerNonNull onactive;
     private PEventHandlerNonNull oninactive;

    public PMediaStream() {
      applyInit(widgetNoArgs());
    }


    public PMediaStream(PMediaStream stream){
      applyInit(widgetWithArgs(), new Object[]{stream});
    }

    public PMediaStream(PMediaStreamTrack[] tracks){
      applyInit(widgetWithArgs(), new Object[]{tracks});
    }


    public void setOnaddtrack(final PEventHandlerNonNull onaddtrack, final PEventAttributesName... atrsName)  {
       addHandler(onaddtrack);
       saveUpdateAttributeCallBack(PAttributeNames.ONADDTRACK, onaddtrack, atrsName);
    }
    public void setOnremovetrack(final PEventHandlerNonNull onremovetrack, final PEventAttributesName... atrsName)  {
       addHandler(onremovetrack);
       saveUpdateAttributeCallBack(PAttributeNames.ONREMOVETRACK, onremovetrack, atrsName);
    }
    public void setOnactive(final PEventHandlerNonNull onactive, final PEventAttributesName... atrsName)  {
       addHandler(onactive);
       saveUpdateAttributeCallBack(PAttributeNames.ONACTIVE, onactive, atrsName);
    }
    public void setOninactive(final PEventHandlerNonNull oninactive, final PEventAttributesName... atrsName)  {
       addHandler(oninactive);
       saveUpdateAttributeCallBack(PAttributeNames.ONINACTIVE, oninactive, atrsName);
    }

    public String getId(){
      return id;
    }
    public Boolean getActive(){
      return active;
    }
    public PEventHandlerNonNull getOnaddtrack(){
      return onaddtrack;
    }
    public PEventHandlerNonNull getOnremovetrack(){
      return onremovetrack;
    }
    public PEventHandlerNonNull getOnactive(){
      return onactive;
    }
    public PEventHandlerNonNull getOninactive(){
      return oninactive;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.MEDIA_STREAM;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.MEDIA_STREAM;
    }


}