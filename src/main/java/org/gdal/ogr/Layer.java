/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

import org.gdal.ogr.Feature;
import org.gdal.ogr.FeatureDefn;
import org.gdal.ogr.FieldDefn;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.ogrJNI;
import org.gdal.osr.SpatialReference;

public class Layer {
    private long swigCPtr;
    protected boolean swigCMemOwn;
    private Object parentReference;

    protected Layer(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    protected static long getCPtr(Layer obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                throw new UnsupportedOperationException("C++ destructor does not have public access");
            }
            this.swigCPtr = 0;
        }
    }

    protected static long getCPtrAndDisown(Layer obj) {
        if (obj != null) {
            obj.swigCMemOwn = false;
            obj.parentReference = null;
        }
        return Layer.getCPtr(obj);
    }

    protected void addReference(Object reference) {
        this.parentReference = reference;
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof Layer) {
            equal = ((Layer)obj).swigCPtr == this.swigCPtr;
        }
        return equal;
    }

    public int hashCode() {
        return (int)this.swigCPtr;
    }

    public double[] GetExtent(boolean force) {
        double[] argout = new double[4];
        try {
            this.GetExtent(argout, force ? 1 : 0);
            return argout;
        }
        catch (RuntimeException e) {
            return null;
        }
    }

    public double[] GetExtent() {
        return this.GetExtent(true);
    }

    public int GetRefCount() {
        return ogrJNI.Layer_GetRefCount(this.swigCPtr, this);
    }

    public void SetSpatialFilter(Geometry filter) {
        ogrJNI.Layer_SetSpatialFilter(this.swigCPtr, this, Geometry.getCPtr(filter), filter);
    }

    public void SetSpatialFilterRect(double minx, double miny, double maxx, double maxy) {
        ogrJNI.Layer_SetSpatialFilterRect(this.swigCPtr, this, minx, miny, maxx, maxy);
    }

    public Geometry GetSpatialFilter() {
        long cPtr = ogrJNI.Layer_GetSpatialFilter(this.swigCPtr, this);
        Geometry ret = null;
        if (cPtr != 0) {
            ret = new Geometry(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public int SetAttributeFilter(String filter_string) {
        return ogrJNI.Layer_SetAttributeFilter(this.swigCPtr, this, filter_string);
    }

    public void ResetReading() {
        ogrJNI.Layer_ResetReading(this.swigCPtr, this);
    }

    public String GetName() {
        return ogrJNI.Layer_GetName(this.swigCPtr, this);
    }

    public String GetGeometryColumn() {
        return ogrJNI.Layer_GetGeometryColumn(this.swigCPtr, this);
    }

    public String GetFIDColumn() {
        return ogrJNI.Layer_GetFIDColumn(this.swigCPtr, this);
    }

    public Feature GetFeature(int fid) {
        long cPtr = ogrJNI.Layer_GetFeature(this.swigCPtr, this, fid);
        return cPtr == 0 ? null : new Feature(cPtr, true);
    }

    public Feature GetNextFeature() {
        long cPtr = ogrJNI.Layer_GetNextFeature(this.swigCPtr, this);
        return cPtr == 0 ? null : new Feature(cPtr, true);
    }

    public int SetNextByIndex(int new_index) {
        return ogrJNI.Layer_SetNextByIndex(this.swigCPtr, this, new_index);
    }

    public int SetFeature(Feature feature) {
        return ogrJNI.Layer_SetFeature(this.swigCPtr, this, Feature.getCPtr(feature), feature);
    }

    public int CreateFeature(Feature feature) {
        return ogrJNI.Layer_CreateFeature(this.swigCPtr, this, Feature.getCPtr(feature), feature);
    }

    public int DeleteFeature(int fid) {
        return ogrJNI.Layer_DeleteFeature(this.swigCPtr, this, fid);
    }

    public int SyncToDisk() {
        return ogrJNI.Layer_SyncToDisk(this.swigCPtr, this);
    }

    public FeatureDefn GetLayerDefn() {
        long cPtr = ogrJNI.Layer_GetLayerDefn(this.swigCPtr, this);
        FeatureDefn ret = null;
        if (cPtr != 0) {
            ret = new FeatureDefn(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public int GetFeatureCount(int force) {
        return ogrJNI.Layer_GetFeatureCount__SWIG_0(this.swigCPtr, this, force);
    }

    public int GetFeatureCount() {
        return ogrJNI.Layer_GetFeatureCount__SWIG_1(this.swigCPtr, this);
    }

    public int GetExtent(double[] argout, int force) {
        return ogrJNI.Layer_GetExtent(this.swigCPtr, this, argout, force);
    }

    public boolean TestCapability(String cap) {
        return ogrJNI.Layer_TestCapability(this.swigCPtr, this, cap);
    }

    public int CreateField(FieldDefn field_def, int approx_ok) {
        return ogrJNI.Layer_CreateField__SWIG_0(this.swigCPtr, this, FieldDefn.getCPtr(field_def), field_def, approx_ok);
    }

    public int CreateField(FieldDefn field_def) {
        return ogrJNI.Layer_CreateField__SWIG_1(this.swigCPtr, this, FieldDefn.getCPtr(field_def), field_def);
    }

    public int StartTransaction() {
        return ogrJNI.Layer_StartTransaction(this.swigCPtr, this);
    }

    public int CommitTransaction() {
        return ogrJNI.Layer_CommitTransaction(this.swigCPtr, this);
    }

    public int RollbackTransaction() {
        return ogrJNI.Layer_RollbackTransaction(this.swigCPtr, this);
    }

    public SpatialReference GetSpatialRef() {
        long cPtr = ogrJNI.Layer_GetSpatialRef(this.swigCPtr, this);
        return cPtr == 0 ? null : new SpatialReference(cPtr, true);
    }

    public long GetFeaturesRead() {
        return ogrJNI.Layer_GetFeaturesRead(this.swigCPtr, this);
    }
}

