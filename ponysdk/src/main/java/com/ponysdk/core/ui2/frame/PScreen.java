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
package com.ponysdk.core.ui2.frame;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.screen_orientation.PScreenOrientation;

public class PScreen extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PScreen.class);
     private Double availWidth;
     private Double availHeight;
     private Double width;
     private Double height;
     private Double colorDepth;
     private Double pixelDepth;
     private Double availLeft;
     private Double availTop;
     private PScreenOrientation orientation;
     private Boolean keepAwake;

    public PScreen() {
      applyInit(widgetNoArgs());
    }

    public void setKeepAwake(final Boolean keepAwake)  {
       if (Objects.equals(this.keepAwake, keepAwake))return;
       this.keepAwake = keepAwake;
       log.info("keepAwake" + keepAwake);
       saveUpdateAttribute(PAttributeNames.KEEP_AWAKE,keepAwake);
    }

    public Double getAvailWidth(){
      return availWidth;
    }
    public Double getAvailHeight(){
      return availHeight;
    }
    public Double getWidth(){
      return width;
    }
    public Double getHeight(){
      return height;
    }
    public Double getColorDepth(){
      return colorDepth;
    }
    public Double getPixelDepth(){
      return pixelDepth;
    }
    public Double getAvailLeft(){
      return availLeft;
    }
    public Double getAvailTop(){
      return availTop;
    }
    public PScreenOrientation getOrientation(){
      return orientation;
    }
    public Boolean getKeepAwake(){
      return keepAwake;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.SCREEN;
    }


}