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

public class PDOMMatrix extends PDOMMatrixReadOnly {
    private static final Logger log = LoggerFactory.getLogger(PDOMMatrix.class);
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

    public PDOMMatrix() {
      applyInit(widgetNoArgs());
    }


    public PDOMMatrix(String init){
      applyInit(widgetWithArgs(), new Object[]{init});
    }

    public PDOMMatrix(Double[] init){
      applyInit(widgetWithArgs(), new Object[]{init});
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
    public void setM11(final Double m11)  {
       if (Objects.equals(this.m11, m11))return;
       this.m11 = m11;
       log.info("m11" + m11);
       saveUpdateAttribute(PAttributeNames.M11,m11);
    }
    public void setM12(final Double m12)  {
       if (Objects.equals(this.m12, m12))return;
       this.m12 = m12;
       log.info("m12" + m12);
       saveUpdateAttribute(PAttributeNames.M12,m12);
    }
    public void setM13(final Double m13)  {
       if (Objects.equals(this.m13, m13))return;
       this.m13 = m13;
       log.info("m13" + m13);
       saveUpdateAttribute(PAttributeNames.M13,m13);
    }
    public void setM14(final Double m14)  {
       if (Objects.equals(this.m14, m14))return;
       this.m14 = m14;
       log.info("m14" + m14);
       saveUpdateAttribute(PAttributeNames.M14,m14);
    }
    public void setM21(final Double m21)  {
       if (Objects.equals(this.m21, m21))return;
       this.m21 = m21;
       log.info("m21" + m21);
       saveUpdateAttribute(PAttributeNames.M21,m21);
    }
    public void setM22(final Double m22)  {
       if (Objects.equals(this.m22, m22))return;
       this.m22 = m22;
       log.info("m22" + m22);
       saveUpdateAttribute(PAttributeNames.M22,m22);
    }
    public void setM23(final Double m23)  {
       if (Objects.equals(this.m23, m23))return;
       this.m23 = m23;
       log.info("m23" + m23);
       saveUpdateAttribute(PAttributeNames.M23,m23);
    }
    public void setM24(final Double m24)  {
       if (Objects.equals(this.m24, m24))return;
       this.m24 = m24;
       log.info("m24" + m24);
       saveUpdateAttribute(PAttributeNames.M24,m24);
    }
    public void setM31(final Double m31)  {
       if (Objects.equals(this.m31, m31))return;
       this.m31 = m31;
       log.info("m31" + m31);
       saveUpdateAttribute(PAttributeNames.M31,m31);
    }
    public void setM32(final Double m32)  {
       if (Objects.equals(this.m32, m32))return;
       this.m32 = m32;
       log.info("m32" + m32);
       saveUpdateAttribute(PAttributeNames.M32,m32);
    }
    public void setM33(final Double m33)  {
       if (Objects.equals(this.m33, m33))return;
       this.m33 = m33;
       log.info("m33" + m33);
       saveUpdateAttribute(PAttributeNames.M33,m33);
    }
    public void setM34(final Double m34)  {
       if (Objects.equals(this.m34, m34))return;
       this.m34 = m34;
       log.info("m34" + m34);
       saveUpdateAttribute(PAttributeNames.M34,m34);
    }
    public void setM41(final Double m41)  {
       if (Objects.equals(this.m41, m41))return;
       this.m41 = m41;
       log.info("m41" + m41);
       saveUpdateAttribute(PAttributeNames.M41,m41);
    }
    public void setM42(final Double m42)  {
       if (Objects.equals(this.m42, m42))return;
       this.m42 = m42;
       log.info("m42" + m42);
       saveUpdateAttribute(PAttributeNames.M42,m42);
    }
    public void setM43(final Double m43)  {
       if (Objects.equals(this.m43, m43))return;
       this.m43 = m43;
       log.info("m43" + m43);
       saveUpdateAttribute(PAttributeNames.M43,m43);
    }
    public void setM44(final Double m44)  {
       if (Objects.equals(this.m44, m44))return;
       this.m44 = m44;
       log.info("m44" + m44);
       saveUpdateAttribute(PAttributeNames.M44,m44);
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

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.DOM_MATRIX;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.DOM_MATRIX;
    }


}