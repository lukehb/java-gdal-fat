/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

import java.util.Enumeration;
import java.util.Vector;
import org.gdal.ogr.DataSource;
import org.gdal.ogr.Driver;
import org.gdal.ogr.Geometry;
import org.gdal.ogr.ogrConstants;
import org.gdal.ogr.ogrJNI;
import org.gdal.osr.SpatialReference;

public class ogr
implements ogrConstants {
    public static String GeometryTypeToName(int eType) {
        return ogrJNI.GeometryTypeToName(eType);
    }

    public static String GetFieldTypeName(int type) {
        return ogrJNI.GetFieldTypeName(type);
    }

    public static Geometry CreateGeometryFromWkb(byte[] nLen, SpatialReference reference) {
        long cPtr = ogrJNI.CreateGeometryFromWkb__SWIG_0(nLen, SpatialReference.getCPtr(reference), reference);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static Geometry CreateGeometryFromWkb(byte[] nLen) {
        long cPtr = ogrJNI.CreateGeometryFromWkb__SWIG_1(nLen);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static Geometry CreateGeometryFromWkt(String val, SpatialReference reference) {
        long cPtr = ogrJNI.CreateGeometryFromWkt__SWIG_0(val, SpatialReference.getCPtr(reference), reference);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static Geometry CreateGeometryFromWkt(String val) {
        long cPtr = ogrJNI.CreateGeometryFromWkt__SWIG_1(val);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static Geometry CreateGeometryFromGML(String input_string) {
        long cPtr = ogrJNI.CreateGeometryFromGML(input_string);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static Geometry CreateGeometryFromJson(String input_string) {
        long cPtr = ogrJNI.CreateGeometryFromJson(input_string);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static Geometry BuildPolygonFromEdges(Geometry hLineCollection, int bBestEffort, int bAutoClose, double dfTolerance) {
        long cPtr = ogrJNI.BuildPolygonFromEdges__SWIG_0(Geometry.getCPtr(hLineCollection), hLineCollection, bBestEffort, bAutoClose, dfTolerance);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static Geometry BuildPolygonFromEdges(Geometry hLineCollection, int bBestEffort, int bAutoClose) {
        long cPtr = ogrJNI.BuildPolygonFromEdges__SWIG_1(Geometry.getCPtr(hLineCollection), hLineCollection, bBestEffort, bAutoClose);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static Geometry BuildPolygonFromEdges(Geometry hLineCollection, int bBestEffort) {
        long cPtr = ogrJNI.BuildPolygonFromEdges__SWIG_2(Geometry.getCPtr(hLineCollection), hLineCollection, bBestEffort);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static Geometry BuildPolygonFromEdges(Geometry hLineCollection) {
        long cPtr = ogrJNI.BuildPolygonFromEdges__SWIG_3(Geometry.getCPtr(hLineCollection), hLineCollection);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static Geometry ApproximateArcAngles(double dfCenterX, double dfCenterY, double dfZ, double dfPrimaryRadius, double dfSecondaryAxis, double dfRotation, double dfStartAngle, double dfEndAngle, double dfMaxAngleStepSizeDegrees) {
        long cPtr = ogrJNI.ApproximateArcAngles(dfCenterX, dfCenterY, dfZ, dfPrimaryRadius, dfSecondaryAxis, dfRotation, dfStartAngle, dfEndAngle, dfMaxAngleStepSizeDegrees);
        return cPtr == 0 ? null : new Geometry(cPtr, true);
    }

    public static int GetDriverCount() {
        return ogrJNI.GetDriverCount();
    }

    public static int GetOpenDSCount() {
        return ogrJNI.GetOpenDSCount();
    }

    public static int SetGenerate_DB2_V72_BYTE_ORDER(int bGenerate_DB2_V72_BYTE_ORDER) {
        return ogrJNI.SetGenerate_DB2_V72_BYTE_ORDER(bGenerate_DB2_V72_BYTE_ORDER);
    }

    public static void RegisterAll() {
        ogrJNI.RegisterAll();
    }

    public static DataSource GetOpenDS(int ds_number) {
        long cPtr = ogrJNI.GetOpenDS(ds_number);
        return cPtr == 0 ? null : new DataSource(cPtr, false);
    }

    public static DataSource Open(String filename, int update) {
        long cPtr = ogrJNI.Open__SWIG_0(filename, update);
        return cPtr == 0 ? null : new DataSource(cPtr, true);
    }

    public static DataSource Open(String filename) {
        long cPtr = ogrJNI.Open__SWIG_1(filename);
        return cPtr == 0 ? null : new DataSource(cPtr, true);
    }

    public static DataSource OpenShared(String filename, int update) {
        long cPtr = ogrJNI.OpenShared__SWIG_0(filename, update);
        return cPtr == 0 ? null : new DataSource(cPtr, true);
    }

    public static DataSource OpenShared(String filename) {
        long cPtr = ogrJNI.OpenShared__SWIG_1(filename);
        return cPtr == 0 ? null : new DataSource(cPtr, true);
    }

    public static Driver GetDriverByName(String name) {
        long cPtr = ogrJNI.GetDriverByName(name);
        return cPtr == 0 ? null : new Driver(cPtr, false);
    }

    public static Driver GetDriver(int driver_number) {
        long cPtr = ogrJNI.GetDriver(driver_number);
        return cPtr == 0 ? null : new Driver(cPtr, false);
    }

    public static Vector GeneralCmdLineProcessor(Vector papszArgv, int nOptions) {
        return ogrJNI.GeneralCmdLineProcessor__SWIG_0(papszArgv, nOptions);
    }

    public static Vector GeneralCmdLineProcessor(Vector papszArgv) {
        return ogrJNI.GeneralCmdLineProcessor__SWIG_1(papszArgv);
    }

    private ogr() {
    }

    public static String[] GeneralCmdLineProcessor(String[] args, int nOptions) {
        int i;
        Vector vArgs = new Vector();
        for (i = 0; i < args.length; ++i) {
            vArgs.addElement(args[i]);
        }
        vArgs = ogr.GeneralCmdLineProcessor(vArgs, nOptions);
        Enumeration eArgs = vArgs.elements();
        args = new String[vArgs.size()];
        i = 0;
        while (eArgs.hasMoreElements()) {
            String arg = (String)eArgs.nextElement();
            args[i++] = arg;
        }
        return args;
    }

    public static String[] GeneralCmdLineProcessor(String[] args) {
        return ogr.GeneralCmdLineProcessor(args, 0);
    }

    public static DataSource Open(String filename, boolean update) {
        return ogr.Open(filename, update ? 1 : 0);
    }
}

