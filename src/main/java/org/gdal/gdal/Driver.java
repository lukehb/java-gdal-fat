/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import java.util.Vector;
import org.gdal.gdal.Dataset;
import org.gdal.gdal.MajorObject;
import org.gdal.gdal.ProgressCallback;
import org.gdal.gdal.gdalJNI;
import org.gdal.gdalconst.gdalconstConstants;

public class Driver
extends MajorObject {
    private long swigCPtr;

    public Driver(long cPtr, boolean cMemoryOwn) {
        super(gdalJNI.Driver_SWIGUpcast(cPtr), cMemoryOwn);
        this.swigCPtr = cPtr;
    }

    public static long getCPtr(Driver obj) {
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

    private static Vector StringArrayToVector(String[] options) {
        if (options == null) {
            return null;
        }
        Vector<String> v = new Vector<String>();
        for (int i = 0; i < options.length; ++i) {
            v.addElement(options[i]);
        }
        return v;
    }

    public Dataset Create(String name, int xsize, int ysize, int bands, int eType, String[] options) {
        return this.Create(name, xsize, ysize, bands, eType, Driver.StringArrayToVector(options));
    }

    public Dataset Create(String name, int xsize, int ysize, int bands, String[] options) {
        return this.Create(name, xsize, ysize, bands, gdalconstConstants.GDT_Byte, Driver.StringArrayToVector(options));
    }

    public Dataset CreateCopy(String name, Dataset src, int strict, String[] options) {
        return this.CreateCopy(name, src, strict, Driver.StringArrayToVector(options), null);
    }

    public Dataset CreateCopy(String name, Dataset src, Vector options) {
        return this.CreateCopy(name, src, 1, options, null);
    }

    public Dataset CreateCopy(String name, Dataset src, String[] options) {
        return this.CreateCopy(name, src, 1, Driver.StringArrayToVector(options), null);
    }

    public String getShortName() {
        return gdalJNI.Driver_ShortName_get(this.swigCPtr, this);
    }

    public String getLongName() {
        return gdalJNI.Driver_LongName_get(this.swigCPtr, this);
    }

    public String getHelpTopic() {
        return gdalJNI.Driver_HelpTopic_get(this.swigCPtr, this);
    }

    public Dataset Create(String name, int xsize, int ysize, int bands, int eType, Vector options) {
        long cPtr = gdalJNI.Driver_Create__SWIG_0(this.swigCPtr, this, name, xsize, ysize, bands, eType, options);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public Dataset Create(String name, int xsize, int ysize, int bands, int eType) {
        long cPtr = gdalJNI.Driver_Create__SWIG_1(this.swigCPtr, this, name, xsize, ysize, bands, eType);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public Dataset Create(String name, int xsize, int ysize, int bands) {
        long cPtr = gdalJNI.Driver_Create__SWIG_2(this.swigCPtr, this, name, xsize, ysize, bands);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public Dataset Create(String name, int xsize, int ysize) {
        long cPtr = gdalJNI.Driver_Create__SWIG_3(this.swigCPtr, this, name, xsize, ysize);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public Dataset CreateCopy(String name, Dataset src, int strict, Vector options, ProgressCallback callback) {
        long cPtr = gdalJNI.Driver_CreateCopy__SWIG_0(this.swigCPtr, this, name, Dataset.getCPtr(src), src, strict, options, callback);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public Dataset CreateCopy(String name, Dataset src, int strict, Vector options) {
        long cPtr = gdalJNI.Driver_CreateCopy__SWIG_2(this.swigCPtr, this, name, Dataset.getCPtr(src), src, strict, options);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public Dataset CreateCopy(String name, Dataset src, int strict) {
        long cPtr = gdalJNI.Driver_CreateCopy__SWIG_3(this.swigCPtr, this, name, Dataset.getCPtr(src), src, strict);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public Dataset CreateCopy(String name, Dataset src) {
        long cPtr = gdalJNI.Driver_CreateCopy__SWIG_4(this.swigCPtr, this, name, Dataset.getCPtr(src), src);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public int Delete(String name) {
        return gdalJNI.Driver_Delete(this.swigCPtr, this, name);
    }

    public int Rename(String newName, String oldName) {
        return gdalJNI.Driver_Rename(this.swigCPtr, this, newName, oldName);
    }

    public int Register() {
        return gdalJNI.Driver_Register(this.swigCPtr, this);
    }

    public void Deregister() {
        gdalJNI.Driver_Deregister(this.swigCPtr, this);
    }
}

