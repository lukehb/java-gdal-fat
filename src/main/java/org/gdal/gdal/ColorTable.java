/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import java.awt.Color;
import java.awt.image.IndexColorModel;
import org.gdal.gdal.gdalJNI;

public class ColorTable
implements Cloneable {
    private long swigCPtr;
    protected boolean swigCMemOwn;
    private Object parentReference;

    protected ColorTable(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    protected static long getCPtr(ColorTable obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                gdalJNI.delete_ColorTable(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    protected void addReference(Object reference) {
        this.parentReference = reference;
    }

    public Object clone() {
        return this.Clone();
    }

    public IndexColorModel getIndexColorModel(int bits) {
        int size = this.GetCount();
        byte[] reds = new byte[size];
        byte[] greens = new byte[size];
        byte[] blues = new byte[size];
        byte[] alphas = new byte[size];
        int noAlphas = 0;
        int zeroAlphas = 0;
        int lastAlphaIndex = -1;
        Color entry = null;
        for (int i = 0; i < size; ++i) {
            entry = this.GetColorEntry(i);
            reds[i] = (byte)(entry.getRed() & 255);
            greens[i] = (byte)(entry.getGreen() & 255);
            blues[i] = (byte)(entry.getBlue() & 255);
            byte alpha = (byte)(entry.getAlpha() & 255);
            if (alpha == 255) {
                ++noAlphas;
            } else if (alpha == 0) {
                ++zeroAlphas;
                lastAlphaIndex = i;
            }
            alphas[i] = alpha;
        }
        if (noAlphas == size) {
            return new IndexColorModel(bits, size, reds, greens, blues);
        }
        if (noAlphas == size - 1 && zeroAlphas == 1) {
            return new IndexColorModel(bits, size, reds, greens, blues, lastAlphaIndex);
        }
        return new IndexColorModel(bits, size, reds, greens, blues, alphas);
    }

    public ColorTable(int palette) {
        this(gdalJNI.new_ColorTable__SWIG_0(palette), true);
    }

    public ColorTable() {
        this(gdalJNI.new_ColorTable__SWIG_1(), true);
    }

    public ColorTable Clone() {
        long cPtr = gdalJNI.ColorTable_Clone(this.swigCPtr, this);
        return cPtr == 0 ? null : new ColorTable(cPtr, true);
    }

    public int GetPaletteInterpretation() {
        return gdalJNI.ColorTable_GetPaletteInterpretation(this.swigCPtr, this);
    }

    public int GetCount() {
        return gdalJNI.ColorTable_GetCount(this.swigCPtr, this);
    }

    public Color GetColorEntry(int entry) {
        return gdalJNI.ColorTable_GetColorEntry(this.swigCPtr, this, entry);
    }

    public void SetColorEntry(int entry, Color centry) {
        gdalJNI.ColorTable_SetColorEntry(this.swigCPtr, this, entry, centry);
    }

    public void CreateColorRamp(int nStartIndex, Color startcolor, int nEndIndex, Color endcolor) {
        gdalJNI.ColorTable_CreateColorRamp(this.swigCPtr, this, nStartIndex, startcolor, nEndIndex, endcolor);
    }
}

