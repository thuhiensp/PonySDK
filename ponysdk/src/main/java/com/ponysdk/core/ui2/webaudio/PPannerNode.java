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
package com.ponysdk.core.ui2.webaudio;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PPannerNode extends PAudioNode {
    private static final Logger log = LoggerFactory.getLogger(PPannerNode.class);
     private PAudioParam positionX;
     private PAudioParam positionY;
     private PAudioParam positionZ;
     private PAudioParam orientationX;
     private PAudioParam orientationY;
     private PAudioParam orientationZ;
     private Double refDistance;
     private Double maxDistance;
     private Double rolloffFactor;
     private Double coneInnerAngle;
     private Double coneOuterAngle;
     private Double coneOuterGain;
     private PPanningModelType panningModel;
     private PDistanceModelType distanceModel;

    public PPannerNode(PBaseAudioContext context){
      applyInit(widgetWithArgs(), new Object[]{context});
    }

    public PPannerNode(PBaseAudioContext context, PPannerOptions options){
      applyInit(widgetWithArgs(), new Object[]{context, options});
    }


    public void setRefDistance(final Double refDistance)  {
       if (Objects.equals(this.refDistance, refDistance))return;
       this.refDistance = refDistance;
       log.info("refDistance" + refDistance);
       saveUpdateAttribute(PAttributeNames.REF_DISTANCE,refDistance);
    }
    public void setMaxDistance(final Double maxDistance)  {
       if (Objects.equals(this.maxDistance, maxDistance))return;
       this.maxDistance = maxDistance;
       log.info("maxDistance" + maxDistance);
       saveUpdateAttribute(PAttributeNames.MAX_DISTANCE,maxDistance);
    }
    public void setRolloffFactor(final Double rolloffFactor)  {
       if (Objects.equals(this.rolloffFactor, rolloffFactor))return;
       this.rolloffFactor = rolloffFactor;
       log.info("rolloffFactor" + rolloffFactor);
       saveUpdateAttribute(PAttributeNames.ROLLOFF_FACTOR,rolloffFactor);
    }
    public void setConeInnerAngle(final Double coneInnerAngle)  {
       if (Objects.equals(this.coneInnerAngle, coneInnerAngle))return;
       this.coneInnerAngle = coneInnerAngle;
       log.info("coneInnerAngle" + coneInnerAngle);
       saveUpdateAttribute(PAttributeNames.CONE_INNER_ANGLE,coneInnerAngle);
    }
    public void setConeOuterAngle(final Double coneOuterAngle)  {
       if (Objects.equals(this.coneOuterAngle, coneOuterAngle))return;
       this.coneOuterAngle = coneOuterAngle;
       log.info("coneOuterAngle" + coneOuterAngle);
       saveUpdateAttribute(PAttributeNames.CONE_OUTER_ANGLE,coneOuterAngle);
    }
    public void setConeOuterGain(final Double coneOuterGain)  {
       if (Objects.equals(this.coneOuterGain, coneOuterGain))return;
       this.coneOuterGain = coneOuterGain;
       log.info("coneOuterGain" + coneOuterGain);
       saveUpdateAttribute(PAttributeNames.CONE_OUTER_GAIN,coneOuterGain);
    }
    public void setPanningModel(final PPanningModelType panningModel)  {
       if (Objects.equals(this.panningModel, panningModel))return;
       this.panningModel = panningModel;
       log.info("panningModel" + panningModel);
       saveUpdateAttribute(PAttributeNames.PANNING_MODEL,panningModel);
    }
    public void setDistanceModel(final PDistanceModelType distanceModel)  {
       if (Objects.equals(this.distanceModel, distanceModel))return;
       this.distanceModel = distanceModel;
       log.info("distanceModel" + distanceModel);
       saveUpdateAttribute(PAttributeNames.DISTANCE_MODEL,distanceModel);
    }

    public PAudioParam getPositionX(){
      return positionX;
    }
    public PAudioParam getPositionY(){
      return positionY;
    }
    public PAudioParam getPositionZ(){
      return positionZ;
    }
    public PAudioParam getOrientationX(){
      return orientationX;
    }
    public PAudioParam getOrientationY(){
      return orientationY;
    }
    public PAudioParam getOrientationZ(){
      return orientationZ;
    }
    public Double getRefDistance(){
      return refDistance;
    }
    public Double getMaxDistance(){
      return maxDistance;
    }
    public Double getRolloffFactor(){
      return rolloffFactor;
    }
    public Double getConeInnerAngle(){
      return coneInnerAngle;
    }
    public Double getConeOuterAngle(){
      return coneOuterAngle;
    }
    public Double getConeOuterGain(){
      return coneOuterGain;
    }
    public PPanningModelType getPanningModel(){
      return panningModel;
    }
    public PDistanceModelType getDistanceModel(){
      return distanceModel;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.PANNER_NODE;
    }


}