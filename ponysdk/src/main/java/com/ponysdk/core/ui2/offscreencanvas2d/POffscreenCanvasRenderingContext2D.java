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
package com.ponysdk.core.ui2.offscreencanvas2d;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.canvas2d.PCanvasRenderingContext2D;
import com.ponysdk.core.ui2.canvas2d.PImageSmoothingQuality;
import com.ponysdk.core.ui2.offscreencanvas.POffscreenCanvas;
import com.ponysdk.core.ui2.uniontype.PCanvasGradientOrCanvasPatternOrString;

public class POffscreenCanvasRenderingContext2D extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(POffscreenCanvasRenderingContext2D.class);
     private POffscreenCanvas canvas;
     private Double globalAlpha;
     private String globalCompositeOperation;
     private String filter;
     private Boolean imageSmoothingEnabled;
     private PCanvasGradientOrCanvasPatternOrString strokeStyle;
     private PCanvasGradientOrCanvasPatternOrString fillStyle;
     private Double shadowOffsetX;
     private Double shadowOffsetY;
     private Double shadowBlur;
     private String shadowColor;
     private Double lineWidth;
     private String lineCap;
     private String lineJoin;
     private Double miterLimit;
     private Double lineDashOffset;
     private PImageSmoothingQuality imageSmoothingQuality;

    public POffscreenCanvasRenderingContext2D() {
      applyInit(widgetNoArgs());
    }

    public void setGlobalAlpha(final Double globalAlpha)  {
       if (Objects.equals(this.globalAlpha, globalAlpha))return;
       this.globalAlpha = globalAlpha;
       log.info("globalAlpha" + globalAlpha);
       saveUpdateAttribute(PAttributeNames.GLOBAL_ALPHA,globalAlpha);
    }
    public void setGlobalCompositeOperation(final String globalCompositeOperation)  {
       if (Objects.equals(this.globalCompositeOperation, globalCompositeOperation))return;
       this.globalCompositeOperation = globalCompositeOperation;
       log.info("globalCompositeOperation" + globalCompositeOperation);
       saveUpdateAttribute(PAttributeNames.GLOBAL_COMPOSITE_OPERATION,globalCompositeOperation);
    }
    public void setFilter(final String filter)  {
       if (Objects.equals(this.filter, filter))return;
       this.filter = filter;
       log.info("filter" + filter);
       saveUpdateAttribute(PAttributeNames.FILTER,filter);
    }
    public void setImageSmoothingEnabled(final Boolean imageSmoothingEnabled)  {
       if (Objects.equals(this.imageSmoothingEnabled, imageSmoothingEnabled))return;
       this.imageSmoothingEnabled = imageSmoothingEnabled;
       log.info("imageSmoothingEnabled" + imageSmoothingEnabled);
       saveUpdateAttribute(PAttributeNames.IMAGE_SMOOTHING_ENABLED,imageSmoothingEnabled);
    }
    public void setStrokeStyle(final PCanvasGradientOrCanvasPatternOrString strokeStyle)  {
       if (Objects.equals(this.strokeStyle, strokeStyle))return;
       this.strokeStyle = strokeStyle;
       log.info("strokeStyle" + strokeStyle);
       saveUpdateAttribute(PAttributeNames.STROKE_STYLE,strokeStyle);
    }
    public void setFillStyle(final PCanvasGradientOrCanvasPatternOrString fillStyle)  {
       if (Objects.equals(this.fillStyle, fillStyle))return;
       this.fillStyle = fillStyle;
       log.info("fillStyle" + fillStyle);
       saveUpdateAttribute(PAttributeNames.FILL_STYLE,fillStyle);
    }
    public void setShadowOffsetX(final Double shadowOffsetX)  {
       if (Objects.equals(this.shadowOffsetX, shadowOffsetX))return;
       this.shadowOffsetX = shadowOffsetX;
       log.info("shadowOffsetX" + shadowOffsetX);
       saveUpdateAttribute(PAttributeNames.SHADOW_OFFSETX,shadowOffsetX);
    }
    public void setShadowOffsetY(final Double shadowOffsetY)  {
       if (Objects.equals(this.shadowOffsetY, shadowOffsetY))return;
       this.shadowOffsetY = shadowOffsetY;
       log.info("shadowOffsetY" + shadowOffsetY);
       saveUpdateAttribute(PAttributeNames.SHADOW_OFFSETY,shadowOffsetY);
    }
    public void setShadowBlur(final Double shadowBlur)  {
       if (Objects.equals(this.shadowBlur, shadowBlur))return;
       this.shadowBlur = shadowBlur;
       log.info("shadowBlur" + shadowBlur);
       saveUpdateAttribute(PAttributeNames.SHADOW_BLUR,shadowBlur);
    }
    public void setShadowColor(final String shadowColor)  {
       if (Objects.equals(this.shadowColor, shadowColor))return;
       this.shadowColor = shadowColor;
       log.info("shadowColor" + shadowColor);
       saveUpdateAttribute(PAttributeNames.SHADOW_COLOR,shadowColor);
    }
    public void setLineWidth(final Double lineWidth)  {
       if (Objects.equals(this.lineWidth, lineWidth))return;
       this.lineWidth = lineWidth;
       log.info("lineWidth" + lineWidth);
       saveUpdateAttribute(PAttributeNames.LINE_WIDTH,lineWidth);
    }
    public void setLineCap(final String lineCap)  {
       if (Objects.equals(this.lineCap, lineCap))return;
       this.lineCap = lineCap;
       log.info("lineCap" + lineCap);
       saveUpdateAttribute(PAttributeNames.LINE_CAP,lineCap);
    }
    public void setLineJoin(final String lineJoin)  {
       if (Objects.equals(this.lineJoin, lineJoin))return;
       this.lineJoin = lineJoin;
       log.info("lineJoin" + lineJoin);
       saveUpdateAttribute(PAttributeNames.LINE_JOIN,lineJoin);
    }
    public void setMiterLimit(final Double miterLimit)  {
       if (Objects.equals(this.miterLimit, miterLimit))return;
       this.miterLimit = miterLimit;
       log.info("miterLimit" + miterLimit);
       saveUpdateAttribute(PAttributeNames.MITER_LIMIT,miterLimit);
    }
    public void setLineDashOffset(final Double lineDashOffset)  {
       if (Objects.equals(this.lineDashOffset, lineDashOffset))return;
       this.lineDashOffset = lineDashOffset;
       log.info("lineDashOffset" + lineDashOffset);
       saveUpdateAttribute(PAttributeNames.LINE_DASH_OFFSET,lineDashOffset);
    }
    public void setImageSmoothingQuality(final PImageSmoothingQuality imageSmoothingQuality)  {
       if (Objects.equals(this.imageSmoothingQuality, imageSmoothingQuality))return;
       this.imageSmoothingQuality = imageSmoothingQuality;
       log.info("imageSmoothingQuality" + imageSmoothingQuality);
       saveUpdateAttribute(PAttributeNames.IMAGE_SMOOTHING_QUALITY,imageSmoothingQuality);
    }

    public POffscreenCanvas getCanvas(){
      return canvas;
    }
    public Double getGlobalAlpha(){
      return globalAlpha;
    }
    public String getGlobalCompositeOperation(){
      return globalCompositeOperation;
    }
    public String getFilter(){
      return filter;
    }
    public Boolean getImageSmoothingEnabled(){
      return imageSmoothingEnabled;
    }
    public PCanvasGradientOrCanvasPatternOrString getStrokeStyle(){
      return strokeStyle;
    }
    public PCanvasGradientOrCanvasPatternOrString getFillStyle(){
      return fillStyle;
    }
    public Double getShadowOffsetX(){
      return shadowOffsetX;
    }
    public Double getShadowOffsetY(){
      return shadowOffsetY;
    }
    public Double getShadowBlur(){
      return shadowBlur;
    }
    public String getShadowColor(){
      return shadowColor;
    }
    public Double getLineWidth(){
      return lineWidth;
    }
    public String getLineCap(){
      return lineCap;
    }
    public String getLineJoin(){
      return lineJoin;
    }
    public Double getMiterLimit(){
      return miterLimit;
    }
    public Double getLineDashOffset(){
      return lineDashOffset;
    }
    public PImageSmoothingQuality getImageSmoothingQuality(){
      return imageSmoothingQuality;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.OFFSCREEN_CANVAS_RENDERING_CONTEXT2D;
    }


}