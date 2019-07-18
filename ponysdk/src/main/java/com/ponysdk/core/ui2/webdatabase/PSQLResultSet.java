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
package com.ponysdk.core.ui2.webdatabase;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PSQLResultSet extends PObject2 {
     private PSQLResultSetRowList rows;
     private Double insertId;
     private Double rowsAffected;

    public PSQLResultSet() {
      applyInit(widgetNoArgs());
    }


    public PSQLResultSetRowList getRows(){
      return rows;
    }
    public Double getInsertId(){
      return insertId;
    }
    public Double getRowsAffected(){
      return rowsAffected;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SQL_RESULT_SET;
    }


}