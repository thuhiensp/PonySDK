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
package com.ponysdk.core.ui2.css;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.core.PPromise;
import com.ponysdk.core.ui2.core.PArrayBuffer;
import com.ponysdk.core.ui2.core.PArrayBufferView;

public class PFontFace extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PFontFace.class);
     private String family;
     private String style;
     private String weight;
     private String stretch;
     private String unicodeRange;
     private String variant;
     private String featureSettings;
     private String display;
     private PPromise<PFontFace> loaded;
     private PFontFaceLoadStatus status;

    public PFontFace(String family, String source){
      applyInit(widgetWithArgs(), new Object[]{family, source});
    }

    public PFontFace(String family, String source, PFontFaceDescriptors descriptors){
      applyInit(widgetWithArgs(), new Object[]{family, source, descriptors});
    }

    public PFontFace(String family, PArrayBuffer source){
      applyInit(widgetWithArgs(), new Object[]{family, source});
    }

    public PFontFace(String family, PArrayBuffer source, PFontFaceDescriptors descriptors){
      applyInit(widgetWithArgs(), new Object[]{family, source, descriptors});
    }

    public PFontFace(String family, PArrayBufferView source){
      applyInit(widgetWithArgs(), new Object[]{family, source});
    }

    public PFontFace(String family, PArrayBufferView source, PFontFaceDescriptors descriptors){
      applyInit(widgetWithArgs(), new Object[]{family, source, descriptors});
    }


    public void setFamily(final String family)  {
       if (Objects.equals(this.family, family))return;
       this.family = family;
       log.info("family" + family);
       saveUpdateAttribute(PAttributeNames.FAMILY,family);
    }
    public void setStyle(final String style)  {
       if (Objects.equals(this.style, style))return;
       this.style = style;
       log.info("style" + style);
       saveUpdateAttribute(PAttributeNames.STYLE,style);
    }
    public void setWeight(final String weight)  {
       if (Objects.equals(this.weight, weight))return;
       this.weight = weight;
       log.info("weight" + weight);
       saveUpdateAttribute(PAttributeNames.WEIGHT,weight);
    }
    public void setStretch(final String stretch)  {
       if (Objects.equals(this.stretch, stretch))return;
       this.stretch = stretch;
       log.info("stretch" + stretch);
       saveUpdateAttribute(PAttributeNames.STRETCH,stretch);
    }
    public void setUnicodeRange(final String unicodeRange)  {
       if (Objects.equals(this.unicodeRange, unicodeRange))return;
       this.unicodeRange = unicodeRange;
       log.info("unicodeRange" + unicodeRange);
       saveUpdateAttribute(PAttributeNames.UNICODE_RANGE,unicodeRange);
    }
    public void setVariant(final String variant)  {
       if (Objects.equals(this.variant, variant))return;
       this.variant = variant;
       log.info("variant" + variant);
       saveUpdateAttribute(PAttributeNames.VARIANT,variant);
    }
    public void setFeatureSettings(final String featureSettings)  {
       if (Objects.equals(this.featureSettings, featureSettings))return;
       this.featureSettings = featureSettings;
       log.info("featureSettings" + featureSettings);
       saveUpdateAttribute(PAttributeNames.FEATURE_SETTINGS,featureSettings);
    }
    public void setDisplay(final String display)  {
       if (Objects.equals(this.display, display))return;
       this.display = display;
       log.info("display" + display);
       saveUpdateAttribute(PAttributeNames.DISPLAY,display);
    }

    public String getFamily(){
      return family;
    }
    public String getStyle(){
      return style;
    }
    public String getWeight(){
      return weight;
    }
    public String getStretch(){
      return stretch;
    }
    public String getUnicodeRange(){
      return unicodeRange;
    }
    public String getVariant(){
      return variant;
    }
    public String getFeatureSettings(){
      return featureSettings;
    }
    public String getDisplay(){
      return display;
    }
    public PPromise<PFontFace> getLoaded(){
      return loaded;
    }
    public PFontFaceLoadStatus getStatus(){
      return status;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.FONT_FACE;
    }


}