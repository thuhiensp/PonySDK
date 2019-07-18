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
package com.ponysdk.core.ui2.serviceworkers;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.workers.PWorkerGlobalScope;

public class PServiceWorkerGlobalScope extends PWorkerGlobalScope {
    private static final Logger log = LoggerFactory.getLogger(PServiceWorkerGlobalScope.class);
     private PClients clients;
     private PServiceWorkerRegistration registration;
     private PEventHandlerNonNull onactivate;
     private PEventHandlerNonNull onfetch;
     private PEventHandlerNonNull oninstall;
     private PEventHandlerNonNull onmessage;
     private PEventHandlerNonNull onforeignfetch;
     private PEventHandlerNonNull onbackgroundfetched;
     private PEventHandlerNonNull onbackgroundfetchfail;
     private PEventHandlerNonNull onbackgroundfetchabort;
     private PEventHandlerNonNull onbackgroundfetchclick;
     private PEventHandlerNonNull onsync;
     private PEventHandlerNonNull onnotificationclick;
     private PEventHandlerNonNull onnotificationclose;
     private PEventHandlerNonNull onpush;

    public PServiceWorkerGlobalScope() {
      applyInit(widgetNoArgs());
    }

    public void setOnactivate(final PEventHandlerNonNull onactivate, final PEventAttributesName... atrsName)  {
       addHandler(onactivate);
       saveUpdateAttributeCallBack(PAttributeNames.ONACTIVATE, onactivate, atrsName);
    }
    public void setOnfetch(final PEventHandlerNonNull onfetch, final PEventAttributesName... atrsName)  {
       addHandler(onfetch);
       saveUpdateAttributeCallBack(PAttributeNames.ONFETCH, onfetch, atrsName);
    }
    public void setOninstall(final PEventHandlerNonNull oninstall, final PEventAttributesName... atrsName)  {
       addHandler(oninstall);
       saveUpdateAttributeCallBack(PAttributeNames.ONINSTALL, oninstall, atrsName);
    }
    public void setOnmessage(final PEventHandlerNonNull onmessage, final PEventAttributesName... atrsName)  {
       addHandler(onmessage);
       saveUpdateAttributeCallBack(PAttributeNames.ONMESSAGE, onmessage, atrsName);
    }
    public void setOnforeignfetch(final PEventHandlerNonNull onforeignfetch, final PEventAttributesName... atrsName)  {
       addHandler(onforeignfetch);
       saveUpdateAttributeCallBack(PAttributeNames.ONFOREIGNFETCH, onforeignfetch, atrsName);
    }
    public void setOnbackgroundfetched(final PEventHandlerNonNull onbackgroundfetched, final PEventAttributesName... atrsName)  {
       addHandler(onbackgroundfetched);
       saveUpdateAttributeCallBack(PAttributeNames.ONBACKGROUNDFETCHED, onbackgroundfetched, atrsName);
    }
    public void setOnbackgroundfetchfail(final PEventHandlerNonNull onbackgroundfetchfail, final PEventAttributesName... atrsName)  {
       addHandler(onbackgroundfetchfail);
       saveUpdateAttributeCallBack(PAttributeNames.ONBACKGROUNDFETCHFAIL, onbackgroundfetchfail, atrsName);
    }
    public void setOnbackgroundfetchabort(final PEventHandlerNonNull onbackgroundfetchabort, final PEventAttributesName... atrsName)  {
       addHandler(onbackgroundfetchabort);
       saveUpdateAttributeCallBack(PAttributeNames.ONBACKGROUNDFETCHABORT, onbackgroundfetchabort, atrsName);
    }
    public void setOnbackgroundfetchclick(final PEventHandlerNonNull onbackgroundfetchclick, final PEventAttributesName... atrsName)  {
       addHandler(onbackgroundfetchclick);
       saveUpdateAttributeCallBack(PAttributeNames.ONBACKGROUNDFETCHCLICK, onbackgroundfetchclick, atrsName);
    }
    public void setOnsync(final PEventHandlerNonNull onsync, final PEventAttributesName... atrsName)  {
       addHandler(onsync);
       saveUpdateAttributeCallBack(PAttributeNames.ONSYNC, onsync, atrsName);
    }
    public void setOnnotificationclick(final PEventHandlerNonNull onnotificationclick, final PEventAttributesName... atrsName)  {
       addHandler(onnotificationclick);
       saveUpdateAttributeCallBack(PAttributeNames.ONNOTIFICATIONCLICK, onnotificationclick, atrsName);
    }
    public void setOnnotificationclose(final PEventHandlerNonNull onnotificationclose, final PEventAttributesName... atrsName)  {
       addHandler(onnotificationclose);
       saveUpdateAttributeCallBack(PAttributeNames.ONNOTIFICATIONCLOSE, onnotificationclose, atrsName);
    }
    public void setOnpush(final PEventHandlerNonNull onpush, final PEventAttributesName... atrsName)  {
       addHandler(onpush);
       saveUpdateAttributeCallBack(PAttributeNames.ONPUSH, onpush, atrsName);
    }

    public PClients getClients(){
      return clients;
    }
    public PServiceWorkerRegistration getRegistration(){
      return registration;
    }
    public PEventHandlerNonNull getOnactivate(){
      return onactivate;
    }
    public PEventHandlerNonNull getOnfetch(){
      return onfetch;
    }
    public PEventHandlerNonNull getOninstall(){
      return oninstall;
    }
    public PEventHandlerNonNull getOnmessage(){
      return onmessage;
    }
    public PEventHandlerNonNull getOnforeignfetch(){
      return onforeignfetch;
    }
    public PEventHandlerNonNull getOnbackgroundfetched(){
      return onbackgroundfetched;
    }
    public PEventHandlerNonNull getOnbackgroundfetchfail(){
      return onbackgroundfetchfail;
    }
    public PEventHandlerNonNull getOnbackgroundfetchabort(){
      return onbackgroundfetchabort;
    }
    public PEventHandlerNonNull getOnbackgroundfetchclick(){
      return onbackgroundfetchclick;
    }
    public PEventHandlerNonNull getOnsync(){
      return onsync;
    }
    public PEventHandlerNonNull getOnnotificationclick(){
      return onnotificationclick;
    }
    public PEventHandlerNonNull getOnnotificationclose(){
      return onnotificationclose;
    }
    public PEventHandlerNonNull getOnpush(){
      return onpush;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SERVICE_WORKER_GLOBAL_SCOPE;
    }


}