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
package com.ponysdk.core.ui2.webgl;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.uniontype.PVRSource;

public class PWebGL2RenderingContext extends PObject2 {
     private PVRSource canvas;
     private Double drawingBufferWidth;
     private Double drawingBufferHeight;

    public PWebGL2RenderingContext() {
      applyInit(widgetNoArgs());
    }


    public PVRSource getCanvas(){
      return canvas;
    }
    public Double getDrawingBufferWidth(){
      return drawingBufferWidth;
    }
    public Double getDrawingBufferHeight(){
      return drawingBufferHeight;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.WEBGL2_RENDERING_CONTEXT;
    }


}