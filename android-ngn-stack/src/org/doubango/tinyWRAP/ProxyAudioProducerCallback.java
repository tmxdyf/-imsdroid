/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.39
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class ProxyAudioProducerCallback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ProxyAudioProducerCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProxyAudioProducerCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      tinyWRAPJNI.delete_ProxyAudioProducerCallback(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    tinyWRAPJNI.ProxyAudioProducerCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    tinyWRAPJNI.ProxyAudioProducerCallback_change_ownership(this, swigCPtr, true);
  }

  public ProxyAudioProducerCallback() {
    this(tinyWRAPJNI.new_ProxyAudioProducerCallback(), true);
    tinyWRAPJNI.ProxyAudioProducerCallback_director_connect(this, swigCPtr, swigCMemOwn, false);
  }

  public int prepare(int ptime, int rate, int channels) {
    return (getClass() == ProxyAudioProducerCallback.class) ? tinyWRAPJNI.ProxyAudioProducerCallback_prepare(swigCPtr, this, ptime, rate, channels) : tinyWRAPJNI.ProxyAudioProducerCallback_prepareSwigExplicitProxyAudioProducerCallback(swigCPtr, this, ptime, rate, channels);
  }

  public int start() {
    return (getClass() == ProxyAudioProducerCallback.class) ? tinyWRAPJNI.ProxyAudioProducerCallback_start(swigCPtr, this) : tinyWRAPJNI.ProxyAudioProducerCallback_startSwigExplicitProxyAudioProducerCallback(swigCPtr, this);
  }

  public int pause() {
    return (getClass() == ProxyAudioProducerCallback.class) ? tinyWRAPJNI.ProxyAudioProducerCallback_pause(swigCPtr, this) : tinyWRAPJNI.ProxyAudioProducerCallback_pauseSwigExplicitProxyAudioProducerCallback(swigCPtr, this);
  }

  public int stop() {
    return (getClass() == ProxyAudioProducerCallback.class) ? tinyWRAPJNI.ProxyAudioProducerCallback_stop(swigCPtr, this) : tinyWRAPJNI.ProxyAudioProducerCallback_stopSwigExplicitProxyAudioProducerCallback(swigCPtr, this);
  }

}
