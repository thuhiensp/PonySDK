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
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
public class PHTMLAnchorElement extends PHTMLElement {
    private static final Logger log = LoggerFactory.getLogger(PHTMLAnchorElement.class);
    public PHTMLAnchorElement() {
    }

    public void setTarget(final String target)  {
       setAttribute(PAttributeNames.TARGET, target);
       log.info("target" + target);
    }
    public void setDownload(final String download)  {
       setAttribute(PAttributeNames.DOWNLOAD, download);
       log.info("download" + download);
    }
    public void setPing(final String ping)  {
       setAttribute(PAttributeNames.PING, ping);
       log.info("ping" + ping);
    }
    public void setRel(final String rel)  {
       setAttribute(PAttributeNames.REL, rel);
       log.info("rel" + rel);
    }
    public void setHreflang(final String hreflang)  {
       setAttribute(PAttributeNames.HREFLANG, hreflang);
       log.info("hreflang" + hreflang);
    }
    public void setType(final String type)  {
       setAttribute(PAttributeNames.TYPE_STRING, type);
       log.info("type" + type);
    }
    public void setReferrerPolicy(final String referrerPolicy)  {
       setAttribute(PAttributeNames.REFERRER_POLICY, referrerPolicy);
       log.info("referrerPolicy" + referrerPolicy);
    }
    public void setText(final String text)  {
       setAttribute(PAttributeNames.TEXT, text);
       log.info("text" + text);
    }
    public void setCoords(final String coords)  {
       setAttribute(PAttributeNames.COORDS, coords);
       log.info("coords" + coords);
    }
    public void setCharset(final String charset)  {
       setAttribute(PAttributeNames.CHARSET, charset);
       log.info("charset" + charset);
    }
    public void setName(final String name)  {
       setAttribute(PAttributeNames.NAME, name);
       log.info("name" + name);
    }
    public void setRev(final String rev)  {
       setAttribute(PAttributeNames.REV, rev);
       log.info("rev" + rev);
    }
    public void setShape(final String shape)  {
       setAttribute(PAttributeNames.SHAPE, shape);
       log.info("shape" + shape);
    }
    public void setHref(final String href)  {
       setAttribute(PAttributeNames.HREF, href);
       log.info("href" + href);
    }
    public void setProtocol(final String protocol)  {
       setAttribute(PAttributeNames.PROTOCOL, protocol);
       log.info("protocol" + protocol);
    }
    public void setUsername(final String username)  {
       setAttribute(PAttributeNames.USERNAME, username);
       log.info("username" + username);
    }
    public void setPassword(final String password)  {
       setAttribute(PAttributeNames.PASSWORD, password);
       log.info("password" + password);
    }
    public void setHost(final String host)  {
       setAttribute(PAttributeNames.HOST, host);
       log.info("host" + host);
    }
    public void setHostname(final String hostname)  {
       setAttribute(PAttributeNames.HOSTNAME, hostname);
       log.info("hostname" + hostname);
    }
    public void setPort(final String port)  {
       setAttribute(PAttributeNames.PORT, port);
       log.info("port" + port);
    }
    public void setPathname(final String pathname)  {
       setAttribute(PAttributeNames.PATHNAME, pathname);
       log.info("pathname" + pathname);
    }
    public void setSearch(final String search)  {
       setAttribute(PAttributeNames.SEARCH, search);
       log.info("search" + search);
    }
    public void setHash(final String hash)  {
       setAttribute(PAttributeNames.HASH, hash);
       log.info("hash" + hash);
    }

    public String getTarget(){
      return (String) getAttribute(PAttributeNames.TARGET);
    }
    public String getDownload(){
      return (String) getAttribute(PAttributeNames.DOWNLOAD);
    }
    public String getPing(){
      return (String) getAttribute(PAttributeNames.PING);
    }
    public String getRel(){
      return (String) getAttribute(PAttributeNames.REL);
    }
    public String getHreflang(){
      return (String) getAttribute(PAttributeNames.HREFLANG);
    }
    public String getType(){
      return (String) getAttribute(PAttributeNames.TYPE_STRING);
    }
    public String getReferrerPolicy(){
      return (String) getAttribute(PAttributeNames.REFERRER_POLICY);
    }
    public String getText(){
      return (String) getAttribute(PAttributeNames.TEXT);
    }
    public String getCoords(){
      return (String) getAttribute(PAttributeNames.COORDS);
    }
    public String getCharset(){
      return (String) getAttribute(PAttributeNames.CHARSET);
    }
    public String getName(){
      return (String) getAttribute(PAttributeNames.NAME);
    }
    public String getRev(){
      return (String) getAttribute(PAttributeNames.REV);
    }
    public String getShape(){
      return (String) getAttribute(PAttributeNames.SHAPE);
    }
    public String getHref(){
      return (String) getAttribute(PAttributeNames.HREF);
    }
    public String getProtocol(){
      return (String) getAttribute(PAttributeNames.PROTOCOL);
    }
    public String getUsername(){
      return (String) getAttribute(PAttributeNames.USERNAME);
    }
    public String getPassword(){
      return (String) getAttribute(PAttributeNames.PASSWORD);
    }
    public String getHost(){
      return (String) getAttribute(PAttributeNames.HOST);
    }
    public String getHostname(){
      return (String) getAttribute(PAttributeNames.HOSTNAME);
    }
    public String getPort(){
      return (String) getAttribute(PAttributeNames.PORT);
    }
    public String getPathname(){
      return (String) getAttribute(PAttributeNames.PATHNAME);
    }
    public String getSearch(){
      return (String) getAttribute(PAttributeNames.SEARCH);
    }
    public String getHash(){
      return (String) getAttribute(PAttributeNames.HASH);
    }

    @Override
    protected PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.HTML_ANCHOR_ELEMENT;
    }

    @Override
    protected PLeafTypeWithArgs widgetWithArgs() {
       return null;
    }

    
}