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
package com.ponysdk.core.ui2.xmlhttprequest;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.dom.PDocument;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;

public class PXMLHttpRequest extends PXMLHttpRequestEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PXMLHttpRequest.class);
     private PEventHandlerNonNull onreadystatechange;
     private Short readyState;
     private Double timeout;
     private Boolean withCredentials;
     private PXMLHttpRequestUpload upload;
     private String responseURL;
     private Short status;
     private String statusText;
     private Object response;
     private String responseText;
     private PDocument responseXML;
     private PXMLHttpRequestResponseType responseType;

    public PXMLHttpRequest() {
      applyInit(widgetNoArgs());
    }



    public void setOnreadystatechange(final PEventHandlerNonNull onreadystatechange, final PEventAttributesName... atrsName)  {
       addHandler(onreadystatechange);
       saveUpdateAttributeCallBack(PAttributeNames.ONREADYSTATECHANGE, onreadystatechange, atrsName);
    }
    public void setTimeout(final Double timeout)  {
       if (Objects.equals(this.timeout, timeout))return;
       this.timeout = timeout;
       log.info("timeout" + timeout);
       saveUpdateAttribute(PAttributeNames.TIMEOUT,timeout);
    }
    public void setWithCredentials(final Boolean withCredentials)  {
       if (Objects.equals(this.withCredentials, withCredentials))return;
       this.withCredentials = withCredentials;
       log.info("withCredentials" + withCredentials);
       saveUpdateAttribute(PAttributeNames.WITH_CREDENTIALS,withCredentials);
    }
    public void setResponseType(final PXMLHttpRequestResponseType responseType)  {
       if (Objects.equals(this.responseType, responseType))return;
       this.responseType = responseType;
       log.info("responseType" + responseType);
       saveUpdateAttribute(PAttributeNames.RESPONSE_TYPE,responseType);
    }

    public PEventHandlerNonNull getOnreadystatechange(){
      return onreadystatechange;
    }
    public Short getReadyState(){
      return readyState;
    }
    public Double getTimeout(){
      return timeout;
    }
    public Boolean getWithCredentials(){
      return withCredentials;
    }
    public PXMLHttpRequestUpload getUpload(){
      return upload;
    }
    public String getResponseURL(){
      return responseURL;
    }
    public Short getStatus(){
      return status;
    }
    public String getStatusText(){
      return statusText;
    }
    public Object getResponse(){
      return response;
    }
    public String getResponseText(){
      return responseText;
    }
    public PDocument getResponseXML(){
      return responseXML;
    }
    public PXMLHttpRequestResponseType getResponseType(){
      return responseType;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.XML_HTTP_REQUEST;
    }


}