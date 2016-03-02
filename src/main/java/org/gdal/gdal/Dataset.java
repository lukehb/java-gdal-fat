/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import java.nio.ByteBuffer;
import java.util.Vector;
import org.gdal.gdal.Band;
import org.gdal.gdal.Driver;
import org.gdal.gdal.GCP;
import org.gdal.gdal.MajorObject;
import org.gdal.gdal.ProgressCallback;
import org.gdal.gdal.gdalJNI;

public class Dataset
extends MajorObject {
    private long swigCPtr;

    public Dataset(long cPtr, boolean cMemoryOwn) {
        super(gdalJNI.Dataset_SWIGUpcast(cPtr), cMemoryOwn);
        this.swigCPtr = cPtr;
    }

    public static long getCPtr(Dataset obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                gdalJNI.delete_Dataset(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    public int GetRasterXSize() {
        return this.getRasterXSize();
    }

    public int GetRasterYSize() {
        return this.getRasterYSize();
    }

    public int GetRasterCount() {
        return this.getRasterCount();
    }

    public int BuildOverviews(int[] overviewlist, ProgressCallback callback) {
        return this.BuildOverviews(null, overviewlist, callback);
    }

    public int BuildOverviews(int[] overviewlist) {
        return this.BuildOverviews(null, overviewlist, null);
    }

    public Vector GetGCPs() {
        Vector gcps = new Vector();
        this.GetGCPs(gcps);
        return gcps;
    }

    public double[] GetGeoTransform() {
        double[] adfGeoTransform = new double[6];
        this.GetGeoTransform(adfGeoTransform);
        return adfGeoTransform;
    }

    public int getRasterXSize() {
        return gdalJNI.Dataset_RasterXSize_get(this.swigCPtr, this);
    }

    public int getRasterYSize() {
        return gdalJNI.Dataset_RasterYSize_get(this.swigCPtr, this);
    }

    public int getRasterCount() {
        return gdalJNI.Dataset_RasterCount_get(this.swigCPtr, this);
    }

    public Driver GetDriver() {
        long cPtr = gdalJNI.Dataset_GetDriver(this.swigCPtr, this);
        return cPtr == 0 ? null : new Driver(cPtr, false);
    }

    public Band GetRasterBand(int nBand) {
        long cPtr = gdalJNI.Dataset_GetRasterBand(this.swigCPtr, this, nBand);
        Band ret = null;
        if (cPtr != 0) {
            ret = new Band(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public String GetProjection() {
        return gdalJNI.Dataset_GetProjection(this.swigCPtr, this);
    }

    public String GetProjectionRef() {
        return gdalJNI.Dataset_GetProjectionRef(this.swigCPtr, this);
    }

    public int SetProjection(String prj) {
        return gdalJNI.Dataset_SetProjection(this.swigCPtr, this, prj);
    }

    public void GetGeoTransform(double[] argout) {
        gdalJNI.Dataset_GetGeoTransform(this.swigCPtr, this, argout);
    }

    public int SetGeoTransform(double[] argin) {
        return gdalJNI.Dataset_SetGeoTransform(this.swigCPtr, this, argin);
    }

    public int BuildOverviews(String resampling, int[] overviewlist, ProgressCallback callback) {
        return gdalJNI.Dataset_BuildOverviews__SWIG_0(this.swigCPtr, this, resampling, overviewlist, callback);
    }

    public int BuildOverviews(String resampling, int[] overviewlist) {
        return gdalJNI.Dataset_BuildOverviews__SWIG_2(this.swigCPtr, this, resampling, overviewlist);
    }

    public int GetGCPCount() {
        return gdalJNI.Dataset_GetGCPCount(this.swigCPtr, this);
    }

    public String GetGCPProjection() {
        return gdalJNI.Dataset_GetGCPProjection(this.swigCPtr, this);
    }

    public void GetGCPs(Vector nGCPs) {
        gdalJNI.Dataset_GetGCPs(this.swigCPtr, this, nGCPs);
    }

    public int SetGCPs(GCP[] nGCPs, String pszGCPProjection) {
        return gdalJNI.Dataset_SetGCPs(this.swigCPtr, this, nGCPs, pszGCPProjection);
    }

    public void FlushCache() {
        gdalJNI.Dataset_FlushCache(this.swigCPtr, this);
    }

    public int AddBand(int datatype, Vector options) {
        return gdalJNI.Dataset_AddBand__SWIG_0(this.swigCPtr, this, datatype, options);
    }

    public int AddBand(int datatype) {
        return gdalJNI.Dataset_AddBand__SWIG_1(this.swigCPtr, this, datatype);
    }

    public int AddBand() {
        return gdalJNI.Dataset_AddBand__SWIG_2(this.swigCPtr, this);
    }

    public int CreateMaskBand(int nFlags) {
        return gdalJNI.Dataset_CreateMaskBand(this.swigCPtr, this, nFlags);
    }

    public Vector GetFileList() {
        return gdalJNI.Dataset_GetFileList(this.swigCPtr, this);
    }

    public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_ReadRaster_Direct__SWIG_0(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_ReadRaster_Direct__SWIG_1(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace, nLineSpace);
    }

    public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_ReadRaster_Direct__SWIG_2(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace);
    }

    public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int[] band_list) {
        return gdalJNI.Dataset_ReadRaster_Direct__SWIG_3(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_0(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_1(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_2(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int[] band_list) {
        return gdalJNI.Dataset_ReadRaster__SWIG_3(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_4(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_5(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_6(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int[] band_list) {
        return gdalJNI.Dataset_ReadRaster__SWIG_7(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_8(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_9(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_10(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int[] band_list) {
        return gdalJNI.Dataset_ReadRaster__SWIG_11(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_12(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_13(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_14(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int[] band_list) {
        return gdalJNI.Dataset_ReadRaster__SWIG_15(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_16(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_17(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace, nLineSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_ReadRaster__SWIG_18(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list, nPixelSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int[] band_list) {
        return gdalJNI.Dataset_ReadRaster__SWIG_19(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, band_list);
    }

    public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_WriteRaster_Direct__SWIG_0(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_WriteRaster_Direct__SWIG_1(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace, nLineSpace);
    }

    public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_WriteRaster_Direct__SWIG_2(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list, nPixelSpace);
    }

    public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int[] band_list) {
        return gdalJNI.Dataset_WriteRaster_Direct__SWIG_3(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, band_list);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_0(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_1(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_2(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int[] band_list) {
        return gdalJNI.Dataset_WriteRaster__SWIG_3(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_4(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_5(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_6(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int[] band_list) {
        return gdalJNI.Dataset_WriteRaster__SWIG_7(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_8(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_9(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_10(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int[] band_list) {
        return gdalJNI.Dataset_WriteRaster__SWIG_11(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_12(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_13(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_14(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int[] band_list) {
        return gdalJNI.Dataset_WriteRaster__SWIG_15(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace, int nBandSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_16(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace, nBandSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int[] band_list, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_17(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace, nLineSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int[] band_list, int nPixelSpace) {
        return gdalJNI.Dataset_WriteRaster__SWIG_18(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list, nPixelSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int[] band_list) {
        return gdalJNI.Dataset_WriteRaster__SWIG_19(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, band_list);
    }
}

