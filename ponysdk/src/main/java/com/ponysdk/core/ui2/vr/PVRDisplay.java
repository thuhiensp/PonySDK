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
package com.ponysdk.core.ui2.vr;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.events.PEventTarget;

public class PVRDisplay extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PVRDisplay.class);
     private Double displayId;
     private String displayName;
     private Boolean isPresenting;
     private PVRDisplayCapabilities capabilities;
     private PVRStageParameters stageParameters;
     private Double depthNear;
     private Double depthFar;

    public PVRDisplay() {
      applyInit(widgetNoArgs());
    }

    public void setDepthNear(final Double depthNear)  {
       if (Objects.equals(this.depthNear, depthNear))return;
       this.depthNear = depthNear;
       log.info("depthNear" + depthNear);
       saveUpdateAttribute(PAttributeNames.DEPTH_NEAR,depthNear);
    }
    public void setDepthFar(final Double depthFar)  {
       if (Objects.equals(this.depthFar, depthFar))return;
       this.depthFar = depthFar;
       log.info("depthFar" + depthFar);
       saveUpdateAttribute(PAttributeNames.DEPTH_FAR,depthFar);
    }

    public Double getDisplayId(){
      return displayId;
    }
    public String getDisplayName(){
      return displayName;
    }
    public Boolean getIsPresenting(){
      return isPresenting;
    }
    public PVRDisplayCapabilities getCapabilities(){
      return capabilities;
    }
    public PVRStageParameters getStageParameters(){
      return stageParameters;
    }
    public Double getDepthNear(){
      return depthNear;
    }
    public Double getDepthFar(){
      return depthFar;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.VR_DISPLAY;
    }


}