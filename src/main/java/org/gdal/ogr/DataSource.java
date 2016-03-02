/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

import java.util.Vector;
import org.gdal.ogr.Driver;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.Layer;
import org.gdal.ogr.ogrJNI;
import org.gdal.osr.SpatialReference;

public class DataSource {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected DataSource(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    protected static long getCPtr(DataSource obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ogrJNI.delete_DataSource(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof DataSource) {
            equal = ((DataSource)obj).swigCPtr == this.swigCPtr;
        }
        return equal;
    }

    public int hashCode() {
        return (int)this.swigCPtr;
    }

    public Layer GetLayer(int index) {
        return this.GetLayerByIndex(index);
    }

    public Layer GetLayer(String layerName) {
        return this.GetLayerByName(layerName);
    }

    public String getName() {
        return ogrJNI.DataSource_name_get(this.swigCPtr, this);
    }

    public int GetRefCount() {
        return ogrJNI.DataSource_GetRefCount(this.swigCPtr, this);
    }

    public int GetSummaryRefCount() {
        return ogrJNI.DataSource_GetSummaryRefCount(this.swigCPtr, this);
    }

    public int GetLayerCount() {
        return ogrJNI.DataSource_GetLayerCount(this.swigCPtr, this);
    }

    public Driver GetDriver() {
        long cPtr = ogrJNI.DataSource_GetDriver(this.swigCPtr, this);
        return cPtr == 0 ? null : new Driver(cPtr, false);
    }

    public String GetName() {
        return ogrJNI.DataSource_GetName(this.swigCPtr, this);
    }

    public int DeleteLayer(int index) {
        return ogrJNI.DataSource_DeleteLayer(this.swigCPtr, this, index);
    }

    public Layer CreateLayer(String name, SpatialReference srs, int geom_type, Vector options) {
        long cPtr = ogrJNI.DataSource_CreateLayer__SWIG_0(this.swigCPtr, this, name, SpatialReference.getCPtr(srs), srs, geom_type, options);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Layer CreateLayer(String name, SpatialReference srs, int geom_type) {
        long cPtr = ogrJNI.DataSource_CreateLayer__SWIG_1(this.swigCPtr, this, name, SpatialReference.getCPtr(srs), srs, geom_type);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Layer CreateLayer(String name, SpatialReference srs) {
        long cPtr = ogrJNI.DataSource_CreateLayer__SWIG_2(this.swigCPtr, this, name, SpatialReference.getCPtr(srs), srs);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Layer CreateLayer(String name) {
        long cPtr = ogrJNI.DataSource_CreateLayer__SWIG_3(this.swigCPtr, this, name);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Layer CopyLayer(Layer src_layer, String new_name, Vector options) {
        long cPtr = ogrJNI.DataSource_CopyLayer__SWIG_0(this.swigCPtr, this, Layer.getCPtr(src_layer), src_layer, new_name, options);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Layer CopyLayer(Layer src_layer, String new_name) {
        long cPtr = ogrJNI.DataSource_CopyLayer__SWIG_1(this.swigCPtr, this, Layer.getCPtr(src_layer), src_layer, new_name);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Layer GetLayerByIndex(int index) {
        long cPtr = ogrJNI.DataSource_GetLayerByIndex(this.swigCPtr, this, index);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Layer GetLayerByName(String layer_name) {
        long cPtr = ogrJNI.DataSource_GetLayerByName(this.swigCPtr, this, layer_name);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public boolean TestCapability(String cap) {
        return ogrJNI.DataSource_TestCapability(this.swigCPtr, this, cap);
    }

    public Layer ExecuteSQL(String statement, Geometry spatialFilter, String dialect) {
        long cPtr = ogrJNI.DataSource_ExecuteSQL__SWIG_0(this.swigCPtr, this, statement, Geometry.getCPtr(spatialFilter), spatialFilter, dialect);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Layer ExecuteSQL(String statement, Geometry spatialFilter) {
        long cPtr = ogrJNI.DataSource_ExecuteSQL__SWIG_1(this.swigCPtr, this, statement, Geometry.getCPtr(spatialFilter), spatialFilter);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Layer ExecuteSQL(String statement) {
        long cPtr = ogrJNI.DataSource_ExecuteSQL__SWIG_2(this.swigCPtr, this, statement);
        Layer ret = null;
        if (cPtr != 0) {
            ret = new Layer(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public void ReleaseResultSet(Layer layer) {
        ogrJNI.DataSource_ReleaseResultSet(this.swigCPtr, this, Layer.getCPtrAndDisown(layer), layer);
    }
}

