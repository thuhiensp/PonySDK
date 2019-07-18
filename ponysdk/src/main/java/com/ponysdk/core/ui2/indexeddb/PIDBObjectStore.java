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
import com.ponysdk.core.ui2.dom.PDOMStringList;

public class PIDBObjectStore extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PIDBObjectStore.class);
     private String name;
     private Object keyPath;
     private PDOMStringList indexNames;
     private PIDBTransaction transaction;
     private Boolean autoIncrement;

    public PIDBObjectStore() {
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
    public Object getKeyPath(){
      return keyPath;
    }
    public PDOMStringList getIndexNames(){
      return indexNames;
    }
    public PIDBTransaction getTransaction(){
      return transaction;
    }
    public Boolean getAutoIncrement(){
      return autoIncrement;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.IDB_OBJECT_STORE;
    }


}