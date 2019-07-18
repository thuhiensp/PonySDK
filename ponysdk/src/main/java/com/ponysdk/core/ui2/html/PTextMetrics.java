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
package com.ponysdk.core.ui2.html;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PTextMetrics extends PObject2 {
     private Double width;
     private Double actualBoundingBoxLeft;
     private Double actualBoundingBoxRight;
     private Double fontBoundingBoxAscent;
     private Double fontBoundingBoxDescent;
     private Double actualBoundingBoxAscent;
     private Double actualBoundingBoxDescent;
     private Double emHeightAscent;
     private Double emHeightDescent;
     private Double hangingBaseline;
     private Double alphabeticBaseline;
     private Double ideographicBaseline;

    public PTextMetrics() {
      applyInit(widgetNoArgs());
    }


    public Double getWidth(){
      return width;
    }
    public Double getActualBoundingBoxLeft(){
      return actualBoundingBoxLeft;
    }
    public Double getActualBoundingBoxRight(){
      return actualBoundingBoxRight;
    }
    public Double getFontBoundingBoxAscent(){
      return fontBoundingBoxAscent;
    }
    public Double getFontBoundingBoxDescent(){
      return fontBoundingBoxDescent;
    }
    public Double getActualBoundingBoxAscent(){
      return actualBoundingBoxAscent;
    }
    public Double getActualBoundingBoxDescent(){
      return actualBoundingBoxDescent;
    }
    public Double getEmHeightAscent(){
      return emHeightAscent;
    }
    public Double getEmHeightDescent(){
      return emHeightDescent;
    }
    public Double getHangingBaseline(){
      return hangingBaseline;
    }
    public Double getAlphabeticBaseline(){
      return alphabeticBaseline;
    }
    public Double getIdeographicBaseline(){
      return ideographicBaseline;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.TEXT_METRICS;
    }


}