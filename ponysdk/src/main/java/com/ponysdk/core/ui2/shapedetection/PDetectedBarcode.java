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
package com.ponysdk.core.ui2.shapedetection;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.geometry.PDOMRect;
import com.ponysdk.core.ui2.imagecapture.PPoint2D;

public class PDetectedBarcode extends PObject2 {
     private String rawValue;
     private PDOMRect boundingBox;
     private PPoint2D[] cornerPoints;

    public PDetectedBarcode() {
      applyInit(widgetNoArgs());
    }




    public String getRawValue(){
      return rawValue;
    }
    public PDOMRect getBoundingBox(){
      return boundingBox;
    }
    public PPoint2D[] getCornerPoints(){
      return cornerPoints;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.DETECTED_BARCODE;
    }


}