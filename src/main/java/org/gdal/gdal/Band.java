/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import java.nio.ByteBuffer;
import java.util.Vector;
import org.gdal.gdal.ColorTable;
import org.gdal.gdal.MajorObject;
import org.gdal.gdal.ProgressCallback;
import org.gdal.gdal.RasterAttributeTable;
import org.gdal.gdal.gdal;
import org.gdal.gdal.gdalJNI;
import org.gdal.gdalconst.gdalconstConstants;

public class Band
extends MajorObject {
    private long swigCPtr;

    public Band(long cPtr, boolean cMemoryOwn) {
        super(gdalJNI.Band_SWIGUpcast(cPtr), cMemoryOwn);
        this.swigCPtr = cPtr;
    }

    public static long getCPtr(Band obj) {
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
        super.delete();
    }

    public int GetXSize() {
        return this.getXSize();
    }

    public int GetYSize() {
        return this.getYSize();
    }

    public int GetRasterDataType() {
        return this.getDataType();
    }

    public int GetBlockXSize() {
        int[] anBlockXSize = new int[1];
        int[] anBlockYSize = new int[1];
        this.GetBlockSize(anBlockXSize, anBlockYSize);
        return anBlockXSize[0];
    }

    public int GetBlockYSize() {
        int[] anBlockXSize = new int[1];
        int[] anBlockYSize = new int[1];
        this.GetBlockSize(anBlockXSize, anBlockYSize);
        return anBlockYSize[0];
    }

    public int Checksum() {
        return this.Checksum(0, 0, this.getXSize(), this.getYSize());
    }

    public int GetStatistics(boolean approx_ok, boolean force, double[] min, double[] max, double[] mean, double[] stddev) {
        return this.GetStatistics(approx_ok ? 1 : 0, force ? 1 : 0, min, max, mean, stddev);
    }

    public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, ByteBuffer nioBuffer) {
        return this.ReadRaster_Direct(xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, gdalconstConstants.GDT_Byte, nioBuffer);
    }

    public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, ByteBuffer nioBuffer) {
        return this.ReadRaster_Direct(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Byte, nioBuffer);
    }

    public ByteBuffer ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type) {
        long buf_size = buf_xsize * buf_ysize * (gdal.GetDataTypeSize(buf_type) / 8);
        if ((long)((int)buf_size) != buf_size) {
            throw new OutOfMemoryError();
        }
        ByteBuffer nioBuffer = ByteBuffer.allocateDirect((int)buf_size);
        int ret = this.ReadRaster_Direct(xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer);
        if (ret == gdalconstConstants.CE_None) {
            return nioBuffer;
        }
        return null;
    }

    public ByteBuffer ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_type) {
        return this.ReadRaster_Direct(xoff, yoff, xsize, ysize, xsize, ysize, buf_type);
    }

    public ByteBuffer ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize) {
        return this.ReadRaster_Direct(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Byte);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, byte[] array) {
        return this.ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, byte[] array) {
        return this.ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Byte, array);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, short[] array) {
        return this.ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, short[] array) {
        return this.ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Int16, array);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, int[] array) {
        return this.ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int[] array) {
        return this.ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Int32, array);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, float[] array) {
        return this.ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, float[] array) {
        return this.ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Float32, array);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, double[] array) {
        return this.ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, double[] array) {
        return this.ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Float64, array);
    }

    public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, ByteBuffer nioBuffer) {
        return this.WriteRaster_Direct(xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, gdalconstConstants.GDT_Byte, nioBuffer);
    }

    public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_type, ByteBuffer nioBuffer) {
        return this.WriteRaster_Direct(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, nioBuffer);
    }

    public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, ByteBuffer nioBuffer) {
        return this.WriteRaster_Direct(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Byte, nioBuffer);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, byte[] array) {
        return this.WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, byte[] array) {
        return this.WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Byte, array);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, short[] array) {
        return this.WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, short[] array) {
        return this.WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Int16, array);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, int[] array) {
        return this.WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int[] array) {
        return this.WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Int32, array);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, float[] array) {
        return this.WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, float[] array) {
        return this.WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Float32, array);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, double[] array) {
        return this.WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, double[] array) {
        return this.WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Float64, array);
    }

    public int getXSize() {
        return gdalJNI.Band_XSize_get(this.swigCPtr, this);
    }

    public int getYSize() {
        return gdalJNI.Band_YSize_get(this.swigCPtr, this);
    }

    public int getDataType() {
        return gdalJNI.Band_DataType_get(this.swigCPtr, this);
    }

    public int GetBand() {
        return gdalJNI.Band_GetBand(this.swigCPtr, this);
    }

    public void GetBlockSize(int[] pnBlockXSize, int[] pnBlockYSize) {
        gdalJNI.Band_GetBlockSize(this.swigCPtr, this, pnBlockXSize, pnBlockYSize);
    }

    public int GetColorInterpretation() {
        return gdalJNI.Band_GetColorInterpretation(this.swigCPtr, this);
    }

    public int GetRasterColorInterpretation() {
        return gdalJNI.Band_GetRasterColorInterpretation(this.swigCPtr, this);
    }

    public int SetColorInterpretation(int val) {
        return gdalJNI.Band_SetColorInterpretation(this.swigCPtr, this, val);
    }

    public int SetRasterColorInterpretation(int val) {
        return gdalJNI.Band_SetRasterColorInterpretation(this.swigCPtr, this, val);
    }

    public void GetNoDataValue(Double[] val) {
        gdalJNI.Band_GetNoDataValue(this.swigCPtr, this, val);
    }

    public int SetNoDataValue(double d) {
        return gdalJNI.Band_SetNoDataValue(this.swigCPtr, this, d);
    }

    public String GetUnitType() {
        return gdalJNI.Band_GetUnitType(this.swigCPtr, this);
    }

    public Vector GetRasterCategoryNames() {
        return gdalJNI.Band_GetRasterCategoryNames(this.swigCPtr, this);
    }

    public int SetRasterCategoryNames(Vector names) {
        return gdalJNI.Band_SetRasterCategoryNames(this.swigCPtr, this, names);
    }

    public void GetMinimum(Double[] val) {
        gdalJNI.Band_GetMinimum(this.swigCPtr, this, val);
    }

    public void GetMaximum(Double[] val) {
        gdalJNI.Band_GetMaximum(this.swigCPtr, this, val);
    }

    public void GetOffset(Double[] val) {
        gdalJNI.Band_GetOffset(this.swigCPtr, this, val);
    }

    public void GetScale(Double[] val) {
        gdalJNI.Band_GetScale(this.swigCPtr, this, val);
    }

    public int GetStatistics(int approx_ok, int force, double[] min, double[] max, double[] mean, double[] stddev) {
        return gdalJNI.Band_GetStatistics(this.swigCPtr, this, approx_ok, force, min, max, mean, stddev);
    }

    public int ComputeStatistics(boolean approx_ok, double[] min, double[] max, double[] mean, double[] stddev, ProgressCallback callback) {
        return gdalJNI.Band_ComputeStatistics__SWIG_0(this.swigCPtr, this, approx_ok, min, max, mean, stddev, callback);
    }

    public int ComputeStatistics(boolean approx_ok, double[] min, double[] max, double[] mean, double[] stddev) {
        return gdalJNI.Band_ComputeStatistics__SWIG_2(this.swigCPtr, this, approx_ok, min, max, mean, stddev);
    }

    public int ComputeStatistics(boolean approx_ok, double[] min, double[] max, double[] mean) {
        return gdalJNI.Band_ComputeStatistics__SWIG_3(this.swigCPtr, this, approx_ok, min, max, mean);
    }

    public int ComputeStatistics(boolean approx_ok, double[] min, double[] max) {
        return gdalJNI.Band_ComputeStatistics__SWIG_4(this.swigCPtr, this, approx_ok, min, max);
    }

    public int ComputeStatistics(boolean approx_ok, double[] min) {
        return gdalJNI.Band_ComputeStatistics__SWIG_5(this.swigCPtr, this, approx_ok, min);
    }

    public int ComputeStatistics(boolean approx_ok) {
        return gdalJNI.Band_ComputeStatistics__SWIG_6(this.swigCPtr, this, approx_ok);
    }

    public int SetStatistics(double min, double max, double mean, double stddev) {
        return gdalJNI.Band_SetStatistics(this.swigCPtr, this, min, max, mean, stddev);
    }

    public int GetOverviewCount() {
        return gdalJNI.Band_GetOverviewCount(this.swigCPtr, this);
    }

    public Band GetOverview(int i) {
        long cPtr = gdalJNI.Band_GetOverview(this.swigCPtr, this, i);
        Band ret = null;
        if (cPtr != 0) {
            ret = new Band(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public int Checksum(int xoff, int yoff, int xsize, int ysize) {
        return gdalJNI.Band_Checksum(this.swigCPtr, this, xoff, yoff, xsize, ysize);
    }

    public void ComputeRasterMinMax(double[] argout, int approx_ok) {
        gdalJNI.Band_ComputeRasterMinMax__SWIG_0(this.swigCPtr, this, argout, approx_ok);
    }

    public void ComputeRasterMinMax(double[] argout) {
        gdalJNI.Band_ComputeRasterMinMax__SWIG_1(this.swigCPtr, this, argout);
    }

    public void ComputeBandStats(double[] argout, int samplestep) {
        gdalJNI.Band_ComputeBandStats__SWIG_0(this.swigCPtr, this, argout, samplestep);
    }

    public void ComputeBandStats(double[] argout) {
        gdalJNI.Band_ComputeBandStats__SWIG_1(this.swigCPtr, this, argout);
    }

    public int Fill(double real_fill, double imag_fill) {
        return gdalJNI.Band_Fill__SWIG_0(this.swigCPtr, this, real_fill, imag_fill);
    }

    public int Fill(double real_fill) {
        return gdalJNI.Band_Fill__SWIG_1(this.swigCPtr, this, real_fill);
    }

    public void FlushCache() {
        gdalJNI.Band_FlushCache(this.swigCPtr, this);
    }

    public ColorTable GetRasterColorTable() {
        long cPtr = gdalJNI.Band_GetRasterColorTable(this.swigCPtr, this);
        ColorTable ret = null;
        if (cPtr != 0) {
            ret = new ColorTable(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public ColorTable GetColorTable() {
        long cPtr = gdalJNI.Band_GetColorTable(this.swigCPtr, this);
        ColorTable ret = null;
        if (cPtr != 0) {
            ret = new ColorTable(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public int SetRasterColorTable(ColorTable arg) {
        return gdalJNI.Band_SetRasterColorTable(this.swigCPtr, this, ColorTable.getCPtr(arg), arg);
    }

    public int SetColorTable(ColorTable arg) {
        return gdalJNI.Band_SetColorTable(this.swigCPtr, this, ColorTable.getCPtr(arg), arg);
    }

    public RasterAttributeTable GetDefaultRAT() {
        long cPtr = gdalJNI.Band_GetDefaultRAT(this.swigCPtr, this);
        return cPtr == 0 ? null : new RasterAttributeTable(cPtr, false);
    }

    public int SetDefaultRAT(RasterAttributeTable table) {
        return gdalJNI.Band_SetDefaultRAT(this.swigCPtr, this, RasterAttributeTable.getCPtr(table), table);
    }

    public Band GetMaskBand() {
        long cPtr = gdalJNI.Band_GetMaskBand(this.swigCPtr, this);
        Band ret = null;
        if (cPtr != 0) {
            ret = new Band(cPtr, false);
            ret.addReference(this);
        }
        return ret;
    }

    public int GetMaskFlags() {
        return gdalJNI.Band_GetMaskFlags(this.swigCPtr, this);
    }

    public int CreateMaskBand(int nFlags) {
        return gdalJNI.Band_CreateMaskBand(this.swigCPtr, this, nFlags);
    }

    public int SetDefaultHistogram(double min, double max, int[] buckets_in) {
        return gdalJNI.Band_SetDefaultHistogram(this.swigCPtr, this, min, max, buckets_in);
    }

    public boolean HasArbitraryOverviews() {
        return gdalJNI.Band_HasArbitraryOverviews(this.swigCPtr, this);
    }

    public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_ReadRaster_Direct__SWIG_0(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, nPixelSpace, nLineSpace);
    }

    public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int nPixelSpace) {
        return gdalJNI.Band_ReadRaster_Direct__SWIG_1(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, nPixelSpace);
    }

    public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer) {
        return gdalJNI.Band_ReadRaster_Direct__SWIG_2(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_ReadRaster__SWIG_0(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace, nLineSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int nPixelSpace) {
        return gdalJNI.Band_ReadRaster__SWIG_1(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut) {
        return gdalJNI.Band_ReadRaster__SWIG_2(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_ReadRaster__SWIG_3(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace, nLineSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int nPixelSpace) {
        return gdalJNI.Band_ReadRaster__SWIG_4(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut) {
        return gdalJNI.Band_ReadRaster__SWIG_5(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_ReadRaster__SWIG_6(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace, nLineSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int nPixelSpace) {
        return gdalJNI.Band_ReadRaster__SWIG_7(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut) {
        return gdalJNI.Band_ReadRaster__SWIG_8(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_ReadRaster__SWIG_9(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace, nLineSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int nPixelSpace) {
        return gdalJNI.Band_ReadRaster__SWIG_10(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut) {
        return gdalJNI.Band_ReadRaster__SWIG_11(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_ReadRaster__SWIG_12(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace, nLineSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int nPixelSpace) {
        return gdalJNI.Band_ReadRaster__SWIG_13(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace);
    }

    public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut) {
        return gdalJNI.Band_ReadRaster__SWIG_14(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut);
    }

    public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_WriteRaster_Direct__SWIG_0(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, nPixelSpace, nLineSpace);
    }

    public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer, int nPixelSpace) {
        return gdalJNI.Band_WriteRaster_Direct__SWIG_1(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, nPixelSpace);
    }

    public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, ByteBuffer nioBuffer) {
        return gdalJNI.Band_WriteRaster_Direct__SWIG_2(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_WriteRaster__SWIG_0(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace, nLineSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int nPixelSpace) {
        return gdalJNI.Band_WriteRaster__SWIG_1(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn) {
        return gdalJNI.Band_WriteRaster__SWIG_2(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_WriteRaster__SWIG_3(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace, nLineSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int nPixelSpace) {
        return gdalJNI.Band_WriteRaster__SWIG_4(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn) {
        return gdalJNI.Band_WriteRaster__SWIG_5(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_WriteRaster__SWIG_6(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace, nLineSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int nPixelSpace) {
        return gdalJNI.Band_WriteRaster__SWIG_7(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn) {
        return gdalJNI.Band_WriteRaster__SWIG_8(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_WriteRaster__SWIG_9(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace, nLineSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int nPixelSpace) {
        return gdalJNI.Band_WriteRaster__SWIG_10(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn) {
        return gdalJNI.Band_WriteRaster__SWIG_11(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int nPixelSpace, int nLineSpace) {
        return gdalJNI.Band_WriteRaster__SWIG_12(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace, nLineSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int nPixelSpace) {
        return gdalJNI.Band_WriteRaster__SWIG_13(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace);
    }

    public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn) {
        return gdalJNI.Band_WriteRaster__SWIG_14(this.swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn);
    }

    public int ReadBlock_Direct(int nXBlockOff, int nYBlockOff, ByteBuffer nioBuffer) {
        return gdalJNI.Band_ReadBlock_Direct(this.swigCPtr, this, nXBlockOff, nYBlockOff, nioBuffer);
    }

    public int WriteBlock_Direct(int nXBlockOff, int nYBlockOff, ByteBuffer nioBuffer) {
        return gdalJNI.Band_WriteBlock_Direct(this.swigCPtr, this, nXBlockOff, nYBlockOff, nioBuffer);
    }

    public int GetHistogram(double min, double max, int[] buckets, boolean include_out_of_range, boolean approx_ok, ProgressCallback callback) {
        return gdalJNI.Band_GetHistogram__SWIG_0(this.swigCPtr, this, min, max, buckets, include_out_of_range, approx_ok, callback);
    }

    public int GetHistogram(double min, double max, int[] buckets, boolean include_out_of_range, boolean approx_ok) {
        return gdalJNI.Band_GetHistogram__SWIG_1(this.swigCPtr, this, min, max, buckets, include_out_of_range, approx_ok);
    }

    public int GetHistogram(double min, double max, int[] buckets) {
        return gdalJNI.Band_GetHistogram__SWIG_2(this.swigCPtr, this, min, max, buckets);
    }

    public int GetHistogram(int[] buckets) {
        return gdalJNI.Band_GetHistogram__SWIG_3(this.swigCPtr, this, buckets);
    }

    public int GetDefaultHistogram(double[] min_ret, double[] max_ret, int[][] buckets_ret, boolean force, ProgressCallback callback) {
        return gdalJNI.Band_GetDefaultHistogram__SWIG_0(this.swigCPtr, this, min_ret, max_ret, buckets_ret, force, callback);
    }

    public int GetDefaultHistogram(double[] min_ret, double[] max_ret, int[][] buckets_ret, boolean force) {
        return gdalJNI.Band_GetDefaultHistogram__SWIG_2(this.swigCPtr, this, min_ret, max_ret, buckets_ret, force);
    }

    public int GetDefaultHistogram(double[] min_ret, double[] max_ret, int[][] buckets_ret) {
        return gdalJNI.Band_GetDefaultHistogram__SWIG_3(this.swigCPtr, this, min_ret, max_ret, buckets_ret);
    }
}

