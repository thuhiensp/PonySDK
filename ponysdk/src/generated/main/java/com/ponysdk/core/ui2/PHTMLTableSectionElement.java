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
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.function.Consumer;
public abstract class PHTMLTableSectionElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLTableSectionElement.class);
    public void setAlign(final String align)  {
       setAttribute(PAttributeNames.ALIGN_STRING, align);
       log.info("align" + align);
    }
    public void setCh(final String ch)  {
       setAttribute(PAttributeNames.CH, ch);
       log.info("ch" + ch);
    }
    public void setChOff(final String chOff)  {
       setAttribute(PAttributeNames.CH_OFF, chOff);
       log.info("chOff" + chOff);
    }
    public void setVAlign(final String vAlign)  {
       setAttribute(PAttributeNames.V_ALIGN, vAlign);
       log.info("vAlign" + vAlign);
    }

    public String getAlign(){
      return (String) getAttribute(PAttributeNames.ALIGN_STRING);
    }
    public String getCh(){
      return (String) getAttribute(PAttributeNames.CH);
    }
    public String getChOff(){
      return (String) getAttribute(PAttributeNames.CH_OFF);
    }
    public String getVAlign(){
      return (String) getAttribute(PAttributeNames.V_ALIGN);
    }


    public void deleteRow(Double index){
       final ModelWriter writer = UIContext.get().getWriter();
       writer.beginPObject2();
       writer.write(ServerToClientModel.POBJECT2_METHOD_VOID, getID());
       writer.write(ServerToClientModel.POBJECT2_NUM_METHOD, PMethodNames.
       DELETE_ROW_TYPEDOUBLE_VOID.getValue());
       writer.write(ServerToClientModel.POBJECT2_ARRAY_ARGUMENTS, new Object[] {index});
       writer.endObject();
    }

    public PHTMLElement insertRow() {
       return null;
    }


    public PHTMLElement insertRow(Double index) {
       return null;
    }


    
}