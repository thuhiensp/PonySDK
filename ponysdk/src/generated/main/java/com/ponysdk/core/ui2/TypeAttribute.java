/*
 * Copyright (c) 2019 PonySDK
 *  Owners:
 *  Luciano Broussal  <luciano.broussal AT gmail.com>
 *	Mathieu Barbier   <mathieu.barbier AT gmail.com>
 *	Nicolas Ciaravola <nicolas.ciaravola.pro AT gmail.com>
 *
 *  WebSite:
 *  http://code.google.com/p/pony-sdk/
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

public enum TypeAttribute {
    POBJECT2,
    PENUM,
    PCALLBACK,
    PEVENT,
    BOOLEAN,
    BYTE,
    INTEGER,
    SHORT,
    LONG,
    FLOAD,
    DOUBLE,
    ARRAY;

    private static final TypeAttribute[] VALUES = TypeAttribute.values();

    private TypeAttribute() {
    }

    public final byte getValue() {
        return (byte) ordinal();
    }

    public static TypeAttribute fromRawValue(final int rawValue) {
        return VALUES[rawValue];
    }

}
