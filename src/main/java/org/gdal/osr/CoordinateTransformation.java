/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.osr;

import org.gdal.osr.SpatialReference;
import org.gdal.osr.osrJNI;

public class CoordinateTransformation {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    public CoordinateTransformation(long cPtr, boolean cMemoryOwn) {
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    public static long getCPtr(CoordinateTransformation obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                osrJNI.delete_CoordinateTransformation(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public double[] TransformPoint(double x, double y, double z) {
        double[] ret = new double[3];
        this.TransformPoint(ret, x, y, z);
        return ret;
    }

    public double[] TransformPoint(double x, double y) {
        return this.TransformPoint(x, y, 0.0);
    }

    public CoordinateTransformation(SpatialReference src, SpatialReference dst) {
        this(osrJNI.new_CoordinateTransformation(SpatialReference.getCPtr(src), src, SpatialReference.getCPtr(dst), dst), true);
    }

    public void TransformPoint(double[] inout) {
        osrJNI.CoordinateTransformation_TransformPoint__SWIG_0(this.swigCPtr, this, inout);
    }

    public void TransformPoint(double[] argout, double x, double y, double z) {
        osrJNI.CoordinateTransformation_TransformPoint__SWIG_1(this.swigCPtr, this, argout, x, y, z);
    }

    public void TransformPoint(double[] argout, double x, double y) {
        osrJNI.CoordinateTransformation_TransformPoint__SWIG_2(this.swigCPtr, this, argout, x, y);
    }

    public void TransformPoints(double[][] nCount) {
        osrJNI.CoordinateTransformation_TransformPoints(this.swigCPtr, this, nCount);
    }
}

