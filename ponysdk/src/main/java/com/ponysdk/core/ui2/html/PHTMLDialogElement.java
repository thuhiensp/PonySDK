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
package com.ponysdk.core.ui2.html;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PHTMLDialogElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLDialogElement.class);
     private Boolean open;
     private String returnValue;

    public PHTMLDialogElement() {
      applyInit(widgetNoArgs());
    }

    public void setOpen(final Boolean open)  {
       if (Objects.equals(this.open, open))return;
       this.open = open;
       log.info("open" + open);
       saveUpdateAttribute(PAttributeNames.OPEN,open);
    }
    public void setReturnValue(final String returnValue)  {
       if (Objects.equals(this.returnValue, returnValue))return;
       this.returnValue = returnValue;
       log.info("returnValue" + returnValue);
       saveUpdateAttribute(PAttributeNames.RETURN_VALUE,returnValue);
    }

    public Boolean getOpen(){
      return open;
    }
    public String getReturnValue(){
      return returnValue;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_DIALOG_ELEMENT;
    }


}