package com.ponysdk.core.ui2.uniontype;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.fileapi.PFile;
public abstract class PFormDataEntryValue extends PObject2 {
PFile valuePFile;
String valueString;
    public PFormDataEntryValue(PFile value){
        valuePFile = value;
    }
    public PFormDataEntryValue(String value){
        valueString = value;
    }
    public PFile getValuePFile(){
      return valuePFile;
    }

    public String getValueString(){
      return valueString;
    }

}