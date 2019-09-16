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

public enum PVRDisplayEventReason implements PEnum {
    CONNECTED("connected"),
    DISCONNECTED("disconnected"),
    NAVIGATION("navigation"),
    MOUNTED("mounted"),
    UNMOUNTED("unmounted");

    private String internalValue;

    PVRDisplayEventReason(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static PVRDisplayEventReason of(String value){
        switch(value){
            case "connected":
                return CONNECTED;
            case "disconnected":
                return DISCONNECTED;
            case "navigation":
                return NAVIGATION;
            case "mounted":
                return MOUNTED;
            case "unmounted":
                return UNMOUNTED;
            default:
                return null;
        }
    }

    public static PVRDisplayEventReason[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(PVRDisplayEventReason::of)
                .toArray(PVRDisplayEventReason[]::new);
    }

}
