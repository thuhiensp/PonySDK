package com.ponysdk.core.ui2.uniontype;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.dom.PNodeList;
import com.ponysdk.core.ui2.dom.PElement;
public abstract class PHTMLOptionsUnion extends PObject2 {
PNodeList valuePNodeList;
PElement valuePElement;
    public PHTMLOptionsUnion(PNodeList value){
        valuePNodeList = value;
    }
    public PHTMLOptionsUnion(PElement value){
        valuePElement = value;
    }
    public PNodeList getValuePNodeList(){
      return valuePNodeList;
    }

    public PElement getValuePElement(){
      return valuePElement;
    }

}