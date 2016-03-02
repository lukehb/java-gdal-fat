/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import org.gdal.gdal.gdalJNI;

public class RasterAttributeTable
implements Cloneable {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected RasterAttributeTable(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    protected static long getCPtr(RasterAttributeTable obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                gdalJNI.delete_RasterAttributeTable(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public Object clone() {
        return this.Clone();
    }

    public RasterAttributeTable() {
        this(gdalJNI.new_RasterAttributeTable(), true);
    }

    public RasterAttributeTable Clone() {
        long cPtr = gdalJNI.RasterAttributeTable_Clone(this.swigCPtr, this);
        return cPtr == 0 ? null : new RasterAttributeTable(cPtr, true);
    }

    public int GetColumnCount() {
        return gdalJNI.RasterAttributeTable_GetColumnCount(this.swigCPtr, this);
    }

    public String GetNameOfCol(int iCol) {
        return gdalJNI.RasterAttributeTable_GetNameOfCol(this.swigCPtr, this, iCol);
    }

    public int GetUsageOfCol(int iCol) {
        return gdalJNI.RasterAttributeTable_GetUsageOfCol(this.swigCPtr, this, iCol);
    }

    public int GetTypeOfCol(int iCol) {
        return gdalJNI.RasterAttributeTable_GetTypeOfCol(this.swigCPtr, this, iCol);
    }

    public int GetColOfUsage(int eUsage) {
        return gdalJNI.RasterAttributeTable_GetColOfUsage(this.swigCPtr, this, eUsage);
    }

    public int GetRowCount() {
        return gdalJNI.RasterAttributeTable_GetRowCount(this.swigCPtr, this);
    }

    public String GetValueAsString(int iRow, int iCol) {
        return gdalJNI.RasterAttributeTable_GetValueAsString(this.swigCPtr, this, iRow, iCol);
    }

    public int GetValueAsInt(int iRow, int iCol) {
        return gdalJNI.RasterAttributeTable_GetValueAsInt(this.swigCPtr, this, iRow, iCol);
    }

    public double GetValueAsDouble(int iRow, int iCol) {
        return gdalJNI.RasterAttributeTable_GetValueAsDouble(this.swigCPtr, this, iRow, iCol);
    }

    public void SetValueAsString(int iRow, int iCol, String pszValue) {
        gdalJNI.RasterAttributeTable_SetValueAsString(this.swigCPtr, this, iRow, iCol, pszValue);
    }

    public void SetValueAsInt(int iRow, int iCol, int nValue) {
        gdalJNI.RasterAttributeTable_SetValueAsInt(this.swigCPtr, this, iRow, iCol, nValue);
    }

    public void SetValueAsDouble(int iRow, int iCol, double dfValue) {
        gdalJNI.RasterAttributeTable_SetValueAsDouble(this.swigCPtr, this, iRow, iCol, dfValue);
    }

    public void SetRowCount(int nCount) {
        gdalJNI.RasterAttributeTable_SetRowCount(this.swigCPtr, this, nCount);
    }

    public int CreateColumn(String pszName, int eType, int eUsage) {
        return gdalJNI.RasterAttributeTable_CreateColumn(this.swigCPtr, this, pszName, eType, eUsage);
    }

    public boolean GetLinearBinning(double[] pdfRow0Min, double[] pdfBinSize) {
        return gdalJNI.RasterAttributeTable_GetLinearBinning(this.swigCPtr, this, pdfRow0Min, pdfBinSize);
    }

    public int SetLinearBinning(double dfRow0Min, double dfBinSize) {
        return gdalJNI.RasterAttributeTable_SetLinearBinning(this.swigCPtr, this, dfRow0Min, dfBinSize);
    }

    public int GetRowOfValue(double dfValue) {
        return gdalJNI.RasterAttributeTable_GetRowOfValue(this.swigCPtr, this, dfValue);
    }
}

