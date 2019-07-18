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
package com.ponysdk.core.ui2.mediasource;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PTrackDefault extends PObject2 {
     private String byteStreamTrackID;
     private String language;
     private String label;
     private String[] kinds;
     private PTrackDefaultType type;

    public PTrackDefault(PTrackDefaultType type, String language, String label, String[] kinds){
      applyInit(widgetWithArgs(), new Object[]{type, language, label, kinds});
    }

    public PTrackDefault(PTrackDefaultType type, String language, String label, String[] kinds, String byteStreamTrackID){
      applyInit(widgetWithArgs(), new Object[]{type, language, label, kinds, byteStreamTrackID});
    }



    public String getByteStreamTrackID(){
      return byteStreamTrackID;
    }
    public String getLanguage(){
      return language;
    }
    public String getLabel(){
      return label;
    }
    public String[] getKinds(){
      return kinds;
    }
    public PTrackDefaultType getType(){
      return type;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.TRACK_DEFAULT;
    }


}