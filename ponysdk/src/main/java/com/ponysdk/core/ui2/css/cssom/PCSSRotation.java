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
package com.ponysdk.core.ui2.css.cssom;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PCSSRotation extends PCSSTransformComponent {
    private static final Logger log = LoggerFactory.getLogger(PCSSRotation.class);
     private PCSSNumericValue angle;
     private Double x;
     private Double y;
     private Double z;

    public PCSSRotation(PCSSNumericValue angleValue){
      applyInit(widgetWithArgs(), new Object[]{angleValue});
    }

    public PCSSRotation(Double x, Double y, Double z, PCSSNumericValue angle){
      applyInit(widgetWithArgs(), new Object[]{x, y, z, angle});
    }


    public void setAngle(final PCSSNumericValue angle)  {
       if (Objects.equals(this.angle, angle))return;
       this.angle = angle;
       log.info("angle" + angle);
       saveUpdateAttribute(PAttributeNames.ANGLE,angle);
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
    public void setZ(final Double z)  {
       if (Objects.equals(this.z, z))return;
       this.z = z;
       log.info("z" + z);
       saveUpdateAttribute(PAttributeNames.Z,z);
    }

    public PCSSNumericValue getAngle(){
      return angle;
    }
    public Double getX(){
      return x;
    }
    public Double getY(){
      return y;
    }
    public Double getZ(){
      return z;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.CSS_ROTATION;
    }


}