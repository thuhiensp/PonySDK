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
package com.ponysdk.core.ui2.html.track;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PTextTrackList extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PTextTrackList.class);
     private Double length;
     private PEventHandlerNonNull onchange;
     private PEventHandlerNonNull onaddtrack;
     private PEventHandlerNonNull onremovetrack;

    public PTextTrackList() {
      applyInit(widgetNoArgs());
    }

    public void setOnchange(final PEventHandlerNonNull onchange, final PEventAttributesName... atrsName)  {
       addHandler(onchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONCHANGE, onchange, atrsName);
    }
    public void setOnaddtrack(final PEventHandlerNonNull onaddtrack, final PEventAttributesName... atrsName)  {
       addHandler(onaddtrack);
       saveUpdateAttributeCallBack(PAttributeNames.ONADDTRACK, onaddtrack, atrsName);
    }
    public void setOnremovetrack(final PEventHandlerNonNull onremovetrack, final PEventAttributesName... atrsName)  {
       addHandler(onremovetrack);
       saveUpdateAttributeCallBack(PAttributeNames.ONREMOVETRACK, onremovetrack, atrsName);
    }

    public Double getLength(){
      return length;
    }
    public PEventHandlerNonNull getOnchange(){
      return onchange;
    }
    public PEventHandlerNonNull getOnaddtrack(){
      return onaddtrack;
    }
    public PEventHandlerNonNull getOnremovetrack(){
      return onremovetrack;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.TEXT_TRACK_LIST;
    }


}