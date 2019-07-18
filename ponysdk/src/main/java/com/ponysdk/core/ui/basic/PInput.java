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

package com.ponysdk.core.ui.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.json.JsonObject;

import com.ponysdk.core.model.ClientToServerModel;
import com.ponysdk.core.model.ServerToClientModel;
import com.ponysdk.core.model.WidgetType;
import com.ponysdk.core.ui.basic.event.PValueChangeEvent;
import com.ponysdk.core.ui.basic.event.PValueChangeHandler;
import com.ponysdk.core.writer.ModelWriter;

/**
 *
 */
public class PInput extends PWidget {

    private final List<PValueChangeHandler<String>> handlers = new ArrayList<>();
    protected String text;
    //private static final Logger log = Logger.getLogger(PTInput.class.getName());

    public PInput() {
        text = "Enjoy";
    }

    public PInput(final String text) {
        this.text = text;
    }

    public void setText(final String text) {
        if (Objects.equals(this.text, text)) return;
        this.text = text;
        if (initialized) saveUpdate(ServerToClientModel.TEXT, this.text);
    }

    public String getText() {
        return text;
    }

    public void ajoutHandler(final PValueChangeHandler<String> handler) {
        handlers.add(handler);
    }

    @Override
    protected void enrichForCreation(final ModelWriter writer) {
        super.enrichForCreation(writer);
        writer.write(ServerToClientModel.TEXT, text);
        System.out.println("Server enrichForCreation " + text);

    }

    @Override
    protected void enrichForUpdate(final ModelWriter writer) {
        super.enrichForUpdate(writer);
        if (this.text != null) writer.write(ServerToClientModel.TEXT, this.text);
        System.out.println("Server enricheForUpdate " + text);

    }

    @Override
    public void onClientData(final JsonObject instruction) {
        if (!isVisible()) return;
        if (instruction.containsKey(ClientToServerModel.HANDLER_STRING_VALUE_CHANGE.toStringValue())) {
            final String value = instruction.getString(ClientToServerModel.HANDLER_STRING_VALUE_CHANGE.toStringValue());
            System.out.println("Check change: " + value);
            text = value;
            for (final PValueChangeHandler<String> handler : handlers) {
                handler.onValueChange(new PValueChangeEvent<>(this, text));
            }
            System.out.println("size of handlers is: " + handlers.size());

        } else {
            super.onClientData(instruction);
        }
    }

    @Override
    protected String dumpDOM() {
        return "<input class=\"" + getStyleNames().collect(Collectors.joining(" ")) + "\">" + text + "</input>";
    }

    @Override
    protected WidgetType getWidgetType() {
        return WidgetType.INPUT;
    }

}
