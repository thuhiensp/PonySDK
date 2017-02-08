/*
 * Copyright (c) 2011 PonySDK
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

package com.ponysdk.core.ui.basic.event;

import com.ponysdk.core.ui.eventbus.Event;

public class PValueChangeEvent<T> extends Event<PValueChangeHandler<T>> {

    public static final Type<PValueChangeHandler<?>> TYPE = new Type<>();

    public PValueChangeEvent(final Object sourceComponent, final T value) {
        super(sourceComponent);
        setData(value);
    }

    @Override
    public Type<PValueChangeHandler<T>> getAssociatedType() {
        return (Type) TYPE;
    }

    @Override
    protected void dispatch(final PValueChangeHandler<T> handler) {
        handler.onValueChange(this);
    }

    @Override
    public T getData() {
        return (T) super.getData();
    }

    /**
     * @deprecated Use {@link #getData()} instead
     */
    @Deprecated
    public T getValue() {
        return getData();
    }

}
