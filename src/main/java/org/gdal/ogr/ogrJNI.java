/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

import java.util.Vector;

import org.gdal.NativeLoader;
import org.gdal.gdal.gdal;
import org.gdal.ogr.DataSource;
import org.gdal.ogr.Driver;
import org.gdal.ogr.Feature;
import org.gdal.ogr.FeatureDefn;
import org.gdal.ogr.FieldDefn;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.Layer;
import org.gdal.osr.CoordinateTransformation;
import org.gdal.osr.SpatialReference;

public class ogrJNI {
    private static boolean available = false;

    public static boolean isAvailable() {
        return available;
    }

    public static final native String GeometryTypeToName(int var0);

    public static final native String GetFieldTypeName(int var0);

    public static final native String Driver_name_get(long var0, Driver var2);

    public static final native long Driver_CreateDataSource__SWIG_0(long var0, Driver var2, String var3, Vector var4);

    public static final native long Driver_CreateDataSource__SWIG_1(long var0, Driver var2, String var3);

    public static final native long Driver_CopyDataSource__SWIG_0(long var0, Driver var2, long var3, DataSource var5, String var6, Vector var7);

    public static final native long Driver_CopyDataSource__SWIG_1(long var0, Driver var2, long var3, DataSource var5, String var6);

    public static final native long Driver_Open__SWIG_0(long var0, Driver var2, String var3, int var4);

    public static final native long Driver_Open__SWIG_1(long var0, Driver var2, String var3);

    public static final native int Driver_DeleteDataSource(long var0, Driver var2, String var3);

    public static final native boolean Driver_TestCapability(long var0, Driver var2, String var3);

    public static final native String Driver_GetName(long var0, Driver var2);

    public static final native String DataSource_name_get(long var0, DataSource var2);

    public static final native void delete_DataSource(long var0);

    public static final native int DataSource_GetRefCount(long var0, DataSource var2);

    public static final native int DataSource_GetSummaryRefCount(long var0, DataSource var2);

    public static final native int DataSource_GetLayerCount(long var0, DataSource var2);

    public static final native long DataSource_GetDriver(long var0, DataSource var2);

    public static final native String DataSource_GetName(long var0, DataSource var2);

    public static final native int DataSource_DeleteLayer(long var0, DataSource var2, int var3);

    public static final native long DataSource_CreateLayer__SWIG_0(long var0, DataSource var2, String var3, long var4, SpatialReference var6, int var7, Vector var8);

    public static final native long DataSource_CreateLayer__SWIG_1(long var0, DataSource var2, String var3, long var4, SpatialReference var6, int var7);

    public static final native long DataSource_CreateLayer__SWIG_2(long var0, DataSource var2, String var3, long var4, SpatialReference var6);

    public static final native long DataSource_CreateLayer__SWIG_3(long var0, DataSource var2, String var3);

    public static final native long DataSource_CopyLayer__SWIG_0(long var0, DataSource var2, long var3, Layer var5, String var6, Vector var7);

    public static final native long DataSource_CopyLayer__SWIG_1(long var0, DataSource var2, long var3, Layer var5, String var6);

    public static final native long DataSource_GetLayerByIndex(long var0, DataSource var2, int var3);

    public static final native long DataSource_GetLayerByName(long var0, DataSource var2, String var3);

    public static final native boolean DataSource_TestCapability(long var0, DataSource var2, String var3);

    public static final native long DataSource_ExecuteSQL__SWIG_0(long var0, DataSource var2, String var3, long var4, Geometry var6, String var7);

    public static final native long DataSource_ExecuteSQL__SWIG_1(long var0, DataSource var2, String var3, long var4, Geometry var6);

    public static final native long DataSource_ExecuteSQL__SWIG_2(long var0, DataSource var2, String var3);

    public static final native void DataSource_ReleaseResultSet(long var0, DataSource var2, long var3, Layer var5);

    public static final native int Layer_GetRefCount(long var0, Layer var2);

    public static final native void Layer_SetSpatialFilter(long var0, Layer var2, long var3, Geometry var5);

    public static final native void Layer_SetSpatialFilterRect(long var0, Layer var2, double var3, double var5, double var7, double var9);

    public static final native long Layer_GetSpatialFilter(long var0, Layer var2);

    public static final native int Layer_SetAttributeFilter(long var0, Layer var2, String var3);

    public static final native void Layer_ResetReading(long var0, Layer var2);

    public static final native String Layer_GetName(long var0, Layer var2);

    public static final native String Layer_GetGeometryColumn(long var0, Layer var2);

    public static final native String Layer_GetFIDColumn(long var0, Layer var2);

    public static final native long Layer_GetFeature(long var0, Layer var2, int var3);

    public static final native long Layer_GetNextFeature(long var0, Layer var2);

    public static final native int Layer_SetNextByIndex(long var0, Layer var2, int var3);

    public static final native int Layer_SetFeature(long var0, Layer var2, long var3, Feature var5);

    public static final native int Layer_CreateFeature(long var0, Layer var2, long var3, Feature var5);

    public static final native int Layer_DeleteFeature(long var0, Layer var2, int var3);

    public static final native int Layer_SyncToDisk(long var0, Layer var2);

    public static final native long Layer_GetLayerDefn(long var0, Layer var2);

    public static final native int Layer_GetFeatureCount__SWIG_0(long var0, Layer var2, int var3);

    public static final native int Layer_GetFeatureCount__SWIG_1(long var0, Layer var2);

    public static final native int Layer_GetExtent(long var0, Layer var2, double[] var3, int var4);

    public static final native boolean Layer_TestCapability(long var0, Layer var2, String var3);

    public static final native int Layer_CreateField__SWIG_0(long var0, Layer var2, long var3, FieldDefn var5, int var6);

    public static final native int Layer_CreateField__SWIG_1(long var0, Layer var2, long var3, FieldDefn var5);

    public static final native int Layer_StartTransaction(long var0, Layer var2);

    public static final native int Layer_CommitTransaction(long var0, Layer var2);

    public static final native int Layer_RollbackTransaction(long var0, Layer var2);

    public static final native long Layer_GetSpatialRef(long var0, Layer var2);

    public static final native long Layer_GetFeaturesRead(long var0, Layer var2);

    public static final native void delete_Feature(long var0);

    public static final native long new_Feature(long var0, FeatureDefn var2);

    public static final native long Feature_GetDefnRef(long var0, Feature var2);

    public static final native int Feature_SetGeometry(long var0, Feature var2, long var3, Geometry var5);

    public static final native int Feature_SetGeometryDirectly(long var0, Feature var2, long var3, Geometry var5);

    public static final native long Feature_GetGeometryRef(long var0, Feature var2);

    public static final native long Feature_Clone(long var0, Feature var2);

    public static final native boolean Feature_Equal(long var0, Feature var2, long var3, Feature var5);

    public static final native int Feature_GetFieldCount(long var0, Feature var2);

    public static final native long Feature_GetFieldDefnRef__SWIG_0(long var0, Feature var2, int var3);

    public static final native long Feature_GetFieldDefnRef__SWIG_1(long var0, Feature var2, String var3);

    public static final native String Feature_GetFieldAsString__SWIG_0(long var0, Feature var2, int var3);

    public static final native String Feature_GetFieldAsString__SWIG_1(long var0, Feature var2, String var3);

    public static final native int Feature_GetFieldAsInteger__SWIG_0(long var0, Feature var2, int var3);

    public static final native int Feature_GetFieldAsInteger__SWIG_1(long var0, Feature var2, String var3);

    public static final native double Feature_GetFieldAsDouble__SWIG_0(long var0, Feature var2, int var3);

    public static final native double Feature_GetFieldAsDouble__SWIG_1(long var0, Feature var2, String var3);

    public static final native void Feature_GetFieldAsDateTime(long var0, Feature var2, int var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10);

    public static final native int[] Feature_GetFieldAsIntegerList(long var0, Feature var2, int var3);

    public static final native double[] Feature_GetFieldAsDoubleList(long var0, Feature var2, int var3);

    public static final native String[] Feature_GetFieldAsStringList(long var0, Feature var2, int var3);

    public static final native boolean Feature_IsFieldSet__SWIG_0(long var0, Feature var2, int var3);

    public static final native boolean Feature_IsFieldSet__SWIG_1(long var0, Feature var2, String var3);

    public static final native int Feature_GetFieldIndex(long var0, Feature var2, String var3);

    public static final native int Feature_GetFID(long var0, Feature var2);

    public static final native int Feature_SetFID(long var0, Feature var2, int var3);

    public static final native void Feature_DumpReadable(long var0, Feature var2);

    public static final native void Feature_UnsetField__SWIG_0(long var0, Feature var2, int var3);

    public static final native void Feature_UnsetField__SWIG_1(long var0, Feature var2, String var3);

    public static final native void Feature_SetField__SWIG_0(long var0, Feature var2, int var3, String var4);

    public static final native void Feature_SetField__SWIG_1(long var0, Feature var2, String var3, String var4);

    public static final native void Feature_SetField__SWIG_2(long var0, Feature var2, int var3, int var4);

    public static final native void Feature_SetField__SWIG_3(long var0, Feature var2, String var3, int var4);

    public static final native void Feature_SetField__SWIG_4(long var0, Feature var2, int var3, double var4);

    public static final native void Feature_SetField__SWIG_5(long var0, Feature var2, String var3, double var4);

    public static final native void Feature_SetField__SWIG_6(long var0, Feature var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

    public static final native void Feature_SetField__SWIG_7(long var0, Feature var2, String var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

    public static final native void Feature_SetFieldIntegerList(long var0, Feature var2, int var3, int[] var4);

    public static final native void Feature_SetFieldDoubleList(long var0, Feature var2, int var3, double[] var4);

    public static final native void Feature_SetFieldStringList(long var0, Feature var2, int var3, Vector var4);

    public static final native int Feature_SetFrom__SWIG_0(long var0, Feature var2, long var3, Feature var5, int var6);

    public static final native int Feature_SetFrom__SWIG_1(long var0, Feature var2, long var3, Feature var5);

    public static final native String Feature_GetStyleString(long var0, Feature var2);

    public static final native void Feature_SetStyleString(long var0, Feature var2, String var3);

    public static final native int Feature_GetFieldType__SWIG_0(long var0, Feature var2, int var3);

    public static final native int Feature_GetFieldType__SWIG_1(long var0, Feature var2, String var3);

    public static final native void delete_FeatureDefn(long var0);

    public static final native long new_FeatureDefn__SWIG_0(String var0);

    public static final native long new_FeatureDefn__SWIG_1();

    public static final native String FeatureDefn_GetName(long var0, FeatureDefn var2);

    public static final native int FeatureDefn_GetFieldCount(long var0, FeatureDefn var2);

    public static final native long FeatureDefn_GetFieldDefn(long var0, FeatureDefn var2, int var3);

    public static final native int FeatureDefn_GetFieldIndex(long var0, FeatureDefn var2, String var3);

    public static final native void FeatureDefn_AddFieldDefn(long var0, FeatureDefn var2, long var3, FieldDefn var5);

    public static final native int FeatureDefn_GetGeomType(long var0, FeatureDefn var2);

    public static final native void FeatureDefn_SetGeomType(long var0, FeatureDefn var2, int var3);

    public static final native int FeatureDefn_GetReferenceCount(long var0, FeatureDefn var2);

    public static final native void delete_FieldDefn(long var0);

    public static final native long new_FieldDefn__SWIG_0(String var0, int var1);

    public static final native long new_FieldDefn__SWIG_1(String var0);

    public static final native long new_FieldDefn__SWIG_2();

    public static final native String FieldDefn_GetName(long var0, FieldDefn var2);

    public static final native String FieldDefn_GetNameRef(long var0, FieldDefn var2);

    public static final native void FieldDefn_SetName(long var0, FieldDefn var2, String var3);

    public static final native int FieldDefn_GetFieldType(long var0, FieldDefn var2);

    public static final native void FieldDefn_SetType(long var0, FieldDefn var2, int var3);

    public static final native int FieldDefn_GetJustify(long var0, FieldDefn var2);

    public static final native void FieldDefn_SetJustify(long var0, FieldDefn var2, int var3);

    public static final native int FieldDefn_GetWidth(long var0, FieldDefn var2);

    public static final native void FieldDefn_SetWidth(long var0, FieldDefn var2, int var3);

    public static final native int FieldDefn_GetPrecision(long var0, FieldDefn var2);

    public static final native void FieldDefn_SetPrecision(long var0, FieldDefn var2, int var3);

    public static final native String FieldDefn_GetTypeName(long var0, FieldDefn var2);

    public static final native String FieldDefn_GetFieldTypeName(long var0, FieldDefn var2, int var3);

    public static final native long CreateGeometryFromWkb__SWIG_0(byte[] var0, long var1, SpatialReference var3);

    public static final native long CreateGeometryFromWkb__SWIG_1(byte[] var0);

    public static final native long CreateGeometryFromWkt__SWIG_0(String var0, long var1, SpatialReference var3);

    public static final native long CreateGeometryFromWkt__SWIG_1(String var0);

    public static final native long CreateGeometryFromGML(String var0);

    public static final native long CreateGeometryFromJson(String var0);

    public static final native long BuildPolygonFromEdges__SWIG_0(long var0, Geometry var2, int var3, int var4, double var5);

    public static final native long BuildPolygonFromEdges__SWIG_1(long var0, Geometry var2, int var3, int var4);

    public static final native long BuildPolygonFromEdges__SWIG_2(long var0, Geometry var2, int var3);

    public static final native long BuildPolygonFromEdges__SWIG_3(long var0, Geometry var2);

    public static final native long ApproximateArcAngles(double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16);

    public static final native void delete_Geometry(long var0);

    public static final native int Geometry_ExportToWkt__SWIG_0(long var0, Geometry var2, String[] var3);

    public static final native byte[] Geometry_ExportToWkb__SWIG_0(long var0, Geometry var2, int var3);

    public static final native byte[] Geometry_ExportToWkb__SWIG_1(long var0, Geometry var2);

    public static final native String Geometry_ExportToGML(long var0, Geometry var2);

    public static final native String Geometry_ExportToKML__SWIG_0(long var0, Geometry var2, String var3);

    public static final native String Geometry_ExportToKML__SWIG_1(long var0, Geometry var2);

    public static final native String Geometry_ExportToJson(long var0, Geometry var2);

    public static final native void Geometry_AddPoint__SWIG_0(long var0, Geometry var2, double var3, double var5, double var7);

    public static final native void Geometry_AddPoint__SWIG_1(long var0, Geometry var2, double var3, double var5);

    public static final native void Geometry_AddPoint_2D(long var0, Geometry var2, double var3, double var5);

    public static final native int Geometry_AddGeometryDirectly(long var0, Geometry var2, long var3, Geometry var5);

    public static final native int Geometry_AddGeometry(long var0, Geometry var2, long var3, Geometry var5);

    public static final native long Geometry_Clone(long var0, Geometry var2);

    public static final native int Geometry_GetGeometryType(long var0, Geometry var2);

    public static final native String Geometry_GetGeometryName(long var0, Geometry var2);

    public static final native double Geometry_GetArea(long var0, Geometry var2);

    public static final native int Geometry_GetPointCount(long var0, Geometry var2);

    public static final native double Geometry_GetX__SWIG_0(long var0, Geometry var2, int var3);

    public static final native double Geometry_GetX__SWIG_1(long var0, Geometry var2);

    public static final native double Geometry_GetY__SWIG_0(long var0, Geometry var2, int var3);

    public static final native double Geometry_GetY__SWIG_1(long var0, Geometry var2);

    public static final native double Geometry_GetZ__SWIG_0(long var0, Geometry var2, int var3);

    public static final native double Geometry_GetZ__SWIG_1(long var0, Geometry var2);

    public static final native void Geometry_GetPoint(long var0, Geometry var2, int var3, double[] var4);

    public static final native void Geometry_GetPoint_2D(long var0, Geometry var2, int var3, double[] var4);

    public static final native int Geometry_GetGeometryCount(long var0, Geometry var2);

    public static final native void Geometry_SetPoint__SWIG_0(long var0, Geometry var2, int var3, double var4, double var6, double var8);

    public static final native void Geometry_SetPoint__SWIG_1(long var0, Geometry var2, int var3, double var4, double var6);

    public static final native void Geometry_SetPoint_2D(long var0, Geometry var2, int var3, double var4, double var6);

    public static final native long Geometry_GetGeometryRef(long var0, Geometry var2, int var3);

    public static final native long Geometry_GetBoundary(long var0, Geometry var2);

    public static final native long Geometry_ConvexHull(long var0, Geometry var2);

    public static final native long Geometry_Buffer__SWIG_0(long var0, Geometry var2, double var3, int var5);

    public static final native long Geometry_Buffer__SWIG_1(long var0, Geometry var2, double var3);

    public static final native long Geometry_Intersection(long var0, Geometry var2, long var3, Geometry var5);

    public static final native long Geometry_Union(long var0, Geometry var2, long var3, Geometry var5);

    public static final native long Geometry_Difference(long var0, Geometry var2, long var3, Geometry var5);

    public static final native long Geometry_SymmetricDifference(long var0, Geometry var2, long var3, Geometry var5);

    public static final native double Geometry_Distance(long var0, Geometry var2, long var3, Geometry var5);

    public static final native void Geometry_Empty(long var0, Geometry var2);

    public static final native boolean Geometry_IsEmpty(long var0, Geometry var2);

    public static final native boolean Geometry_IsValid(long var0, Geometry var2);

    public static final native boolean Geometry_IsSimple(long var0, Geometry var2);

    public static final native boolean Geometry_IsRing(long var0, Geometry var2);

    public static final native boolean Geometry_Intersect(long var0, Geometry var2, long var3, Geometry var5);

    public static final native boolean Geometry_Equal(long var0, Geometry var2, long var3, Geometry var5);

    public static final native boolean Geometry_Disjoint(long var0, Geometry var2, long var3, Geometry var5);

    public static final native boolean Geometry_Touches(long var0, Geometry var2, long var3, Geometry var5);

    public static final native boolean Geometry_Crosses(long var0, Geometry var2, long var3, Geometry var5);

    public static final native boolean Geometry_Within(long var0, Geometry var2, long var3, Geometry var5);

    public static final native boolean Geometry_Contains(long var0, Geometry var2, long var3, Geometry var5);

    public static final native boolean Geometry_Overlaps(long var0, Geometry var2, long var3, Geometry var5);

    public static final native int Geometry_TransformTo(long var0, Geometry var2, long var3, SpatialReference var5);

    public static final native int Geometry_Transform(long var0, Geometry var2, long var3, CoordinateTransformation var5);

    public static final native long Geometry_GetSpatialReference(long var0, Geometry var2);

    public static final native void Geometry_AssignSpatialReference(long var0, Geometry var2, long var3, SpatialReference var5);

    public static final native void Geometry_CloseRings(long var0, Geometry var2);

    public static final native void Geometry_FlattenTo2D(long var0, Geometry var2);

    public static final native void Geometry_Segmentize(long var0, Geometry var2, double var3);

    public static final native void Geometry_GetEnvelope(long var0, Geometry var2, double[] var3);

    public static final native int Geometry_WkbSize(long var0, Geometry var2);

    public static final native int Geometry_GetCoordinateDimension(long var0, Geometry var2);

    public static final native void Geometry_SetCoordinateDimension(long var0, Geometry var2, int var3);

    public static final native int Geometry_GetDimension(long var0, Geometry var2);

    public static final native long new_Geometry__SWIG_0(int var0, String var1, byte[] var2, String var3);

    public static final native long new_Geometry__SWIG_1(int var0);

    public static final native String Geometry_ExportToWkt__SWIG_1(long var0, Geometry var2);

    public static final native long Geometry_Centroid(long var0, Geometry var2);

    public static final native int GetDriverCount();

    public static final native int GetOpenDSCount();

    public static final native int SetGenerate_DB2_V72_BYTE_ORDER(int var0);

    public static final native void RegisterAll();

    public static final native long GetOpenDS(int var0);

    public static final native long Open__SWIG_0(String var0, int var1);

    public static final native long Open__SWIG_1(String var0);

    public static final native long OpenShared__SWIG_0(String var0, int var1);

    public static final native long OpenShared__SWIG_1(String var0);

    public static final native long GetDriverByName(String var0);

    public static final native long GetDriver(int var0);

    public static final native Vector GeneralCmdLineProcessor__SWIG_0(Vector var0, int var1);

    public static final native Vector GeneralCmdLineProcessor__SWIG_1(Vector var0);

    static {
        available = NativeLoader.load();
    }
}

