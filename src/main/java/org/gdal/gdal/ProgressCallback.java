/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import org.gdal.gdal.gdalJNI;

public class ProgressCallback {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    public ProgressCallback(long cPtr, boolean cMemoryOwn) {
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    public static long getCPtr(ProgressCallback obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                gdalJNI.delete_ProgressCallback(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public int run(double dfComplete, String pszMessage) {
        return gdalJNI.ProgressCallback_run(this.swigCPtr, this, dfComplete, pszMessage);
    }

    public ProgressCallback() {
        this(gdalJNI.new_ProgressCallback(), true);
    }
}

