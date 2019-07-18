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
package com.ponysdk.core.ui2.fileapi;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.core.PDate;
import com.ponysdk.core.ui2.core.PArrayBuffer;
import com.ponysdk.core.ui2.core.PArrayBufferView;

public class PFile extends PBlob {
     private String name;
     private Double lastModified;
     private PDate lastModifiedDate;
     private String webkitRelativePath;

    public PFile(PArrayBuffer[] fileBits, String fileName){
      applyInit(widgetWithArgs(), new Object[]{fileBits, fileName});
    }

    public PFile(PArrayBuffer[] fileBits, String fileName, PFilePropertyBag options){
      applyInit(widgetWithArgs(), new Object[]{fileBits, fileName, options});
    }

    public PFile(PArrayBufferView[] fileBits, String fileName){
      applyInit(widgetWithArgs(), new Object[]{fileBits, fileName});
    }

    public PFile(PArrayBufferView[] fileBits, String fileName, PFilePropertyBag options){
      applyInit(widgetWithArgs(), new Object[]{fileBits, fileName, options});
    }

    public PFile(PBlob[] fileBits, String fileName){
      applyInit(widgetWithArgs(), new Object[]{fileBits, fileName});
    }

    public PFile(PBlob[] fileBits, String fileName, PFilePropertyBag options){
      applyInit(widgetWithArgs(), new Object[]{fileBits, fileName, options});
    }

    public PFile(String[] fileBits, String fileName){
      applyInit(widgetWithArgs(), new Object[]{fileBits, fileName});
    }

    public PFile(String[] fileBits, String fileName, PFilePropertyBag options){
      applyInit(widgetWithArgs(), new Object[]{fileBits, fileName, options});
    }



    public String getName(){
      return name;
    }
    public Double getLastModified(){
      return lastModified;
    }
    public PDate getLastModifiedDate(){
      return lastModifiedDate;
    }
    public String getWebkitRelativePath(){
      return webkitRelativePath;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.FILE;
    }


}