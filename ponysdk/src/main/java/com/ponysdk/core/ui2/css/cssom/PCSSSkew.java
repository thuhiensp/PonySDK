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

public class PCSSSkew extends PCSSTransformComponent {
    private static final Logger log = LoggerFactory.getLogger(PCSSSkew.class);
     private PCSSNumericValue ax;
     private PCSSNumericValue ay;

    public PCSSSkew(PCSSNumericValue ax, PCSSNumericValue ay){
      applyInit(widgetWithArgs(), new Object[]{ax, ay});
    }


    public void setAx(final PCSSNumericValue ax)  {
       if (Objects.equals(this.ax, ax))return;
       this.ax = ax;
       log.info("ax" + ax);
       saveUpdateAttribute(PAttributeNames.AX,ax);
    }
    public void setAy(final PCSSNumericValue ay)  {
       if (Objects.equals(this.ay, ay))return;
       this.ay = ay;
       log.info("ay" + ay);
       saveUpdateAttribute(PAttributeNames.AY,ay);
    }

    public PCSSNumericValue getAx(){
      return ax;
    }
    public PCSSNumericValue getAy(){
      return ay;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.CSS_SKEW;
    }


}