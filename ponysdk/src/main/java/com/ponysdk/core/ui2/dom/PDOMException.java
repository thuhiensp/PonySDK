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
package com.ponysdk.core.ui2.dom;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PDOMException extends PObject2 {
     private Short code;
     private String name;
     private String message;

    public PDOMException() {
      applyInit(widgetNoArgs());
    }


    public PDOMException(String message){
      applyInit(widgetWithArgs(), new Object[]{message});
    }

    public PDOMException(String message, String name){
      applyInit(widgetWithArgs(), new Object[]{message, name});
    }



    public Short getCode(){
      return code;
    }
    public String getName(){
      return name;
    }
    public String getMessage(){
      return message;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.DOM_EXCEPTION;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.DOM_EXCEPTION;
    }


}