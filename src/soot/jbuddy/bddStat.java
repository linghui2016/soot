/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.17u-20021128-1508
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package soot.jbuddy;


public class bddStat {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected bddStat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      JBuddyJNI.delete_bddStat(swigCPtr);
      swigCMemOwn = false;
    }
    swigCPtr = 0;
  }

  protected static long getCPtr(bddStat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public void setProduced(int produced) {
    JBuddyJNI.set_bddStat_produced(swigCPtr, produced);
  }

  public int getProduced() {
    return JBuddyJNI.get_bddStat_produced(swigCPtr);
  }

  public void setNodenum(int nodenum) {
    JBuddyJNI.set_bddStat_nodenum(swigCPtr, nodenum);
  }

  public int getNodenum() {
    return JBuddyJNI.get_bddStat_nodenum(swigCPtr);
  }

  public void setMaxnodenum(int maxnodenum) {
    JBuddyJNI.set_bddStat_maxnodenum(swigCPtr, maxnodenum);
  }

  public int getMaxnodenum() {
    return JBuddyJNI.get_bddStat_maxnodenum(swigCPtr);
  }

  public void setFreenodes(int freenodes) {
    JBuddyJNI.set_bddStat_freenodes(swigCPtr, freenodes);
  }

  public int getFreenodes() {
    return JBuddyJNI.get_bddStat_freenodes(swigCPtr);
  }

  public void setMinfreenodes(int minfreenodes) {
    JBuddyJNI.set_bddStat_minfreenodes(swigCPtr, minfreenodes);
  }

  public int getMinfreenodes() {
    return JBuddyJNI.get_bddStat_minfreenodes(swigCPtr);
  }

  public void setVarnum(int varnum) {
    JBuddyJNI.set_bddStat_varnum(swigCPtr, varnum);
  }

  public int getVarnum() {
    return JBuddyJNI.get_bddStat_varnum(swigCPtr);
  }

  public void setCachesize(int cachesize) {
    JBuddyJNI.set_bddStat_cachesize(swigCPtr, cachesize);
  }

  public int getCachesize() {
    return JBuddyJNI.get_bddStat_cachesize(swigCPtr);
  }

  public void setGbcnum(int gbcnum) {
    JBuddyJNI.set_bddStat_gbcnum(swigCPtr, gbcnum);
  }

  public int getGbcnum() {
    return JBuddyJNI.get_bddStat_gbcnum(swigCPtr);
  }

  public bddStat() {
    this(JBuddyJNI.new_bddStat(), true);
  }

}
