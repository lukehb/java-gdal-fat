/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.osr;

import java.util.Vector;
import org.gdal.osr.osrJNI;

public class SpatialReference
implements Cloneable {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    public SpatialReference(long cPtr, boolean cMemoryOwn) {
        this.swigCMemOwn = cMemoryOwn;
        this.swigCPtr = cPtr;
    }

    public static long getCPtr(SpatialReference obj) {
        return obj == null ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        this.delete();
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                osrJNI.delete_SpatialReference(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof SpatialReference) {
            equal = ((SpatialReference)obj).swigCPtr == this.swigCPtr;
        }
        return equal;
    }

    public Object clone() {
        return this.Clone();
    }

    public int hashCode() {
        return (int)this.swigCPtr;
    }

    public String toString() {
        return this.__str__();
    }

    public String ExportToWkt() {
        String[] array = new String[]{null};
        this.ExportToWkt(array);
        return array[0];
    }

    public String ExportToPrettyWkt(int simplify) {
        String[] array = new String[]{null};
        this.ExportToPrettyWkt(array, simplify);
        return array[0];
    }

    public String ExportToPrettyWkt() {
        String[] array = new String[]{null};
        this.ExportToPrettyWkt(array);
        return array[0];
    }

    public String ExportToProj4() {
        String[] array = new String[]{null};
        this.ExportToProj4(array);
        return array[0];
    }

    public String ExportToXML(String dialect) {
        String[] array = new String[]{null};
        this.ExportToXML(array, dialect);
        return array[0];
    }

    public String ExportToXML() {
        String[] array = new String[]{null};
        this.ExportToXML(array);
        return array[0];
    }

    public String ExportToMICoordSys() {
        String[] array = new String[]{null};
        this.ExportToMICoordSys(array);
        return array[0];
    }

    public double[] GetTOWGS84() {
        double[] array = new double[7];
        this.GetTOWGS84(array);
        return array;
    }

    public int SetTOWGS84(double p1, double p2, double p3) {
        return this.SetTOWGS84(p1, p2, p3, 0.0, 0.0, 0.0, 0.0);
    }

    public SpatialReference(String wkt) {
        this(osrJNI.new_SpatialReference__SWIG_0(wkt), true);
    }

    public SpatialReference() {
        this(osrJNI.new_SpatialReference__SWIG_1(), true);
    }

    public String __str__() {
        return osrJNI.SpatialReference___str__(this.swigCPtr, this);
    }

    public int IsSame(SpatialReference rhs) {
        return osrJNI.SpatialReference_IsSame(this.swigCPtr, this, SpatialReference.getCPtr(rhs), rhs);
    }

    public int IsSameGeogCS(SpatialReference rhs) {
        return osrJNI.SpatialReference_IsSameGeogCS(this.swigCPtr, this, SpatialReference.getCPtr(rhs), rhs);
    }

    public int IsGeographic() {
        return osrJNI.SpatialReference_IsGeographic(this.swigCPtr, this);
    }

    public int IsProjected() {
        return osrJNI.SpatialReference_IsProjected(this.swigCPtr, this);
    }

    public int IsLocal() {
        return osrJNI.SpatialReference_IsLocal(this.swigCPtr, this);
    }

    public int EPSGTreatsAsLatLong() {
        return osrJNI.SpatialReference_EPSGTreatsAsLatLong(this.swigCPtr, this);
    }

    public int SetAuthority(String pszTargetKey, String pszAuthority, int nCode) {
        return osrJNI.SpatialReference_SetAuthority(this.swigCPtr, this, pszTargetKey, pszAuthority, nCode);
    }

    public String GetAttrValue(String name, int child) {
        return osrJNI.SpatialReference_GetAttrValue__SWIG_0(this.swigCPtr, this, name, child);
    }

    public String GetAttrValue(String name) {
        return osrJNI.SpatialReference_GetAttrValue__SWIG_1(this.swigCPtr, this, name);
    }

    public int SetAttrValue(String name, String value) {
        return osrJNI.SpatialReference_SetAttrValue(this.swigCPtr, this, name, value);
    }

    public int SetAngularUnits(String name, double to_radians) {
        return osrJNI.SpatialReference_SetAngularUnits(this.swigCPtr, this, name, to_radians);
    }

    public double GetAngularUnits() {
        return osrJNI.SpatialReference_GetAngularUnits(this.swigCPtr, this);
    }

    public int SetLinearUnits(String name, double to_meters) {
        return osrJNI.SpatialReference_SetLinearUnits(this.swigCPtr, this, name, to_meters);
    }

    public int SetLinearUnitsAndUpdateParameters(String name, double to_meters) {
        return osrJNI.SpatialReference_SetLinearUnitsAndUpdateParameters(this.swigCPtr, this, name, to_meters);
    }

    public double GetLinearUnits() {
        return osrJNI.SpatialReference_GetLinearUnits(this.swigCPtr, this);
    }

    public String GetLinearUnitsName() {
        return osrJNI.SpatialReference_GetLinearUnitsName(this.swigCPtr, this);
    }

    public String GetAuthorityCode(String target_key) {
        return osrJNI.SpatialReference_GetAuthorityCode(this.swigCPtr, this, target_key);
    }

    public String GetAuthorityName(String target_key) {
        return osrJNI.SpatialReference_GetAuthorityName(this.swigCPtr, this, target_key);
    }

    public int SetUTM(int zone, int north) {
        return osrJNI.SpatialReference_SetUTM__SWIG_0(this.swigCPtr, this, zone, north);
    }

    public int SetUTM(int zone) {
        return osrJNI.SpatialReference_SetUTM__SWIG_1(this.swigCPtr, this, zone);
    }

    public int SetStatePlane(int zone, int is_nad83, String unitsname, double units) {
        return osrJNI.SpatialReference_SetStatePlane__SWIG_0(this.swigCPtr, this, zone, is_nad83, unitsname, units);
    }

    public int SetStatePlane(int zone, int is_nad83, String unitsname) {
        return osrJNI.SpatialReference_SetStatePlane__SWIG_1(this.swigCPtr, this, zone, is_nad83, unitsname);
    }

    public int SetStatePlane(int zone, int is_nad83) {
        return osrJNI.SpatialReference_SetStatePlane__SWIG_2(this.swigCPtr, this, zone, is_nad83);
    }

    public int SetStatePlane(int zone) {
        return osrJNI.SpatialReference_SetStatePlane__SWIG_3(this.swigCPtr, this, zone);
    }

    public int AutoIdentifyEPSG() {
        return osrJNI.SpatialReference_AutoIdentifyEPSG(this.swigCPtr, this);
    }

    public int SetProjection(String arg) {
        return osrJNI.SpatialReference_SetProjection(this.swigCPtr, this, arg);
    }

    public int SetProjParm(String name, double val) {
        return osrJNI.SpatialReference_SetProjParm(this.swigCPtr, this, name, val);
    }

    public double GetProjParm(String name, double default_val) {
        return osrJNI.SpatialReference_GetProjParm__SWIG_0(this.swigCPtr, this, name, default_val);
    }

    public double GetProjParm(String name) {
        return osrJNI.SpatialReference_GetProjParm__SWIG_1(this.swigCPtr, this, name);
    }

    public int SetNormProjParm(String name, double val) {
        return osrJNI.SpatialReference_SetNormProjParm(this.swigCPtr, this, name, val);
    }

    public double GetNormProjParm(String name, double default_val) {
        return osrJNI.SpatialReference_GetNormProjParm__SWIG_0(this.swigCPtr, this, name, default_val);
    }

    public double GetNormProjParm(String name) {
        return osrJNI.SpatialReference_GetNormProjParm__SWIG_1(this.swigCPtr, this, name);
    }

    public int SetACEA(double stdp1, double stdp2, double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetACEA(this.swigCPtr, this, stdp1, stdp2, clat, clong, fe, fn);
    }

    public int SetAE(double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetAE(this.swigCPtr, this, clat, clong, fe, fn);
    }

    public int SetBonne(double stdp, double cm, double fe, double fn) {
        return osrJNI.SpatialReference_SetBonne(this.swigCPtr, this, stdp, cm, fe, fn);
    }

    public int SetCEA(double stdp1, double cm, double fe, double fn) {
        return osrJNI.SpatialReference_SetCEA(this.swigCPtr, this, stdp1, cm, fe, fn);
    }

    public int SetCS(double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetCS(this.swigCPtr, this, clat, clong, fe, fn);
    }

    public int SetEC(double stdp1, double stdp2, double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetEC(this.swigCPtr, this, stdp1, stdp2, clat, clong, fe, fn);
    }

    public int SetEckertIV(double cm, double fe, double fn) {
        return osrJNI.SpatialReference_SetEckertIV(this.swigCPtr, this, cm, fe, fn);
    }

    public int SetEckertVI(double cm, double fe, double fn) {
        return osrJNI.SpatialReference_SetEckertVI(this.swigCPtr, this, cm, fe, fn);
    }

    public int SetEquirectangular(double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetEquirectangular(this.swigCPtr, this, clat, clong, fe, fn);
    }

    public int SetEquirectangular2(double clat, double clong, double pseudostdparallellat, double fe, double fn) {
        return osrJNI.SpatialReference_SetEquirectangular2(this.swigCPtr, this, clat, clong, pseudostdparallellat, fe, fn);
    }

    public int SetGaussSchreiberTMercator(double clat, double clong, double sc, double fe, double fn) {
        return osrJNI.SpatialReference_SetGaussSchreiberTMercator(this.swigCPtr, this, clat, clong, sc, fe, fn);
    }

    public int SetGS(double cm, double fe, double fn) {
        return osrJNI.SpatialReference_SetGS(this.swigCPtr, this, cm, fe, fn);
    }

    public int SetGH(double cm, double fe, double fn) {
        return osrJNI.SpatialReference_SetGH(this.swigCPtr, this, cm, fe, fn);
    }

    public int SetGEOS(double cm, double satelliteheight, double fe, double fn) {
        return osrJNI.SpatialReference_SetGEOS(this.swigCPtr, this, cm, satelliteheight, fe, fn);
    }

    public int SetGnomonic(double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetGnomonic(this.swigCPtr, this, clat, clong, fe, fn);
    }

    public int SetHOM(double clat, double clong, double azimuth, double recttoskew, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetHOM(this.swigCPtr, this, clat, clong, azimuth, recttoskew, scale, fe, fn);
    }

    public int SetHOM2PNO(double clat, double dfLat1, double dfLong1, double dfLat2, double dfLong2, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetHOM2PNO(this.swigCPtr, this, clat, dfLat1, dfLong1, dfLat2, dfLong2, scale, fe, fn);
    }

    public int SetKrovak(double clat, double clong, double azimuth, double pseudostdparallellat, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetKrovak(this.swigCPtr, this, clat, clong, azimuth, pseudostdparallellat, scale, fe, fn);
    }

    public int SetLAEA(double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetLAEA(this.swigCPtr, this, clat, clong, fe, fn);
    }

    public int SetLCC(double stdp1, double stdp2, double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetLCC(this.swigCPtr, this, stdp1, stdp2, clat, clong, fe, fn);
    }

    public int SetLCC1SP(double clat, double clong, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetLCC1SP(this.swigCPtr, this, clat, clong, scale, fe, fn);
    }

    public int SetLCCB(double stdp1, double stdp2, double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetLCCB(this.swigCPtr, this, stdp1, stdp2, clat, clong, fe, fn);
    }

    public int SetMC(double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetMC(this.swigCPtr, this, clat, clong, fe, fn);
    }

    public int SetMercator(double clat, double clong, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetMercator(this.swigCPtr, this, clat, clong, scale, fe, fn);
    }

    public int SetMollweide(double cm, double fe, double fn) {
        return osrJNI.SpatialReference_SetMollweide(this.swigCPtr, this, cm, fe, fn);
    }

    public int SetNZMG(double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetNZMG(this.swigCPtr, this, clat, clong, fe, fn);
    }

    public int SetOS(double dfOriginLat, double dfCMeridian, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetOS(this.swigCPtr, this, dfOriginLat, dfCMeridian, scale, fe, fn);
    }

    public int SetOrthographic(double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetOrthographic(this.swigCPtr, this, clat, clong, fe, fn);
    }

    public int SetPolyconic(double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetPolyconic(this.swigCPtr, this, clat, clong, fe, fn);
    }

    public int SetPS(double clat, double clong, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetPS(this.swigCPtr, this, clat, clong, scale, fe, fn);
    }

    public int SetRobinson(double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetRobinson(this.swigCPtr, this, clong, fe, fn);
    }

    public int SetSinusoidal(double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetSinusoidal(this.swigCPtr, this, clong, fe, fn);
    }

    public int SetStereographic(double clat, double clong, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetStereographic(this.swigCPtr, this, clat, clong, scale, fe, fn);
    }

    public int SetSOC(double latitudeoforigin, double cm, double fe, double fn) {
        return osrJNI.SpatialReference_SetSOC(this.swigCPtr, this, latitudeoforigin, cm, fe, fn);
    }

    public int SetTM(double clat, double clong, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetTM(this.swigCPtr, this, clat, clong, scale, fe, fn);
    }

    public int SetTMVariant(String pszVariantName, double clat, double clong, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetTMVariant(this.swigCPtr, this, pszVariantName, clat, clong, scale, fe, fn);
    }

    public int SetTMG(double clat, double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetTMG(this.swigCPtr, this, clat, clong, fe, fn);
    }

    public int SetTMSO(double clat, double clong, double scale, double fe, double fn) {
        return osrJNI.SpatialReference_SetTMSO(this.swigCPtr, this, clat, clong, scale, fe, fn);
    }

    public int SetVDG(double clong, double fe, double fn) {
        return osrJNI.SpatialReference_SetVDG(this.swigCPtr, this, clong, fe, fn);
    }

    public int SetWellKnownGeogCS(String name) {
        return osrJNI.SpatialReference_SetWellKnownGeogCS(this.swigCPtr, this, name);
    }

    public int SetFromUserInput(String name) {
        return osrJNI.SpatialReference_SetFromUserInput(this.swigCPtr, this, name);
    }

    public int CopyGeogCSFrom(SpatialReference rhs) {
        return osrJNI.SpatialReference_CopyGeogCSFrom(this.swigCPtr, this, SpatialReference.getCPtr(rhs), rhs);
    }

    public int SetTOWGS84(double p1, double p2, double p3, double p4, double p5, double p6, double p7) {
        return osrJNI.SpatialReference_SetTOWGS84(this.swigCPtr, this, p1, p2, p3, p4, p5, p6, p7);
    }

    public int GetTOWGS84(double[] argout) {
        return osrJNI.SpatialReference_GetTOWGS84(this.swigCPtr, this, argout);
    }

    public int SetLocalCS(String pszName) {
        return osrJNI.SpatialReference_SetLocalCS(this.swigCPtr, this, pszName);
    }

    public int SetGeogCS(String pszGeogName, String pszDatumName, String pszEllipsoidName, double dfSemiMajor, double dfInvFlattening, String pszPMName, double dfPMOffset, String pszUnits, double dfConvertToRadians) {
        return osrJNI.SpatialReference_SetGeogCS__SWIG_0(this.swigCPtr, this, pszGeogName, pszDatumName, pszEllipsoidName, dfSemiMajor, dfInvFlattening, pszPMName, dfPMOffset, pszUnits, dfConvertToRadians);
    }

    public int SetGeogCS(String pszGeogName, String pszDatumName, String pszEllipsoidName, double dfSemiMajor, double dfInvFlattening, String pszPMName, double dfPMOffset, String pszUnits) {
        return osrJNI.SpatialReference_SetGeogCS__SWIG_1(this.swigCPtr, this, pszGeogName, pszDatumName, pszEllipsoidName, dfSemiMajor, dfInvFlattening, pszPMName, dfPMOffset, pszUnits);
    }

    public int SetGeogCS(String pszGeogName, String pszDatumName, String pszEllipsoidName, double dfSemiMajor, double dfInvFlattening, String pszPMName, double dfPMOffset) {
        return osrJNI.SpatialReference_SetGeogCS__SWIG_2(this.swigCPtr, this, pszGeogName, pszDatumName, pszEllipsoidName, dfSemiMajor, dfInvFlattening, pszPMName, dfPMOffset);
    }

    public int SetGeogCS(String pszGeogName, String pszDatumName, String pszEllipsoidName, double dfSemiMajor, double dfInvFlattening, String pszPMName) {
        return osrJNI.SpatialReference_SetGeogCS__SWIG_3(this.swigCPtr, this, pszGeogName, pszDatumName, pszEllipsoidName, dfSemiMajor, dfInvFlattening, pszPMName);
    }

    public int SetGeogCS(String pszGeogName, String pszDatumName, String pszEllipsoidName, double dfSemiMajor, double dfInvFlattening) {
        return osrJNI.SpatialReference_SetGeogCS__SWIG_4(this.swigCPtr, this, pszGeogName, pszDatumName, pszEllipsoidName, dfSemiMajor, dfInvFlattening);
    }

    public int SetProjCS(String name) {
        return osrJNI.SpatialReference_SetProjCS__SWIG_0(this.swigCPtr, this, name);
    }

    public int SetProjCS() {
        return osrJNI.SpatialReference_SetProjCS__SWIG_1(this.swigCPtr, this);
    }

    public int ImportFromWkt(String ppszInput) {
        return osrJNI.SpatialReference_ImportFromWkt(this.swigCPtr, this, ppszInput);
    }

    public int ImportFromProj4(String ppszInput) {
        return osrJNI.SpatialReference_ImportFromProj4(this.swigCPtr, this, ppszInput);
    }

    public int ImportFromUrl(String url) {
        return osrJNI.SpatialReference_ImportFromUrl(this.swigCPtr, this, url);
    }

    public int ImportFromESRI(Vector ppszInput) {
        return osrJNI.SpatialReference_ImportFromESRI(this.swigCPtr, this, ppszInput);
    }

    public int ImportFromEPSG(int arg) {
        return osrJNI.SpatialReference_ImportFromEPSG(this.swigCPtr, this, arg);
    }

    public int ImportFromEPSGA(int arg) {
        return osrJNI.SpatialReference_ImportFromEPSGA(this.swigCPtr, this, arg);
    }

    public int ImportFromPCI(String proj, String units, double[] argin) {
        return osrJNI.SpatialReference_ImportFromPCI__SWIG_0(this.swigCPtr, this, proj, units, argin);
    }

    public int ImportFromPCI(String proj, String units) {
        return osrJNI.SpatialReference_ImportFromPCI__SWIG_1(this.swigCPtr, this, proj, units);
    }

    public int ImportFromPCI(String proj) {
        return osrJNI.SpatialReference_ImportFromPCI__SWIG_2(this.swigCPtr, this, proj);
    }

    public int ImportFromUSGS(int proj_code, int zone, double[] argin, int datum_code) {
        return osrJNI.SpatialReference_ImportFromUSGS__SWIG_0(this.swigCPtr, this, proj_code, zone, argin, datum_code);
    }

    public int ImportFromUSGS(int proj_code, int zone, double[] argin) {
        return osrJNI.SpatialReference_ImportFromUSGS__SWIG_1(this.swigCPtr, this, proj_code, zone, argin);
    }

    public int ImportFromUSGS(int proj_code, int zone) {
        return osrJNI.SpatialReference_ImportFromUSGS__SWIG_2(this.swigCPtr, this, proj_code, zone);
    }

    public int ImportFromUSGS(int proj_code) {
        return osrJNI.SpatialReference_ImportFromUSGS__SWIG_3(this.swigCPtr, this, proj_code);
    }

    public int ImportFromXML(String xmlString) {
        return osrJNI.SpatialReference_ImportFromXML(this.swigCPtr, this, xmlString);
    }

    public int ImportFromMICoordSys(String pszCoordSys) {
        return osrJNI.SpatialReference_ImportFromMICoordSys(this.swigCPtr, this, pszCoordSys);
    }

    public int ExportToWkt(String[] argout) {
        return osrJNI.SpatialReference_ExportToWkt(this.swigCPtr, this, argout);
    }

    public int ExportToPrettyWkt(String[] argout, int simplify) {
        return osrJNI.SpatialReference_ExportToPrettyWkt__SWIG_0(this.swigCPtr, this, argout, simplify);
    }

    public int ExportToPrettyWkt(String[] argout) {
        return osrJNI.SpatialReference_ExportToPrettyWkt__SWIG_1(this.swigCPtr, this, argout);
    }

    public int ExportToProj4(String[] argout) {
        return osrJNI.SpatialReference_ExportToProj4(this.swigCPtr, this, argout);
    }

    public int ExportToPCI(String[] proj, String[] units, double[] parms) {
        return osrJNI.SpatialReference_ExportToPCI(this.swigCPtr, this, proj, units, parms);
    }

    public int ExportToUSGS(int[] code, int[] zone, double[] parms, int[] datum) {
        return osrJNI.SpatialReference_ExportToUSGS(this.swigCPtr, this, code, zone, parms, datum);
    }

    public int ExportToXML(String[] argout, String dialect) {
        return osrJNI.SpatialReference_ExportToXML__SWIG_0(this.swigCPtr, this, argout, dialect);
    }

    public int ExportToXML(String[] argout) {
        return osrJNI.SpatialReference_ExportToXML__SWIG_1(this.swigCPtr, this, argout);
    }

    public int ExportToMICoordSys(String[] argout) {
        return osrJNI.SpatialReference_ExportToMICoordSys(this.swigCPtr, this, argout);
    }

    public SpatialReference CloneGeogCS() {
        long cPtr = osrJNI.SpatialReference_CloneGeogCS(this.swigCPtr, this);
        return cPtr == 0 ? null : new SpatialReference(cPtr, true);
    }

    public SpatialReference Clone() {
        long cPtr = osrJNI.SpatialReference_Clone(this.swigCPtr, this);
        return cPtr == 0 ? null : new SpatialReference(cPtr, true);
    }

    public int Validate() {
        return osrJNI.SpatialReference_Validate(this.swigCPtr, this);
    }

    public int StripCTParms() {
        return osrJNI.SpatialReference_StripCTParms(this.swigCPtr, this);
    }

    public int FixupOrdering() {
        return osrJNI.SpatialReference_FixupOrdering(this.swigCPtr, this);
    }

    public int Fixup() {
        return osrJNI.SpatialReference_Fixup(this.swigCPtr, this);
    }

    public int MorphToESRI() {
        return osrJNI.SpatialReference_MorphToESRI(this.swigCPtr, this);
    }

    public int MorphFromESRI() {
        return osrJNI.SpatialReference_MorphFromESRI(this.swigCPtr, this);
    }
}

