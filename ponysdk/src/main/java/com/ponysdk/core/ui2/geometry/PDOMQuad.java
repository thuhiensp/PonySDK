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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PDOMQuad extends PObject2 {
     private PDOMPoint p1;
     private PDOMPoint p2;
     private PDOMPoint p3;
     private PDOMPoint p4;

    public PDOMQuad() {
      applyInit(widgetNoArgs());
    }


    public PDOMQuad(PDOMPointInit p1){
      applyInit(widgetWithArgs(), new Object[]{p1});
    }

    public PDOMQuad(PDOMPointInit p1, PDOMPointInit p2){
      applyInit(widgetWithArgs(), new Object[]{p1, p2});
    }

    public PDOMQuad(PDOMPointInit p1, PDOMPointInit p2, PDOMPointInit p3){
      applyInit(widgetWithArgs(), new Object[]{p1, p2, p3});
    }

    public PDOMQuad(PDOMPointInit p1, PDOMPointInit p2, PDOMPointInit p3, PDOMPointInit p4){
      applyInit(widgetWithArgs(), new Object[]{p1, p2, p3, p4});
    }



    public PDOMPoint getP1(){
      return p1;
    }
    public PDOMPoint getP2(){
      return p2;
    }
    public PDOMPoint getP3(){
      return p3;
    }
    public PDOMPoint getP4(){
      return p4;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.DOM_QUAD;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.DOM_QUAD;
    }


}