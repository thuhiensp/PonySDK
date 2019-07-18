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
package com.ponysdk.core.ui2.indexeddb;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PIDBIndex extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PIDBIndex.class);
     private String name;
     private PIDBObjectStore objectStore;
     private Object keyPath;
     private Boolean multiEntry;
     private Boolean unique;

    public PIDBIndex() {
      applyInit(widgetNoArgs());
    }

    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }

    public String getName(){
      return name;
    }
    public PIDBObjectStore getObjectStore(){
      return objectStore;
    }
    public Object getKeyPath(){
      return keyPath;
    }
    public Boolean getMultiEntry(){
      return multiEntry;
    }
    public Boolean getUnique(){
      return unique;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.IDB_INDEX;
    }


}