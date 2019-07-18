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
package com.ponysdk.core.ui2.sensor;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public abstract class PSensor extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PSensor.class);
     private Boolean activated;
     private Double timestamp;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onreading;
     private PEventHandlerNonNull onactivate;

    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnreading(final PEventHandlerNonNull onreading, final PEventAttributesName... atrsName)  {
       addHandler(onreading);
       saveUpdateAttributeCallBack(PAttributeNames.ONREADING, onreading, atrsName);
    }
    public void setOnactivate(final PEventHandlerNonNull onactivate, final PEventAttributesName... atrsName)  {
       addHandler(onactivate);
       saveUpdateAttributeCallBack(PAttributeNames.ONACTIVATE, onactivate, atrsName);
    }

    public Boolean getActivated(){
      return activated;
    }
    public Double getTimestamp(){
      return timestamp;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnreading(){
      return onreading;
    }
    public PEventHandlerNonNull getOnactivate(){
      return onactivate;
    }


}