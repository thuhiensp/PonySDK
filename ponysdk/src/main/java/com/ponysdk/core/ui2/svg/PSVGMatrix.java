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

public class PSVGMatrix extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PSVGMatrix.class);
     private Double a;
     private Double b;
     private Double c;
     private Double d;
     private Double e;
     private Double f;

    public PSVGMatrix() {
      applyInit(widgetNoArgs());
    }

    public void setA(final Double a)  {
       if (Objects.equals(this.a, a))return;
       this.a = a;
       log.info("a" + a);
       saveUpdateAttribute(PAttributeNames.A,a);
    }
    public void setB(final Double b)  {
       if (Objects.equals(this.b, b))return;
       this.b = b;
       log.info("b" + b);
       saveUpdateAttribute(PAttributeNames.B,b);
    }
    public void setC(final Double c)  {
       if (Objects.equals(this.c, c))return;
       this.c = c;
       log.info("c" + c);
       saveUpdateAttribute(PAttributeNames.C,c);
    }
    public void setD(final Double d)  {
       if (Objects.equals(this.d, d))return;
       this.d = d;
       log.info("d" + d);
       saveUpdateAttribute(PAttributeNames.D,d);
    }
    public void setE(final Double e)  {
       if (Objects.equals(this.e, e))return;
       this.e = e;
       log.info("e" + e);
       saveUpdateAttribute(PAttributeNames.E,e);
    }
    public void setF(final Double f)  {
       if (Objects.equals(this.f, f))return;
       this.f = f;
       log.info("f" + f);
       saveUpdateAttribute(PAttributeNames.F,f);
    }

    public Double getA(){
      return a;
    }
    public Double getB(){
      return b;
    }
    public Double getC(){
      return c;
    }
    public Double getD(){
      return d;
    }
    public Double getE(){
      return e;
    }
    public Double getF(){
      return f;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVG_MATRIX;
    }


}