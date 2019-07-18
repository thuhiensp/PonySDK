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
package com.ponysdk.core.ui2.geometry;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PDOMRect extends PDOMRectReadOnly {
    private static final Logger log = LoggerFactory.getLogger(PDOMRect.class);
     private Double x;
     private Double y;
     private Double width;
     private Double height;

    public PDOMRect() {
      applyInit(widgetNoArgs());
    }


    public PDOMRect(Double x){
      applyInit(widgetWithArgs(), new Object[]{x});
    }

    public PDOMRect(Double x, Double y){
      applyInit(widgetWithArgs(), new Object[]{x, y});
    }

    public PDOMRect(Double x, Double y, Double width){
      applyInit(widgetWithArgs(), new Object[]{x, y, width});
    }

    public PDOMRect(Double x, Double y, Double width, Double height){
      applyInit(widgetWithArgs(), new Object[]{x, y, width, height});
    }


    public void setX(final Double x)  {
       if (Objects.equals(this.x, x))return;
       this.x = x;
       log.info("x" + x);
       saveUpdateAttribute(PAttributeNames.X,x);
    }
    public void setY(final Double y)  {
       if (Objects.equals(this.y, y))return;
       this.y = y;
       log.info("y" + y);
       saveUpdateAttribute(PAttributeNames.Y,y);
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

    public Double getX(){
      return x;
    }
    public Double getY(){
      return y;
    }
    public Double getWidth(){
      return width;
    }
    public Double getHeight(){
      return height;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.DOM_RECT;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.DOM_RECT;
    }


}