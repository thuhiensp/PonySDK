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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PSVGPoint extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PSVGPoint.class);
     private Double x;
     private Double y;

    public PSVGPoint() {
      applyInit(widgetNoArgs());
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

    public Double getX(){
      return x;
    }
    public Double getY(){
      return y;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVG_POINT;
    }


}