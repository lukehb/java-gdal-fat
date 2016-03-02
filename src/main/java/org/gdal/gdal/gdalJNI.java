/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.Hashtable;
import java.util.Vector;

import org.gdal.NativeLoader;
import org.gdal.gdal.Band;
import org.gdal.gdal.ColorTable;
import org.gdal.gdal.Dataset;
import org.gdal.gdal.Driver;
import org.gdal.gdal.GCP;
import org.gdal.gdal.MajorObject;
import org.gdal.gdal.ProgressCallback;
import org.gdal.gdal.RasterAttributeTable;
import org.gdal.gdal.TermProgressCallback;
import org.gdal.gdal.Transformer;
import org.gdal.gdal.XMLNode;
import org.gdal.gdal.gdal;
import org.gdal.ogr.Layer;

public class gdalJNI {
    private static boolean available = false;

    public static boolean isAvailable() {
        return available;
    }

    public static final native void delete_ProgressCallback(long var0);

    public static final native int ProgressCallback_run(long var0, ProgressCallback var2, double var3, String var5);

    public static final native long new_ProgressCallback();

    public static final native long new_TermProgressCallback();

    public static final native int TermProgressCallback_run(long var0, TermProgressCallback var2, double var3, String var5);

    public static final native void delete_TermProgressCallback(long var0);

    public static final native void Debug(String var0, String var1);

    public static final native int PushErrorHandler__SWIG_0(String var0);

    public static final native int PushErrorHandler__SWIG_1();

    public static final native void Error(int var0, int var1, String var2);

    public static final native void PopErrorHandler();

    public static final native void ErrorReset();

    public static final native String EscapeString__SWIG_0(byte[] var0, int var1);

    public static final native String EscapeString__SWIG_1(String var0, int var1);

    public static final native int GetLastErrorNo();

    public static final native int GetLastErrorType();

    public static final native String GetLastErrorMsg();

    public static final native void PushFinderLocation(String var0);

    public static final native void PopFinderLocation();

    public static final native void FinderClean();

    public static final native String FindFile(String var0, String var1);

    public static final native Vector ReadDir(String var0);

    public static final native void SetConfigOption(String var0, String var1);

    public static final native String GetConfigOption__SWIG_0(String var0, String var1);

    public static final native String GetConfigOption__SWIG_1(String var0);

    public static final native String CPLBinaryToHex(byte[] var0);

    public static final native byte[] CPLHexToBinary(String var0);

    public static final native void FileFromMemBuffer(String var0, byte[] var1);

    public static final native int Unlink(String var0);

    public static final native int HasThreadSupport();

    public static final native int CXT_Element_get();

    public static final native int CXT_Text_get();

    public static final native int CXT_Attribute_get();

    public static final native int CXT_Comment_get();

    public static final native int CXT_Literal_get();

    public static final native int XMLNode_Type_get(long var0, XMLNode var2);

    public static final native String XMLNode_Value_get(long var0, XMLNode var2);

    public static final native long XMLNode_Next_get(long var0, XMLNode var2);

    public static final native long XMLNode_Child_get(long var0, XMLNode var2);

    public static final native long new_XMLNode__SWIG_0(String var0);

    public static final native long new_XMLNode__SWIG_1(int var0, String var1);

    public static final native void delete_XMLNode(long var0);

    public static final native long XMLNode_ParseXMLFile(String var0);

    public static final native String XMLNode_SerializeXMLTree(long var0, XMLNode var2);

    public static final native String XMLNode_toString(long var0, XMLNode var2);

    public static final native long XMLNode_SearchXMLNode(long var0, XMLNode var2, String var3);

    public static final native long XMLNode_GetXMLNode(long var0, XMLNode var2, String var3);

    public static final native String XMLNode_GetXMLValue(long var0, XMLNode var2, String var3, String var4);

    public static final native void XMLNode_AddXMLChild(long var0, XMLNode var2, long var3, XMLNode var5);

    public static final native void XMLNode_AddXMLSibling(long var0, XMLNode var2, long var3, XMLNode var5);

    public static final native long XMLNode_Clone(long var0, XMLNode var2);

    public static final native int XMLNode_SetXMLValue(long var0, XMLNode var2, String var3, String var4);

    public static final native void XMLNode_StripXMLNamespace(long var0, XMLNode var2, String var3, int var4);

    public static final native String MajorObject_GetDescription(long var0, MajorObject var2);

    public static final native void MajorObject_SetDescription(long var0, MajorObject var2, String var3);

    public static final native Hashtable MajorObject_GetMetadata_Dict__SWIG_0(long var0, MajorObject var2, String var3);

    public static final native Hashtable MajorObject_GetMetadata_Dict__SWIG_1(long var0, MajorObject var2);

    public static final native Vector MajorObject_GetMetadata_List__SWIG_0(long var0, MajorObject var2, String var3);

    public static final native Vector MajorObject_GetMetadata_List__SWIG_1(long var0, MajorObject var2);

    public static final native int MajorObject_SetMetadata__SWIG_0(long var0, MajorObject var2, Vector var3, String var4);

    public static final native int MajorObject_SetMetadata__SWIG_1(long var0, MajorObject var2, Vector var3);

    public static final native int MajorObject_SetMetadata__SWIG_2(long var0, MajorObject var2, String var3, String var4);

    public static final native int MajorObject_SetMetadata__SWIG_3(long var0, MajorObject var2, String var3);

    public static final native String MajorObject_GetMetadataItem__SWIG_0(long var0, MajorObject var2, String var3, String var4);

    public static final native String MajorObject_GetMetadataItem__SWIG_1(long var0, MajorObject var2, String var3);

    public static final native int MajorObject_SetMetadataItem__SWIG_0(long var0, MajorObject var2, String var3, String var4, String var5);

    public static final native int MajorObject_SetMetadataItem__SWIG_1(long var0, MajorObject var2, String var3, String var4);

    public static final native String Driver_ShortName_get(long var0, Driver var2);

    public static final native String Driver_LongName_get(long var0, Driver var2);

    public static final native String Driver_HelpTopic_get(long var0, Driver var2);

    public static final native long Driver_Create__SWIG_0(long var0, Driver var2, String var3, int var4, int var5, int var6, int var7, Vector var8);

    public static final native long Driver_Create__SWIG_1(long var0, Driver var2, String var3, int var4, int var5, int var6, int var7);

    public static final native long Driver_Create__SWIG_2(long var0, Driver var2, String var3, int var4, int var5, int var6);

    public static final native long Driver_Create__SWIG_3(long var0, Driver var2, String var3, int var4, int var5);

    public static final native long Driver_CreateCopy__SWIG_0(long var0, Driver var2, String var3, long var4, Dataset var6, int var7, Vector var8, ProgressCallback var9);

    public static final native long Driver_CreateCopy__SWIG_2(long var0, Driver var2, String var3, long var4, Dataset var6, int var7, Vector var8);

    public static final native long Driver_CreateCopy__SWIG_3(long var0, Driver var2, String var3, long var4, Dataset var6, int var7);

    public static final native long Driver_CreateCopy__SWIG_4(long var0, Driver var2, String var3, long var4, Dataset var6);

    public static final native int Driver_Delete(long var0, Driver var2, String var3);

    public static final native int Driver_Rename(long var0, Driver var2, String var3, String var4);

    public static final native int Driver_Register(long var0, Driver var2);

    public static final native void Driver_Deregister(long var0, Driver var2);

    public static final native void GCP_GCPX_set(long var0, GCP var2, double var3);

    public static final native double GCP_GCPX_get(long var0, GCP var2);

    public static final native void GCP_GCPY_set(long var0, GCP var2, double var3);

    public static final native double GCP_GCPY_get(long var0, GCP var2);

    public static final native void GCP_GCPZ_set(long var0, GCP var2, double var3);

    public static final native double GCP_GCPZ_get(long var0, GCP var2);

    public static final native void GCP_GCPPixel_set(long var0, GCP var2, double var3);

    public static final native double GCP_GCPPixel_get(long var0, GCP var2);

    public static final native void GCP_GCPLine_set(long var0, GCP var2, double var3);

    public static final native double GCP_GCPLine_get(long var0, GCP var2);

    public static final native void GCP_Info_set(long var0, GCP var2, String var3);

    public static final native String GCP_Info_get(long var0, GCP var2);

    public static final native void GCP_Id_set(long var0, GCP var2, String var3);

    public static final native String GCP_Id_get(long var0, GCP var2);

    public static final native long new_GCP(double var0, double var2, double var4, double var6, double var8, String var10, String var11);

    public static final native void delete_GCP(long var0);

    public static final native double GDAL_GCP_GCPX_get(long var0, GCP var2);

    public static final native void GDAL_GCP_GCPX_set(long var0, GCP var2, double var3);

    public static final native double GDAL_GCP_GCPY_get(long var0, GCP var2);

    public static final native void GDAL_GCP_GCPY_set(long var0, GCP var2, double var3);

    public static final native double GDAL_GCP_GCPZ_get(long var0, GCP var2);

    public static final native void GDAL_GCP_GCPZ_set(long var0, GCP var2, double var3);

    public static final native double GDAL_GCP_GCPPixel_get(long var0, GCP var2);

    public static final native void GDAL_GCP_GCPPixel_set(long var0, GCP var2, double var3);

    public static final native double GDAL_GCP_GCPLine_get(long var0, GCP var2);

    public static final native void GDAL_GCP_GCPLine_set(long var0, GCP var2, double var3);

    public static final native String GDAL_GCP_Info_get(long var0, GCP var2);

    public static final native void GDAL_GCP_Info_set(long var0, GCP var2, String var3);

    public static final native String GDAL_GCP_Id_get(long var0, GCP var2);

    public static final native void GDAL_GCP_Id_set(long var0, GCP var2, String var3);

    public static final native double GDAL_GCP_get_GCPX(long var0, GCP var2);

    public static final native void GDAL_GCP_set_GCPX(long var0, GCP var2, double var3);

    public static final native double GDAL_GCP_get_GCPY(long var0, GCP var2);

    public static final native void GDAL_GCP_set_GCPY(long var0, GCP var2, double var3);

    public static final native double GDAL_GCP_get_GCPZ(long var0, GCP var2);

    public static final native void GDAL_GCP_set_GCPZ(long var0, GCP var2, double var3);

    public static final native double GDAL_GCP_get_GCPPixel(long var0, GCP var2);

    public static final native void GDAL_GCP_set_GCPPixel(long var0, GCP var2, double var3);

    public static final native double GDAL_GCP_get_GCPLine(long var0, GCP var2);

    public static final native void GDAL_GCP_set_GCPLine(long var0, GCP var2, double var3);

    public static final native String GDAL_GCP_get_Info(long var0, GCP var2);

    public static final native void GDAL_GCP_set_Info(long var0, GCP var2, String var3);

    public static final native String GDAL_GCP_get_Id(long var0, GCP var2);

    public static final native void GDAL_GCP_set_Id(long var0, GCP var2, String var3);

    public static final native int GCPsToGeoTransform__SWIG_0(GCP[] var0, double[] var1, int var2);

    public static final native int GCPsToGeoTransform__SWIG_1(GCP[] var0, double[] var1);

    public static final native int Dataset_RasterXSize_get(long var0, Dataset var2);

    public static final native int Dataset_RasterYSize_get(long var0, Dataset var2);

    public static final native int Dataset_RasterCount_get(long var0, Dataset var2);

    public static final native void delete_Dataset(long var0);

    public static final native long Dataset_GetDriver(long var0, Dataset var2);

    public static final native long Dataset_GetRasterBand(long var0, Dataset var2, int var3);

    public static final native String Dataset_GetProjection(long var0, Dataset var2);

    public static final native String Dataset_GetProjectionRef(long var0, Dataset var2);

    public static final native int Dataset_SetProjection(long var0, Dataset var2, String var3);

    public static final native void Dataset_GetGeoTransform(long var0, Dataset var2, double[] var3);

    public static final native int Dataset_SetGeoTransform(long var0, Dataset var2, double[] var3);

    public static final native int Dataset_BuildOverviews__SWIG_0(long var0, Dataset var2, String var3, int[] var4, ProgressCallback var5);

    public static final native int Dataset_BuildOverviews__SWIG_2(long var0, Dataset var2, String var3, int[] var4);

    public static final native int Dataset_GetGCPCount(long var0, Dataset var2);

    public static final native String Dataset_GetGCPProjection(long var0, Dataset var2);

    public static final native void Dataset_GetGCPs(long var0, Dataset var2, Vector var3);

    public static final native int Dataset_SetGCPs(long var0, Dataset var2, GCP[] var3, String var4);

    public static final native void Dataset_FlushCache(long var0, Dataset var2);

    public static final native int Dataset_AddBand__SWIG_0(long var0, Dataset var2, int var3, Vector var4);

    public static final native int Dataset_AddBand__SWIG_1(long var0, Dataset var2, int var3);

    public static final native int Dataset_AddBand__SWIG_2(long var0, Dataset var2);

    public static final native int Dataset_CreateMaskBand(long var0, Dataset var2, int var3);

    public static final native Vector Dataset_GetFileList(long var0, Dataset var2);

    public static final native int Dataset_ReadRaster_Direct__SWIG_0(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_ReadRaster_Direct__SWIG_1(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int[] var11, int var12, int var13);

    public static final native int Dataset_ReadRaster_Direct__SWIG_2(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int[] var11, int var12);

    public static final native int Dataset_ReadRaster_Direct__SWIG_3(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int[] var11);

    public static final native int Dataset_ReadRaster__SWIG_0(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_ReadRaster__SWIG_1(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int[] var11, int var12, int var13);

    public static final native int Dataset_ReadRaster__SWIG_2(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int[] var11, int var12);

    public static final native int Dataset_ReadRaster__SWIG_3(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int[] var11);

    public static final native int Dataset_ReadRaster__SWIG_4(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_ReadRaster__SWIG_5(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int[] var11, int var12, int var13);

    public static final native int Dataset_ReadRaster__SWIG_6(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int[] var11, int var12);

    public static final native int Dataset_ReadRaster__SWIG_7(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int[] var11);

    public static final native int Dataset_ReadRaster__SWIG_8(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_ReadRaster__SWIG_9(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int[] var11, int var12, int var13);

    public static final native int Dataset_ReadRaster__SWIG_10(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int[] var11, int var12);

    public static final native int Dataset_ReadRaster__SWIG_11(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int[] var11);

    public static final native int Dataset_ReadRaster__SWIG_12(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_ReadRaster__SWIG_13(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int[] var11, int var12, int var13);

    public static final native int Dataset_ReadRaster__SWIG_14(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int[] var11, int var12);

    public static final native int Dataset_ReadRaster__SWIG_15(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int[] var11);

    public static final native int Dataset_ReadRaster__SWIG_16(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_ReadRaster__SWIG_17(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int[] var11, int var12, int var13);

    public static final native int Dataset_ReadRaster__SWIG_18(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int[] var11, int var12);

    public static final native int Dataset_ReadRaster__SWIG_19(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int[] var11);

    public static final native int Dataset_WriteRaster_Direct__SWIG_0(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_WriteRaster_Direct__SWIG_1(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int[] var11, int var12, int var13);

    public static final native int Dataset_WriteRaster_Direct__SWIG_2(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int[] var11, int var12);

    public static final native int Dataset_WriteRaster_Direct__SWIG_3(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int[] var11);

    public static final native int Dataset_WriteRaster__SWIG_0(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_WriteRaster__SWIG_1(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int[] var11, int var12, int var13);

    public static final native int Dataset_WriteRaster__SWIG_2(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int[] var11, int var12);

    public static final native int Dataset_WriteRaster__SWIG_3(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int[] var11);

    public static final native int Dataset_WriteRaster__SWIG_4(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_WriteRaster__SWIG_5(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int[] var11, int var12, int var13);

    public static final native int Dataset_WriteRaster__SWIG_6(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int[] var11, int var12);

    public static final native int Dataset_WriteRaster__SWIG_7(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int[] var11);

    public static final native int Dataset_WriteRaster__SWIG_8(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_WriteRaster__SWIG_9(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int[] var11, int var12, int var13);

    public static final native int Dataset_WriteRaster__SWIG_10(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int[] var11, int var12);

    public static final native int Dataset_WriteRaster__SWIG_11(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int[] var11);

    public static final native int Dataset_WriteRaster__SWIG_12(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_WriteRaster__SWIG_13(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int[] var11, int var12, int var13);

    public static final native int Dataset_WriteRaster__SWIG_14(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int[] var11, int var12);

    public static final native int Dataset_WriteRaster__SWIG_15(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int[] var11);

    public static final native int Dataset_WriteRaster__SWIG_16(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int[] var11, int var12, int var13, int var14);

    public static final native int Dataset_WriteRaster__SWIG_17(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int[] var11, int var12, int var13);

    public static final native int Dataset_WriteRaster__SWIG_18(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int[] var11, int var12);

    public static final native int Dataset_WriteRaster__SWIG_19(long var0, Dataset var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int[] var11);

    public static final native int Band_XSize_get(long var0, Band var2);

    public static final native int Band_YSize_get(long var0, Band var2);

    public static final native int Band_DataType_get(long var0, Band var2);

    public static final native int Band_GetBand(long var0, Band var2);

    public static final native void Band_GetBlockSize(long var0, Band var2, int[] var3, int[] var4);

    public static final native int Band_GetColorInterpretation(long var0, Band var2);

    public static final native int Band_GetRasterColorInterpretation(long var0, Band var2);

    public static final native int Band_SetColorInterpretation(long var0, Band var2, int var3);

    public static final native int Band_SetRasterColorInterpretation(long var0, Band var2, int var3);

    public static final native void Band_GetNoDataValue(long var0, Band var2, Double[] var3);

    public static final native int Band_SetNoDataValue(long var0, Band var2, double var3);

    public static final native String Band_GetUnitType(long var0, Band var2);

    public static final native Vector Band_GetRasterCategoryNames(long var0, Band var2);

    public static final native int Band_SetRasterCategoryNames(long var0, Band var2, Vector var3);

    public static final native void Band_GetMinimum(long var0, Band var2, Double[] var3);

    public static final native void Band_GetMaximum(long var0, Band var2, Double[] var3);

    public static final native void Band_GetOffset(long var0, Band var2, Double[] var3);

    public static final native void Band_GetScale(long var0, Band var2, Double[] var3);

    public static final native int Band_GetStatistics(long var0, Band var2, int var3, int var4, double[] var5, double[] var6, double[] var7, double[] var8);

    public static final native int Band_ComputeStatistics__SWIG_0(long var0, Band var2, boolean var3, double[] var4, double[] var5, double[] var6, double[] var7, ProgressCallback var8);

    public static final native int Band_ComputeStatistics__SWIG_2(long var0, Band var2, boolean var3, double[] var4, double[] var5, double[] var6, double[] var7);

    public static final native int Band_ComputeStatistics__SWIG_3(long var0, Band var2, boolean var3, double[] var4, double[] var5, double[] var6);

    public static final native int Band_ComputeStatistics__SWIG_4(long var0, Band var2, boolean var3, double[] var4, double[] var5);

    public static final native int Band_ComputeStatistics__SWIG_5(long var0, Band var2, boolean var3, double[] var4);

    public static final native int Band_ComputeStatistics__SWIG_6(long var0, Band var2, boolean var3);

    public static final native int Band_SetStatistics(long var0, Band var2, double var3, double var5, double var7, double var9);

    public static final native int Band_GetOverviewCount(long var0, Band var2);

    public static final native long Band_GetOverview(long var0, Band var2, int var3);

    public static final native int Band_Checksum(long var0, Band var2, int var3, int var4, int var5, int var6);

    public static final native void Band_ComputeRasterMinMax__SWIG_0(long var0, Band var2, double[] var3, int var4);

    public static final native void Band_ComputeRasterMinMax__SWIG_1(long var0, Band var2, double[] var3);

    public static final native void Band_ComputeBandStats__SWIG_0(long var0, Band var2, double[] var3, int var4);

    public static final native void Band_ComputeBandStats__SWIG_1(long var0, Band var2, double[] var3);

    public static final native int Band_Fill__SWIG_0(long var0, Band var2, double var3, double var5);

    public static final native int Band_Fill__SWIG_1(long var0, Band var2, double var3);

    public static final native void Band_FlushCache(long var0, Band var2);

    public static final native long Band_GetRasterColorTable(long var0, Band var2);

    public static final native long Band_GetColorTable(long var0, Band var2);

    public static final native int Band_SetRasterColorTable(long var0, Band var2, long var3, ColorTable var5);

    public static final native int Band_SetColorTable(long var0, Band var2, long var3, ColorTable var5);

    public static final native long Band_GetDefaultRAT(long var0, Band var2);

    public static final native int Band_SetDefaultRAT(long var0, Band var2, long var3, RasterAttributeTable var5);

    public static final native long Band_GetMaskBand(long var0, Band var2);

    public static final native int Band_GetMaskFlags(long var0, Band var2);

    public static final native int Band_CreateMaskBand(long var0, Band var2, int var3);

    public static final native int Band_SetDefaultHistogram(long var0, Band var2, double var3, double var5, int[] var7);

    public static final native boolean Band_HasArbitraryOverviews(long var0, Band var2);

    public static final native int Band_ReadRaster_Direct__SWIG_0(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int var11, int var12);

    public static final native int Band_ReadRaster_Direct__SWIG_1(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int var11);

    public static final native int Band_ReadRaster_Direct__SWIG_2(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10);

    public static final native int Band_ReadRaster__SWIG_0(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int var11, int var12);

    public static final native int Band_ReadRaster__SWIG_1(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int var11);

    public static final native int Band_ReadRaster__SWIG_2(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10);

    public static final native int Band_ReadRaster__SWIG_3(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int var11, int var12);

    public static final native int Band_ReadRaster__SWIG_4(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int var11);

    public static final native int Band_ReadRaster__SWIG_5(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10);

    public static final native int Band_ReadRaster__SWIG_6(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int var11, int var12);

    public static final native int Band_ReadRaster__SWIG_7(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int var11);

    public static final native int Band_ReadRaster__SWIG_8(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10);

    public static final native int Band_ReadRaster__SWIG_9(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int var11, int var12);

    public static final native int Band_ReadRaster__SWIG_10(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int var11);

    public static final native int Band_ReadRaster__SWIG_11(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10);

    public static final native int Band_ReadRaster__SWIG_12(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int var11, int var12);

    public static final native int Band_ReadRaster__SWIG_13(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int var11);

    public static final native int Band_ReadRaster__SWIG_14(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10);

    public static final native int Band_WriteRaster_Direct__SWIG_0(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int var11, int var12);

    public static final native int Band_WriteRaster_Direct__SWIG_1(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10, int var11);

    public static final native int Band_WriteRaster_Direct__SWIG_2(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ByteBuffer var10);

    public static final native int Band_WriteRaster__SWIG_0(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int var11, int var12);

    public static final native int Band_WriteRaster__SWIG_1(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10, int var11);

    public static final native int Band_WriteRaster__SWIG_2(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte[] var10);

    public static final native int Band_WriteRaster__SWIG_3(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int var11, int var12);

    public static final native int Band_WriteRaster__SWIG_4(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10, int var11);

    public static final native int Band_WriteRaster__SWIG_5(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short[] var10);

    public static final native int Band_WriteRaster__SWIG_6(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int var11, int var12);

    public static final native int Band_WriteRaster__SWIG_7(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int var11);

    public static final native int Band_WriteRaster__SWIG_8(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10);

    public static final native int Band_WriteRaster__SWIG_9(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int var11, int var12);

    public static final native int Band_WriteRaster__SWIG_10(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10, int var11);

    public static final native int Band_WriteRaster__SWIG_11(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float[] var10);

    public static final native int Band_WriteRaster__SWIG_12(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int var11, int var12);

    public static final native int Band_WriteRaster__SWIG_13(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10, int var11);

    public static final native int Band_WriteRaster__SWIG_14(long var0, Band var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, double[] var10);

    public static final native int Band_ReadBlock_Direct(long var0, Band var2, int var3, int var4, ByteBuffer var5);

    public static final native int Band_WriteBlock_Direct(long var0, Band var2, int var3, int var4, ByteBuffer var5);

    public static final native int Band_GetHistogram__SWIG_0(long var0, Band var2, double var3, double var5, int[] var7, boolean var8, boolean var9, ProgressCallback var10);

    public static final native int Band_GetHistogram__SWIG_1(long var0, Band var2, double var3, double var5, int[] var7, boolean var8, boolean var9);

    public static final native int Band_GetHistogram__SWIG_2(long var0, Band var2, double var3, double var5, int[] var7);

    public static final native int Band_GetHistogram__SWIG_3(long var0, Band var2, int[] var3);

    public static final native int Band_GetDefaultHistogram__SWIG_0(long var0, Band var2, double[] var3, double[] var4, int[][] var5, boolean var6, ProgressCallback var7);

    public static final native int Band_GetDefaultHistogram__SWIG_2(long var0, Band var2, double[] var3, double[] var4, int[][] var5, boolean var6);

    public static final native int Band_GetDefaultHistogram__SWIG_3(long var0, Band var2, double[] var3, double[] var4, int[][] var5);

    public static final native long new_ColorTable__SWIG_0(int var0);

    public static final native long new_ColorTable__SWIG_1();

    public static final native void delete_ColorTable(long var0);

    public static final native long ColorTable_Clone(long var0, ColorTable var2);

    public static final native int ColorTable_GetPaletteInterpretation(long var0, ColorTable var2);

    public static final native int ColorTable_GetCount(long var0, ColorTable var2);

    public static final native Color ColorTable_GetColorEntry(long var0, ColorTable var2, int var3);

    public static final native void ColorTable_SetColorEntry(long var0, ColorTable var2, int var3, Color var4);

    public static final native void ColorTable_CreateColorRamp(long var0, ColorTable var2, int var3, Color var4, int var5, Color var6);

    public static final native long new_RasterAttributeTable();

    public static final native void delete_RasterAttributeTable(long var0);

    public static final native long RasterAttributeTable_Clone(long var0, RasterAttributeTable var2);

    public static final native int RasterAttributeTable_GetColumnCount(long var0, RasterAttributeTable var2);

    public static final native String RasterAttributeTable_GetNameOfCol(long var0, RasterAttributeTable var2, int var3);

    public static final native int RasterAttributeTable_GetUsageOfCol(long var0, RasterAttributeTable var2, int var3);

    public static final native int RasterAttributeTable_GetTypeOfCol(long var0, RasterAttributeTable var2, int var3);

    public static final native int RasterAttributeTable_GetColOfUsage(long var0, RasterAttributeTable var2, int var3);

    public static final native int RasterAttributeTable_GetRowCount(long var0, RasterAttributeTable var2);

    public static final native String RasterAttributeTable_GetValueAsString(long var0, RasterAttributeTable var2, int var3, int var4);

    public static final native int RasterAttributeTable_GetValueAsInt(long var0, RasterAttributeTable var2, int var3, int var4);

    public static final native double RasterAttributeTable_GetValueAsDouble(long var0, RasterAttributeTable var2, int var3, int var4);

    public static final native void RasterAttributeTable_SetValueAsString(long var0, RasterAttributeTable var2, int var3, int var4, String var5);

    public static final native void RasterAttributeTable_SetValueAsInt(long var0, RasterAttributeTable var2, int var3, int var4, int var5);

    public static final native void RasterAttributeTable_SetValueAsDouble(long var0, RasterAttributeTable var2, int var3, int var4, double var5);

    public static final native void RasterAttributeTable_SetRowCount(long var0, RasterAttributeTable var2, int var3);

    public static final native int RasterAttributeTable_CreateColumn(long var0, RasterAttributeTable var2, String var3, int var4, int var5);

    public static final native boolean RasterAttributeTable_GetLinearBinning(long var0, RasterAttributeTable var2, double[] var3, double[] var4);

    public static final native int RasterAttributeTable_SetLinearBinning(long var0, RasterAttributeTable var2, double var3, double var5);

    public static final native int RasterAttributeTable_GetRowOfValue(long var0, RasterAttributeTable var2, double var3);

    public static final native int ComputeMedianCutPCT__SWIG_0(long var0, Band var2, long var3, Band var5, long var6, Band var8, int var9, long var10, ColorTable var12, ProgressCallback var13);

    public static final native int ComputeMedianCutPCT__SWIG_2(long var0, Band var2, long var3, Band var5, long var6, Band var8, int var9, long var10, ColorTable var12);

    public static final native int DitherRGB2PCT__SWIG_0(long var0, Band var2, long var3, Band var5, long var6, Band var8, long var9, Band var11, long var12, ColorTable var14, ProgressCallback var15);

    public static final native int DitherRGB2PCT__SWIG_2(long var0, Band var2, long var3, Band var5, long var6, Band var8, long var9, Band var11, long var12, ColorTable var14);

    public static final native int ReprojectImage__SWIG_0(long var0, Dataset var2, long var3, Dataset var5, String var6, String var7, int var8, double var9, double var11, ProgressCallback var13);

    public static final native int ReprojectImage__SWIG_2(long var0, Dataset var2, long var3, Dataset var5, String var6, String var7, int var8, double var9, double var11);

    public static final native int ReprojectImage__SWIG_3(long var0, Dataset var2, long var3, Dataset var5, String var6, String var7, int var8, double var9);

    public static final native int ReprojectImage__SWIG_4(long var0, Dataset var2, long var3, Dataset var5, String var6, String var7, int var8);

    public static final native int ReprojectImage__SWIG_5(long var0, Dataset var2, long var3, Dataset var5, String var6, String var7);

    public static final native int ReprojectImage__SWIG_6(long var0, Dataset var2, long var3, Dataset var5, String var6);

    public static final native int ReprojectImage__SWIG_7(long var0, Dataset var2, long var3, Dataset var5);

    public static final native int ComputeProximity__SWIG_0(long var0, Band var2, long var3, Band var5, Vector var6, ProgressCallback var7);

    public static final native int ComputeProximity__SWIG_2(long var0, Band var2, long var3, Band var5, Vector var6);

    public static final native int ComputeProximity__SWIG_3(long var0, Band var2, long var3, Band var5);

    public static final native int RasterizeLayer__SWIG_0(long var0, Dataset var2, int[] var3, Layer var4, double[] var5, Vector var6, ProgressCallback var7);

    public static final native int RasterizeLayer__SWIG_2(long var0, Dataset var2, int[] var3, Layer var4, double[] var5, Vector var6);

    public static final native int RasterizeLayer__SWIG_3(long var0, Dataset var2, int[] var3, Layer var4, double[] var5);

    public static final native int RasterizeLayer__SWIG_5(long var0, Dataset var2, int[] var3, Layer var4);

    public static final native int Polygonize__SWIG_0(long var0, Band var2, long var3, Band var5, Layer var6, int var7, Vector var8, ProgressCallback var9);

    public static final native int Polygonize__SWIG_2(long var0, Band var2, long var3, Band var5, Layer var6, int var7, Vector var8);

    public static final native int Polygonize__SWIG_3(long var0, Band var2, long var3, Band var5, Layer var6, int var7);

    public static final native int FillNodata__SWIG_0(long var0, Band var2, long var3, Band var5, double var6, int var8, Vector var9, ProgressCallback var10);

    public static final native int FillNodata__SWIG_2(long var0, Band var2, long var3, Band var5, double var6, int var8, Vector var9);

    public static final native int FillNodata__SWIG_3(long var0, Band var2, long var3, Band var5, double var6, int var8);

    public static final native int SieveFilter__SWIG_0(long var0, Band var2, long var3, Band var5, long var6, Band var8, int var9, int var10, Vector var11, ProgressCallback var12);

    public static final native int SieveFilter__SWIG_2(long var0, Band var2, long var3, Band var5, long var6, Band var8, int var9, int var10, Vector var11);

    public static final native int SieveFilter__SWIG_3(long var0, Band var2, long var3, Band var5, long var6, Band var8, int var9, int var10);

    public static final native int SieveFilter__SWIG_4(long var0, Band var2, long var3, Band var5, long var6, Band var8, int var9);

    public static final native int RegenerateOverviews__SWIG_0(long var0, Band var2, Band[] var3, String var4, ProgressCallback var5);

    public static final native int RegenerateOverviews__SWIG_2(long var0, Band var2, Band[] var3, String var4);

    public static final native int RegenerateOverviews__SWIG_3(long var0, Band var2, Band[] var3);

    public static final native int RegenerateOverview__SWIG_0(long var0, Band var2, long var3, Band var5, String var6, ProgressCallback var7);

    public static final native int RegenerateOverview__SWIG_2(long var0, Band var2, long var3, Band var5, String var6);

    public static final native int RegenerateOverview__SWIG_3(long var0, Band var2, long var3, Band var5);

    public static final native long AutoCreateWarpedVRT__SWIG_0(long var0, Dataset var2, String var3, String var4, int var5, double var6);

    public static final native long AutoCreateWarpedVRT__SWIG_1(long var0, Dataset var2, String var3, String var4, int var5);

    public static final native long AutoCreateWarpedVRT__SWIG_2(long var0, Dataset var2, String var3, String var4);

    public static final native long AutoCreateWarpedVRT__SWIG_3(long var0, Dataset var2, String var3);

    public static final native long AutoCreateWarpedVRT__SWIG_4(long var0, Dataset var2);

    public static final native long new_Transformer(long var0, Dataset var2, long var3, Dataset var5, Vector var6);

    public static final native void delete_Transformer(long var0);

    public static final native int Transformer_TransformPoint__SWIG_0(long var0, Transformer var2, int var3, double[] var4);

    public static final native int Transformer_TransformPoint__SWIG_1(long var0, Transformer var2, double[] var3, int var4, double var5, double var7, double var9);

    public static final native int Transformer_TransformPoint__SWIG_2(long var0, Transformer var2, double[] var3, int var4, double var5, double var7);

    public static final native int Transformer_TransformPoints(long var0, Transformer var2, int var3, double[][] var4, int[] var5);

    public static final native void ApplyGeoTransform(double[] var0, double var1, double var3, double[] var5, double[] var6);

    public static final native int InvGeoTransform(double[] var0, double[] var1);

    public static final native String VersionInfo__SWIG_0(String var0);

    public static final native String VersionInfo__SWIG_1();

    public static final native void AllRegister();

    public static final native void GDALDestroyDriverManager();

    public static final native int GetCacheMax();

    public static final native void SetCacheMax(int var0);

    public static final native int GetCacheUsed();

    public static final native int GetDataTypeSize(int var0);

    public static final native int DataTypeIsComplex(int var0);

    public static final native String GetDataTypeName(int var0);

    public static final native int GetDataTypeByName(String var0);

    public static final native String GetColorInterpretationName(int var0);

    public static final native String GetPaletteInterpretationName(int var0);

    public static final native String DecToDMS__SWIG_0(double var0, String var2, int var3);

    public static final native String DecToDMS__SWIG_1(double var0, String var2);

    public static final native double PackedDMSToDec(double var0);

    public static final native double DecToPackedDMS(double var0);

    public static final native long ParseXMLString(String var0);

    public static final native String SerializeXMLTree(long var0, XMLNode var2);

    public static final native int GetDriverCount();

    public static final native long GetDriverByName(String var0);

    public static final native long GetDriver(int var0);

    public static final native long Open__SWIG_0(String var0, int var1);

    public static final native long Open__SWIG_1(String var0);

    public static final native long OpenShared__SWIG_0(String var0, int var1);

    public static final native long OpenShared__SWIG_1(String var0);

    public static final native long IdentifyDriver__SWIG_0(String var0, Vector var1);

    public static final native long IdentifyDriver__SWIG_1(String var0);

    public static final native Vector GeneralCmdLineProcessor__SWIG_0(Vector var0, int var1);

    public static final native Vector GeneralCmdLineProcessor__SWIG_1(Vector var0);

    public static final native long TermProgressCallback_SWIGUpcast(long var0);

    public static final native long Driver_SWIGUpcast(long var0);

    public static final native long Dataset_SWIGUpcast(long var0);

    public static final native long Band_SWIGUpcast(long var0);

    static {
        NativeLoader.load();
    }
}

