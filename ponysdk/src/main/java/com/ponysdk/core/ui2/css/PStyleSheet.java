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
import com.ponysdk.core.ui2.dom.PNode;

public abstract class PStyleSheet extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PStyleSheet.class);
     private String type;
     private String href;
     private PNode ownerNode;
     private PStyleSheet parentStyleSheet;
     private String title;
     private PMediaList media;
     private Boolean disabled;

    public void setDisabled(final Boolean disabled)  {
       if (Objects.equals(this.disabled, disabled))return;
       this.disabled = disabled;
       log.info("disabled" + disabled);
       saveUpdateAttribute(PAttributeNames.DISABLED,disabled);
    }

    public String getType(){
      return type;
    }
    public String getHref(){
      return href;
    }
    public PNode getOwnerNode(){
      return ownerNode;
    }
    public PStyleSheet getParentStyleSheet(){
      return parentStyleSheet;
    }
    public String getTitle(){
      return title;
    }
    public PMediaList getMedia(){
      return media;
    }
    public Boolean getDisabled(){
      return disabled;
    }


}