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
package com.ponysdk.core.ui2.html;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PHTMLBaseElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLBaseElement.class);
     private String href;
     private String target;

    public PHTMLBaseElement() {
      applyInit(widgetNoArgs());
    }

    public void setHref(final String href)  {
       if (Objects.equals(this.href, href))return;
       this.href = href;
       log.info("href" + href);
       saveUpdateAttribute(PAttributeNames.HREF,href);
    }
    public void setTarget(final String target)  {
       if (Objects.equals(this.target, target))return;
       this.target = target;
       log.info("target" + target);
       saveUpdateAttribute(PAttributeNames.TARGET,target);
    }

    public String getHref(){
      return href;
    }
    public String getTarget(){
      return target;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_BASE_ELEMENT;
    }


}