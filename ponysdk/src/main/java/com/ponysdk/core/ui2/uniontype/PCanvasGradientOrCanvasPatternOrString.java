package com.ponysdk.core.ui2.uniontype;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.canvas2d.PCanvasGradient;
import com.ponysdk.core.ui2.canvas2d.PCanvasPattern;
public abstract class PCanvasGradientOrCanvasPatternOrString extends PObject2 {
PCanvasGradient valuePCanvasGradient;
PCanvasPattern valuePCanvasPattern;
String valueString;
    public PCanvasGradientOrCanvasPatternOrString(PCanvasGradient value){
        valuePCanvasGradient = value;
    }
    public PCanvasGradientOrCanvasPatternOrString(PCanvasPattern value){
        valuePCanvasPattern = value;
    }
    public PCanvasGradientOrCanvasPatternOrString(String value){
        valueString = value;
    }
    public PCanvasGradient getValuePCanvasGradient(){
      return valuePCanvasGradient;
    }

    public PCanvasPattern getValuePCanvasPattern(){
      return valuePCanvasPattern;
    }

    public String getValueString(){
      return valueString;
    }

}