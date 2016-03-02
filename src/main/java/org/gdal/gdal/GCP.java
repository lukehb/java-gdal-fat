/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import org.gdal.gdal.gdalJNI;

public class GCP {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected GCP(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    protected static long getCPtr(GCP obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                gdalJNI.delete_GCP(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public GCP(double x, double y, double z, double pixel, double line) {
        this(x, y, z, pixel, line, "", "");
    }

    public GCP(double x, double y, double pixel, double line, String info, String id) {
        this(x, y, 0.0, pixel, line, info, id);
    }

    public GCP(double x, double y, double pixel, double line) {
        this(x, y, 0.0, pixel, line, "", "");
    }

    public void setGCPX(double value) {
        gdalJNI.GCP_GCPX_set(this.swigCPtr, this, value);
    }

    public double getGCPX() {
        return gdalJNI.GCP_GCPX_get(this.swigCPtr, this);
    }

    public void setGCPY(double value) {
        gdalJNI.GCP_GCPY_set(this.swigCPtr, this, value);
    }

    public double getGCPY() {
        return gdalJNI.GCP_GCPY_get(this.swigCPtr, this);
    }

    public void setGCPZ(double value) {
        gdalJNI.GCP_GCPZ_set(this.swigCPtr, this, value);
    }

    public double getGCPZ() {
        return gdalJNI.GCP_GCPZ_get(this.swigCPtr, this);
    }

    public void setGCPPixel(double value) {
        gdalJNI.GCP_GCPPixel_set(this.swigCPtr, this, value);
    }

    public double getGCPPixel() {
        return gdalJNI.GCP_GCPPixel_get(this.swigCPtr, this);
    }

    public void setGCPLine(double value) {
        gdalJNI.GCP_GCPLine_set(this.swigCPtr, this, value);
    }

    public double getGCPLine() {
        return gdalJNI.GCP_GCPLine_get(this.swigCPtr, this);
    }

    public void setInfo(String value) {
        gdalJNI.GCP_Info_set(this.swigCPtr, this, value);
    }

    public String getInfo() {
        return gdalJNI.GCP_Info_get(this.swigCPtr, this);
    }

    public void setId(String value) {
        gdalJNI.GCP_Id_set(this.swigCPtr, this, value);
    }

    public String getId() {
        return gdalJNI.GCP_Id_get(this.swigCPtr, this);
    }

    public GCP(double x, double y, double z, double pixel, double line, String info, String id) {
        this(gdalJNI.new_GCP(x, y, z, pixel, line, info, id), true);
    }
}

