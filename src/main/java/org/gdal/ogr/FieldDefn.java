/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

import org.gdal.ogr.ogrJNI;

public class FieldDefn {
    private long swigCPtr;
    protected boolean swigCMemOwn;
    private Object parentReference;

    protected FieldDefn(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    protected static long getCPtr(FieldDefn obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ogrJNI.delete_FieldDefn(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    protected static long getCPtrAndDisown(FieldDefn obj) {
        if (obj != null) {
            obj.swigCMemOwn = false;
            obj.parentReference = null;
        }
        return FieldDefn.getCPtr(obj);
    }

    protected void addReference(Object reference) {
        this.parentReference = reference;
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof FieldDefn) {
            equal = ((FieldDefn)obj).swigCPtr == this.swigCPtr;
        }
        return equal;
    }

    public int hashCode() {
        return (int)this.swigCPtr;
    }

    public FieldDefn(String name_null_ok, int field_type) {
        this(ogrJNI.new_FieldDefn__SWIG_0(name_null_ok, field_type), true);
    }

    public FieldDefn(String name_null_ok) {
        this(ogrJNI.new_FieldDefn__SWIG_1(name_null_ok), true);
    }

    public FieldDefn() {
        this(ogrJNI.new_FieldDefn__SWIG_2(), true);
    }

    public String GetName() {
        return ogrJNI.FieldDefn_GetName(this.swigCPtr, this);
    }

    public String GetNameRef() {
        return ogrJNI.FieldDefn_GetNameRef(this.swigCPtr, this);
    }

    public void SetName(String name) {
        ogrJNI.FieldDefn_SetName(this.swigCPtr, this, name);
    }

    public int GetFieldType() {
        return ogrJNI.FieldDefn_GetFieldType(this.swigCPtr, this);
    }

    public void SetType(int type) {
        ogrJNI.FieldDefn_SetType(this.swigCPtr, this, type);
    }

    public int GetJustify() {
        return ogrJNI.FieldDefn_GetJustify(this.swigCPtr, this);
    }

    public void SetJustify(int justify) {
        ogrJNI.FieldDefn_SetJustify(this.swigCPtr, this, justify);
    }

    public int GetWidth() {
        return ogrJNI.FieldDefn_GetWidth(this.swigCPtr, this);
    }

    public void SetWidth(int width) {
        ogrJNI.FieldDefn_SetWidth(this.swigCPtr, this, width);
    }

    public int GetPrecision() {
        return ogrJNI.FieldDefn_GetPrecision(this.swigCPtr, this);
    }

    public void SetPrecision(int precision) {
        ogrJNI.FieldDefn_SetPrecision(this.swigCPtr, this, precision);
    }

    public String GetTypeName() {
        return ogrJNI.FieldDefn_GetTypeName(this.swigCPtr, this);
    }

    public String GetFieldTypeName(int type) {
        return ogrJNI.FieldDefn_GetFieldTypeName(this.swigCPtr, this, type);
    }
}

