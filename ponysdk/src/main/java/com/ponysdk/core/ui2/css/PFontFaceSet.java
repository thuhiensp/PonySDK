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
package com.ponysdk.core.ui2.css;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.core.PPromise;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PFontFaceSet extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PFontFaceSet.class);
     private PEventHandlerNonNull onloading;
     private PEventHandlerNonNull onloadingdone;
     private PEventHandlerNonNull onloadingerror;
     private PPromise<PFontFaceSet> ready;
     private PFontFaceSetLoadStatus status;

    public PFontFaceSet() {
      applyInit(widgetNoArgs());
    }

    public void setOnloading(final PEventHandlerNonNull onloading, final PEventAttributesName... atrsName)  {
       addHandler(onloading);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOADING, onloading, atrsName);
    }
    public void setOnloadingdone(final PEventHandlerNonNull onloadingdone, final PEventAttributesName... atrsName)  {
       addHandler(onloadingdone);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOADINGDONE, onloadingdone, atrsName);
    }
    public void setOnloadingerror(final PEventHandlerNonNull onloadingerror, final PEventAttributesName... atrsName)  {
       addHandler(onloadingerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONLOADINGERROR, onloadingerror, atrsName);
    }

    public PEventHandlerNonNull getOnloading(){
      return onloading;
    }
    public PEventHandlerNonNull getOnloadingdone(){
      return onloadingdone;
    }
    public PEventHandlerNonNull getOnloadingerror(){
      return onloadingerror;
    }
    public PPromise<PFontFaceSet> getReady(){
      return ready;
    }
    public PFontFaceSetLoadStatus getStatus(){
      return status;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.FONT_FACE_SET;
    }


}