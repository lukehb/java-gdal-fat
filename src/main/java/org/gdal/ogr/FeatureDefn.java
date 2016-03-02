/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

import org.gdal.ogr.FieldDefn;
import org.gdal.ogr.ogrJNI;

public class FeatureDefn {
    private long swigCPtr;
    protected boolean swigCMemOwn;
    private Object parentReference;

    protected FeatureDefn(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    protected static long getCPtr(FeatureDefn obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ogrJNI.delete_FeatureDefn(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    protected static long getCPtrAndDisown(FeatureDefn obj) {
        if (obj != null) {
            obj.swigCMemOwn = false;
            obj.parentReference = null;
        }
        return FeatureDefn.getCPtr(obj);
    }

    protected void addReference(Object reference) {
        this.parentReference = reference;
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof FeatureDefn) {
            equal = ((FeatureDefn)obj).swigCPtr == this.swigCPtr;
        }
        return equal;
    }

    public int hashCode() {
        return (int)this.swigCPtr;
    }

    public FeatureDefn(String name_null_ok) {
        this(ogrJNI.new_FeatureDefn__SWIG_0(name_null_ok), true);
    }

    public FeatureDefn() {
        this(ogrJNI.new_FeatureDefn__SWIG_1(), true);
    }

    public String GetName() {
        return ogrJNI.FeatureDefn_GetName(this.swigCPtr, this);
    }

    public int GetFieldCount() {
        return ogrJNI.FeatureDefn_GetFieldCount(this.swigCPtr, this);
    }

    public FieldDefn GetFieldDefn(int i) {
        long cPtr = ogrJNI.FeatureDefn_GetFieldDefn(this.swigCPtr, this, i);
        FieldDefn ret = null;
        if (cPtr != 0) {
            ret = new FieldDefn(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public int GetFieldIndex(String name) {
        return ogrJNI.FeatureDefn_GetFieldIndex(this.swigCPtr, this, name);
    }

    public void AddFieldDefn(FieldDefn defn) {
        ogrJNI.FeatureDefn_AddFieldDefn(this.swigCPtr, this, FieldDefn.getCPtr(defn), defn);
    }

    public int GetGeomType() {
        return ogrJNI.FeatureDefn_GetGeomType(this.swigCPtr, this);
    }

    public void SetGeomType(int geom_type) {
        ogrJNI.FeatureDefn_SetGeomType(this.swigCPtr, this, geom_type);
    }

    public int GetReferenceCount() {
        return ogrJNI.FeatureDefn_GetReferenceCount(this.swigCPtr, this);
    }
}

