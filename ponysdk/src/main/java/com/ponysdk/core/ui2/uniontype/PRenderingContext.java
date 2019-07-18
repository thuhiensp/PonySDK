package com.ponysdk.core.ui2.uniontype;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.canvas2d.PCanvasRenderingContext2D;
import com.ponysdk.core.ui2.webgl.PWebGLRenderingContext;
import com.ponysdk.core.ui2.webgl.PWebGL2RenderingContext;
import com.ponysdk.core.ui2.imagebitmap.PImageBitmapRenderingContext;
public abstract class PRenderingContext extends PObject2 {
PCanvasRenderingContext2D valuePCanvasRenderingContext2D;
PWebGLRenderingContext valuePWebGLRenderingContext;
PWebGL2RenderingContext valuePWebGL2RenderingContext;
PImageBitmapRenderingContext valuePImageBitmapRenderingContext;
    public PRenderingContext(PCanvasRenderingContext2D value){
        valuePCanvasRenderingContext2D = value;
    }
    public PRenderingContext(PWebGLRenderingContext value){
        valuePWebGLRenderingContext = value;
    }
    public PRenderingContext(PWebGL2RenderingContext value){
        valuePWebGL2RenderingContext = value;
    }
    public PRenderingContext(PImageBitmapRenderingContext value){
        valuePImageBitmapRenderingContext = value;
    }
    public PCanvasRenderingContext2D getValuePCanvasRenderingContext2D(){
      return valuePCanvasRenderingContext2D;
    }

    public PWebGLRenderingContext getValuePWebGLRenderingContext(){
      return valuePWebGLRenderingContext;
    }

    public PWebGL2RenderingContext getValuePWebGL2RenderingContext(){
      return valuePWebGL2RenderingContext;
    }

    public PImageBitmapRenderingContext getValuePImageBitmapRenderingContext(){
      return valuePImageBitmapRenderingContext;
    }

}