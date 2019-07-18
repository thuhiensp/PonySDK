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
package com.ponysdk.core.ui2.html;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PValidityState extends PObject2 {
     private Boolean valueMissing;
     private Boolean typeMismatch;
     private Boolean patternMismatch;
     private Boolean tooLong;
     private Boolean tooShort;
     private Boolean rangeUnderflow;
     private Boolean rangeOverflow;
     private Boolean stepMismatch;
     private Boolean badInput;
     private Boolean customError;
     private Boolean valid;

    public PValidityState() {
      applyInit(widgetNoArgs());
    }


    public Boolean getValueMissing(){
      return valueMissing;
    }
    public Boolean getTypeMismatch(){
      return typeMismatch;
    }
    public Boolean getPatternMismatch(){
      return patternMismatch;
    }
    public Boolean getTooLong(){
      return tooLong;
    }
    public Boolean getTooShort(){
      return tooShort;
    }
    public Boolean getRangeUnderflow(){
      return rangeUnderflow;
    }
    public Boolean getRangeOverflow(){
      return rangeOverflow;
    }
    public Boolean getStepMismatch(){
      return stepMismatch;
    }
    public Boolean getBadInput(){
      return badInput;
    }
    public Boolean getCustomError(){
      return customError;
    }
    public Boolean getValid(){
      return valid;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.VALIDITY_STATE;
    }


}