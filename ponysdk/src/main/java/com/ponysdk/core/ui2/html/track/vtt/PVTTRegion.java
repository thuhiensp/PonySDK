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
package com.ponysdk.core.ui2.html.track.vtt;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PVTTRegion extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PVTTRegion.class);
     private Double width;
     private Double lines;
     private Double regionAnchorX;
     private Double regionAnchorY;
     private Double viewportAnchorX;
     private Double viewportAnchorY;
     private PScrollSetting scroll;

    public PVTTRegion() {
      applyInit(widgetNoArgs());
    }



    public void setWidth(final Double width)  {
       if (Objects.equals(this.width, width))return;
       this.width = width;
       log.info("width" + width);
       saveUpdateAttribute(PAttributeNames.WIDTH,width);
    }
    public void setLines(final Double lines)  {
       if (Objects.equals(this.lines, lines))return;
       this.lines = lines;
       log.info("lines" + lines);
       saveUpdateAttribute(PAttributeNames.LINES,lines);
    }
    public void setRegionAnchorX(final Double regionAnchorX)  {
       if (Objects.equals(this.regionAnchorX, regionAnchorX))return;
       this.regionAnchorX = regionAnchorX;
       log.info("regionAnchorX" + regionAnchorX);
       saveUpdateAttribute(PAttributeNames.REGION_ANCHORX,regionAnchorX);
    }
    public void setRegionAnchorY(final Double regionAnchorY)  {
       if (Objects.equals(this.regionAnchorY, regionAnchorY))return;
       this.regionAnchorY = regionAnchorY;
       log.info("regionAnchorY" + regionAnchorY);
       saveUpdateAttribute(PAttributeNames.REGION_ANCHORY,regionAnchorY);
    }
    public void setViewportAnchorX(final Double viewportAnchorX)  {
       if (Objects.equals(this.viewportAnchorX, viewportAnchorX))return;
       this.viewportAnchorX = viewportAnchorX;
       log.info("viewportAnchorX" + viewportAnchorX);
       saveUpdateAttribute(PAttributeNames.VIEWPORT_ANCHORX,viewportAnchorX);
    }
    public void setViewportAnchorY(final Double viewportAnchorY)  {
       if (Objects.equals(this.viewportAnchorY, viewportAnchorY))return;
       this.viewportAnchorY = viewportAnchorY;
       log.info("viewportAnchorY" + viewportAnchorY);
       saveUpdateAttribute(PAttributeNames.VIEWPORT_ANCHORY,viewportAnchorY);
    }
    public void setScroll(final PScrollSetting scroll)  {
       if (Objects.equals(this.scroll, scroll))return;
       this.scroll = scroll;
       log.info("scroll" + scroll);
       saveUpdateAttribute(PAttributeNames.SCROLL,scroll);
    }

    public Double getWidth(){
      return width;
    }
    public Double getLines(){
      return lines;
    }
    public Double getRegionAnchorX(){
      return regionAnchorX;
    }
    public Double getRegionAnchorY(){
      return regionAnchorY;
    }
    public Double getViewportAnchorX(){
      return viewportAnchorX;
    }
    public Double getViewportAnchorY(){
      return viewportAnchorY;
    }
    public PScrollSetting getScroll(){
      return scroll;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.VTT_REGION;
    }


}