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
package com.ponysdk.core.ui2.mediasource;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PSourceBufferList extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PSourceBufferList.class);
     private Double length;
     private PEventHandlerNonNull onaddsourcebuffer;
     private PEventHandlerNonNull onremovesourcebuffer;

    public PSourceBufferList() {
      applyInit(widgetNoArgs());
    }

    public void setOnaddsourcebuffer(final PEventHandlerNonNull onaddsourcebuffer, final PEventAttributesName... atrsName)  {
       addHandler(onaddsourcebuffer);
       saveUpdateAttributeCallBack(PAttributeNames.ONADDSOURCEBUFFER, onaddsourcebuffer, atrsName);
    }
    public void setOnremovesourcebuffer(final PEventHandlerNonNull onremovesourcebuffer, final PEventAttributesName... atrsName)  {
       addHandler(onremovesourcebuffer);
       saveUpdateAttributeCallBack(PAttributeNames.ONREMOVESOURCEBUFFER, onremovesourcebuffer, atrsName);
    }

    public Double getLength(){
      return length;
    }
    public PEventHandlerNonNull getOnaddsourcebuffer(){
      return onaddsourcebuffer;
    }
    public PEventHandlerNonNull getOnremovesourcebuffer(){
      return onremovesourcebuffer;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SOURCE_BUFFER_LIST;
    }


}