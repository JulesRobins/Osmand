/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class RasterBitmapTile extends MapTiledData {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected RasterBitmapTile(long cPtr, boolean cMemoryOwn) {
    super(OsmAndCoreJNI.RasterBitmapTile_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RasterBitmapTile obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        OsmAndCoreJNI.delete_RasterBitmapTile(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RasterBitmapTile(SWIGTYPE_p_std__shared_ptrT_SkBitmap_const_t bitmap, AlphaChannelData alphaChannelData, float densityFactor, TileId tileId, ZoomLevel zoom) {
    this(OsmAndCoreJNI.new_RasterBitmapTile(SWIGTYPE_p_std__shared_ptrT_SkBitmap_const_t.getCPtr(bitmap), alphaChannelData.swigValue(), densityFactor, TileId.getCPtr(tileId), tileId, zoom.swigValue()), true);
  }

  public void setBitmap(SWIGTYPE_p_std__shared_ptrT_SkBitmap_const_t value) {
    OsmAndCoreJNI.RasterBitmapTile_bitmap_set(swigCPtr, this, SWIGTYPE_p_std__shared_ptrT_SkBitmap_const_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__shared_ptrT_SkBitmap_const_t getBitmap() {
    long cPtr = OsmAndCoreJNI.RasterBitmapTile_bitmap_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__shared_ptrT_SkBitmap_const_t(cPtr, false);
  }

  public void setAlphaChannelData(AlphaChannelData value) {
    OsmAndCoreJNI.RasterBitmapTile_alphaChannelData_set(swigCPtr, this, value.swigValue());
  }

  public AlphaChannelData getAlphaChannelData() {
    return AlphaChannelData.swigToEnum(OsmAndCoreJNI.RasterBitmapTile_alphaChannelData_get(swigCPtr, this));
  }

  public void setDensityFactor(float value) {
    OsmAndCoreJNI.RasterBitmapTile_densityFactor_set(swigCPtr, this, value);
  }

  public float getDensityFactor() {
    return OsmAndCoreJNI.RasterBitmapTile_densityFactor_get(swigCPtr, this);
  }

  public void releaseConsumableContent() {
    OsmAndCoreJNI.RasterBitmapTile_releaseConsumableContent(swigCPtr, this);
  }

}