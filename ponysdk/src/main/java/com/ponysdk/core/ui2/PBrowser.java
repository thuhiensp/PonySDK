/*
 * Copyright 2019 SmartTrade Technologies
 *     Pony SDK
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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.core.PJSONImpl;
import com.ponysdk.core.ui2.core.PMath;
import com.ponysdk.core.ui2.frame.PConsole;
import com.ponysdk.core.ui2.frame.PLocation;
import com.ponysdk.core.ui2.frame.PNavigator;
import com.ponysdk.core.ui2.frame.PWindow;
import com.ponysdk.core.ui2.html.PHTMLDocument;

public class PBrowser extends PObject2 {
    private static PNavigator navigator;
    private static PWindow window;
    private static PHTMLDocument document;
    private static PLocation location;
    private static PWindow self;
    private static PWindow top;
    private static PConsole console;
    private static Double Infinity;
    private static Double NaN;
    private static Object undefined;
    private static PMath JsMath;
    private static PJSONImpl JSON;

    public PBrowser() {
      applyInit(widgetNoArgs());
    }



    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.BROWSER;
    }


}