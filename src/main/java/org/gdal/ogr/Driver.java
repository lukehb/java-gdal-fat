/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

import java.util.Vector;
import org.gdal.ogr.DataSource;
import org.gdal.ogr.ogrJNI;

public class Driver {
    private long swigCPtr;
    protected boolean swigCMemOwn;
    private Object parentReference;

    protected Driver(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    protected static long getCPtr(Driver obj) {
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

    protected static long getCPtrAndDisown(Driver obj) {
        if (obj != null) {
            obj.swigCMemOwn = false;
            obj.parentReference = null;
        }
        return Driver.getCPtr(obj);
    }

    protected void addReference(Object reference) {
        this.parentReference = reference;
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof Driver) {
            equal = ((Driver)obj).swigCPtr == this.swigCPtr;
        }
        return equal;
    }

    public int hashCode() {
        return (int)this.swigCPtr;
    }

    public String getName() {
        return ogrJNI.Driver_name_get(this.swigCPtr, this);
    }

    public DataSource CreateDataSource(String name, Vector options) {
        long cPtr = ogrJNI.Driver_CreateDataSource__SWIG_0(this.swigCPtr, this, name, options);
        return cPtr == 0 ? null : new DataSource(cPtr, true);
    }

    public DataSource CreateDataSource(String name) {
        long cPtr = ogrJNI.Driver_CreateDataSource__SWIG_1(this.swigCPtr, this, name);
        return cPtr == 0 ? null : new DataSource(cPtr, true);
    }

    public DataSource CopyDataSource(DataSource copy_ds, String name, Vector options) {
        long cPtr = ogrJNI.Driver_CopyDataSource__SWIG_0(this.swigCPtr, this, DataSource.getCPtr(copy_ds), copy_ds, name, options);
        return cPtr == 0 ? null : new DataSource(cPtr, true);
    }

    public DataSource CopyDataSource(DataSource copy_ds, String name) {
        long cPtr = ogrJNI.Driver_CopyDataSource__SWIG_1(this.swigCPtr, this, DataSource.getCPtr(copy_ds), copy_ds, name);
        return cPtr == 0 ? null : new DataSource(cPtr, true);
    }

    public DataSource Open(String name, int update) {
        long cPtr = ogrJNI.Driver_Open__SWIG_0(this.swigCPtr, this, name, update);
        return cPtr == 0 ? null : new DataSource(cPtr, true);
    }

    public DataSource Open(String name) {
        long cPtr = ogrJNI.Driver_Open__SWIG_1(this.swigCPtr, this, name);
        return cPtr == 0 ? null : new DataSource(cPtr, true);
    }

    public int DeleteDataSource(String name) {
        return ogrJNI.Driver_DeleteDataSource(this.swigCPtr, this, name);
    }

    public boolean TestCapability(String cap) {
        return ogrJNI.Driver_TestCapability(this.swigCPtr, this, cap);
    }

    public String GetName() {
        return ogrJNI.Driver_GetName(this.swigCPtr, this);
    }
}

