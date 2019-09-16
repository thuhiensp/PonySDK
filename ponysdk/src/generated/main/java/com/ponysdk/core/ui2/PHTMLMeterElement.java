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
package  com.ponysdk.core.ui2;
import com.ponysdk.core.model.ServerToClientModel;
import com.ponysdk.core.writer.ModelWriter;
import com.ponysdk.core.server.application.UIContext;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
public class PHTMLMeterElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLMeterElement.class);
    public PHTMLMeterElement() {
    }

    public void setValue(final Double value)  {
       setAttribute(PAttributeNames.VALUE_DOUBLE, value);
       log.info("value" + value);
    }
    public void setMin(final Double min)  {
       setAttribute(PAttributeNames.MIN_DOUBLE, min);
       log.info("min" + min);
    }
    public void setMax(final Double max)  {
       setAttribute(PAttributeNames.MAX_DOUBLE, max);
       log.info("max" + max);
    }
    public void setLow(final Double low)  {
       setAttribute(PAttributeNames.LOW, low);
       log.info("low" + low);
    }
    public void setHigh(final Double high)  {
       setAttribute(PAttributeNames.HIGH, high);
       log.info("high" + high);
    }
    public void setOptimum(final Double optimum)  {
       setAttribute(PAttributeNames.OPTIMUM, optimum);
       log.info("optimum" + optimum);
    }

    public Double getValue(){
      return (Double) getAttribute(PAttributeNames.VALUE_DOUBLE);
    }
    public Double getMin(){
      return (Double) getAttribute(PAttributeNames.MIN_DOUBLE);
    }
    public Double getMax(){
      return (Double) getAttribute(PAttributeNames.MAX_DOUBLE);
    }
    public Double getLow(){
      return (Double) getAttribute(PAttributeNames.LOW);
    }
    public Double getHigh(){
      return (Double) getAttribute(PAttributeNames.HIGH);
    }
    public Double getOptimum(){
      return (Double) getAttribute(PAttributeNames.OPTIMUM);
    }

    @Override
    protected PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_METER_ELEMENT;
    }

    @Override
    protected PLeafTypeWithArgs widgetWithArgs() {
       return null;
    }

    
}