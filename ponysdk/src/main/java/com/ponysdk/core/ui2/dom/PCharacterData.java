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

public abstract class PCharacterData extends PNode {
    private static final Logger log = LoggerFactory.getLogger(PCharacterData.class);
     private String data;
     private Double length;
     private PElement previousElementSibling;
     private PElement nextElementSibling;

    public void setData(final String data)  {
       if (Objects.equals(this.data, data))return;
       this.data = data;
       log.info("data" + data);
       saveUpdateAttribute(PAttributeNames.DATA,data);
    }

    public String getData(){
      return data;
    }
    public Double getLength(){
      return length;
    }
    public PElement getPreviousElementSibling(){
      return previousElementSibling;
    }
    public PElement getNextElementSibling(){
      return nextElementSibling;
    }


}