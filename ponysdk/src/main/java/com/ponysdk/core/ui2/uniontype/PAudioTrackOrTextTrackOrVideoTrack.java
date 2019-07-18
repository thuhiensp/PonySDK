package com.ponysdk.core.ui2.uniontype;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.html.track.PAudioTrack;
import com.ponysdk.core.ui2.html.track.PTextTrack;
import com.ponysdk.core.ui2.html.track.PVideoTrack;
public abstract class PAudioTrackOrTextTrackOrVideoTrack extends PObject2 {
PAudioTrack valuePAudioTrack;
PTextTrack valuePTextTrack;
PVideoTrack valuePVideoTrack;
    public PAudioTrackOrTextTrackOrVideoTrack(PAudioTrack value){
        valuePAudioTrack = value;
    }
    public PAudioTrackOrTextTrackOrVideoTrack(PTextTrack value){
        valuePTextTrack = value;
    }
    public PAudioTrackOrTextTrackOrVideoTrack(PVideoTrack value){
        valuePVideoTrack = value;
    }
    public PAudioTrack getValuePAudioTrack(){
      return valuePAudioTrack;
    }

    public PTextTrack getValuePTextTrack(){
      return valuePTextTrack;
    }

    public PVideoTrack getValuePVideoTrack(){
      return valuePVideoTrack;
    }

}