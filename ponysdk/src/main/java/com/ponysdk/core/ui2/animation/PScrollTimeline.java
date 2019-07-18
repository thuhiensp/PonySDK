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
package com.ponysdk.core.ui2.animation;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.dom.PElement;
import com.ponysdk.core.ui2.uniontype.PDoubleOrString;

public class PScrollTimeline extends PAnimationTimeline {
     private PElement scrollSource;
     private PDoubleOrString timeRange;
     private PScrollDirection orientation;

    public PScrollTimeline() {
      applyInit(widgetNoArgs());
    }


    public PScrollTimeline(PScrollTimelineOptions options){
      applyInit(widgetWithArgs(), new Object[]{options});
    }



    public PElement getScrollSource(){
      return scrollSource;
    }
    public PDoubleOrString getTimeRange(){
      return timeRange;
    }
    public PScrollDirection getOrientation(){
      return orientation;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SCROLL_TIMELINE;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.SCROLL_TIMELINE;
    }


}