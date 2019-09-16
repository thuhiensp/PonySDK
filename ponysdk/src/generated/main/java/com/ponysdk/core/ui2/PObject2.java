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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import javax.json.JsonObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ponysdk.core.model.ClientToServerModel;
import com.ponysdk.core.model.ServerToClientModel;
import com.ponysdk.core.server.application.UIContext;
import com.ponysdk.core.writer.ModelWriter;

/**
 *
 */
public abstract class PObject2 {

    private static final Logger log = LoggerFactory.getLogger(PObject2.class);
    protected final int ID = UIContext.get().nextID();
    protected PWindow2 pWindow;
    protected Boolean initialized = false;
    protected Object[] argOfConstructor;
    protected Map<Integer, Consumer<?>> cbacks = new HashMap<>();
    public int cbacksSequence = 0;
    //protected PEventManager eventManager; Map<Integer, Consumer<?>> callbacks
    protected ArrayList<Object> attributes;

    protected PObject2() {
    }

    protected PObject2(final Object... argOfConstructor) {
        this.argOfConstructor = argOfConstructor;
        //((Consumer<String>)(callbacks.get(id))).accept(s); Mettre dans onclientData.
    }

    protected void applyExisting(final PWindow2 window) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_EXISTING, ID);
        log.info("Id of object is " + ID);
        final short idOfWidgetNoArgs = widgetNoArgs().getValue();
        log.info("number of leaf type is" + idOfWidgetNoArgs);
        writer.write(ServerToClientModel.POBJECT2_WINDOW_ATTACHE, window.getID());
        writer.write(ServerToClientModel.POBJECT2_CONSTRUCTOR_NONARGUMENT, idOfWidgetNoArgs);

        writer.endObject();
        UIContext.get().registerObject2Cache(this); //state hien Le. Register object when we create by PObjectCache2, ConcurrentHashMap + Garbage Collector.
        if (attributes != null) enrichforCreation();
        creatAllChild();
        initialized = true;
    }

    protected void applyInit(final PLeafTypeNoArgs widgetNoArgs) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_CREATE, ID);
        log.info("Id of object is " + ID);
        final short idOfWidgetNoArgs = widgetNoArgs.getValue();
        writer.write(ServerToClientModel.POBJECT2_CONSTRUCTOR_NONARGUMENT, idOfWidgetNoArgs);
        log.info("number of leaf type is" + idOfWidgetNoArgs);
        writer.endObject();
        UIContext.get().registerObject2Cache(this);
        if (attributes != null) enrichforCreation();
        creatAllChild();
        initialized = true;
    }

    private void enrichforCreation() {
        for (int i = 0; i < attributes.size(); i = i + 2) {
            final PAttributeNames nameOfAttribute = (PAttributeNames) attributes.get(i);
            final Object value = attributes.get(i + 1);
            saveUpdateAttribute(nameOfAttribute, value);
        }
    }

    protected void setAttribute(final PAttributeNames name, final Object value) throws IllegalArgumentException {
        if (name == null) throw new IllegalArgumentException("Setting a attribute's name null");
        //TODO if (value == null) add method to remove attribute;
        addAttribute(name, value);
        if (initialized) saveUpdateAttribute(name, value);
    }

    private void saveUpdateAttribute(final PAttributeNames name, final Object value) {
        switch (name.getType()) {
            case DOUBLE:
                saveUpdateAttribute(name, (Double) value);
                break;
            case BOOLEAN:
                saveUpdateAttribute(name, (Boolean) value);
                break;
            case STRING:
                saveUpdateAttribute(name, (String) value);
                break;
            case SHORT:
                saveUpdateAttribute(name, (Short) value);
                break;
            case PEVENT:
                saveUpdateAttribute(name, (PEvent) value);
                break;
            case POBJECT2:
                saveUpdateAttribute(name, (PObject2) value);
                break;
            case PENUM:
                saveUpdateAttribute(name, (PEnum) value);
                break;
            case PCALLBACK:
                saveUpdateAttributeCallBack(name, (AttributeCallBack) value);
                break;
            default:
                log.error("Unknown model type : {}", name.getType());
                break;
        }
    }

    private void saveUpdateAttributeCallBack(final PAttributeNames name, final AttributeCallBack value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        final short numOfAttr = name.getValue();
        writer.write(ServerToClientModel.TYPE_ADD_HANDLER, ID);
        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numOfAttr);
        final int length = value.getRequestedAttributes().length;
        if (length > 0) {
            final Object[] atrsId = new Object[length];
            for (int index = 0; index < length; index++) {
                atrsId[index] = value.getRequestedAttributes()[index].getValue();
            }
            writer.write(ServerToClientModel.PTYPE_EVENT_INFO, atrsId);
        }
        writer.endObject();
    }

    protected void creatAllChild() {
    }

    protected void applyInit(final PLeafTypeWithArgs widgetWithArgs) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        writer.write(ServerToClientModel.POBJECT2_TYPE_CREATE, ID);
        log.info("Id of object is " + ID);
        final byte idOfWidgetWithArgs = widgetWithArgs.getValue();
        writer.write(ServerToClientModel.POBJECT2_CONSTRUCTOR_ARGUMENTS, idOfWidgetWithArgs);
        log.info("number of leaf type is" + idOfWidgetWithArgs);
        writer.write(ServerToClientModel.POBJECT2_ARRAY_ARGUMENTS, argOfConstructor);
        writer.endObject();
        UIContext.get().registerObject2Cache(this);
        argOfConstructor = null;
        initialized = true;
    }

    protected void saveUpdateAttribute(final PAttributeNames nameofAttribute, final PMediaImage[] value) {
    }

    public final int getID() {
        return ID;
    }

    public PWindow2 getWindow() {
        return pWindow;
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final Double value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        saveUpdateAttributePart1(nameOfAttribute, writer);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_DOUBLE, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final String value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        saveUpdateAttributePart1(nameOfAttribute, writer);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_TEXT, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final Integer value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        saveUpdateAttributePart1(nameOfAttribute, writer);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_INT, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final Boolean value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        saveUpdateAttributePart1(nameOfAttribute, writer);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_BOOLEAN, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final Short value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        saveUpdateAttributePart1(nameOfAttribute, writer);
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_SHORT, value);
        writer.endObject();
    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final PEvent event) {

    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final PObject2[] value) {

    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final PObject2 value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        saveUpdateAttributePart1(nameOfAttribute, writer);
        writer.write(ServerToClientModel.POBJECT2_ID_OBJECT, value.getID());
        writer.endObject();

    }

    protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final PEnum value) {
        final ModelWriter writer = UIContext.get().getWriter();
        writer.beginPObject2();
        saveUpdateAttributePart1(nameOfAttribute, writer);
        final String internalValue = value.getInternalValue();
        writer.write(ServerToClientModel.POBJECT2_ATTRIBUTE_VALUE_TEXT, internalValue);
        writer.endObject();

    }

    private void saveUpdateAttributePart1(final PAttributeNames nameOfAttribute, final ModelWriter writer) {
        writer.write(ServerToClientModel.POBJECT2_TYPE_UPDATE, ID);
        log.info("Id of object is " + ID);
        final short numeOfAttr = nameOfAttribute.getValue();
        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numeOfAttr);
    }

    public void onClientData(final JsonObject instruction) {
        final String domHandlerType = ClientToServerModel.DOM_HANDLER_TYPE.toStringValue();
        if (instruction.containsKey(domHandlerType)) {
            final int handlerId = instruction.getInt(domHandlerType);
            final PAttributeNames nameOfAtr = PAttributeNames.fromRawValue(handlerId);
            final AttributeCallBack atrCallBack = (AttributeCallBack) getAttribute(nameOfAtr);
            final String eventClassKey = ClientToServerModel.PEVENT_CLASS.toStringValue();
            final String eventInfoKey = ClientToServerModel.PEVENT_INFO.toStringValue();
            PEvent event = null;
            if (instruction.containsKey(eventClassKey) && instruction.containsKey(eventInfoKey)) {
                final String eventClass = instruction.getString(eventClassKey);
                final JsonObject eventInfo = instruction.getJsonObject(eventInfoKey);
                final PConstructionEvent pConstructionEvent = new PConstructionEvent();
                event = pConstructionEvent.constructorEvent(eventClass, eventInfo);
            }

            ((PEventHandlerNonNull) atrCallBack.getCallBack()).callback(event);
        }
        final String idOfCbackMethod = ClientToServerModel.PMETHOD_CALLBACK_ID.toStringValue();
        final String methodKey = ClientToServerModel.PMETHOD_ID.toStringValue();
        final String resultKey = ClientToServerModel.RESULT.toStringValue();
        if (instruction.containsKey(idOfCbackMethod) && instruction.containsKey(methodKey) && instruction.containsKey(resultKey)) {
            final int idOfCback = instruction.getInt(idOfCbackMethod);
            final Short idOfMethod = (short) instruction.getInt(methodKey);
            final PMethodNames methodName = PMethodNames.fromRawValue(idOfMethod);
            log.info("can i arrive here: " + idOfMethod + "--" + methodName);
            final AttributeType typeReturnOfMethod = methodName.getTypeReturn();
            switch (typeReturnOfMethod) {
                case BOOLEAN: {
                    final Consumer<Boolean> cback = (Consumer<Boolean>) cbacks.get(idOfCback);
                    final Boolean result = instruction.getBoolean(resultKey);
                    log.info("can i read the result as boolean" + result);
                    cback.accept(result);
                    break;
                }
                case DOUBLE: {
                    final Consumer<Double> cback = (Consumer<Double>) cbacks.get(idOfCback);
                    final Double result = instruction.getJsonNumber(resultKey).doubleValue();
                    log.info("can i read the result as double" + result);
                    cback.accept(result);
                    break;
                }

                case STRING: {
                    final Consumer<String> cback = (Consumer<String>) cbacks.get(idOfCback);
                    final String result = instruction.getString(resultKey);
                    log.info("can i read the result as string" + result);
                    cback.accept(result);
                    break;
                }
                case SHORT: {
                    final Consumer<Short> cback = (Consumer<Short>) cbacks.get(idOfCback);
                    final Short result = (short) instruction.getInt(resultKey);
                    cback.accept(result);
                    break;
                }

                case INTEGER: {
                    final Consumer<Integer> cback = (Consumer<Integer>) cbacks.get(idOfCback);
                    final int result = instruction.getInt(resultKey);
                    cback.accept(result);
                    break;
                }
                default:
                    break;
            }

        }

    }

    //    public static void main(final String[] args) {
    //
    //        final Toto<Integer> toto = new Toto<>(Integer::toBinaryString, Integer::valueOf);
    //        toto.accept("5");
    //        final Collection<?> c = new ArrayList<String>();
    //        ((ArrayList<String>) c).add("5");
    //
    //    }

    //    private static class Toto<T> {
    //
    //        private final Consumer<T> cs;
    //        private final Function<String, T> convert;
    //
    //        public Toto(final Consumer<T> cs, final Function<String, T> convert) {
    //            this.cs = cs;
    //            this.convert = convert;
    //        }
    //
    //        void accept(final String o) {
    //            cs.accept(convert.apply(o));
    //        }
    //    }

    public final boolean attach(final PWindow2 pWindow) {
        if (this.pWindow == null && pWindow != null) {
            this.pWindow = pWindow;
            init();
            return true;
        } else if (this.pWindow != pWindow) {
            throw new IllegalAccessError(
                "Widget already attached to an other window, current window : #" + this.pWindow + ", new window : #" + pWindow);
        }

        return false;
    }

    protected void init() {
        if (initialized) return;
        else if (argOfConstructor == null) {
            applyInit(widgetNoArgs());
        } else {
            applyInit(widgetWithArgs());
        }
    }

    private void addAttribute(final PAttributeNames name, final Object value) {
        if (attributes == null) {
            attributes = new ArrayList<>();
        }
        addAttribute(name, value, attributes.size());

    }

    private void addAttribute(final PAttributeNames name, final Object value, final int size) {
        for (int i = 0; i < size; i = i + 2) {
            final Object object = attributes.get(i);
            if (object.equals(name)) {
                attributes.set(i + 1, value);
                return;
            }
        }
        //if not found, append
        attributes.add(name);
        attributes.add(value);

    }

    protected Object getAttribute(final PAttributeNames name) {
        if (attributes != null) {
            for (int i = 0; i < attributes.size(); i = i + 2) {
                final Object object = attributes.get(i);
                if (object.equals(name)) {
                    return attributes.get(i + 1);
                }
            }
        }
        return null;
    }

    protected abstract PLeafTypeNoArgs widgetNoArgs();

    protected abstract PLeafTypeWithArgs widgetWithArgs();

}

//private void saveUpdateAttribute1(final PAttributeNames name, final Object value) {
//    if (value instanceof Integer) saveUpdateAttribute(name, (Integer) value);
//    else if (value instanceof Double) saveUpdateAttribute(name, (Double) value);
//    else if (value instanceof Boolean) saveUpdateAttribute(name, (Boolean) value);
//    else if (value instanceof String) saveUpdateAttribute(name, (String) value);
//    else if (value instanceof Short) saveUpdateAttribute(name, (Short) value);
//    else if (value instanceof Object[]) saveUpadateAttribute(name, (Object[]) value);
//    else if (value instanceof PCallBack) saveUpdateAttributeCallBack(name, (PCallBack) value);
//    else if (value instanceof AttributeCallBack) saveUpdateAttributeCallBack(name, (AttributeCallBack) value);
//    else throw new IllegalArgumentException("");
//}

//private void saveUpadateAttribute(final PAttributeNames nameOfAttribute, final Object[] value) {
//    final ModelWriter writer = UIContext.get().getWriter();
//    writer.beginPObject2();
//    writer.write(ServerToClientModel.POBJECT2_TYPE_UPDATE, ID);
//    log.info("Id of object is " + ID);
//    final short numeOfAttr = nameOfAttribute.getValue();
//    writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numeOfAttr);
//    writer.write(ServerToClientModel.POBJECT2_ARRAY_ARGUMENTS, value);
//    writer.endObject();
//}
//protected void requestEventInfo(final ServerToClientModel eventInfo, final PEventAttributesName... attributesNames) {
//        final ModelWriter writer = UIContext.get().getWriter();
//        final int length = attributesNames.length;
//        final Object[] atrsId = new Object[length];
//        for (int index = 0; index < length; index++) {
//            atrsId[index] = attributesNames[index].getValue();
//        }
//        writer.beginPObject2();
//        writer.write(ServerToClientModel.PTYPE_EVENT_INFO, atrsId);
//        writer.endObject();
//    }

//    protected void saveUpdateAttributeCallBackfinal PAttributeNames nameOfAttribute, final PCallBack value, final ServerToClientModel eventInfo, final PEventAttributesName... attributesNames){
//
//    }
//    protected HandlerRegistration addHandler(final PCallBack handler) {
//        if (eventManager == null) eventManager = new PEventManager();
//        final HandlerRegistration handlerRegistration = eventManager.addHandler(handler);
//        return handlerRegistration;
//    }

//    public void onClientData2(final JsonObject instruction) {
//        final String domHandlerType = ClientToServerModel.DOM_HANDLER_TYPE.toStringValue();
//        final String handlerType = ClientToServerModel.PHANDLER_ID.toStringValue();
//        if (instruction.containsKey(domHandlerType) && instruction.containsKey(handlerType)) {
//            //final PAttributeNames attr = PAttributeNames.fromRawValue(instruction.getInt(domHandlerType));
//            final int handlerId = instruction.getInt(handlerType);
//            final PCallBack pCallBack = eventManager.getCallBack(handlerId);
//            final String eventClassKey = ClientToServerModel.PEVENT_CLASS.toStringValue();
//            final String eventInfoKey = ClientToServerModel.PEVENT_INFO.toStringValue();
//            log.info("understand evenInfoKey?" + eventClassKey);
//            log.info("understand eventClassKey" + eventInfoKey);
//            PEvent event = null;
//            if (instruction.containsKey(eventClassKey) && instruction.containsKey(eventInfoKey)) {
//                final String eventClass = instruction.getString(eventClassKey);
//                log.info("Well Done or Not? " + eventClass);
//                final JsonObject eventInfo = instruction.getJsonObject(eventInfoKey);
//                for (final Object key : eventInfo.keySet()) {
//                    final String keyStr = (String) key;
//                    final Object keyvalue = eventInfo.get(keyStr);
//                    log.info("key: " + keyStr + " value: " + keyvalue);
//                }
//                final PConstructionEvent pConstructionEvent = new PConstructionEvent();
//                event = pConstructionEvent.constructorEvent(eventClass, eventInfo);
//
//            }
//
//            ((PEventHandlerNonNull) pCallBack).callback(event);
//        }
//    }
//protected void saveUpdateAttribute(final PAttributeNames nameOfAttribute, final PCallBack value) {
//        final ModelWriter writer = UIContext.get().getWriter();
//        final short numOfAttr = nameOfAttribute.getValue();
//        writer.beginPObject2();
//        writer.write(ServerToClientModel.TYPE_ADD_HANDLER, ID);
//        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numOfAttr);
//        writer.write(ServerToClientModel.PHANDLER_ID, eventManager.getId() - 1);
//        writer.endObject();
//    }

//    protected void saveUpdateAttributeCallBack(final PAttributeNames nameOfAttribute, final PCallBack value,
//                                               final PEventAttributesName[] attributesNames) {
//        final ModelWriter writer = UIContext.get().getWriter();
//        writer.beginPObject2();
//        final short numOfAttr = nameOfAttribute.getValue();
//        final int length = attributesNames.length;
//        final Object[] atrsId = new Object[length];
//        for (int index = 0; index < length; index++) {
//            atrsId[index] = attributesNames[index].getValue();
//        }
//        writer.write(ServerToClientModel.TYPE_ADD_HANDLER, ID);
//        writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numOfAttr);
//        writer.write(ServerToClientModel.PHANDLER_ID, eventManager.getId() - 1);
//        writer.write(ServerToClientModel.PTYPE_EVENT_INFO, atrsId);
//        writer.endObject();
//    }
//                for (final Object key : eventInfo.keySet()) { //for verify info are good.
//                    final String keyStr = (String) key;
//                    final Object keyvalue = eventInfo.get(keyStr);
//                    log.info("key: " + keyStr + " value: " + keyvalue);
//                }
//protected void saveUpdateAttributeCallBack(final PAttributeNames nameOfAttribute, final PCallBack value,
//final PEventAttributesName... attributesNames) {
//final ModelWriter writer = UIContext.get().getWriter();
//writer.beginPObject2();
//final short numOfAttr = nameOfAttribute.getValue();
//final int length = attributesNames.length;
//final Object[] atrsId = new Object[length];
//for (int index = 0; index < length; index++) {
//atrsId[index] = attributesNames[index].getValue();
//}
//writer.write(ServerToClientModel.TYPE_ADD_HANDLER, ID);
//writer.write(ServerToClientModel.POBJECT2_NUM_ATTRIBUTE, numOfAttr);
//writer.write(ServerToClientModel.PTYPE_EVENT_INFO, atrsId);
//writer.endObject();
//}

//public void onClientData(final JsonObject instruction) {
//    final String domHandlerType = ClientToServerModel.DOM_HANDLER_TYPE.toStringValue();
//    if (instruction.containsKey(domHandlerType)) {
//        final int handlerId = instruction.getInt(domHandlerType);
//        final PAttributeNames nameOfAtr = PAttributeNames.fromRawValue(handlerId);
//        final AttributeCallBack atrCallBack = (AttributeCallBack) getAttribute(nameOfAtr);
//        final String eventClassKey = ClientToServerModel.PEVENT_CLASS.toStringValue();
//        final String eventInfoKey = ClientToServerModel.PEVENT_INFO.toStringValue();
//        PEvent event = null;
//        if (instruction.containsKey(eventClassKey) && instruction.containsKey(eventInfoKey)) {
//            final String eventClass = instruction.getString(eventClassKey);
//            final JsonObject eventInfo = instruction.getJsonObject(eventInfoKey);
//            final PConstructionEvent pConstructionEvent = new PConstructionEvent();
//            event = pConstructionEvent.constructorEvent(eventClass, eventInfo);
//        }
//
//        ((PEventHandlerNonNull) atrCallBack.getCallBack()).callback(event);
//    }
//    final String idOfCbackMethod = ClientToServerModel.PMETHOD_CALLBACK.toStringValue();
//    log.info("id of callBackMethod" + idOfCbackMethod);
//    final String resultkey = ClientToServerModel.RESULT.toStringValue();
//    log.info("id of resultkey" + resultkey);
//    log.info("can i read id of cbackmethod" + instruction.containsKey(idOfCbackMethod));
//    log.info("can i read resultkey" + instruction.containsKey(resultkey));
//    if (instruction.containsKey(idOfCbackMethod) && instruction.containsKey(resultkey)) {
//        log.info("we can arrive here?");
//        final int idOfCback = instruction.getInt(idOfCbackMethod);
//        log.info("id of call back?" + idOfCback);
//        //            final Consumer<Object> cback = (Consumer<Object>) this.cbacks.get(idOfCback);
//        //            cback.accept("5");
//        final Consumer<?> cback = this.cbacks.get(idOfCback);
//        Method method;
//        try {
//            method = this.getClass().getMethod("contains", Consumer.class, PNode.class);
//            final Type[] genericParameterTypes = method.getGenericParameterTypes();
//            if (genericParameterTypes[0] instanceof ParameterizedType) {
//                final ParameterizedType atype = (ParameterizedType) genericParameterTypes[0];
//                final Type typeOfConsumer = atype.getActualTypeArguments()[0];
//                if (typeOfConsumer.equals(Boolean.class)) {
//                    final Boolean result = instruction.getBoolean(resultkey);
//                    ((Consumer<Boolean>) cback).accept(result);
//
//                }
//
//            }
//        } catch (final NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (final SecurityException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
//
