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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PFunction extends PObject2 {
    private static PFunction caller;
    private static String displayName;
    private static Integer length;
    private static String name;
    private static PJsObject prototype;

    public PFunction(String functionBody){
      applyInit(widgetWithArgs(), new Object[]{functionBody});
    }

    public PFunction(String args, String functionBody){
      applyInit(widgetWithArgs(), new Object[]{args, functionBody});
    }




    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.FUNCTION;
    }


}