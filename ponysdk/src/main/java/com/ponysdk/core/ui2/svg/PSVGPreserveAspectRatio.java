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
package com.ponysdk.core.ui2.svg;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PSVGPreserveAspectRatio extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PSVGPreserveAspectRatio.class);
     private Short align;
     private Short meetOrSlice;

    public PSVGPreserveAspectRatio() {
      applyInit(widgetNoArgs());
    }

    public void setAlign(final Short align)  {
       if (Objects.equals(this.align, align))return;
       this.align = align;
       log.info("align" + align);
       saveUpdateAttribute(PAttributeNames.ALIGN,align);
    }
    public void setMeetOrSlice(final Short meetOrSlice)  {
       if (Objects.equals(this.meetOrSlice, meetOrSlice))return;
       this.meetOrSlice = meetOrSlice;
       log.info("meetOrSlice" + meetOrSlice);
       saveUpdateAttribute(PAttributeNames.MEET_OR_SLICE,meetOrSlice);
    }

    public Short getAlign(){
      return align;
    }
    public Short getMeetOrSlice(){
      return meetOrSlice;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SVG_PRESERVE_ASPECT_RATIO;
    }


}