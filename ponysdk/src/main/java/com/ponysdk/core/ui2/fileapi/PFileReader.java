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
package com.ponysdk.core.ui2.fileapi;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.dom.PDOMException;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;
import com.ponysdk.core.ui2.uniontype.PArrayBufferOrString;

public class PFileReader extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PFileReader.class);
     private Short readyState;
     private PArrayBufferOrString result;
     private PDOMException error;
     private PEventHandlerNonNull onloadstart;
     private PEventHandlerNonNull onprogress;
     private PEventHandlerNonNull onload;
     private PEventHandlerNonNull onabort;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onloadend;

    public PFileReader() {
      applyInit(widgetNoArgs());
    }



    public void setOnloadstart(final PEventHandlerNonNull onloadstart, final PEventAttributesName... atrsName)  {
       addHandler(onloadstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOADSTART, onloadstart, atrsName);
    }
    public void setOnprogress(final PEventHandlerNonNull onprogress, final PEventAttributesName... atrsName)  {
       addHandler(onprogress);
       saveUpdateAttributeCallBack(PAttributeNames.ONPROGRESS, onprogress, atrsName);
    }
    public void setOnload(final PEventHandlerNonNull onload, final PEventAttributesName... atrsName)  {
       addHandler(onload);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOAD, onload, atrsName);
    }
    public void setOnabort(final PEventHandlerNonNull onabort, final PEventAttributesName... atrsName)  {
       addHandler(onabort);
       saveUpdateAttributeCallBack(PAttributeNames.ONABORT, onabort, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnloadend(final PEventHandlerNonNull onloadend, final PEventAttributesName... atrsName)  {
       addHandler(onloadend);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOADEND, onloadend, atrsName);
    }

    public Short getReadyState(){
      return readyState;
    }
    public PArrayBufferOrString getResult(){
      return result;
    }
    public PDOMException getError(){
      return error;
    }
    public PEventHandlerNonNull getOnloadstart(){
      return onloadstart;
    }
    public PEventHandlerNonNull getOnprogress(){
      return onprogress;
    }
    public PEventHandlerNonNull getOnload(){
      return onload;
    }
    public PEventHandlerNonNull getOnabort(){
      return onabort;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnloadend(){
      return onloadend;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.FILE_READER;
    }


}