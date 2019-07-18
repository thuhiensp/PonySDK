package com.ponysdk.core.ui2.uniontype;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.serviceworkers.PClient;
import com.ponysdk.core.ui2.dom.PMessagePort;
import com.ponysdk.core.ui2.serviceworkers.PServiceWorker;
public abstract class PClientOrMessagePortOrServiceWorker extends PObject2 {
PClient valuePClient;
PMessagePort valuePMessagePort;
PServiceWorker valuePServiceWorker;
    public PClientOrMessagePortOrServiceWorker(PClient value){
        valuePClient = value;
    }
    public PClientOrMessagePortOrServiceWorker(PMessagePort value){
        valuePMessagePort = value;
    }
    public PClientOrMessagePortOrServiceWorker(PServiceWorker value){
        valuePServiceWorker = value;
    }
    public PClient getValuePClient(){
      return valuePClient;
    }

    public PMessagePort getValuePMessagePort(){
      return valuePMessagePort;
    }

    public PServiceWorker getValuePServiceWorker(){
      return valuePServiceWorker;
    }

}