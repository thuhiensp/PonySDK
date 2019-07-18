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
package com.ponysdk.core.ui2.background_fetch;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.fetch.PResponse;
import com.ponysdk.core.ui2.fetch.PRequest;
import com.ponysdk.core.ui2.fetch.PResponse;

public class PBackgroundFetchSettledFetch extends PBackgroundFetchFetch {
     private PResponse response;

    public PBackgroundFetchSettledFetch(PRequest request, PResponse response){
      applyInit(widgetWithArgs(), new Object[]{request, response});
    }



    public PResponse getResponse(){
      return response;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.BACKGROUND_FETCH_SETTLED_FETCH;
    }


}