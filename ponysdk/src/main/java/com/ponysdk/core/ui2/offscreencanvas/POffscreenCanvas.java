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
package com.ponysdk.core.ui2.offscreencanvas;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.events.PEventTarget;

public class POffscreenCanvas extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(POffscreenCanvas.class);
     private Double width;
     private Double height;

    public POffscreenCanvas(Double width, Double height){
      applyInit(widgetWithArgs(), new Object[]{width, height});
    }


    public void setWidth(final Double width)  {
       if (Objects.equals(this.width, width))return;
       this.width = width;
       log.info("width" + width);
       saveUpdateAttribute(PAttributeNames.WIDTH,width);
    }
    public void setHeight(final Double height)  {
       if (Objects.equals(this.height, height))return;
       this.height = height;
       log.info("height" + height);
       saveUpdateAttribute(PAttributeNames.HEIGHT,height);
    }

    public Double getWidth(){
      return width;
    }
    public Double getHeight(){
      return height;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.OFFSCREEN_CANVAS;
    }


}