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

public class PHTMLFontElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLFontElement.class);
     private String color;
     private String face;
     private String size;

    public PHTMLFontElement() {
      applyInit(widgetNoArgs());
    }

    public void setColor(final String color)  {
       if (Objects.equals(this.color, color))return;
       this.color = color;
       log.info("color" + color);
       saveUpdateAttribute(PAttributeNames.COLOR,color);
    }
    public void setFace(final String face)  {
       if (Objects.equals(this.face, face))return;
       this.face = face;
       log.info("face" + face);
       saveUpdateAttribute(PAttributeNames.FACE,face);
    }
    public void setSize(final String size)  {
       if (Objects.equals(this.size, size))return;
       this.size = size;
       log.info("size" + size);
       saveUpdateAttribute(PAttributeNames.SIZE,size);
    }

    public String getColor(){
      return color;
    }
    public String getFace(){
      return face;
    }
    public String getSize(){
      return size;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_FONT_ELEMENT;
    }


}