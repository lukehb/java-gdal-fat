/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import java.util.Vector;
import org.gdal.gdal.Dataset;
import org.gdal.gdal.gdalJNI;

public class Transformer {
    private long swigCPtr;
    protected boolean swigCMemOwn;
    private Object parentReference;

    protected Transformer(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    protected static long getCPtr(Transformer obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                gdalJNI.delete_Transformer(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    protected static long getCPtrAndDisown(Transformer obj) {
        if (obj != null) {
            obj.swigCMemOwn = false;
            obj.parentReference = null;
        }
        return Transformer.getCPtr(obj);
    }

    protected void addReference(Object reference) {
        this.parentReference = reference;
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof Transformer) {
            equal = ((Transformer)obj).swigCPtr == this.swigCPtr;
        }
        return equal;
    }

    public int hashCode() {
        return (int)this.swigCPtr;
    }

    public Transformer(Dataset src, Dataset dst, Vector options) {
        this(gdalJNI.new_Transformer(Dataset.getCPtr(src), src, Dataset.getCPtr(dst), dst, options), true);
    }

    public int TransformPoint(int bDstToSrc, double[] inout) {
        return gdalJNI.Transformer_TransformPoint__SWIG_0(this.swigCPtr, this, bDstToSrc, inout);
    }

    public int TransformPoint(double[] argout, int bDstToSrc, double x, double y, double z) {
        return gdalJNI.Transformer_TransformPoint__SWIG_1(this.swigCPtr, this, argout, bDstToSrc, x, y, z);
    }

    public int TransformPoint(double[] argout, int bDstToSrc, double x, double y) {
        return gdalJNI.Transformer_TransformPoint__SWIG_2(this.swigCPtr, this, argout, bDstToSrc, x, y);
    }

    public int TransformPoints(int bDstToSrc, double[][] nCount, int[] panSuccess) {
        return gdalJNI.Transformer_TransformPoints(this.swigCPtr, this, bDstToSrc, nCount, panSuccess);
    }
}

