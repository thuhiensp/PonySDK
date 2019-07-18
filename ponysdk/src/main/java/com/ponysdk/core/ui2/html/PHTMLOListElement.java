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

public class PHTMLOListElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLOListElement.class);
     private Boolean reversed;
     private Double start;
     private String type;
     private Boolean compact;

    public PHTMLOListElement() {
      applyInit(widgetNoArgs());
    }

    public void setReversed(final Boolean reversed)  {
       if (Objects.equals(this.reversed, reversed))return;
       this.reversed = reversed;
       log.info("reversed" + reversed);
       saveUpdateAttribute(PAttributeNames.REVERSED,reversed);
    }
    public void setStart(final Double start)  {
       if (Objects.equals(this.start, start))return;
       this.start = start;
       log.info("start" + start);
       saveUpdateAttribute(PAttributeNames.START,start);
    }
    public void setType(final String type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
    }
    public void setCompact(final Boolean compact)  {
       if (Objects.equals(this.compact, compact))return;
       this.compact = compact;
       log.info("compact" + compact);
       saveUpdateAttribute(PAttributeNames.COMPACT,compact);
    }

    public Boolean getReversed(){
      return reversed;
    }
    public Double getStart(){
      return start;
    }
    public String getType(){
      return type;
    }
    public Boolean getCompact(){
      return compact;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTMLO_LIST_ELEMENT;
    }


}