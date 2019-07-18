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
package com.ponysdk.core.ui2.fetch;

import java.util.Arrays;
import com.ponysdk.core.ui2.PEnum;

public enum PRequestCache implements PEnum {
    DEFAULT("default"),
    NO_STORE("no-store"),
    RELOAD("reload"),
    NO_CACHE("no-cache"),
    FORCE_CACHE("force-cache"),
    ONLY_IF_CACHED("only-if-cached");

    private String internalValue;

    PRequestCache(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static PRequestCache of(String value){
        switch(value){
            case "default":
                return DEFAULT;
            case "no-store":
                return NO_STORE;
            case "reload":
                return RELOAD;
            case "no-cache":
                return NO_CACHE;
            case "force-cache":
                return FORCE_CACHE;
            case "only-if-cached":
                return ONLY_IF_CACHED;
            default:
                return null;
        }
    }

    public static PRequestCache[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(PRequestCache::of)
                .toArray(PRequestCache[]::new);
    }

}
