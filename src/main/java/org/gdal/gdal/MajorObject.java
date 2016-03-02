/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.gdal.gdal.gdalJNI;

public class MajorObject {
    private long swigCPtr;
    protected boolean swigCMemOwn;
    private Object parentReference;

    protected MajorObject(long cPtr, boolean cMemoryOwn) {
        if (cPtr == 0) {
            throw new RuntimeException();
        }
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    protected static long getCPtr(MajorObject obj) {
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
    }

    protected void addReference(Object reference) {
        this.parentReference = reference;
    }

    public int SetMetadata(Hashtable metadata, String domain) {
        if (metadata == null) {
            return this.SetMetadata((Vector)null, domain);
        }
        Vector<String> v = new Vector<String>();
        Enumeration values = metadata.elements();
        Enumeration keys = metadata.keys();
        while (keys.hasMoreElements()) {
            v.add((String)keys.nextElement() + "=" + (String)values.nextElement());
        }
        return this.SetMetadata(v, domain);
    }

    public int SetMetadata(Hashtable metadata) {
        return this.SetMetadata(metadata, null);
    }

    public String GetDescription() {
        return gdalJNI.MajorObject_GetDescription(this.swigCPtr, this);
    }

    public void SetDescription(String pszNewDesc) {
        gdalJNI.MajorObject_SetDescription(this.swigCPtr, this, pszNewDesc);
    }

    public Hashtable GetMetadata_Dict(String pszDomain) {
        return gdalJNI.MajorObject_GetMetadata_Dict__SWIG_0(this.swigCPtr, this, pszDomain);
    }

    public Hashtable GetMetadata_Dict() {
        return gdalJNI.MajorObject_GetMetadata_Dict__SWIG_1(this.swigCPtr, this);
    }

    public Vector GetMetadata_List(String pszDomain) {
        return gdalJNI.MajorObject_GetMetadata_List__SWIG_0(this.swigCPtr, this, pszDomain);
    }

    public Vector GetMetadata_List() {
        return gdalJNI.MajorObject_GetMetadata_List__SWIG_1(this.swigCPtr, this);
    }

    public int SetMetadata(Vector papszMetadata, String pszDomain) {
        return gdalJNI.MajorObject_SetMetadata__SWIG_0(this.swigCPtr, this, papszMetadata, pszDomain);
    }

    public int SetMetadata(Vector papszMetadata) {
        return gdalJNI.MajorObject_SetMetadata__SWIG_1(this.swigCPtr, this, papszMetadata);
    }

    public int SetMetadata(String pszMetadataString, String pszDomain) {
        return gdalJNI.MajorObject_SetMetadata__SWIG_2(this.swigCPtr, this, pszMetadataString, pszDomain);
    }

    public int SetMetadata(String pszMetadataString) {
        return gdalJNI.MajorObject_SetMetadata__SWIG_3(this.swigCPtr, this, pszMetadataString);
    }

    public String GetMetadataItem(String pszName, String pszDomain) {
        return gdalJNI.MajorObject_GetMetadataItem__SWIG_0(this.swigCPtr, this, pszName, pszDomain);
    }

    public String GetMetadataItem(String pszName) {
        return gdalJNI.MajorObject_GetMetadataItem__SWIG_1(this.swigCPtr, this, pszName);
    }

    public int SetMetadataItem(String pszName, String pszValue, String pszDomain) {
        return gdalJNI.MajorObject_SetMetadataItem__SWIG_0(this.swigCPtr, this, pszName, pszValue, pszDomain);
    }

    public int SetMetadataItem(String pszName, String pszValue) {
        return gdalJNI.MajorObject_SetMetadataItem__SWIG_1(this.swigCPtr, this, pszName, pszValue);
    }
}

