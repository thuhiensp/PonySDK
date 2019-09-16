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
package  com.ponysdk.core.ui2;
import com.ponysdk.core.model.ServerToClientModel;
import com.ponysdk.core.writer.ModelWriter;
import com.ponysdk.core.server.application.UIContext;
import java.util.function.Consumer;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
public class PUint16Array extends PArrayBufferView {
    public PUint16Array(Double length){
      super(length);
    }

    public PUint16Array(PUint16Array array){
      super(array);
    }

    public PUint16Array(Short[] array){
      super(array);
    }

    public PUint16Array(PArrayBuffer buffer){
      super(buffer);
    }

    public PUint16Array(PArrayBuffer buffer, Double byteOffset){
      super(buffer, byteOffset);
    }

    public PUint16Array(PArrayBuffer buffer, Double byteOffset, Double length){
      super(buffer, byteOffset, length);
    }




    @Override
    protected PLeafTypeNoArgs widgetNoArgs() {
       return null;
    }
    @Override
    protected PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.UINT16_ARRAY;
    }


    public void get(final Consumer<Short> cback,Double index){
       cbacksSequence++;
       cbacks.put(cbacksSequence, cback);
       final ModelWriter writer = UIContext.get().getWriter();
       writer.beginPObject2();
       writer.write(ServerToClientModel.POBJECT2_METHOD, getID());
       writer.write(ServerToClientModel.POBJECT2_NUM_METHOD, PMethodNames.GET_TYPEDOUBLE_SHORT.getValue());
       writer.write(ServerToClientModel.POBJECT2_METHOD_CALLBACK, cbacksSequence);
       writer.write(ServerToClientModel.POBJECT2_ARRAY_ARGUMENTS, new Object[] {index});
       writer.endObject();
    }

    public void set(PUint16Array array){
    }

    public void set(Short[] array){
    }

    public void set(PUint16Array array, Double offset){
    }

    public void set(Short[] array, Double offset){
    }

    public void set(Double index, Short value){
       final ModelWriter writer = UIContext.get().getWriter();
       writer.beginPObject2();
       writer.write(ServerToClientModel.POBJECT2_METHOD_VOID, getID());
       writer.write(ServerToClientModel.POBJECT2_NUM_METHOD, PMethodNames.
       SET_TYPEDOUBLE_TYPESHORT_VOID.getValue());
       writer.write(ServerToClientModel.POBJECT2_ARRAY_ARGUMENTS, new Object[] {index,value});
       writer.endObject();
    }

    public PUint16Array subarray(Double begin) {
       return null;
    }


    public PUint16Array subarray(Double begin, Double end) {
       return null;
    }


    
}