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
package com.ponysdk.core.ui2.dom;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.events.PEventTarget;

public abstract class PNode extends PEventTarget {
    private static final Logger log = LoggerFactory.getLogger(PNode.class);
     private Short nodeType;
     private String nodeName;
     private String baseURI;
     private Boolean isConnected;
     private PDocument ownerDocument;
     private PNode parentNode;
     private PElement parentElement;
     private PNodeList childNodes;
     private PNode firstChild;
     private PNode lastChild;
     private PNode previousSibling;
     private PNode nextSibling;
     private String nodeValue;
     private String textContent;

    public void setNodeValue(final String nodeValue)  {
       if (Objects.equals(this.nodeValue, nodeValue))return;
       this.nodeValue = nodeValue;
       log.info("nodeValue" + nodeValue);
       saveUpdateAttribute(PAttributeNames.NODE_VALUE,nodeValue);
    }
    public void setTextContent(final String textContent)  {
       if (Objects.equals(this.textContent, textContent))return;
       this.textContent = textContent;
       log.info("textContent" + textContent);
       saveUpdateAttribute(PAttributeNames.TEXT_CONTENT,textContent);
    }

    public Short getNodeType(){
      return nodeType;
    }
    public String getNodeName(){
      return nodeName;
    }
    public String getBaseURI(){
      return baseURI;
    }
    public Boolean getIsConnected(){
      return isConnected;
    }
    public PDocument getOwnerDocument(){
      return ownerDocument;
    }
    public PNode getParentNode(){
      return parentNode;
    }
    public PElement getParentElement(){
      return parentElement;
    }
    public PNodeList getChildNodes(){
      return childNodes;
    }
    public PNode getFirstChild(){
      return firstChild;
    }
    public PNode getLastChild(){
      return lastChild;
    }
    public PNode getPreviousSibling(){
      return previousSibling;
    }
    public PNode getNextSibling(){
      return nextSibling;
    }
    public String getNodeValue(){
      return nodeValue;
    }
    public String getTextContent(){
      return textContent;
    }


}