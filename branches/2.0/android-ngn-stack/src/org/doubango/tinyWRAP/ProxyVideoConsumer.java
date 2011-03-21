/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class ProxyVideoConsumer extends ProxyPlugin {
  private long swigCPtr;

  public ProxyVideoConsumer(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.ProxyVideoConsumer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ProxyVideoConsumer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_ProxyVideoConsumer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean setDisplaySize(int width, int height) {
    return tinyWRAPJNI.ProxyVideoConsumer_setDisplaySize(swigCPtr, this, width, height);
  }

  public void setCallback(ProxyVideoConsumerCallback _callback) {
    tinyWRAPJNI.ProxyVideoConsumer_setCallback(swigCPtr, this, ProxyVideoConsumerCallback.getCPtr(_callback), _callback);
  }

  public java.math.BigInteger getMediaSessionId() {
    return tinyWRAPJNI.ProxyVideoConsumer_getMediaSessionId(swigCPtr, this);
  }

  public static boolean registerPlugin() {
    return tinyWRAPJNI.ProxyVideoConsumer_registerPlugin();
  }

  public static void setDefaultChroma(tmedia_chroma_t chroma) {
    tinyWRAPJNI.ProxyVideoConsumer_setDefaultChroma(chroma.swigValue());
  }

}
