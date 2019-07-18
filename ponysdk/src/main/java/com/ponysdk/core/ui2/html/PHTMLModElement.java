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

public class PHTMLModElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLModElement.class);
     private String cite;
     private String dateTime;

    public PHTMLModElement() {
      applyInit(widgetNoArgs());
    }

    public void setCite(final String cite)  {
       if (Objects.equals(this.cite, cite))return;
       this.cite = cite;
       log.info("cite" + cite);
       saveUpdateAttribute(PAttributeNames.CITE,cite);
    }
    public void setDateTime(final String dateTime)  {
       if (Objects.equals(this.dateTime, dateTime))return;
       this.dateTime = dateTime;
       log.info("dateTime" + dateTime);
       saveUpdateAttribute(PAttributeNames.DATE_TIME,dateTime);
    }

    public String getCite(){
      return cite;
    }
    public String getDateTime(){
      return dateTime;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_MOD_ELEMENT;
    }


}