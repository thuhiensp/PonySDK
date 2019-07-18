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

public class PSVGAngle extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PSVGAngle.class);
     private Short unitType;
     private Double value;
     private Double valueInSpecifiedUnits;
     private String valueAsString;

    public PSVGAngle() {
      applyInit(widgetNoArgs());
    }

    public void setValue(final Double value)  {
       if (Objects.equals(this.value, value))return;
       this.value = value;
       log.info("value" + value);
       saveUpdateAttribute(PAttributeNames.VALUE,value);
    }
    public void setValueInSpecifiedUnits(final Double valueInSpecifiedUnits)  {
       if (Objects.equals(this.valueInSpecifiedUnits, valueInSpecifiedUnits))return;
       this.valueInSpecifiedUnits = valueInSpecifiedUnits;
       log.info("valueInSpecifiedUnits" + valueInSpecifiedUnits);
       saveUpdateAttribute(PAttributeNames.VALUE_IN_SPECIFIED_UNITS,valueInSpecifiedUnits);
    }
    public void setValueAsString(final String valueAsString)  {
       if (Objects.equals(this.valueAsString, valueAsString))return;
       this.valueAsString = valueAsString;
       log.info("valueAsString" + valueAsString);
       saveUpdateAttribute(PAttributeNames.VALUE_AS_STRING,valueAsString);
    }

    public Short getUnitType(){
      return unitType;
    }
    public Double getValue(){
      return value;
    }
    public Double getValueInSpecifiedUnits(){
      return valueInSpecifiedUnits;
    }
    public String getValueAsString(){
      return valueAsString;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVG_ANGLE;
    }


}