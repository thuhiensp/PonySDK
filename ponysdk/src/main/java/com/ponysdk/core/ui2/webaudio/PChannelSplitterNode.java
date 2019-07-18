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
package com.ponysdk.core.ui2.webaudio;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PChannelSplitterNode extends PAudioNode {

    public PChannelSplitterNode(PBaseAudioContext context){
      applyInit(widgetWithArgs(), new Object[]{context});
    }

    public PChannelSplitterNode(PBaseAudioContext context, PChannelSplitterOptions options){
      applyInit(widgetWithArgs(), new Object[]{context, options});
    }




    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.CHANNEL_SPLITTER_NODE;
    }


}