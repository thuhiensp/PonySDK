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

public class PHTMLAreaElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLAreaElement.class);
     private String alt;
     private String coords;
     private String download;
     private String shape;
     private String target;
     private String ping;
     private String rel;
     private String referrerPolicy;
     private Boolean noHref;
     private String href;
     private String origin;
     private String protocol;
     private String username;
     private String password;
     private String host;
     private String hostname;
     private String port;
     private String pathname;
     private String search;
     private String hash;

    public PHTMLAreaElement() {
      applyInit(widgetNoArgs());
    }

    public void setAlt(final String alt)  {
       if (Objects.equals(this.alt, alt))return;
       this.alt = alt;
       log.info("alt" + alt);
       saveUpdateAttribute(PAttributeNames.ALT,alt);
    }
    public void setCoords(final String coords)  {
       if (Objects.equals(this.coords, coords))return;
       this.coords = coords;
       log.info("coords" + coords);
       saveUpdateAttribute(PAttributeNames.COORDS,coords);
    }
    public void setDownload(final String download)  {
       if (Objects.equals(this.download, download))return;
       this.download = download;
       log.info("download" + download);
       saveUpdateAttribute(PAttributeNames.DOWNLOAD,download);
    }
    public void setShape(final String shape)  {
       if (Objects.equals(this.shape, shape))return;
       this.shape = shape;
       log.info("shape" + shape);
       saveUpdateAttribute(PAttributeNames.SHAPE,shape);
    }
    public void setTarget(final String target)  {
       if (Objects.equals(this.target, target))return;
       this.target = target;
       log.info("target" + target);
       saveUpdateAttribute(PAttributeNames.TARGET,target);
    }
    public void setPing(final String ping)  {
       if (Objects.equals(this.ping, ping))return;
       this.ping = ping;
       log.info("ping" + ping);
       saveUpdateAttribute(PAttributeNames.PING,ping);
    }
    public void setRel(final String rel)  {
       if (Objects.equals(this.rel, rel))return;
       this.rel = rel;
       log.info("rel" + rel);
       saveUpdateAttribute(PAttributeNames.REL,rel);
    }
    public void setReferrerPolicy(final String referrerPolicy)  {
       if (Objects.equals(this.referrerPolicy, referrerPolicy))return;
       this.referrerPolicy = referrerPolicy;
       log.info("referrerPolicy" + referrerPolicy);
       saveUpdateAttribute(PAttributeNames.REFERRER_POLICY,referrerPolicy);
    }
    public void setNoHref(final Boolean noHref)  {
       if (Objects.equals(this.noHref, noHref))return;
       this.noHref = noHref;
       log.info("noHref" + noHref);
       saveUpdateAttribute(PAttributeNames.NO_HREF,noHref);
    }
    public void setHref(final String href)  {
       if (Objects.equals(this.href, href))return;
       this.href = href;
       log.info("href" + href);
       saveUpdateAttribute(PAttributeNames.HREF,href);
    }
    public void setProtocol(final String protocol)  {
       if (Objects.equals(this.protocol, protocol))return;
       this.protocol = protocol;
       log.info("protocol" + protocol);
       saveUpdateAttribute(PAttributeNames.PROTOCOL,protocol);
    }
    public void setUsername(final String username)  {
       if (Objects.equals(this.username, username))return;
       this.username = username;
       log.info("username" + username);
       saveUpdateAttribute(PAttributeNames.USERNAME,username);
    }
    public void setPassword(final String password)  {
       if (Objects.equals(this.password, password))return;
       this.password = password;
       log.info("password" + password);
       saveUpdateAttribute(PAttributeNames.PASSWORD,password);
    }
    public void setHost(final String host)  {
       if (Objects.equals(this.host, host))return;
       this.host = host;
       log.info("host" + host);
       saveUpdateAttribute(PAttributeNames.HOST,host);
    }
    public void setHostname(final String hostname)  {
       if (Objects.equals(this.hostname, hostname))return;
       this.hostname = hostname;
       log.info("hostname" + hostname);
       saveUpdateAttribute(PAttributeNames.HOSTNAME,hostname);
    }
    public void setPort(final String port)  {
       if (Objects.equals(this.port, port))return;
       this.port = port;
       log.info("port" + port);
       saveUpdateAttribute(PAttributeNames.PORT,port);
    }
    public void setPathname(final String pathname)  {
       if (Objects.equals(this.pathname, pathname))return;
       this.pathname = pathname;
       log.info("pathname" + pathname);
       saveUpdateAttribute(PAttributeNames.PATHNAME,pathname);
    }
    public void setSearch(final String search)  {
       if (Objects.equals(this.search, search))return;
       this.search = search;
       log.info("search" + search);
       saveUpdateAttribute(PAttributeNames.SEARCH,search);
    }
    public void setHash(final String hash)  {
       if (Objects.equals(this.hash, hash))return;
       this.hash = hash;
       log.info("hash" + hash);
       saveUpdateAttribute(PAttributeNames.HASH,hash);
    }

    public String getAlt(){
      return alt;
    }
    public String getCoords(){
      return coords;
    }
    public String getDownload(){
      return download;
    }
    public String getShape(){
      return shape;
    }
    public String getTarget(){
      return target;
    }
    public String getPing(){
      return ping;
    }
    public String getRel(){
      return rel;
    }
    public String getReferrerPolicy(){
      return referrerPolicy;
    }
    public Boolean getNoHref(){
      return noHref;
    }
    public String getHref(){
      return href;
    }
    public String getOrigin(){
      return origin;
    }
    public String getProtocol(){
      return protocol;
    }
    public String getUsername(){
      return username;
    }
    public String getPassword(){
      return password;
    }
    public String getHost(){
      return host;
    }
    public String getHostname(){
      return hostname;
    }
    public String getPort(){
      return port;
    }
    public String getPathname(){
      return pathname;
    }
    public String getSearch(){
      return search;
    }
    public String getHash(){
      return hash;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_AREA_ELEMENT;
    }


}