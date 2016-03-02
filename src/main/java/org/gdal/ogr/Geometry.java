/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

import org.gdal.ogr.GeometryNative;
import org.gdal.ogr.ogr;
import org.gdal.ogr.ogrJNI;
import org.gdal.osr.CoordinateTransformation;
import org.gdal.osr.SpatialReference;

public class Geometry
implements Cloneable {
    private long swigCPtr;
    private GeometryNative nativeObject;
    private Object parentReference;

    protected Geometry(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCPtr = cPtr;
        if (cMemoryOwn) {
            this.nativeObject = new GeometryNative(this, cPtr);
        }
    }

    protected static long getCPtr(Geometry obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    public void delete() {
        if (this.nativeObject != null) {
            this.nativeObject.delete();
            this.nativeObject = null;
        }
    }

    protected static long getCPtrAndDisown(Geometry obj) {
        if (obj != null) {
            if (obj.nativeObject == null) {
                throw new RuntimeException("Cannot disown an object that was not owned...");
            }
            obj.nativeObject.dontDisposeNativeResources();
            obj.nativeObject = null;
            obj.parentReference = null;
        }
        return Geometry.getCPtr(obj);
    }

    protected void addReference(Object reference) {
        this.parentReference = reference;
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof Geometry) {
            equal = this.Equal((Geometry)obj);
        }
        return equal;
    }

    public int hashCode() {
        return (int)this.swigCPtr;
    }

    public Object clone() {
        return this.Clone();
    }

    public double[] GetPoint_2D(int iPoint) {
        double[] coords = new double[2];
        this.GetPoint_2D(iPoint, coords);
        return coords;
    }

    public double[] GetPoint(int iPoint) {
        double[] coords = new double[3];
        this.GetPoint(iPoint, coords);
        return coords;
    }

    public static Geometry CreateFromWkt(String wkt) {
        return ogr.CreateGeometryFromWkt(wkt);
    }

    public static Geometry CreateFromWkb(byte[] wkb) {
        return ogr.CreateGeometryFromWkb(wkb);
    }

    public static Geometry CreateFromGML(String gml) {
        return ogr.CreateGeometryFromGML(gml);
    }

    public static Geometry CreateFromJson(String json) {
        return ogr.CreateGeometryFromJson(json);
    }

    public int ExportToWkb(byte[] wkbArray, int byte_order) {
        if (wkbArray == null) {
            throw new NullPointerException();
        }
        byte[] srcArray = this.ExportToWkb(byte_order);
        if (wkbArray.length < srcArray.length) {
            throw new RuntimeException("Array too small");
        }
        System.arraycopy(srcArray, 0, wkbArray, 0, srcArray.length);
        return 0;
    }

    public int ExportToWkt(String[] argout) {
        return ogrJNI.Geometry_ExportToWkt__SWIG_0(this.swigCPtr, this, argout);
    }

    public byte[] ExportToWkb(int byte_order) {
        return ogrJNI.Geometry_ExportToWkb__SWIG_0(this.swigCPtr, this, byte_order);
    }

    public byte[] ExportToWkb() {
        return ogrJNI.Geometry_ExportToWkb__SWIG_1(this.swigCPtr, this);
    }

    public String ExportToGML() {
        return ogrJNI.Geometry_ExportToGML(this.swigCPtr, this);
    }

    public String ExportToKML(String altitude_mode) {
        return ogrJNI.Geometry_ExportToKML__SWIG_0(this.swigCPtr, this, altitude_mode);
    }

    public String ExportToKML() {
        return ogrJNI.Geometry_ExportToKML__SWIG_1(this.swigCPtr, this);
    }

    public String ExportToJson() {
        return ogrJNI.Geometry_ExportToJson(this.swigCPtr, this);
    }

    public void AddPoint(double x, double y, double z) {
        ogrJNI.Geometry_AddPoint__SWIG_0(this.swigCPtr, this, x, y, z);
    }

    public void AddPoint(double x, double y) {
        ogrJNI.Geometry_AddPoint__SWIG_1(this.swigCPtr, this, x, y);
    }

    public void AddPoint_2D(double x, double y) {
        ogrJNI.Geometry_AddPoint_2D(this.swigCPtr, this, x, y);
    }

    public int AddGeometryDirectly(Geometry other_disown) {
        int ret = ogrJNI.Geometry_AddGeometryDirectly(this.swigCPtr, this, Geometry.getCPtrAndDisown(other_disown), other_disown);
        if (other_disown != null) {
            other_disown.addReference(this);
        }
        return ret;
    }

    public int AddGeometry(Geometry other) {
        return ogrJNI.Geometry_AddGeometry(this.swigCPtr, this, Geometry.getCPtr(other), other);
    }

    public Geometry Clone() {
        long cPtr = ogrJNI.Geometry_Clone(this.swigCPtr, this);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public int GetGeometryType() {
        return ogrJNI.Geometry_GetGeometryType(this.swigCPtr, this);
    }

    public String GetGeometryName() {
        return ogrJNI.Geometry_GetGeometryName(this.swigCPtr, this);
    }

    public double GetArea() {
        return ogrJNI.Geometry_GetArea(this.swigCPtr, this);
    }

    public int GetPointCount() {
        return ogrJNI.Geometry_GetPointCount(this.swigCPtr, this);
    }

    public double GetX(int point) {
        return ogrJNI.Geometry_GetX__SWIG_0(this.swigCPtr, this, point);
    }

    public double GetX() {
        return ogrJNI.Geometry_GetX__SWIG_1(this.swigCPtr, this);
    }

    public double GetY(int point) {
        return ogrJNI.Geometry_GetY__SWIG_0(this.swigCPtr, this, point);
    }

    public double GetY() {
        return ogrJNI.Geometry_GetY__SWIG_1(this.swigCPtr, this);
    }

    public double GetZ(int point) {
        return ogrJNI.Geometry_GetZ__SWIG_0(this.swigCPtr, this, point);
    }

    public double GetZ() {
        return ogrJNI.Geometry_GetZ__SWIG_1(this.swigCPtr, this);
    }

    public void GetPoint(int iPoint, double[] argout) {
        ogrJNI.Geometry_GetPoint(this.swigCPtr, this, iPoint, argout);
    }

    public void GetPoint_2D(int iPoint, double[] argout) {
        ogrJNI.Geometry_GetPoint_2D(this.swigCPtr, this, iPoint, argout);
    }

    public int GetGeometryCount() {
        return ogrJNI.Geometry_GetGeometryCount(this.swigCPtr, this);
    }

    public void SetPoint(int point, double x, double y, double z) {
        ogrJNI.Geometry_SetPoint__SWIG_0(this.swigCPtr, this, point, x, y, z);
    }

    public void SetPoint(int point, double x, double y) {
        ogrJNI.Geometry_SetPoint__SWIG_1(this.swigCPtr, this, point, x, y);
    }

    public void SetPoint_2D(int point, double x, double y) {
        ogrJNI.Geometry_SetPoint_2D(this.swigCPtr, this, point, x, y);
    }

    public Geometry GetGeometryRef(int geom) {
        long cPtr = ogrJNI.Geometry_GetGeometryRef(this.swigCPtr, this, geom);
        Geometry ret = null;
        if (cPtr != 0) {
            ret = new Geometry(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public Geometry GetBoundary() {
        long cPtr = ogrJNI.Geometry_GetBoundary(this.swigCPtr, this);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public Geometry ConvexHull() {
        long cPtr = ogrJNI.Geometry_ConvexHull(this.swigCPtr, this);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public Geometry Buffer(double distance, int quadsecs) {
        long cPtr = ogrJNI.Geometry_Buffer__SWIG_0(this.swigCPtr, this, distance, quadsecs);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public Geometry Buffer(double distance) {
        long cPtr = ogrJNI.Geometry_Buffer__SWIG_1(this.swigCPtr, this, distance);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public Geometry Intersection(Geometry other) {
        long cPtr = ogrJNI.Geometry_Intersection(this.swigCPtr, this, Geometry.getCPtr(other), other);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public Geometry Union(Geometry other) {
        long cPtr = ogrJNI.Geometry_Union(this.swigCPtr, this, Geometry.getCPtr(other), other);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public Geometry Difference(Geometry other) {
        long cPtr = ogrJNI.Geometry_Difference(this.swigCPtr, this, Geometry.getCPtr(other), other);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public Geometry SymmetricDifference(Geometry other) {
        long cPtr = ogrJNI.Geometry_SymmetricDifference(this.swigCPtr, this, Geometry.getCPtr(other), other);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public double Distance(Geometry other) {
        return ogrJNI.Geometry_Distance(this.swigCPtr, this, Geometry.getCPtr(other), other);
    }

    public void Empty() {
        ogrJNI.Geometry_Empty(this.swigCPtr, this);
    }

    public boolean IsEmpty() {
        return ogrJNI.Geometry_IsEmpty(this.swigCPtr, this);
    }

    public boolean IsValid() {
        return ogrJNI.Geometry_IsValid(this.swigCPtr, this);
    }

    public boolean IsSimple() {
        return ogrJNI.Geometry_IsSimple(this.swigCPtr, this);
    }

    public boolean IsRing() {
        return ogrJNI.Geometry_IsRing(this.swigCPtr, this);
    }

    public boolean Intersect(Geometry other) {
        return ogrJNI.Geometry_Intersect(this.swigCPtr, this, Geometry.getCPtr(other), other);
    }

    public boolean Equal(Geometry other) {
        return ogrJNI.Geometry_Equal(this.swigCPtr, this, Geometry.getCPtr(other), other);
    }

    public boolean Disjoint(Geometry other) {
        return ogrJNI.Geometry_Disjoint(this.swigCPtr, this, Geometry.getCPtr(other), other);
    }

    public boolean Touches(Geometry other) {
        return ogrJNI.Geometry_Touches(this.swigCPtr, this, Geometry.getCPtr(other), other);
    }

    public boolean Crosses(Geometry other) {
        return ogrJNI.Geometry_Crosses(this.swigCPtr, this, Geometry.getCPtr(other), other);
    }

    public boolean Within(Geometry other) {
        return ogrJNI.Geometry_Within(this.swigCPtr, this, Geometry.getCPtr(other), other);
    }

    public boolean Contains(Geometry other) {
        return ogrJNI.Geometry_Contains(this.swigCPtr, this, Geometry.getCPtr(other), other);
    }

    public boolean Overlaps(Geometry other) {
        return ogrJNI.Geometry_Overlaps(this.swigCPtr, this, Geometry.getCPtr(other), other);
    }

    public int TransformTo(SpatialReference reference) {
        return ogrJNI.Geometry_TransformTo(this.swigCPtr, this, SpatialReference.getCPtr(reference), reference);
    }

    public int Transform(CoordinateTransformation trans) {
        return ogrJNI.Geometry_Transform(this.swigCPtr, this, CoordinateTransformation.getCPtr(trans), trans);
    }

    public SpatialReference GetSpatialReference() {
        long cPtr = ogrJNI.Geometry_GetSpatialReference(this.swigCPtr, this);
        return cPtr == 0 ? null : new SpatialReference(cPtr, true);
    }

    public void AssignSpatialReference(SpatialReference reference) {
        ogrJNI.Geometry_AssignSpatialReference(this.swigCPtr, this, SpatialReference.getCPtr(reference), reference);
    }

    public void CloseRings() {
        ogrJNI.Geometry_CloseRings(this.swigCPtr, this);
    }

    public void FlattenTo2D() {
        ogrJNI.Geometry_FlattenTo2D(this.swigCPtr, this);
    }

    public void Segmentize(double dfMaxLength) {
        ogrJNI.Geometry_Segmentize(this.swigCPtr, this, dfMaxLength);
    }

    public void GetEnvelope(double[] argout) {
        ogrJNI.Geometry_GetEnvelope(this.swigCPtr, this, argout);
    }

    public int WkbSize() {
        return ogrJNI.Geometry_WkbSize(this.swigCPtr, this);
    }

    public int GetCoordinateDimension() {
        return ogrJNI.Geometry_GetCoordinateDimension(this.swigCPtr, this);
    }

    public void SetCoordinateDimension(int dimension) {
        ogrJNI.Geometry_SetCoordinateDimension(this.swigCPtr, this, dimension);
    }

    public int GetDimension() {
        return ogrJNI.Geometry_GetDimension(this.swigCPtr, this);
    }

    public Geometry(int type, String wkt, byte[] nLen, String gml) {
        this(ogrJNI.new_Geometry__SWIG_0(type, wkt, nLen, gml), true);
    }

    public Geometry(int type) {
        this(ogrJNI.new_Geometry__SWIG_1(type), true);
    }

    public String ExportToWkt() {
        return ogrJNI.Geometry_ExportToWkt__SWIG_1(this.swigCPtr, this);
    }

    public Geometry Centroid() {
        long cPtr = ogrJNI.Geometry_Centroid(this.swigCPtr, this);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }
}

