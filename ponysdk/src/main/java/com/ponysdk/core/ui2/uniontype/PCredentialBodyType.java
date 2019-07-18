package com.ponysdk.core.ui2.uniontype;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.html.PFormData;
import com.ponysdk.core.ui2.dom.PURLSearchParams;
public abstract class PCredentialBodyType extends PObject2 {
PFormData valuePFormData;
PURLSearchParams valuePURLSearchParams;
    public PCredentialBodyType(PFormData value){
        valuePFormData = value;
    }
    public PCredentialBodyType(PURLSearchParams value){
        valuePURLSearchParams = value;
    }
    public PFormData getValuePFormData(){
      return valuePFormData;
    }

    public PURLSearchParams getValuePURLSearchParams(){
      return valuePURLSearchParams;
    }

}