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
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.css.PStyleSheetList;

public class PShadowRoot extends PDocumentFragment {
    private static final Logger log = LoggerFactory.getLogger(PShadowRoot.class);
     private PElement host;
     private PShadowRoot olderShadowRoot;
     private String innerHTML;
     private Boolean delegatesFocus;
     private PElement activeElement;
     private PStyleSheetList styleSheets;
     private PElement pointerLockElement;
     private PElement fullscreenElement;
     private PShadowRootMode mode;

    private PShadowRoot(){
}

    public void setInnerHTML(final String innerHTML)  {
       if (Objects.equals(this.innerHTML, innerHTML))return;
       this.innerHTML = innerHTML;
       log.info("innerHTML" + innerHTML);
       saveUpdateAttribute(PAttributeNames.INNERHTML,innerHTML);
    }

    public PElement getHost(){
      return host;
    }
    public PShadowRoot getOlderShadowRoot(){
      return olderShadowRoot;
    }
    public String getInnerHTML(){
      return innerHTML;
    }
    public Boolean getDelegatesFocus(){
      return delegatesFocus;
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
    public PShadowRootMode getMode(){
      return mode;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SHADOW_ROOT;
    }


}