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
package com.ponysdk.core.ui2.serviceworkers;
import com.ponysdk.core.ui2.PEventAttributesName;
import java.util.HashMap;
import java.util.Map;
import com.ponysdk.core.ui2.events.PEvent;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PInstallEvent extends PExtendableEvent {
    public PInstallEvent(final Map<PEventAttributesName, Object> mapValueByAttributeName){
       super(mapValueByAttributeName);
    }



}