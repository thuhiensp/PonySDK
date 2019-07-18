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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PHTMLHyperlinkElementUtils extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PHTMLHyperlinkElementUtils.class);
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

    public PHTMLHyperlinkElementUtils() {
      applyInit(widgetNoArgs());
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
      return PLeafTypeNoArgs.HTML_HYPERLINK_ELEMENT_UTILS;
    }


}