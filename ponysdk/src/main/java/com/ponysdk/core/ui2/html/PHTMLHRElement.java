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

public class PHTMLHRElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLHRElement.class);
     private String align;
     private String color;
     private Boolean noShade;
     private String size;
     private String width;

    public PHTMLHRElement() {
      applyInit(widgetNoArgs());
    }

    public void setAlign(final String align)  {
       if (Objects.equals(this.align, align))return;
       this.align = align;
       log.info("align" + align);
       saveUpdateAttribute(PAttributeNames.ALIGN,align);
    }
    public void setColor(final String color)  {
       if (Objects.equals(this.color, color))return;
       this.color = color;
       log.info("color" + color);
       saveUpdateAttribute(PAttributeNames.COLOR,color);
    }
    public void setNoShade(final Boolean noShade)  {
       if (Objects.equals(this.noShade, noShade))return;
       this.noShade = noShade;
       log.info("noShade" + noShade);
       saveUpdateAttribute(PAttributeNames.NO_SHADE,noShade);
    }
    public void setSize(final String size)  {
       if (Objects.equals(this.size, size))return;
       this.size = size;
       log.info("size" + size);
       saveUpdateAttribute(PAttributeNames.SIZE,size);
    }
    public void setWidth(final String width)  {
       if (Objects.equals(this.width, width))return;
       this.width = width;
       log.info("width" + width);
       saveUpdateAttribute(PAttributeNames.WIDTH,width);
    }

    public String getAlign(){
      return align;
    }
    public String getColor(){
      return color;
    }
    public Boolean getNoShade(){
      return noShade;
    }
    public String getSize(){
      return size;
    }
    public String getWidth(){
      return width;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTMLHR_ELEMENT;
    }


}