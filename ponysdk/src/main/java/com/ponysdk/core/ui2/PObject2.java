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

import javax.json.JsonObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ponysdk.core.model.ClientToServerModel;
import com.ponysdk.core.model.ServerToClientModel;
import com.ponysdk.core.server.application.UIContext;
import com.ponysdk.core.ui.eventbus.HandlerRegistration;
import com.ponysdk.core.ui2.events.PEvent;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.writer.ModelWriter;

/**
 *
 */
public class PObject2 {

    private static final Logger log = LoggerFactory.getLogger(PObject2.class);
    protected final int ID = UIContext.get().nextID();

    protected PEventManager eventManager;

    protected void applyInit(final PLeafTypeNoArgs widgetNoArgs) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_CREATE, ID);
        log.info("Id of object is " + ID);
        final short idOfWidgetNoArgs = widgetNoArgs.getValue();
        writer.write(ServerToClientModel.POBJECT2_CONSTRUCTOR_NONARGUMENT, idOfWidgetNoArgs);
        log.info("number of leaf type is" + idOfWidgetNoArgs);
        //enrichForCreation(writer); not use now, for later???
        //enrichForUpdate(writer);  not use now, for later???
        writer.endObject();
        UIContext.get().registerObject2(this, ID);//register object when we create.
        //UIContext.get().registerObject(this);//??? Necessary? for later?
    }

    protected void applyInit(final PLeafTypeWithArgs widgetWithArgs, final Object[] args) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_CREATE, ID);
        log.info("Id of object is " + ID);
        final byte idOfWidgetWithArgs = widgetWithArgs.getValue();
        writer.write(ServerToClientModel.POBJECT2_CONSTRUCTOR_ARGUMENTS, idOfWidgetWithArgs);
        log.info("number of leaf type is" + idOfWidgetWithArgs);
        writer.write(ServerToClientModel.POBJECT2_ARRAY_ARGUMENTS, args);
        writer.endObject();
        //UIContext.get().registerObject(this);//??? Necessary? for later?

    }

    public final int getID() {
        return ID;
    }

    public void add(final PObject2 pObject2) {
        final int childId = pObject2.getID();
        final int parentId = this.getID();
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_ADD, childId);
        writer.write(ServerToClientModel.POBJECT2_PARENT_OBJECT_ID, parentId);
        //enrichForCreation(writer); not use now, for later???
        //enrichForUpdate(writer); not use now, for later???
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final Long value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_UPDATE, ID);
        log.info("Id of object is " + ID);
        final short numeOfAttr = nameOfAttribute.getValue();
        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numeOfAttr);
        log.info("HTML attribute value is " + value);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_LONG, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final Double value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_UPDATE, ID);
        log.info("Id of object is " + ID);
        final short numeOfAttr = nameOfAttribute.getValue();
        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numeOfAttr);
        log.info("HTML attribute value is " + value);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_DOUBLE, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final String value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_UPDATE, ID);
        final short numeOfAttr = nameOfAttribute.getValue();
        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numeOfAttr);
        log.info("HTML attribute value is " + value);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_TEXT, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final Integer value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_UPDATE, ID);
        log.info("Id of object is " + ID);
        final short numeOfAttr = nameOfAttribute.getValue();
        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numeOfAttr);
        log.info("HTML attribute value is " + value);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_INT, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final boolean value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_UPDATE, ID);
        log.info("Id of object is " + ID);
        final short numOfAttr = nameOfAttribute.getValue();
        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numOfAttr);
        log.info("HTML attribute value is " + value);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_BOOLEAN, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final Short value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_UPDATE, ID);
        log.info("Id of object is " + ID);
        final short numOfAttr = nameOfAttribute.getValue();
        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numOfAttr);
        log.info("HTML attribute value is " + value);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_SHORT, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final PObject2[] value) {

    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final PObject2 value) {
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final PEnum value) {
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final PCallBack value) {
        final ModelWriter writer = UIContext.get().getWriter();
        final short numOfAttr = nameOfAttribute.getValue();
        writer.beginPObject2();
        writer.write(ServerToClientModel.TYPE_ADD_HANDLER, ID);
        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numOfAttr);
        writer.write(ServerToClientModel.PHANDLER_ID, eventManager.getId() - 1);
        writer.endObject();
    }

    protected void saveUpdateAttributeCallBack(final PAttributeNames nameOfAttribute, final PCallBack value,
                                               final PEventAttributesName[] attributesNames) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        final short numOfAttr = nameOfAttribute.getValue();
        final int length = attributesNames.length;
        final Object[] atrsId = new Object[length];
        for (int index = 0; index < length; index++) {
            atrsId[index] = attributesNames[index].getValue();
        }
        writer.write(ServerToClientModel.TYPE_ADD_HANDLER, ID);
        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numOfAttr);
        writer.write(ServerToClientModel.PHANDLER_ID, eventManager.getId() - 1);
        writer.write(ServerToClientModel.PTYPE_EVENT_INFO, atrsId);
        writer.endObject();
    }

    protected void requestEventInfo(final ServerToClientModel eventInfo, final PEventAttributesName... attributesNames) {
        final ModelWriter writer = UIContext.get().getWriter();
        final int length = attributesNames.length;
        final Object[] atrsId = new Object[length];
        for (int index = 0; index < length; index++) {
            atrsId[index] = attributesNames[index].getValue();
        }
        writer.beginPObject2();
        writer.write(ServerToClientModel.PTYPE_EVENT_INFO, atrsId);
        writer.endObject();
    }

    //    protected void saveUpdateAttributeCallBackfinal PAttributeNames nameOfAttribute, final PCallBack value, final ServerToClientModel eventInfo, final PEventAttributesName... attributesNames){
    //
    //    }
    protected HandlerRegistration addHandler(final PCallBack handler) {
        if (eventManager == null) eventManager = new PEventManager();
        final HandlerRegistration handlerRegistration = eventManager.addHandler(handler);
        return handlerRegistration;
    }

    public void onClientData(final JsonObject instruction) {
        final String domHandlerType = ClientToServerModel.DOM_HANDLER_TYPE.toStringValue();
        final String handlerType = ClientToServerModel.PHANDLER_ID.toStringValue();
        if (instruction.containsKey(domHandlerType) && instruction.containsKey(handlerType)) {
            //final PAttributeNames attr = PAttributeNames.fromRawValue(instruction.getInt(domHandlerType));
            final int handlerId = instruction.getInt(handlerType);
            final PCallBack pCallBack = eventManager.getCallBack(handlerId);
            final String eventClassKey = ClientToServerModel.PEVENT_CLASS.toStringValue();
            final String eventInfoKey = ClientToServerModel.PEVENT_INFO.toStringValue();
            log.info("understand evenInfoKey?" + eventClassKey);
            log.info("understand eventClassKey" + eventInfoKey);
            PEvent event = null;
            //            if (instruction.containsKey(eventClassKey) && !instruction.containsKey(eventInfoKey)) {
            //                ((PEventHandlerNonNull) pCallBack).callback(null);
            //            }
            if (instruction.containsKey(eventClassKey) && instruction.containsKey(eventInfoKey)) {
                final String eventClass = instruction.getString(eventClassKey);
                log.info("Well Done or Not? " + eventClass);
                final JsonObject eventInfo = instruction.getJsonObject(eventInfoKey);
                for (final Object key : eventInfo.keySet()) {
                    final String keyStr = (String) key;
                    final Object keyvalue = eventInfo.get(keyStr);
                    log.info("key: " + keyStr + " value: " + keyvalue);
                }
                final PConstructionEvent pConstructionEvent = new PConstructionEvent();
                event = pConstructionEvent.constructorEvent(eventClass, eventInfo);

            }

            ((PEventHandlerNonNull) pCallBack).callback(event);
        }
    }

}
