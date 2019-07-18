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

package com.ponysdk.core.terminal.ui;

import java.util.logging.Logger;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.TextBox;
import com.ponysdk.core.model.ClientToServerModel;
import com.ponysdk.core.model.ServerToClientModel;
import com.ponysdk.core.terminal.UIBuilder;
import com.ponysdk.core.terminal.instruction.PTInstruction;
import com.ponysdk.core.terminal.model.BinaryModel;
import com.ponysdk.core.terminal.model.ReaderBuffer;

/**
 *
 */
public class PTInput extends PTWidget<TextBox> {

    private String text;

    private static final Logger log = Logger.getLogger(PTInput.class.getName());

    @Override
    protected TextBox createUIObject() {
        return new TextBox();
    }

    @Override
    public void create(final ReaderBuffer buffer, final int objectId, final UIBuilder uiBuilder) {
        super.create(buffer, objectId, uiBuilder);
        uiObject.addValueChangeHandler(event -> {
            this.text = event.getValue();
            log.info("the current value of input: " + getClass() + " &&&" + text);
            final PTInstruction eventInstruction = new PTInstruction(getObjectID());
            eventInstruction.put(ClientToServerModel.HANDLER_STRING_VALUE_CHANGE, text); //-->change the value text of input
            uiBuilder.sendDataToServer(uiObject, eventInstruction); //--> sent the change to server.
            //Lambda function: implement interface valueChangeHandle, that has a method "void onValueChange(ValueChangeEvent )", so "event " in this case is ValueChangeEvent
        });
    }

    @Override
    public boolean update(final ReaderBuffer buffer, final BinaryModel binaryModel) {
        final ServerToClientModel model = binaryModel.getModel();
        if (ServerToClientModel.TEXT == model) {
            final String value = binaryModel.getStringValue();
            setText(uiObject.getElement(), value);
            log.info("Update client: " + getClass() + " &&&" + value);
            return true;
        } else {
            text = binaryModel.getStringValue();
            return super.update(buffer, binaryModel);
        }
    }

    protected static final native void setText(Element element, String text) /*-{
                                                                             element.value = text;
                                                                             }-*/;
}
