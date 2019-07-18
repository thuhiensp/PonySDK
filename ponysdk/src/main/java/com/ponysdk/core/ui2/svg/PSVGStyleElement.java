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
package com.ponysdk.core.ui2.svg;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.css.PStyleSheet;

public class PSVGStyleElement extends PSVGElement {
    private static final Logger log = LoggerFactory.getLogger(PSVGStyleElement.class);
     private String type;
     private String media;
     private String title;
     private PStyleSheet sheet;
     private Boolean disabled;

    public PSVGStyleElement() {
      applyInit(widgetNoArgs());
    }

    public void setType(final String type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
    }
    public void setMedia(final String media)  {
       if (Objects.equals(this.media, media))return;
       this.media = media;
       log.info("media" + media);
       saveUpdateAttribute(PAttributeNames.MEDIA,media);
    }
    public void setTitle(final String title)  {
       if (Objects.equals(this.title, title))return;
       this.title = title;
       log.info("title" + title);
       saveUpdateAttribute(PAttributeNames.TITLE,title);
    }
    public void setDisabled(final Boolean disabled)  {
       if (Objects.equals(this.disabled, disabled))return;
       this.disabled = disabled;
       log.info("disabled" + disabled);
       saveUpdateAttribute(PAttributeNames.DISABLED,disabled);
    }

    public String getType(){
      return type;
    }
    public String getMedia(){
      return media;
    }
    public String getTitle(){
      return title;
    }
    public PStyleSheet getSheet(){
      return sheet;
    }
    public Boolean getDisabled(){
      return disabled;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVG_STYLE_ELEMENT;
    }


}