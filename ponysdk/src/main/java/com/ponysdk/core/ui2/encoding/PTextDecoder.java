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
package com.ponysdk.core.ui2.encoding;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PTextDecoder extends PObject2 {
     private String encoding;
     private Boolean fatal;
     private Boolean ignoreBOM;

    public PTextDecoder() {
      applyInit(widgetNoArgs());
    }


    public PTextDecoder(String label){
      applyInit(widgetWithArgs(), new Object[]{label});
    }

    public PTextDecoder(String label, PTextDecoderOptions options){
      applyInit(widgetWithArgs(), new Object[]{label, options});
    }



    public String getEncoding(){
      return encoding;
    }
    public Boolean getFatal(){
      return fatal;
    }
    public Boolean getIgnoreBOM(){
      return ignoreBOM;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.TEXT_DECODER;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.TEXT_DECODER;
    }


}