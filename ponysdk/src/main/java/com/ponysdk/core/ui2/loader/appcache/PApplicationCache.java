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
package com.ponysdk.core.ui2.loader.appcache;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PApplicationCache extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PApplicationCache.class);
     private Short status;
     private PEventHandlerNonNull onchecking;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onnoupdate;
     private PEventHandlerNonNull ondownloading;
     private PEventHandlerNonNull onprogress;
     private PEventHandlerNonNull onupdateready;
     private PEventHandlerNonNull oncached;
     private PEventHandlerNonNull onobsolete;

    public PApplicationCache() {
      applyInit(widgetNoArgs());
    }

    public void setOnchecking(final PEventHandlerNonNull onchecking, final PEventAttributesName... atrsName)  {
       addHandler(onchecking);
       saveUpdateAttributeCallBack(PAttributeNames.ONCHECKING, onchecking, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnnoupdate(final PEventHandlerNonNull onnoupdate, final PEventAttributesName... atrsName)  {
       addHandler(onnoupdate);
       saveUpdateAttributeCallBack(PAttributeNames.ONNOUPDATE, onnoupdate, atrsName);
    }
    public void setOndownloading(final PEventHandlerNonNull ondownloading, final PEventAttributesName... atrsName)  {
       addHandler(ondownloading);
       saveUpdateAttributeCallBack(PAttributeNames.ONDOWNLOADING, ondownloading, atrsName);
    }
    public void setOnprogress(final PEventHandlerNonNull onprogress, final PEventAttributesName... atrsName)  {
       addHandler(onprogress);
       saveUpdateAttributeCallBack(PAttributeNames.ONPROGRESS, onprogress, atrsName);
    }
    public void setOnupdateready(final PEventHandlerNonNull onupdateready, final PEventAttributesName... atrsName)  {
       addHandler(onupdateready);
       saveUpdateAttributeCallBack(PAttributeNames.ONUPDATEREADY, onupdateready, atrsName);
    }
    public void setOncached(final PEventHandlerNonNull oncached, final PEventAttributesName... atrsName)  {
       addHandler(oncached);
       saveUpdateAttributeCallBack(PAttributeNames.ONCACHED, oncached, atrsName);
    }
    public void setOnobsolete(final PEventHandlerNonNull onobsolete, final PEventAttributesName... atrsName)  {
       addHandler(onobsolete);
       saveUpdateAttributeCallBack(PAttributeNames.ONOBSOLETE, onobsolete, atrsName);
    }

    public Short getStatus(){
      return status;
    }
    public PEventHandlerNonNull getOnchecking(){
      return onchecking;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnnoupdate(){
      return onnoupdate;
    }
    public PEventHandlerNonNull getOndownloading(){
      return ondownloading;
    }
    public PEventHandlerNonNull getOnprogress(){
      return onprogress;
    }
    public PEventHandlerNonNull getOnupdateready(){
      return onupdateready;
    }
    public PEventHandlerNonNull getOncached(){
      return oncached;
    }
    public PEventHandlerNonNull getOnobsolete(){
      return onobsolete;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.APPLICATION_CACHE;
    }


}