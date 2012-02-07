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

package com.ponysdk.ui.terminal.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.ponysdk.ui.terminal.HandlerType;
import com.ponysdk.ui.terminal.Property;
import com.ponysdk.ui.terminal.PropertyKey;
import com.ponysdk.ui.terminal.UIBuilder;
import com.ponysdk.ui.terminal.UIService;
import com.ponysdk.ui.terminal.instruction.AddHandler;
import com.ponysdk.ui.terminal.instruction.Create;
import com.ponysdk.ui.terminal.instruction.EventInstruction;
import com.ponysdk.ui.terminal.instruction.Update;

public class PTFileUpload extends PTWidget {

    private FormPanel wrappedFormPanel;

    final FileUpload fileUpload = new FileUpload();

    @Override
    public void create(final Create create, final UIService uiService) {
        wrappedFormPanel = new FormPanel();
        init(create, uiService, wrappedFormPanel);

        wrappedFormPanel.setEncoding(FormPanel.ENCODING_MULTIPART);
        wrappedFormPanel.setMethod(FormPanel.METHOD_POST);
        final VerticalPanel panel = new VerticalPanel();
        panel.setSize("100%", "100%");
        wrappedFormPanel.setWidget(panel);
        panel.add(fileUpload);

        wrappedFormPanel.addSubmitCompleteHandler(new SubmitCompleteHandler() {

            @Override
            public void onSubmitComplete(final SubmitCompleteEvent event) {
                final EventInstruction eventInstruction = new EventInstruction(create.getObjectID(), HandlerType.SUBMIT_COMPLETE_HANDLER);
                uiService.triggerEvent(eventInstruction);
            }
        });
    }

    @Override
    public void addHandler(final AddHandler addHandler, final UIService uiService) {
        // TODO change to STRING CHANGE HANDLER
        if (HandlerType.CHANGE_HANDLER.equals(addHandler.getType())) {
            fileUpload.addChangeHandler(new ChangeHandler() {

                @Override
                public void onChange(final ChangeEvent event) {
                    final EventInstruction eventInstruction = new EventInstruction(addHandler.getObjectID(), HandlerType.CHANGE_HANDLER);
                    eventInstruction.setMainPropertyValue(PropertyKey.FILE_NAME, fileUpload.getFilename());
                    uiService.triggerEvent(eventInstruction);
                }
            });
            return;
        }

        if (HandlerType.EMBEDED_STREAM_REQUEST_HANDLER.equals(addHandler.getType())) {
            final String action = GWT.getModuleBaseURL() + "stream?" + "ponySessionID=" + UIBuilder.sessionID + "&" + PropertyKey.STREAM_REQUEST_ID.name() + "=" + addHandler.getMainProperty().getValue();
            wrappedFormPanel.setAction(action);
            wrappedFormPanel.submit();
        }

        super.addHandler(addHandler, uiService);
    }

    @Override
    public void update(final Update update, final UIService uiService) {
        final Property property = update.getMainProperty();
        final PropertyKey propertyKey = property.getKey();
        if (PropertyKey.NAME.equals(propertyKey)) {
            fileUpload.setName(property.getValue());
        } else if (PropertyKey.ENABLED.equals(propertyKey)) {
            fileUpload.setEnabled(property.getBooleanValue());
        } else {
            super.update(update, uiService);
        }
    }

    @Override
    public FormPanel cast() {
        return (FormPanel) uiObject;
    }
}
