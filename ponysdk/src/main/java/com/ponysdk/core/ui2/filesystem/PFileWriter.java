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
package com.ponysdk.core.ui2.filesystem;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.dom.PDOMException;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PFileWriter extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PFileWriter.class);
     private Short readyState;
     private PDOMException error;
     private Double position;
     private Double length;
     private PEventHandlerNonNull onwritestart;
     private PEventHandlerNonNull onprogress;
     private PEventHandlerNonNull onwrite;
     private PEventHandlerNonNull onabort;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onwriteend;

    public PFileWriter() {
      applyInit(widgetNoArgs());
    }

    public void setOnwritestart(final PEventHandlerNonNull onwritestart, final PEventAttributesName... atrsName)  {
       addHandler(onwritestart);
       saveUpdateAttributeCallBack(PAttributeNames.ONWRITESTART, onwritestart, atrsName);
    }
    public void setOnprogress(final PEventHandlerNonNull onprogress, final PEventAttributesName... atrsName)  {
       addHandler(onprogress);
       saveUpdateAttributeCallBack(PAttributeNames.ONPROGRESS, onprogress, atrsName);
    }
    public void setOnwrite(final PEventHandlerNonNull onwrite, final PEventAttributesName... atrsName)  {
       addHandler(onwrite);
       saveUpdateAttributeCallBack(PAttributeNames.ONWRITE, onwrite, atrsName);
    }
    public void setOnabort(final PEventHandlerNonNull onabort, final PEventAttributesName... atrsName)  {
       addHandler(onabort);
       saveUpdateAttributeCallBack(PAttributeNames.ONABORT, onabort, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnwriteend(final PEventHandlerNonNull onwriteend, final PEventAttributesName... atrsName)  {
       addHandler(onwriteend);
       saveUpdateAttributeCallBack(PAttributeNames.ONWRITEEND, onwriteend, atrsName);
    }

    public Short getReadyState(){
      return readyState;
    }
    public PDOMException getError(){
      return error;
    }
    public Double getPosition(){
      return position;
    }
    public Double getLength(){
      return length;
    }
    public PEventHandlerNonNull getOnwritestart(){
      return onwritestart;
    }
    public PEventHandlerNonNull getOnprogress(){
      return onprogress;
    }
    public PEventHandlerNonNull getOnwrite(){
      return onwrite;
    }
    public PEventHandlerNonNull getOnabort(){
      return onabort;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnwriteend(){
      return onwriteend;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.FILE_WRITER;
    }


}