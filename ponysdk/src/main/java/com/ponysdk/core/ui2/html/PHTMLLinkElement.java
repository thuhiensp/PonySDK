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
import com.ponysdk.core.ui2.css.PStyleSheet;
import com.ponysdk.core.ui2.dom.PDOMTokenList;
import com.ponysdk.core.ui2.dom.PDocument;

public class PHTMLLinkElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLLinkElement.class);
     private Boolean disabled;
     private String href;
     private String crossOrigin;
     private String rel;
     private PDOMTokenList relList;
     private String media;
     private String hreflang;
     private String type;
     private String as;
     private String referrerPolicy;
     private PDOMTokenList sizes;
     private String charset;
     private String rev;
     private String target;
     private PStyleSheet sheet;
     private PDocument importAttribute;
     private String integrity;
     private String scope;

    public PHTMLLinkElement() {
      applyInit(widgetNoArgs());
    }

    public void setDisabled(final Boolean disabled)  {
       if (Objects.equals(this.disabled, disabled))return;
       this.disabled = disabled;
       log.info("disabled" + disabled);
       saveUpdateAttribute(PAttributeNames.DISABLED,disabled);
    }
    public void setHref(final String href)  {
       if (Objects.equals(this.href, href))return;
       this.href = href;
       log.info("href" + href);
       saveUpdateAttribute(PAttributeNames.HREF,href);
    }
    public void setCrossOrigin(final String crossOrigin)  {
       if (Objects.equals(this.crossOrigin, crossOrigin))return;
       this.crossOrigin = crossOrigin;
       log.info("crossOrigin" + crossOrigin);
       saveUpdateAttribute(PAttributeNames.CROSS_ORIGIN,crossOrigin);
    }
    public void setRel(final String rel)  {
       if (Objects.equals(this.rel, rel))return;
       this.rel = rel;
       log.info("rel" + rel);
       saveUpdateAttribute(PAttributeNames.REL,rel);
    }
    public void setMedia(final String media)  {
       if (Objects.equals(this.media, media))return;
       this.media = media;
       log.info("media" + media);
       saveUpdateAttribute(PAttributeNames.MEDIA,media);
    }
    public void setHreflang(final String hreflang)  {
       if (Objects.equals(this.hreflang, hreflang))return;
       this.hreflang = hreflang;
       log.info("hreflang" + hreflang);
       saveUpdateAttribute(PAttributeNames.HREFLANG,hreflang);
    }
    public void setType(final String type)  {
       if (Objects.equals(this.type, type))return;
       this.type = type;
       log.info("type" + type);
       saveUpdateAttribute(PAttributeNames.TYPE,type);
    }
    public void setAs(final String as)  {
       if (Objects.equals(this.as, as))return;
       this.as = as;
       log.info("as" + as);
       saveUpdateAttribute(PAttributeNames.AS,as);
    }
    public void setReferrerPolicy(final String referrerPolicy)  {
       if (Objects.equals(this.referrerPolicy, referrerPolicy))return;
       this.referrerPolicy = referrerPolicy;
       log.info("referrerPolicy" + referrerPolicy);
       saveUpdateAttribute(PAttributeNames.REFERRER_POLICY,referrerPolicy);
    }
    public void setCharset(final String charset)  {
       if (Objects.equals(this.charset, charset))return;
       this.charset = charset;
       log.info("charset" + charset);
       saveUpdateAttribute(PAttributeNames.CHARSET,charset);
    }
    public void setRev(final String rev)  {
       if (Objects.equals(this.rev, rev))return;
       this.rev = rev;
       log.info("rev" + rev);
       saveUpdateAttribute(PAttributeNames.REV,rev);
    }
    public void setTarget(final String target)  {
       if (Objects.equals(this.target, target))return;
       this.target = target;
       log.info("target" + target);
       saveUpdateAttribute(PAttributeNames.TARGET,target);
    }
    public void setIntegrity(final String integrity)  {
       if (Objects.equals(this.integrity, integrity))return;
       this.integrity = integrity;
       log.info("integrity" + integrity);
       saveUpdateAttribute(PAttributeNames.INTEGRITY,integrity);
    }
    public void setScope(final String scope)  {
       if (Objects.equals(this.scope, scope))return;
       this.scope = scope;
       log.info("scope" + scope);
       saveUpdateAttribute(PAttributeNames.SCOPE,scope);
    }

    public Boolean getDisabled(){
      return disabled;
    }
    public String getHref(){
      return href;
    }
    public String getCrossOrigin(){
      return crossOrigin;
    }
    public String getRel(){
      return rel;
    }
    public PDOMTokenList getRelList(){
      return relList;
    }
    public String getMedia(){
      return media;
    }
    public String getHreflang(){
      return hreflang;
    }
    public String getType(){
      return type;
    }
    public String getAs(){
      return as;
    }
    public String getReferrerPolicy(){
      return referrerPolicy;
    }
    public PDOMTokenList getSizes(){
      return sizes;
    }
    public String getCharset(){
      return charset;
    }
    public String getRev(){
      return rev;
    }
    public String getTarget(){
      return target;
    }
    public PStyleSheet getSheet(){
      return sheet;
    }
    public PDocument getImportAttribute(){
      return importAttribute;
    }
    public String getIntegrity(){
      return integrity;
    }
    public String getScope(){
      return scope;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_LINK_ELEMENT;
    }


}