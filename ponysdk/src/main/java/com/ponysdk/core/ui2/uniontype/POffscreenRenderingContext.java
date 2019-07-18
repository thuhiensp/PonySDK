package com.ponysdk.core.ui2.uniontype;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.offscreencanvas2d.POffscreenCanvasRenderingContext2D;
import com.ponysdk.core.ui2.webgl.PWebGLRenderingContext;
import com.ponysdk.core.ui2.webgl.PWebGL2RenderingContext;
public abstract class POffscreenRenderingContext extends PObject2 {
POffscreenCanvasRenderingContext2D valuePOffscreenCanvasRenderingContext2D;
PWebGLRenderingContext valuePWebGLRenderingContext;
PWebGL2RenderingContext valuePWebGL2RenderingContext;
    public POffscreenRenderingContext(POffscreenCanvasRenderingContext2D value){
        valuePOffscreenCanvasRenderingContext2D = value;
    }
    public POffscreenRenderingContext(PWebGLRenderingContext value){
        valuePWebGLRenderingContext = value;
    }
    public POffscreenRenderingContext(PWebGL2RenderingContext value){
        valuePWebGL2RenderingContext = value;
    }
    public POffscreenCanvasRenderingContext2D getValuePOffscreenCanvasRenderingContext2D(){
      return valuePOffscreenCanvasRenderingContext2D;
    }

    public PWebGLRenderingContext getValuePWebGLRenderingContext(){
      return valuePWebGLRenderingContext;
    }

    public PWebGL2RenderingContext getValuePWebGL2RenderingContext(){
      return valuePWebGL2RenderingContext;
    }

}