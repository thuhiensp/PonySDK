package com.ponysdk.core.ui2.uniontype;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.html.PRadioNodeList;
import com.ponysdk.core.ui2.dom.PElement;
public abstract class PFormControlsUnion extends PObject2 {
PRadioNodeList valuePRadioNodeList;
PElement valuePElement;
    public PFormControlsUnion(PRadioNodeList value){
        valuePRadioNodeList = value;
    }
    public PFormControlsUnion(PElement value){
        valuePElement = value;
    }
    public PRadioNodeList getValuePRadioNodeList(){
      return valuePRadioNodeList;
    }

    public PElement getValuePElement(){
      return valuePElement;
    }

}