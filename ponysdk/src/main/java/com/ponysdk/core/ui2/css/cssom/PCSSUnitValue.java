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

public class PCSSUnitValue extends PCSSNumericValue {
    private static final Logger log = LoggerFactory.getLogger(PCSSUnitValue.class);
     private Double value;
     private String unit;
     private String type;

    public PCSSUnitValue(Double value, String unit){
      applyInit(widgetWithArgs(), new Object[]{value, unit});
    }


    public void setValue(final Double value)  {
       if (Objects.equals(this.value, value))return;
       this.value = value;
       log.info("value" + value);
       saveUpdateAttribute(PAttributeNames.VALUE,value);
    }
    public void setUnit(final String unit)  {
       if (Objects.equals(this.unit, unit))return;
       this.unit = unit;
       log.info("unit" + unit);
       saveUpdateAttribute(PAttributeNames.UNIT,unit);
    }

    public Double getValue(){
      return value;
    }
    public String getUnit(){
      return unit;
    }
    public String getType(){
      return type;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.CSS_UNIT_VALUE;
    }


}