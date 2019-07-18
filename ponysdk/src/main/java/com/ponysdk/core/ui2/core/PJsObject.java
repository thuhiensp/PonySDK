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
package com.ponysdk.core.ui2.core;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PJsObject<T> extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PJsObject.class);
    private static Integer length;
    private static PJsObject prototype;
     private PJsObject __proto__;
     private PFunction constructor;
    private static String name;
    private static PFunction caller;

    public PJsObject() {
      applyInit(widgetNoArgs());
    }


    public PJsObject(Object value){
      applyInit(widgetWithArgs(), new Object[]{value});
    }


    public void set__proto__(final PJsObject __proto__)  {
       if (Objects.equals(this.__proto__, __proto__))return;
       this.__proto__ = __proto__;
       log.info("__proto__" + __proto__);
       saveUpdateAttribute(PAttributeNames.__PROTO__,__proto__);
    }
    public void setConstructor(final PFunction constructor)  {
       if (Objects.equals(this.constructor, constructor))return;
       this.constructor = constructor;
       log.info("constructor" + constructor);
       saveUpdateAttribute(PAttributeNames.CONSTRUCTOR,constructor);
    }

    public PJsObject get__proto__(){
      return __proto__;
    }
    public PFunction getConstructor(){
      return constructor;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.JS_OBJECT;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.JS_OBJECT;
    }


}