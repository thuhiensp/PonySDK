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

public class PHTMLAnchorElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLAnchorElement.class);
     private String target;
     private String download;
     private String ping;
     private String rel;
     private String hreflang;
     private String type;
     private String referrerPolicy;
     private String text;
     private String coords;
     private String charset;
     private String name;
     private String rev;
     private String shape;
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

    public PHTMLAnchorElement() {
      applyInit(widgetNoArgs());
    }

    public void setTarget(final String target)  {
       if (Objects.equals(this.target, target))return;
       this.target = target;
       log.info("target" + target);
       saveUpdateAttribute(PAttributeNames.TARGET,target);
    }
    public void setDownload(final String download)  {
       if (Objects.equals(this.download, download))return;
       this.download = download;
       log.info("download" + download);
       saveUpdateAttribute(PAttributeNames.DOWNLOAD,download);
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
    public void setReferrerPolicy(final String referrerPolicy)  {
       if (Objects.equals(this.referrerPolicy, referrerPolicy))return;
       this.referrerPolicy = referrerPolicy;
       log.info("referrerPolicy" + referrerPolicy);
       saveUpdateAttribute(PAttributeNames.REFERRER_POLICY,referrerPolicy);
    }
    public void setText(final String text)  {
       if (Objects.equals(this.text, text))return;
       this.text = text;
       log.info("text" + text);
       saveUpdateAttribute(PAttributeNames.TEXT,text);
    }
    public void setCoords(final String coords)  {
       if (Objects.equals(this.coords, coords))return;
       this.coords = coords;
       log.info("coords" + coords);
       saveUpdateAttribute(PAttributeNames.COORDS,coords);
    }
    public void setCharset(final String charset)  {
       if (Objects.equals(this.charset, charset))return;
       this.charset = charset;
       log.info("charset" + charset);
       saveUpdateAttribute(PAttributeNames.CHARSET,charset);
    }
    public void setName(final String name)  {
       if (Objects.equals(this.name, name))return;
       this.name = name;
       log.info("name" + name);
       saveUpdateAttribute(PAttributeNames.NAME,name);
    }
    public void setRev(final String rev)  {
       if (Objects.equals(this.rev, rev))return;
       this.rev = rev;
       log.info("rev" + rev);
       saveUpdateAttribute(PAttributeNames.REV,rev);
    }
    public void setShape(final String shape)  {
       if (Objects.equals(this.shape, shape))return;
       this.shape = shape;
       log.info("shape" + shape);
       saveUpdateAttribute(PAttributeNames.SHAPE,shape);
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

    public String getTarget(){
      return target;
    }
    public String getDownload(){
      return download;
    }
    public String getPing(){
      return ping;
    }
    public String getRel(){
      return rel;
    }
    public String getHreflang(){
      return hreflang;
    }
    public String getType(){
      return type;
    }
    public String getReferrerPolicy(){
      return referrerPolicy;
    }
    public String getText(){
      return text;
    }
    public String getCoords(){
      return coords;
    }
    public String getCharset(){
      return charset;
    }
    public String getName(){
      return name;
    }
    public String getRev(){
      return rev;
    }
    public String getShape(){
      return shape;
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
      return PLeafTypeNoArgs.HTML_ANCHOR_ELEMENT;
    }


}