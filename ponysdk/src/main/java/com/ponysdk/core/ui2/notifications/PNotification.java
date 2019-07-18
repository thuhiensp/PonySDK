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
package com.ponysdk.core.ui2.notifications;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PNotification extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PNotification.class);
    private static Double maxActions;
     private PEventHandlerNonNull onclick;
     private PEventHandlerNonNull onshow;
     private PEventHandlerNonNull onerror;
     private PEventHandlerNonNull onclose;
     private String title;
     private String dir;
     private String lang;
     private String body;
     private String tag;
     private String image;
     private String icon;
     private String badge;
     private Double[] vibrate;
     private Double timestamp;
     private Boolean renotify;
     private Boolean silent;
     private Boolean requireInteraction;
     private Object data;
     private PNotificationAction[] actions;
    private static PNotificationPermission permission;

    public PNotification(String title){
      applyInit(widgetWithArgs(), new Object[]{title});
    }

    public PNotification(String title, PNotificationOptions options){
      applyInit(widgetWithArgs(), new Object[]{title, options});
    }


    public void setOnclick(final PEventHandlerNonNull onclick, final PEventAttributesName... atrsName)  {
       addHandler(onclick);
       saveUpdateAttributeCallBack(PAttributeNames.ONCLICK, onclick, atrsName);
    }
    public void setOnshow(final PEventHandlerNonNull onshow, final PEventAttributesName... atrsName)  {
       addHandler(onshow);
       saveUpdateAttributeCallBack(PAttributeNames.ONSHOW, onshow, atrsName);
    }
    public void setOnerror(final PEventHandlerNonNull onerror, final PEventAttributesName... atrsName)  {
       addHandler(onerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONERROR, onerror, atrsName);
    }
    public void setOnclose(final PEventHandlerNonNull onclose, final PEventAttributesName... atrsName)  {
       addHandler(onclose);
       saveUpdateAttributeCallBack(PAttributeNames.ONCLOSE, onclose, atrsName);
    }

    public PEventHandlerNonNull getOnclick(){
      return onclick;
    }
    public PEventHandlerNonNull getOnshow(){
      return onshow;
    }
    public PEventHandlerNonNull getOnerror(){
      return onerror;
    }
    public PEventHandlerNonNull getOnclose(){
      return onclose;
    }
    public String getTitle(){
      return title;
    }
    public String getDir(){
      return dir;
    }
    public String getLang(){
      return lang;
    }
    public String getBody(){
      return body;
    }
    public String getTag(){
      return tag;
    }
    public String getImage(){
      return image;
    }
    public String getIcon(){
      return icon;
    }
    public String getBadge(){
      return badge;
    }
    public Double[] getVibrate(){
      return vibrate;
    }
    public Double getTimestamp(){
      return timestamp;
    }
    public Boolean getRenotify(){
      return renotify;
    }
    public Boolean getSilent(){
      return silent;
    }
    public Boolean getRequireInteraction(){
      return requireInteraction;
    }
    public Object getData(){
      return data;
    }
    public PNotificationAction[] getActions(){
      return actions;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.NOTIFICATION;
    }


}