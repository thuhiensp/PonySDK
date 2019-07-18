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
package com.ponysdk.core.ui2.html;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PHTMLSourceElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLSourceElement.class);
     private String src;
     private String type;
     private String srcset;
     private String sizes;
     private String media;

    public PHTMLSourceElement() {
      applyInit(widgetNoArgs());
    }

    public void setSrc(final String src)  {
       if (Objects.equals(this.src, src))return;
       this.src = src;
       log.info("src" + src);
       saveUpdateAttribute(PAttributeNames.SRC,src);
    }
    public void setType(final String type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
    }
    public void setSrcset(final String srcset)  {
       if (Objects.equals(this.srcset, srcset))return;
       this.srcset = srcset;
       log.info("srcset" + srcset);
       saveUpdateAttribute(PAttributeNames.SRCSET,srcset);
    }
    public void setSizes(final String sizes)  {
       if (Objects.equals(this.sizes, sizes))return;
       this.sizes = sizes;
       log.info("sizes" + sizes);
       saveUpdateAttribute(PAttributeNames.SIZES,sizes);
    }
    public void setMedia(final String media)  {
       if (Objects.equals(this.media, media))return;
       this.media = media;
       log.info("media" + media);
       saveUpdateAttribute(PAttributeNames.MEDIA,media);
    }

    public String getSrc(){
      return src;
    }
    public String getType(){
      return type;
    }
    public String getSrcset(){
      return srcset;
    }
    public String getSizes(){
      return sizes;
    }
    public String getMedia(){
      return media;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_SOURCE_ELEMENT;
    }


}