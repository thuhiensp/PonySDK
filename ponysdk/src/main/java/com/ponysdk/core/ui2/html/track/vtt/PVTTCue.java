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
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.html.track.PTextTrackCue;
import com.ponysdk.core.ui2.uniontype.PDoubleOrString;

public class PVTTCue extends PTextTrackCue {
    private static final Logger log = LoggerFactory.getLogger(PVTTCue.class);
     private PVTTRegion region;
     private Boolean snapToLines;
     private PDoubleOrString line;
     private PDoubleOrString position;
     private Double size;
     private String text;
     private PDirectionSetting vertical;
     private PAlignSetting align;

    public PVTTCue(Double startTime, Double endTime, String text){
      applyInit(widgetWithArgs(), new Object[]{startTime, endTime, text});
    }


    public void setRegion(final PVTTRegion region)  {
       if (Objects.equals(this.region, region))return;
       this.region = region;
       log.info("region" + region);
       saveUpdateAttribute(PAttributeNames.REGION,region);
    }
    public void setSnapToLines(final Boolean snapToLines)  {
       if (Objects.equals(this.snapToLines, snapToLines))return;
       this.snapToLines = snapToLines;
       log.info("snapToLines" + snapToLines);
       saveUpdateAttribute(PAttributeNames.SNAP_TO_LINES,snapToLines);
    }
    public void setLine(final PDoubleOrString line)  {
       if (Objects.equals(this.line, line))return;
       this.line = line;
       log.info("line" + line);
       saveUpdateAttribute(PAttributeNames.LINE,line);
    }
    public void setPosition(final PDoubleOrString position)  {
       if (Objects.equals(this.position, position))return;
       this.position = position;
       log.info("position" + position);
       saveUpdateAttribute(PAttributeNames.POSITION,position);
    }
    public void setSize(final Double size)  {
       if (Objects.equals(this.size, size))return;
       this.size = size;
       log.info("size" + size);
       saveUpdateAttribute(PAttributeNames.SIZE,size);
    }
    public void setText(final String text)  {
       if (Objects.equals(this.text, text))return;
       this.text = text;
       log.info("text" + text);
       saveUpdateAttribute(PAttributeNames.TEXT,text);
    }
    public void setVertical(final PDirectionSetting vertical)  {
       if (Objects.equals(this.vertical, vertical))return;
       this.vertical = vertical;
       log.info("vertical" + vertical);
       saveUpdateAttribute(PAttributeNames.VERTICAL,vertical);
    }
    public void setAlign(final PAlignSetting align)  {
       if (Objects.equals(this.align, align))return;
       this.align = align;
       log.info("align" + align);
       saveUpdateAttribute(PAttributeNames.ALIGN,align);
    }

    public PVTTRegion getRegion(){
      return region;
    }
    public Boolean getSnapToLines(){
      return snapToLines;
    }
    public PDoubleOrString getLine(){
      return line;
    }
    public PDoubleOrString getPosition(){
      return position;
    }
    public Double getSize(){
      return size;
    }
    public String getText(){
      return text;
    }
    public PDirectionSetting getVertical(){
      return vertical;
    }
    public PAlignSetting getAlign(){
      return align;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.VTT_CUE;
    }


}