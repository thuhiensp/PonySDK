/*
 * Copyright 2019 SmartTrade Technologies
 *     and Pony SDK project.
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
package com.ponysdk.core.ui2;

import java.util.Arrays;
import com.ponysdk.core.ui2.PEnum;

public enum PScrollTimelineAutoKeyword implements PEnum {
    AUTO("auto");

    private String internalValue;

    PScrollTimelineAutoKeyword(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static PScrollTimelineAutoKeyword of(String value){
        switch(value){
            case "auto":
                return AUTO;
            default:
                return null;
        }
    }

    public static PScrollTimelineAutoKeyword[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(PScrollTimelineAutoKeyword::of)
                .toArray(PScrollTimelineAutoKeyword[]::new);
    }

}
