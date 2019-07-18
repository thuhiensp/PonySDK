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
import com.ponysdk.core.ui2.html.track.PTextTrack;

public class PHTMLTrackElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLTrackElement.class);
     private String kind;
     private String src;
     private String srclang;
     private String label;
     private Boolean defaultAttribute;
     private Short readyState;
     private PTextTrack track;

    public PHTMLTrackElement() {
      applyInit(widgetNoArgs());
    }

    public void setKind(final String kind)  {
       if (Objects.equals(this.kind, kind))return;
       this.kind = kind;
       log.info("kind" + kind);
       saveUpdateAttribute(PAttributeNames.KIND,kind);
    }
    public void setSrc(final String src)  {
       if (Objects.equals(this.src, src))return;
       this.src = src;
       log.info("src" + src);
       saveUpdateAttribute(PAttributeNames.SRC,src);
    }
    public void setSrclang(final String srclang)  {
       if (Objects.equals(this.srclang, srclang))return;
       this.srclang = srclang;
       log.info("srclang" + srclang);
       saveUpdateAttribute(PAttributeNames.SRCLANG,srclang);
    }
    public void setLabel(final String label)  {
       if (Objects.equals(this.label, label))return;
       this.label = label;
       log.info("label" + label);
       saveUpdateAttribute(PAttributeNames.LABEL,label);
    }
    public void setDefault(final Boolean defaultAttribute)  {
       if (Objects.equals(this.defaultAttribute, defaultAttribute))return;
       this.defaultAttribute = defaultAttribute;
       log.info("defaultAttribute" + defaultAttribute);
       saveUpdateAttribute(PAttributeNames.DEFAULT,defaultAttribute);
    }

    public String getKind(){
      return kind;
    }
    public String getSrc(){
      return src;
    }
    public String getSrclang(){
      return srclang;
    }
    public String getLabel(){
      return label;
    }
    public Boolean getDefaultAttribute(){
      return defaultAttribute;
    }
    public Short getReadyState(){
      return readyState;
    }
    public PTextTrack getTrack(){
      return track;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_TRACK_ELEMENT;
    }


}