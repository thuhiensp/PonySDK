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
package com.ponysdk.core.ui2.dom;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.css.PStyleSheetList;

public class PDocumentOrShadowRoot extends PObject2 {
     private PElement activeElement;
     private PStyleSheetList styleSheets;
     private PElement pointerLockElement;
     private PElement fullscreenElement;

    public PDocumentOrShadowRoot() {
      applyInit(widgetNoArgs());
    }


    public PElement getActiveElement(){
      return activeElement;
    }
    public PStyleSheetList getStyleSheets(){
      return styleSheets;
    }
    public PElement getPointerLockElement(){
      return pointerLockElement;
    }
    public PElement getFullscreenElement(){
      return fullscreenElement;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.DOCUMENT_OR_SHADOW_ROOT;
    }


}