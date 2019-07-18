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

public abstract class PDOMMatrixReadOnly extends PObject2 {
     private Double a;
     private Double b;
     private Double c;
     private Double d;
     private Double e;
     private Double f;
     private Double m11;
     private Double m12;
     private Double m13;
     private Double m14;
     private Double m21;
     private Double m22;
     private Double m23;
     private Double m24;
     private Double m31;
     private Double m32;
     private Double m33;
     private Double m34;
     private Double m41;
     private Double m42;
     private Double m43;
     private Double m44;
     private Boolean is2D;
     private Boolean isIdentity;


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
    public Double getM11(){
      return m11;
    }
    public Double getM12(){
      return m12;
    }
    public Double getM13(){
      return m13;
    }
    public Double getM14(){
      return m14;
    }
    public Double getM21(){
      return m21;
    }
    public Double getM22(){
      return m22;
    }
    public Double getM23(){
      return m23;
    }
    public Double getM24(){
      return m24;
    }
    public Double getM31(){
      return m31;
    }
    public Double getM32(){
      return m32;
    }
    public Double getM33(){
      return m33;
    }
    public Double getM34(){
      return m34;
    }
    public Double getM41(){
      return m41;
    }
    public Double getM42(){
      return m42;
    }
    public Double getM43(){
      return m43;
    }
    public Double getM44(){
      return m44;
    }
    public Boolean getIs2D(){
      return is2D;
    }
    public Boolean getIsIdentity(){
      return isIdentity;
    }


}