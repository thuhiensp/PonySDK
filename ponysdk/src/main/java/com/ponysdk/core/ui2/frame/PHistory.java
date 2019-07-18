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
package com.ponysdk.core.ui2.frame;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.core.PJsObject;

public class PHistory extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PHistory.class);
     private Double length;
     private PJsObject state;
     private PScrollRestoration scrollRestoration;

    public PHistory() {
      applyInit(widgetNoArgs());
    }

    public void setScrollRestoration(final PScrollRestoration scrollRestoration)  {
       if (Objects.equals(this.scrollRestoration, scrollRestoration))return;
       this.scrollRestoration = scrollRestoration;
       log.info("scrollRestoration" + scrollRestoration);
       saveUpdateAttribute(PAttributeNames.SCROLL_RESTORATION,scrollRestoration);
    }

    public Double getLength(){
      return length;
    }
    public PJsObject getState(){
      return state;
    }
    public PScrollRestoration getScrollRestoration(){
      return scrollRestoration;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HISTORY;
    }


}