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
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PHTMLMarqueeElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLMarqueeElement.class);
     private String behavior;
     private String bgColor;
     private String direction;
     private String height;
     private Double hspace;
     private Double loop;
     private Double scrollAmount;
     private Double scrollDelay;
     private Boolean trueSpeed;
     private Double vspace;
     private String width;

    public PHTMLMarqueeElement() {
      applyInit(widgetNoArgs());
    }

    public void setBehavior(final String behavior)  {
       if (Objects.equals(this.behavior, behavior))return;
       this.behavior = behavior;
       log.info("behavior" + behavior);
       saveUpdateAttribute(PAttributeNames.BEHAVIOR,behavior);
    }
    public void setBgColor(final String bgColor)  {
       if (Objects.equals(this.bgColor, bgColor))return;
       this.bgColor = bgColor;
       log.info("bgColor" + bgColor);
       saveUpdateAttribute(PAttributeNames.BG_COLOR,bgColor);
    }
    public void setDirection(final String direction)  {
       if (Objects.equals(this.direction, direction))return;
       this.direction = direction;
       log.info("direction" + direction);
       saveUpdateAttribute(PAttributeNames.DIRECTION,direction);
    }
    public void setHeight(final String height)  {
       if (Objects.equals(this.height, height))return;
       this.height = height;
       log.info("height" + height);
       saveUpdateAttribute(PAttributeNames.HEIGHT,height);
    }
    public void setHspace(final Double hspace)  {
       if (Objects.equals(this.hspace, hspace))return;
       this.hspace = hspace;
       log.info("hspace" + hspace);
       saveUpdateAttribute(PAttributeNames.HSPACE,hspace);
    }
    public void setLoop(final Double loop)  {
       if (Objects.equals(this.loop, loop))return;
       this.loop = loop;
       log.info("loop" + loop);
       saveUpdateAttribute(PAttributeNames.LOOP,loop);
    }
    public void setScrollAmount(final Double scrollAmount)  {
       if (Objects.equals(this.scrollAmount, scrollAmount))return;
       this.scrollAmount = scrollAmount;
       log.info("scrollAmount" + scrollAmount);
       saveUpdateAttribute(PAttributeNames.SCROLL_AMOUNT,scrollAmount);
    }
    public void setScrollDelay(final Double scrollDelay)  {
       if (Objects.equals(this.scrollDelay, scrollDelay))return;
       this.scrollDelay = scrollDelay;
       log.info("scrollDelay" + scrollDelay);
       saveUpdateAttribute(PAttributeNames.SCROLL_DELAY,scrollDelay);
    }
    public void setTrueSpeed(final Boolean trueSpeed)  {
       if (Objects.equals(this.trueSpeed, trueSpeed))return;
       this.trueSpeed = trueSpeed;
       log.info("trueSpeed" + trueSpeed);
       saveUpdateAttribute(PAttributeNames.TRUE_SPEED,trueSpeed);
    }
    public void setVspace(final Double vspace)  {
       if (Objects.equals(this.vspace, vspace))return;
       this.vspace = vspace;
       log.info("vspace" + vspace);
       saveUpdateAttribute(PAttributeNames.VSPACE,vspace);
    }
    public void setWidth(final String width)  {
       if (Objects.equals(this.width, width))return;
       this.width = width;
       log.info("width" + width);
       saveUpdateAttribute(PAttributeNames.WIDTH,width);
    }

    public String getBehavior(){
      return behavior;
    }
    public String getBgColor(){
      return bgColor;
    }
    public String getDirection(){
      return direction;
    }
    public String getHeight(){
      return height;
    }
    public Double getHspace(){
      return hspace;
    }
    public Double getLoop(){
      return loop;
    }
    public Double getScrollAmount(){
      return scrollAmount;
    }
    public Double getScrollDelay(){
      return scrollDelay;
    }
    public Boolean getTrueSpeed(){
      return trueSpeed;
    }
    public Double getVspace(){
      return vspace;
    }
    public String getWidth(){
      return width;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_MARQUEE_ELEMENT;
    }


}