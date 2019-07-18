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

import java.util.HashMap;
import java.util.Map;

import com.ponysdk.core.ui.eventbus.HandlerRegistration;

public class PEventManager {

    private int Id = 1;
    private final Map<Integer, PCallBack> handlers;

    public PEventManager() {
        this.handlers = newHandlersMap();
    }

    protected HashMap<Integer, PCallBack> newHandlersMap() {
        return new HashMap<>();
    }

    //    protected PCallBack newHandlersSet() {
    //        return new HashSet<>();
    //    }

    //    public Collection<PCallBack> getEventHandlers(final PAttributeNames nameOfEvent) {
    //        return handlers.getOrDefault(nameOfEvent, Collections.emptySet());
    //    }

    protected HandlerRegistration addHandler(final PCallBack handler) {
        if (handler == null) throw new NullPointerException("Cannot add a null handler");
        handlers.put(Id, handler);
        Id++;
        return () -> removeHandler(Id);
    }

    protected boolean removeHandler(final Integer idOfHandler) {
        final PCallBack handler = handlers.get(idOfHandler);
        if (handler == null) return false;
        return handlers.remove(idOfHandler, handler);
    }

    public PCallBack getCallBack(final int id) {
        return handlers.get(id);
    }

    public int getId() {
        return Id;
    }

}
