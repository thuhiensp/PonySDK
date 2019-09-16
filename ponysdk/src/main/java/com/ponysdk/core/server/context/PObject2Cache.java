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

package com.ponysdk.core.server.context;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ponysdk.core.model.ServerToClientModel;
import com.ponysdk.core.server.application.UIContext;
import com.ponysdk.core.ui.basic.PWindowManager2;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PWindow2;
import com.ponysdk.core.writer.ModelWriter;

public class PObject2Cache {

    private static final Logger log = LoggerFactory.getLogger(PObject2Cache.class);

    private final Map<Integer, PObject2WeakReference> referenceByObjectID = new ConcurrentHashMap<>();
    private final ReferenceQueue<PObject2> queue = new ReferenceQueue<>();

    public PObject2 add(final PObject2 pObject) {
        expungeStaleEntries();
        final PObject2WeakReference weakReference = new PObject2WeakReference(pObject, queue);
        referenceByObjectID.put(weakReference.getObjectID(), weakReference);
        if (log.isDebugEnabled()) log.debug("Registering object: {}", pObject);
        return pObject;
    }

    public PObject2 get(final int objectID) {
        expungeStaleEntries();
        final Reference<PObject2> value = referenceByObjectID.get(objectID);
        return value != null ? value.get() : null;
    }

    private void expungeStaleEntries() {
        PObject2WeakReference reference;
        while ((reference = (PObject2WeakReference) queue.poll()) != null) {
            final int objectID = reference.getObjectID();
            referenceByObjectID.remove(objectID);
            final int windowID = reference.getWindowID();
            if (log.isDebugEnabled()) log.debug("Removing reference on object #{} in window #{}", objectID, windowID);
            final PWindow2 window = windowID == PWindow2.getMain().getID() ? PWindow2.getMain() : PWindowManager2.getWindow(windowID);
            //if (window != null) {
            final ModelWriter writer = UIContext.get().getWriter();
            writer.beginPObject2();
            writer.write(ServerToClientModel.TYPE_GC, objectID);
            writer.endObject();
            //}
        }
    }

    private static class PObject2WeakReference extends WeakReference<PObject2> {

        private final int objectID;
        private final int windowID;

        public PObject2WeakReference(final PObject2 pObject, final ReferenceQueue<? super PObject2> queue) {
            super(pObject, queue);
            objectID = pObject.getID();
            windowID = pObject.getWindow() != null ? pObject.getWindow().getID() : -1;
        }

        public int getObjectID() {
            return objectID;
        }

        public int getWindowID() {
            return windowID;
        }

    }

}
