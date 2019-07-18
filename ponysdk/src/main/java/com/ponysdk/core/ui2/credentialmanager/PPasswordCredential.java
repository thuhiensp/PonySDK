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
package com.ponysdk.core.ui2.credentialmanager;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.uniontype.PCredentialBodyType;
import com.ponysdk.core.ui2.html.PHTMLFormElement;

public class PPasswordCredential extends PCredential {
    private static final Logger log = LoggerFactory.getLogger(PPasswordCredential.class);
     private String idName;
     private String passwordName;
     private PCredentialBodyType additionalData;
     private String password;
     private String name;
     private String iconURL;

    public PPasswordCredential(PPasswordCredentialData data){
      applyInit(widgetWithArgs(), new Object[]{data});
    }

    public PPasswordCredential(PHTMLFormElement form){
      applyInit(widgetWithArgs(), new Object[]{form});
    }


    public void setIdName(final String idName)  {
       if (Objects.equals(this.idName, idName))return;
       this.idName = idName;
       log.info("idName" + idName);
       saveUpdateAttribute(PAttributeNames.ID_NAME,idName);
    }
    public void setPasswordName(final String passwordName)  {
       if (Objects.equals(this.passwordName, passwordName))return;
       this.passwordName = passwordName;
       log.info("passwordName" + passwordName);
       saveUpdateAttribute(PAttributeNames.PASSWORD_NAME,passwordName);
    }
    public void setAdditionalData(final PCredentialBodyType additionalData)  {
       if (Objects.equals(this.additionalData, additionalData))return;
       this.additionalData = additionalData;
       log.info("additionalData" + additionalData);
       saveUpdateAttribute(PAttributeNames.ADDITIONAL_DATA,additionalData);
    }

    public String getIdName(){
      return idName;
    }
    public String getPasswordName(){
      return passwordName;
    }
    public PCredentialBodyType getAdditionalData(){
      return additionalData;
    }
    public String getPassword(){
      return password;
    }
    public String getName(){
      return name;
    }
    public String getIconURL(){
      return iconURL;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.PASSWORD_CREDENTIAL;
    }


}