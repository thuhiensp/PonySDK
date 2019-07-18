package com.ponysdk.core.ui2.uniontype;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.html.PHTMLScriptElement;
import com.ponysdk.core.ui2.svg.PSVGScriptElement;
public abstract class PHTMLOrSVGScriptElement extends PObject2 {
PHTMLScriptElement valuePHTMLScriptElement;
PSVGScriptElement valuePSVGScriptElement;
    public PHTMLOrSVGScriptElement(PHTMLScriptElement value){
        valuePHTMLScriptElement = value;
    }
    public PHTMLOrSVGScriptElement(PSVGScriptElement value){
        valuePSVGScriptElement = value;
    }
    public PHTMLScriptElement getValuePHTMLScriptElement(){
      return valuePHTMLScriptElement;
    }

    public PSVGScriptElement getValuePSVGScriptElement(){
      return valuePSVGScriptElement;
    }

}