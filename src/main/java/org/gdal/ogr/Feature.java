/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

import java.util.Vector;
import org.gdal.ogr.FeatureDefn;
import org.gdal.ogr.FeatureNative;
import org.gdal.ogr.FieldDefn;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.ogrJNI;

public class Feature
implements Cloneable {
    private long swigCPtr;
    private FeatureNative nativeObject;

    protected Feature(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCPtr = cPtr;
        if (cMemoryOwn) {
            this.nativeObject = new FeatureNative(this, cPtr);
        }
    }

    protected static long getCPtr(Feature obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    public void delete() {
        if (this.nativeObject != null) {
            this.nativeObject.delete();
            this.nativeObject = null;
        }
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof Feature) {
            equal = this.Equal((Feature)obj);
        }
        return equal;
    }

    public int hashCode() {
        return (int)this.swigCPtr;
    }

    public Object clone() {
        return this.Clone();
    }

    public Feature(FeatureDefn feature_def) {
        this(ogrJNI.new_Feature(FeatureDefn.getCPtr(feature_def), feature_def), true);
    }

    public FeatureDefn GetDefnRef() {
        long cPtr = ogrJNI.Feature_GetDefnRef(this.swigCPtr, this);
        FeatureDefn ret = null;
        if (cPtr != 0) {
            ret = new FeatureDefn(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public int SetGeometry(Geometry geom) {
        return ogrJNI.Feature_SetGeometry(this.swigCPtr, this, Geometry.getCPtr(geom), geom);
    }

    public int SetGeometryDirectly(Geometry geom) {
        int ret = ogrJNI.Feature_SetGeometryDirectly(this.swigCPtr, this, Geometry.getCPtrAndDisown(geom), geom);
        if (geom != null) {
            geom.addReference(this);
        }
        return ret;
    }

    public Geometry GetGeometryRef() {
        long cPtr = ogrJNI.Feature_GetGeometryRef(this.swigCPtr, this);
        Geometry ret = null;
        if (cPtr != 0) {
            ret = new Geometry(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Feature Clone() {
        long cPtr = ogrJNI.Feature_Clone(this.swigCPtr, this);
        return cPtr == 0 ? null : new Feature(cPtr, true);
    }

    public boolean Equal(Feature feature) {
        return ogrJNI.Feature_Equal(this.swigCPtr, this, Feature.getCPtr(feature), feature);
    }

    public int GetFieldCount() {
        return ogrJNI.Feature_GetFieldCount(this.swigCPtr, this);
    }

    public FieldDefn GetFieldDefnRef(int id) {
        long cPtr = ogrJNI.Feature_GetFieldDefnRef__SWIG_0(this.swigCPtr, this, id);
        FieldDefn ret = null;
        if (cPtr != 0) {
            ret = new FieldDefn(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public FieldDefn GetFieldDefnRef(String name) {
        long cPtr = ogrJNI.Feature_GetFieldDefnRef__SWIG_1(this.swigCPtr, this, name);
        FieldDefn ret = null;
        if (cPtr != 0) {
            ret = new FieldDefn(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public String GetFieldAsString(int id) {
        return ogrJNI.Feature_GetFieldAsString__SWIG_0(this.swigCPtr, this, id);
    }

    public String GetFieldAsString(String name) {
        return ogrJNI.Feature_GetFieldAsString__SWIG_1(this.swigCPtr, this, name);
    }

    public int GetFieldAsInteger(int id) {
        return ogrJNI.Feature_GetFieldAsInteger__SWIG_0(this.swigCPtr, this, id);
    }

    public int GetFieldAsInteger(String name) {
        return ogrJNI.Feature_GetFieldAsInteger__SWIG_1(this.swigCPtr, this, name);
    }

    public double GetFieldAsDouble(int id) {
        return ogrJNI.Feature_GetFieldAsDouble__SWIG_0(this.swigCPtr, this, id);
    }

    public double GetFieldAsDouble(String name) {
        return ogrJNI.Feature_GetFieldAsDouble__SWIG_1(this.swigCPtr, this, name);
    }

    public void GetFieldAsDateTime(int id, int[] pnYear, int[] pnMonth, int[] pnDay, int[] pnHour, int[] pnMinute, int[] pnSecond, int[] pnTZFlag) {
        ogrJNI.Feature_GetFieldAsDateTime(this.swigCPtr, this, id, pnYear, pnMonth, pnDay, pnHour, pnMinute, pnSecond, pnTZFlag);
    }

    public int[] GetFieldAsIntegerList(int id) {
        return ogrJNI.Feature_GetFieldAsIntegerList(this.swigCPtr, this, id);
    }

    public double[] GetFieldAsDoubleList(int id) {
        return ogrJNI.Feature_GetFieldAsDoubleList(this.swigCPtr, this, id);
    }

    public String[] GetFieldAsStringList(int id) {
        return ogrJNI.Feature_GetFieldAsStringList(this.swigCPtr, this, id);
    }

    public boolean IsFieldSet(int id) {
        return ogrJNI.Feature_IsFieldSet__SWIG_0(this.swigCPtr, this, id);
    }

    public boolean IsFieldSet(String name) {
        return ogrJNI.Feature_IsFieldSet__SWIG_1(this.swigCPtr, this, name);
    }

    public int GetFieldIndex(String name) {
        return ogrJNI.Feature_GetFieldIndex(this.swigCPtr, this, name);
    }

    public int GetFID() {
        return ogrJNI.Feature_GetFID(this.swigCPtr, this);
    }

    public int SetFID(int fid) {
        return ogrJNI.Feature_SetFID(this.swigCPtr, this, fid);
    }

    public void DumpReadable() {
        ogrJNI.Feature_DumpReadable(this.swigCPtr, this);
    }

    public void UnsetField(int id) {
        ogrJNI.Feature_UnsetField__SWIG_0(this.swigCPtr, this, id);
    }

    public void UnsetField(String name) {
        ogrJNI.Feature_UnsetField__SWIG_1(this.swigCPtr, this, name);
    }

    public void SetField(int id, String value) {
        ogrJNI.Feature_SetField__SWIG_0(this.swigCPtr, this, id, value);
    }

    public void SetField(String name, String value) {
        ogrJNI.Feature_SetField__SWIG_1(this.swigCPtr, this, name, value);
    }

    public void SetField(int id, int value) {
        ogrJNI.Feature_SetField__SWIG_2(this.swigCPtr, this, id, value);
    }

    public void SetField(String name, int value) {
        ogrJNI.Feature_SetField__SWIG_3(this.swigCPtr, this, name, value);
    }

    public void SetField(int id, double value) {
        ogrJNI.Feature_SetField__SWIG_4(this.swigCPtr, this, id, value);
    }

    public void SetField(String name, double value) {
        ogrJNI.Feature_SetField__SWIG_5(this.swigCPtr, this, name, value);
    }

    public void SetField(int id, int year, int month, int day, int hour, int minute, int second, int tzflag) {
        ogrJNI.Feature_SetField__SWIG_6(this.swigCPtr, this, id, year, month, day, hour, minute, second, tzflag);
    }

    public void SetField(String name, int year, int month, int day, int hour, int minute, int second, int tzflag) {
        ogrJNI.Feature_SetField__SWIG_7(this.swigCPtr, this, name, year, month, day, hour, minute, second, tzflag);
    }

    public void SetFieldIntegerList(int id, int[] nList) {
        ogrJNI.Feature_SetFieldIntegerList(this.swigCPtr, this, id, nList);
    }

    public void SetFieldDoubleList(int id, double[] nList) {
        ogrJNI.Feature_SetFieldDoubleList(this.swigCPtr, this, id, nList);
    }

    public void SetFieldStringList(int id, Vector pList) {
        ogrJNI.Feature_SetFieldStringList(this.swigCPtr, this, id, pList);
    }

    public int SetFrom(Feature other, int forgiving) {
        return ogrJNI.Feature_SetFrom__SWIG_0(this.swigCPtr, this, Feature.getCPtr(other), other, forgiving);
    }

    public int SetFrom(Feature other) {
        return ogrJNI.Feature_SetFrom__SWIG_1(this.swigCPtr, this, Feature.getCPtr(other), other);
    }

    public String GetStyleString() {
        return ogrJNI.Feature_GetStyleString(this.swigCPtr, this);
    }

    public void SetStyleString(String the_string) {
        ogrJNI.Feature_SetStyleString(this.swigCPtr, this, the_string);
    }

    public int GetFieldType(int id) {
        return ogrJNI.Feature_GetFieldType__SWIG_0(this.swigCPtr, this, id);
    }

    public int GetFieldType(String name) {
        return ogrJNI.Feature_GetFieldType__SWIG_1(this.swigCPtr, this, name);
    }
}

