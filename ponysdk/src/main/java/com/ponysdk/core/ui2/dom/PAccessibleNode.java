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
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;

public class PAccessibleNode extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PAccessibleNode.class);
     private PAccessibleNode activeDescendant;
     private Boolean atomic;
     private String autocomplete;
     private Boolean busy;
     private String checked;
     private Double colCount;
     private Double colIndex;
     private Double colSpan;
     private PAccessibleNodeList controls;
     private String current;
     private PAccessibleNodeList describedBy;
     private PAccessibleNode details;
     private Boolean disabled;
     private PAccessibleNode errorMessage;
     private Boolean expanded;
     private PAccessibleNodeList flowTo;
     private Boolean hidden;
     private String invalid;
     private String keyShortcuts;
     private String label;
     private PAccessibleNodeList labeledBy;
     private Double level;
     private String live;
     private Boolean modal;
     private Boolean multiline;
     private Boolean multiselectable;
     private String orientation;
     private PAccessibleNodeList owns;
     private String placeholder;
     private Double posInSet;
     private String pressed;
     private Boolean readOnly;
     private String relevant;
     private Boolean required;
     private String role;
     private String roleDescription;
     private Double rowCount;
     private Double rowIndex;
     private Double rowSpan;
     private Boolean selected;
     private Double setSize;
     private String sort;
     private Double valueMax;
     private Double valueMin;
     private Double valueNow;
     private String valueText;

    public PAccessibleNode() {
      applyInit(widgetNoArgs());
    }

    public void setActiveDescendant(final PAccessibleNode activeDescendant)  {
       if (Objects.equals(this.activeDescendant, activeDescendant))return;
       this.activeDescendant = activeDescendant;
       log.info("activeDescendant" + activeDescendant);
       saveUpdateAttribute(PAttributeNames.ACTIVE_DESCENDANT,activeDescendant);
    }
    public void setAtomic(final Boolean atomic)  {
       if (Objects.equals(this.atomic, atomic))return;
       this.atomic = atomic;
       log.info("atomic" + atomic);
       saveUpdateAttribute(PAttributeNames.ATOMIC,atomic);
    }
    public void setAutocomplete(final String autocomplete)  {
       if (Objects.equals(this.autocomplete, autocomplete))return;
       this.autocomplete = autocomplete;
       log.info("autocomplete" + autocomplete);
       saveUpdateAttribute(PAttributeNames.AUTOCOMPLETE,autocomplete);
    }
    public void setBusy(final Boolean busy)  {
       if (Objects.equals(this.busy, busy))return;
       this.busy = busy;
       log.info("busy" + busy);
       saveUpdateAttribute(PAttributeNames.BUSY,busy);
    }
    public void setChecked(final String checked)  {
       if (Objects.equals(this.checked, checked))return;
       this.checked = checked;
       log.info("checked" + checked);
       saveUpdateAttribute(PAttributeNames.CHECKED,checked);
    }
    public void setColCount(final Double colCount)  {
       if (Objects.equals(this.colCount, colCount))return;
       this.colCount = colCount;
       log.info("colCount" + colCount);
       saveUpdateAttribute(PAttributeNames.COL_COUNT,colCount);
    }
    public void setColIndex(final Double colIndex)  {
       if (Objects.equals(this.colIndex, colIndex))return;
       this.colIndex = colIndex;
       log.info("colIndex" + colIndex);
       saveUpdateAttribute(PAttributeNames.COL_INDEX,colIndex);
    }
    public void setColSpan(final Double colSpan)  {
       if (Objects.equals(this.colSpan, colSpan))return;
       this.colSpan = colSpan;
       log.info("colSpan" + colSpan);
       saveUpdateAttribute(PAttributeNames.COL_SPAN,colSpan);
    }
    public void setControls(final PAccessibleNodeList controls)  {
       if (Objects.equals(this.controls, controls))return;
       this.controls = controls;
       log.info("controls" + controls);
       saveUpdateAttribute(PAttributeNames.CONTROLS,controls);
    }
    public void setCurrent(final String current)  {
       if (Objects.equals(this.current, current))return;
       this.current = current;
       log.info("current" + current);
       saveUpdateAttribute(PAttributeNames.CURRENT,current);
    }
    public void setDescribedBy(final PAccessibleNodeList describedBy)  {
       if (Objects.equals(this.describedBy, describedBy))return;
       this.describedBy = describedBy;
       log.info("describedBy" + describedBy);
       saveUpdateAttribute(PAttributeNames.DESCRIBED_BY,describedBy);
    }
    public void setDetails(final PAccessibleNode details)  {
       if (Objects.equals(this.details, details))return;
       this.details = details;
       log.info("details" + details);
       saveUpdateAttribute(PAttributeNames.DETAILS,details);
    }
    public void setDisabled(final Boolean disabled)  {
       if (Objects.equals(this.disabled, disabled))return;
       this.disabled = disabled;
       log.info("disabled" + disabled);
       saveUpdateAttribute(PAttributeNames.DISABLED,disabled);
    }
    public void setErrorMessage(final PAccessibleNode errorMessage)  {
       if (Objects.equals(this.errorMessage, errorMessage))return;
       this.errorMessage = errorMessage;
       log.info("errorMessage" + errorMessage);
       saveUpdateAttribute(PAttributeNames.ERROR_MESSAGE,errorMessage);
    }
    public void setExpanded(final Boolean expanded)  {
       if (Objects.equals(this.expanded, expanded))return;
       this.expanded = expanded;
       log.info("expanded" + expanded);
       saveUpdateAttribute(PAttributeNames.EXPANDED,expanded);
    }
    public void setFlowTo(final PAccessibleNodeList flowTo)  {
       if (Objects.equals(this.flowTo, flowTo))return;
       this.flowTo = flowTo;
       log.info("flowTo" + flowTo);
       saveUpdateAttribute(PAttributeNames.FLOW_TO,flowTo);
    }
    public void setHidden(final Boolean hidden)  {
       if (Objects.equals(this.hidden, hidden))return;
       this.hidden = hidden;
       log.info("hidden" + hidden);
       saveUpdateAttribute(PAttributeNames.HIDDEN,hidden);
    }
    public void setInvalid(final String invalid)  {
       if (Objects.equals(this.invalid, invalid))return;
       this.invalid = invalid;
       log.info("invalid" + invalid);
       saveUpdateAttribute(PAttributeNames.INVALID,invalid);
    }
    public void setKeyShortcuts(final String keyShortcuts)  {
       if (Objects.equals(this.keyShortcuts, keyShortcuts))return;
       this.keyShortcuts = keyShortcuts;
       log.info("keyShortcuts" + keyShortcuts);
       saveUpdateAttribute(PAttributeNames.KEY_SHORTCUTS,keyShortcuts);
    }
    public void setLabel(final String label)  {
       if (Objects.equals(this.label, label))return;
       this.label = label;
       log.info("label" + label);
       saveUpdateAttribute(PAttributeNames.LABEL,label);
    }
    public void setLabeledBy(final PAccessibleNodeList labeledBy)  {
       if (Objects.equals(this.labeledBy, labeledBy))return;
       this.labeledBy = labeledBy;
       log.info("labeledBy" + labeledBy);
       saveUpdateAttribute(PAttributeNames.LABELED_BY,labeledBy);
    }
    public void setLevel(final Double level)  {
       if (Objects.equals(this.level, level))return;
       this.level = level;
       log.info("level" + level);
       saveUpdateAttribute(PAttributeNames.LEVEL,level);
    }
    public void setLive(final String live)  {
       if (Objects.equals(this.live, live))return;
       this.live = live;
       log.info("live" + live);
       saveUpdateAttribute(PAttributeNames.LIVE,live);
    }
    public void setModal(final Boolean modal)  {
       if (Objects.equals(this.modal, modal))return;
       this.modal = modal;
       log.info("modal" + modal);
       saveUpdateAttribute(PAttributeNames.MODAL,modal);
    }
    public void setMultiline(final Boolean multiline)  {
       if (Objects.equals(this.multiline, multiline))return;
       this.multiline = multiline;
       log.info("multiline" + multiline);
       saveUpdateAttribute(PAttributeNames.MULTILINE,multiline);
    }
    public void setMultiselectable(final Boolean multiselectable)  {
       if (Objects.equals(this.multiselectable, multiselectable))return;
       this.multiselectable = multiselectable;
       log.info("multiselectable" + multiselectable);
       saveUpdateAttribute(PAttributeNames.MULTISELECTABLE,multiselectable);
    }
    public void setOrientation(final String orientation)  {
       if (Objects.equals(this.orientation, orientation))return;
       this.orientation = orientation;
       log.info("orientation" + orientation);
       saveUpdateAttribute(PAttributeNames.ORIENTATION,orientation);
    }
    public void setOwns(final PAccessibleNodeList owns)  {
       if (Objects.equals(this.owns, owns))return;
       this.owns = owns;
       log.info("owns" + owns);
       saveUpdateAttribute(PAttributeNames.OWNS,owns);
    }
    public void setPlaceholder(final String placeholder)  {
       if (Objects.equals(this.placeholder, placeholder))return;
       this.placeholder = placeholder;
       log.info("placeholder" + placeholder);
       saveUpdateAttribute(PAttributeNames.PLACEHOLDER,placeholder);
    }
    public void setPosInSet(final Double posInSet)  {
       if (Objects.equals(this.posInSet, posInSet))return;
       this.posInSet = posInSet;
       log.info("posInSet" + posInSet);
       saveUpdateAttribute(PAttributeNames.POS_IN_SET,posInSet);
    }
    public void setPressed(final String pressed)  {
       if (Objects.equals(this.pressed, pressed))return;
       this.pressed = pressed;
       log.info("pressed" + pressed);
       saveUpdateAttribute(PAttributeNames.PRESSED,pressed);
    }
    public void setReadOnly(final Boolean readOnly)  {
       if (Objects.equals(this.readOnly, readOnly))return;
       this.readOnly = readOnly;
       log.info("readOnly" + readOnly);
       saveUpdateAttribute(PAttributeNames.READ_ONLY,readOnly);
    }
    public void setRelevant(final String relevant)  {
       if (Objects.equals(this.relevant, relevant))return;
       this.relevant = relevant;
       log.info("relevant" + relevant);
       saveUpdateAttribute(PAttributeNames.RELEVANT,relevant);
    }
    public void setRequired(final Boolean required)  {
       if (Objects.equals(this.required, required))return;
       this.required = required;
       log.info("required" + required);
       saveUpdateAttribute(PAttributeNames.REQUIRED,required);
    }
    public void setRole(final String role)  {
       if (Objects.equals(this.role, role))return;
       this.role = role;
       log.info("role" + role);
       saveUpdateAttribute(PAttributeNames.ROLE,role);
    }
    public void setRoleDescription(final String roleDescription)  {
       if (Objects.equals(this.roleDescription, roleDescription))return;
       this.roleDescription = roleDescription;
       log.info("roleDescription" + roleDescription);
       saveUpdateAttribute(PAttributeNames.ROLE_DESCRIPTION,roleDescription);
    }
    public void setRowCount(final Double rowCount)  {
       if (Objects.equals(this.rowCount, rowCount))return;
       this.rowCount = rowCount;
       log.info("rowCount" + rowCount);
       saveUpdateAttribute(PAttributeNames.ROW_COUNT,rowCount);
    }
    public void setRowIndex(final Double rowIndex)  {
       if (Objects.equals(this.rowIndex, rowIndex))return;
       this.rowIndex = rowIndex;
       log.info("rowIndex" + rowIndex);
       saveUpdateAttribute(PAttributeNames.ROW_INDEX,rowIndex);
    }
    public void setRowSpan(final Double rowSpan)  {
       if (Objects.equals(this.rowSpan, rowSpan))return;
       this.rowSpan = rowSpan;
       log.info("rowSpan" + rowSpan);
       saveUpdateAttribute(PAttributeNames.ROW_SPAN,rowSpan);
    }
    public void setSelected(final Boolean selected)  {
       if (Objects.equals(this.selected, selected))return;
       this.selected = selected;
       log.info("selected" + selected);
       saveUpdateAttribute(PAttributeNames.SELECTED,selected);
    }
    public void setSetSize(final Double setSize)  {
       if (Objects.equals(this.setSize, setSize))return;
       this.setSize = setSize;
       log.info("setSize" + setSize);
       saveUpdateAttribute(PAttributeNames.SET_SIZE,setSize);
    }
    public void setSort(final String sort)  {
       if (Objects.equals(this.sort, sort))return;
       this.sort = sort;
       log.info("sort" + sort);
       saveUpdateAttribute(PAttributeNames.SORT,sort);
    }
    public void setValueMax(final Double valueMax)  {
       if (Objects.equals(this.valueMax, valueMax))return;
       this.valueMax = valueMax;
       log.info("valueMax" + valueMax);
       saveUpdateAttribute(PAttributeNames.VALUE_MAX,valueMax);
    }
    public void setValueMin(final Double valueMin)  {
       if (Objects.equals(this.valueMin, valueMin))return;
       this.valueMin = valueMin;
       log.info("valueMin" + valueMin);
       saveUpdateAttribute(PAttributeNames.VALUE_MIN,valueMin);
    }
    public void setValueNow(final Double valueNow)  {
       if (Objects.equals(this.valueNow, valueNow))return;
       this.valueNow = valueNow;
       log.info("valueNow" + valueNow);
       saveUpdateAttribute(PAttributeNames.VALUE_NOW,valueNow);
    }
    public void setValueText(final String valueText)  {
       if (Objects.equals(this.valueText, valueText))return;
       this.valueText = valueText;
       log.info("valueText" + valueText);
       saveUpdateAttribute(PAttributeNames.VALUE_TEXT,valueText);
    }

    public PAccessibleNode getActiveDescendant(){
      return activeDescendant;
    }
    public Boolean getAtomic(){
      return atomic;
    }
    public String getAutocomplete(){
      return autocomplete;
    }
    public Boolean getBusy(){
      return busy;
    }
    public String getChecked(){
      return checked;
    }
    public Double getColCount(){
      return colCount;
    }
    public Double getColIndex(){
      return colIndex;
    }
    public Double getColSpan(){
      return colSpan;
    }
    public PAccessibleNodeList getControls(){
      return controls;
    }
    public String getCurrent(){
      return current;
    }
    public PAccessibleNodeList getDescribedBy(){
      return describedBy;
    }
    public PAccessibleNode getDetails(){
      return details;
    }
    public Boolean getDisabled(){
      return disabled;
    }
    public PAccessibleNode getErrorMessage(){
      return errorMessage;
    }
    public Boolean getExpanded(){
      return expanded;
    }
    public PAccessibleNodeList getFlowTo(){
      return flowTo;
    }
    public Boolean getHidden(){
      return hidden;
    }
    public String getInvalid(){
      return invalid;
    }
    public String getKeyShortcuts(){
      return keyShortcuts;
    }
    public String getLabel(){
      return label;
    }
    public PAccessibleNodeList getLabeledBy(){
      return labeledBy;
    }
    public Double getLevel(){
      return level;
    }
    public String getLive(){
      return live;
    }
    public Boolean getModal(){
      return modal;
    }
    public Boolean getMultiline(){
      return multiline;
    }
    public Boolean getMultiselectable(){
      return multiselectable;
    }
    public String getOrientation(){
      return orientation;
    }
    public PAccessibleNodeList getOwns(){
      return owns;
    }
    public String getPlaceholder(){
      return placeholder;
    }
    public Double getPosInSet(){
      return posInSet;
    }
    public String getPressed(){
      return pressed;
    }
    public Boolean getReadOnly(){
      return readOnly;
    }
    public String getRelevant(){
      return relevant;
    }
    public Boolean getRequired(){
      return required;
    }
    public String getRole(){
      return role;
    }
    public String getRoleDescription(){
      return roleDescription;
    }
    public Double getRowCount(){
      return rowCount;
    }
    public Double getRowIndex(){
      return rowIndex;
    }
    public Double getRowSpan(){
      return rowSpan;
    }
    public Boolean getSelected(){
      return selected;
    }
    public Double getSetSize(){
      return setSize;
    }
    public String getSort(){
      return sort;
    }
    public Double getValueMax(){
      return valueMax;
    }
    public Double getValueMin(){
      return valueMin;
    }
    public Double getValueNow(){
      return valueNow;
    }
    public String getValueText(){
      return valueText;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.ACCESSIBLE_NODE;
    }


}