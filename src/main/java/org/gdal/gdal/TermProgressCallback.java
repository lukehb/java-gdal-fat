/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import org.gdal.gdal.ProgressCallback;
import org.gdal.gdal.gdalJNI;

public class TermProgressCallback
extends ProgressCallback {
    private long swigCPtr;

    public TermProgressCallback(long cPtr, boolean cMemoryOwn) {
        super(gdalJNI.TermProgressCallback_SWIGUpcast(cPtr), cMemoryOwn);
        this.swigCPtr = cPtr;
    }

    public static long getCPtr(TermProgressCallback obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                gdalJNI.delete_TermProgressCallback(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    public TermProgressCallback() {
        this(gdalJNI.new_TermProgressCallback(), true);
    }

    public int run(double dfComplete, String pszMessage) {
        return gdalJNI.TermProgressCallback_run(this.swigCPtr, this, dfComplete, pszMessage);
    }
}

