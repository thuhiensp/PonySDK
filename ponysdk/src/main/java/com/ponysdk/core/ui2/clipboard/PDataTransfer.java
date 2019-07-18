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
package com.ponysdk.core.ui2.clipboard;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.fileapi.PFileList;

public class PDataTransfer extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PDataTransfer.class);
     private String dropEffect;
     private String effectAllowed;
     private PDataTransferItemList items;
     private String[] types;
     private PFileList files;

    public PDataTransfer() {
      applyInit(widgetNoArgs());
    }



    public void setDropEffect(final String dropEffect)  {
       if (Objects.equals(this.dropEffect, dropEffect))return;
       this.dropEffect = dropEffect;
       log.info("dropEffect" + dropEffect);
       saveUpdateAttribute(PAttributeNames.DROP_EFFECT,dropEffect);
    }
    public void setEffectAllowed(final String effectAllowed)  {
       if (Objects.equals(this.effectAllowed, effectAllowed))return;
       this.effectAllowed = effectAllowed;
       log.info("effectAllowed" + effectAllowed);
       saveUpdateAttribute(PAttributeNames.EFFECT_ALLOWED,effectAllowed);
    }

    public String getDropEffect(){
      return dropEffect;
    }
    public String getEffectAllowed(){
      return effectAllowed;
    }
    public PDataTransferItemList getItems(){
      return items;
    }
    public String[] getTypes(){
      return types;
    }
    public PFileList getFiles(){
      return files;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.DATA_TRANSFER;
    }


}