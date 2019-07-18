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
import com.ponysdk.core.ui2.css.cssom.PStylePropertyMap;
import com.ponysdk.core.ui2.events.PEventHandlerNonNull;
import com.ponysdk.core.ui2.html.PHTMLCollection;
import com.ponysdk.core.ui2.html.PHTMLSlotElement;

public abstract class PElement extends PNode {
    private static final Logger log = LoggerFactory.getLogger(PElement.class);
     private String namespaceURI;
     private String prefix;
     private String localName;
     private String tagName;
     private String id;
     private String className;
     private PDOMTokenList classList;
     private String slot;
     private PNamedNodeMap attributes;
     private PShadowRoot shadowRoot;
     private PHTMLSlotElement assignedSlot;
     private String innerHTML;
     private String outerHTML;
     private Double scrollTop;
     private Double scrollLeft;
     private Double scrollWidth;
     private Double scrollHeight;
     private Double clientTop;
     private Double clientLeft;
     private Double clientWidth;
     private Double clientHeight;
     private PStylePropertyMap styleMap;
     private String computedRole;
     private String computedName;
     private PAccessibleNode accessibleNode;
     private PEventHandlerNonNull onbeforecopy;
     private PEventHandlerNonNull onbeforecut;
     private PEventHandlerNonNull onbeforepaste;
     private PEventHandlerNonNull oncopy;
     private PEventHandlerNonNull oncut;
     private PEventHandlerNonNull onpaste;
     private PEventHandlerNonNull onsearch;
     private PEventHandlerNonNull onselectstart;
     private PEventHandlerNonNull onwheel;
     private PEventHandlerNonNull onfullscreenchange;
     private PEventHandlerNonNull onfullscreenerror;
     private PEventHandlerNonNull onwebkitfullscreenchange;
     private PEventHandlerNonNull onwebkitfullscreenerror;
     private PHTMLCollection children;
     private PElement firstElementChild;
     private PElement lastElementChild;
     private Double childElementCount;
     private PElement previousElementSibling;
     private PElement nextElementSibling;

    public void setId(final String id)  {
       if (Objects.equals(this.id, id))return;
       this.id = id;
       log.info("id" + id);
       saveUpdateAttribute(PAttributeNames.ID,id);
    }
    public void setClassName(final String className)  {
       if (Objects.equals(this.className, className))return;
       this.className = className;
       log.info("className" + className);
       saveUpdateAttribute(PAttributeNames.CLASS_NAME,className);
    }
    public void setSlot(final String slot)  {
       if (Objects.equals(this.slot, slot))return;
       this.slot = slot;
       log.info("slot" + slot);
       saveUpdateAttribute(PAttributeNames.SLOT,slot);
    }
    public void setInnerHTML(final String innerHTML)  {
       if (Objects.equals(this.innerHTML, innerHTML))return;
       this.innerHTML = innerHTML;
       log.info("innerHTML" + innerHTML);
       saveUpdateAttribute(PAttributeNames.INNERHTML,innerHTML);
    }
    public void setOuterHTML(final String outerHTML)  {
       if (Objects.equals(this.outerHTML, outerHTML))return;
       this.outerHTML = outerHTML;
       log.info("outerHTML" + outerHTML);
       saveUpdateAttribute(PAttributeNames.OUTERHTML,outerHTML);
    }
    public void setScrollTop(final Double scrollTop)  {
       if (Objects.equals(this.scrollTop, scrollTop))return;
       this.scrollTop = scrollTop;
       log.info("scrollTop" + scrollTop);
       saveUpdateAttribute(PAttributeNames.SCROLL_TOP,scrollTop);
    }
    public void setScrollLeft(final Double scrollLeft)  {
       if (Objects.equals(this.scrollLeft, scrollLeft))return;
       this.scrollLeft = scrollLeft;
       log.info("scrollLeft" + scrollLeft);
       saveUpdateAttribute(PAttributeNames.SCROLL_LEFT,scrollLeft);
    }
    public void setOnbeforecopy(final PEventHandlerNonNull onbeforecopy, final PEventAttributesName... atrsName)  {
       addHandler(onbeforecopy);
       saveUpdateAttributeCallBack(PAttributeNames.ONBEFORECOPY, onbeforecopy, atrsName);
    }
    public void setOnbeforecut(final PEventHandlerNonNull onbeforecut, final PEventAttributesName... atrsName)  {
       addHandler(onbeforecut);
       saveUpdateAttributeCallBack(PAttributeNames.ONBEFORECUT, onbeforecut, atrsName);
    }
    public void setOnbeforepaste(final PEventHandlerNonNull onbeforepaste, final PEventAttributesName... atrsName)  {
       addHandler(onbeforepaste);
       saveUpdateAttributeCallBack(PAttributeNames.ONBEFOREPASTE, onbeforepaste, atrsName);
    }
    public void setOncopy(final PEventHandlerNonNull oncopy, final PEventAttributesName... atrsName)  {
       addHandler(oncopy);
       saveUpdateAttributeCallBack(PAttributeNames.ONCOPY, oncopy, atrsName);
    }
    public void setOncut(final PEventHandlerNonNull oncut, final PEventAttributesName... atrsName)  {
       addHandler(oncut);
       saveUpdateAttributeCallBack(PAttributeNames.ONCUT, oncut, atrsName);
    }
    public void setOnpaste(final PEventHandlerNonNull onpaste, final PEventAttributesName... atrsName)  {
       addHandler(onpaste);
       saveUpdateAttributeCallBack(PAttributeNames.ONPASTE, onpaste, atrsName);
    }
    public void setOnsearch(final PEventHandlerNonNull onsearch, final PEventAttributesName... atrsName)  {
       addHandler(onsearch);
       saveUpdateAttributeCallBack(PAttributeNames.ONSEARCH, onsearch, atrsName);
    }
    public void setOnselectstart(final PEventHandlerNonNull onselectstart, final PEventAttributesName... atrsName)  {
       addHandler(onselectstart);
       saveUpdateAttributeCallBack(PAttributeNames.ONSELECTSTART, onselectstart, atrsName);
    }
    public void setOnwheel(final PEventHandlerNonNull onwheel, final PEventAttributesName... atrsName)  {
       addHandler(onwheel);
       saveUpdateAttributeCallBack(PAttributeNames.ONWHEEL, onwheel, atrsName);
    }
    public void setOnfullscreenchange(final PEventHandlerNonNull onfullscreenchange, final PEventAttributesName... atrsName)  {
       addHandler(onfullscreenchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONFULLSCREENCHANGE, onfullscreenchange, atrsName);
    }
    public void setOnfullscreenerror(final PEventHandlerNonNull onfullscreenerror, final PEventAttributesName... atrsName)  {
       addHandler(onfullscreenerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONFULLSCREENERROR, onfullscreenerror, atrsName);
    }
    public void setOnwebkitfullscreenchange(final PEventHandlerNonNull onwebkitfullscreenchange, final PEventAttributesName... atrsName)  {
       addHandler(onwebkitfullscreenchange);
       saveUpdateAttributeCallBack(PAttributeNames.ONWEBKITFULLSCREENCHANGE, onwebkitfullscreenchange, atrsName);
    }
    public void setOnwebkitfullscreenerror(final PEventHandlerNonNull onwebkitfullscreenerror, final PEventAttributesName... atrsName)  {
       addHandler(onwebkitfullscreenerror);
       saveUpdateAttributeCallBack(PAttributeNames.ONWEBKITFULLSCREENERROR, onwebkitfullscreenerror, atrsName);
    }

    public String getNamespaceURI(){
      return namespaceURI;
    }
    public String getPrefix(){
      return prefix;
    }
    public String getLocalName(){
      return localName;
    }
    public String getTagName(){
      return tagName;
    }
    public String getId(){
      return id;
    }
    public String getClassName(){
      return className;
    }
    public PDOMTokenList getClassList(){
      return classList;
    }
    public String getSlot(){
      return slot;
    }
    public PNamedNodeMap getAttributes(){
      return attributes;
    }
    public PShadowRoot getShadowRoot(){
      return shadowRoot;
    }
    public PHTMLSlotElement getAssignedSlot(){
      return assignedSlot;
    }
    public String getInnerHTML(){
      return innerHTML;
    }
    public String getOuterHTML(){
      return outerHTML;
    }
    public Double getScrollTop(){
      return scrollTop;
    }
    public Double getScrollLeft(){
      return scrollLeft;
    }
    public Double getScrollWidth(){
      return scrollWidth;
    }
    public Double getScrollHeight(){
      return scrollHeight;
    }
    public Double getClientTop(){
      return clientTop;
    }
    public Double getClientLeft(){
      return clientLeft;
    }
    public Double getClientWidth(){
      return clientWidth;
    }
    public Double getClientHeight(){
      return clientHeight;
    }
    public PStylePropertyMap getStyleMap(){
      return styleMap;
    }
    public String getComputedRole(){
      return computedRole;
    }
    public String getComputedName(){
      return computedName;
    }
    public PAccessibleNode getAccessibleNode(){
      return accessibleNode;
    }
    public PEventHandlerNonNull getOnbeforecopy(){
      return onbeforecopy;
    }
    public PEventHandlerNonNull getOnbeforecut(){
      return onbeforecut;
    }
    public PEventHandlerNonNull getOnbeforepaste(){
      return onbeforepaste;
    }
    public PEventHandlerNonNull getOncopy(){
      return oncopy;
    }
    public PEventHandlerNonNull getOncut(){
      return oncut;
    }
    public PEventHandlerNonNull getOnpaste(){
      return onpaste;
    }
    public PEventHandlerNonNull getOnsearch(){
      return onsearch;
    }
    public PEventHandlerNonNull getOnselectstart(){
      return onselectstart;
    }
    public PEventHandlerNonNull getOnwheel(){
      return onwheel;
    }
    public PEventHandlerNonNull getOnfullscreenchange(){
      return onfullscreenchange;
    }
    public PEventHandlerNonNull getOnfullscreenerror(){
      return onfullscreenerror;
    }
    public PEventHandlerNonNull getOnwebkitfullscreenchange(){
      return onwebkitfullscreenchange;
    }
    public PEventHandlerNonNull getOnwebkitfullscreenerror(){
      return onwebkitfullscreenerror;
    }
    public PHTMLCollection getChildren(){
      return children;
    }
    public PElement getFirstElementChild(){
      return firstElementChild;
    }
    public PElement getLastElementChild(){
      return lastElementChild;
    }
    public Double getChildElementCount(){
      return childElementCount;
    }
    public PElement getPreviousElementSibling(){
      return previousElementSibling;
    }
    public PElement getNextElementSibling(){
      return nextElementSibling;
    }


}