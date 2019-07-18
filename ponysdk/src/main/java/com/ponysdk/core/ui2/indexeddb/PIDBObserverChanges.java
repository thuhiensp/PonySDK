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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PIDBObserverChanges extends PObject2 {
     private PIDBDatabase database;
     private PIDBTransaction transaction;
     private Object records;

    public PIDBObserverChanges() {
      applyInit(widgetNoArgs());
    }


    public PIDBDatabase getDatabase(){
      return database;
    }
    public PIDBTransaction getTransaction(){
      return transaction;
    }
    public Object getRecords(){
      return records;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.IDB_OBSERVER_CHANGES;
    }


}