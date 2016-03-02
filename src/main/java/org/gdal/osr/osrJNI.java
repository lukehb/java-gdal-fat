/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.osr;

import java.util.Vector;

import org.gdal.NativeLoader;
import org.gdal.gdal.gdal;
import org.gdal.osr.CoordinateTransformation;
import org.gdal.osr.SpatialReference;

public class osrJNI {
    private static boolean available = false;

    public static final native void UseExceptions();

    public static final native void DontUseExceptions();

    public static final native int ExceptionsAreAllowed();

    public static boolean isAvailable() {
        return available;
    }

    public static final native String GetWellKnownGeogCSAsWKT__SWIG_0(String var0);

    public static final native String GetUserInputAsWKT__SWIG_0(String var0);

    public static final native int GetWellKnownGeogCSAsWKT__SWIG_1(String var0, String[] var1);

    public static final native int GetUserInputAsWKT__SWIG_1(String var0, String[] var1);

    public static final native Vector GetProjectionMethods();

    public static final native String[] GetProjectionMethodParameterList(String var0, String[] var1);

    public static final native void GetProjectionMethodParamInfo(String var0, String var1, String[] var2, String[] var3, double[] var4);

    public static final native long new_SpatialReference__SWIG_0(String var0);

    public static final native long new_SpatialReference__SWIG_1();

    public static final native void delete_SpatialReference(long var0);

    public static final native String SpatialReference___str__(long var0, SpatialReference var2);

    public static final native int SpatialReference_IsSame(long var0, SpatialReference var2, long var3, SpatialReference var5);

    public static final native int SpatialReference_IsSameGeogCS(long var0, SpatialReference var2, long var3, SpatialReference var5);

    public static final native int SpatialReference_IsGeographic(long var0, SpatialReference var2);

    public static final native int SpatialReference_IsProjected(long var0, SpatialReference var2);

    public static final native int SpatialReference_IsLocal(long var0, SpatialReference var2);

    public static final native int SpatialReference_EPSGTreatsAsLatLong(long var0, SpatialReference var2);

    public static final native int SpatialReference_SetAuthority(long var0, SpatialReference var2, String var3, String var4, int var5);

    public static final native String SpatialReference_GetAttrValue__SWIG_0(long var0, SpatialReference var2, String var3, int var4);

    public static final native String SpatialReference_GetAttrValue__SWIG_1(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_SetAttrValue(long var0, SpatialReference var2, String var3, String var4);

    public static final native int SpatialReference_SetAngularUnits(long var0, SpatialReference var2, String var3, double var4);

    public static final native double SpatialReference_GetAngularUnits(long var0, SpatialReference var2);

    public static final native int SpatialReference_SetLinearUnits(long var0, SpatialReference var2, String var3, double var4);

    public static final native int SpatialReference_SetLinearUnitsAndUpdateParameters(long var0, SpatialReference var2, String var3, double var4);

    public static final native double SpatialReference_GetLinearUnits(long var0, SpatialReference var2);

    public static final native String SpatialReference_GetLinearUnitsName(long var0, SpatialReference var2);

    public static final native String SpatialReference_GetAuthorityCode(long var0, SpatialReference var2, String var3);

    public static final native String SpatialReference_GetAuthorityName(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_SetUTM__SWIG_0(long var0, SpatialReference var2, int var3, int var4);

    public static final native int SpatialReference_SetUTM__SWIG_1(long var0, SpatialReference var2, int var3);

    public static final native int SpatialReference_SetStatePlane__SWIG_0(long var0, SpatialReference var2, int var3, int var4, String var5, double var6);

    public static final native int SpatialReference_SetStatePlane__SWIG_1(long var0, SpatialReference var2, int var3, int var4, String var5);

    public static final native int SpatialReference_SetStatePlane__SWIG_2(long var0, SpatialReference var2, int var3, int var4);

    public static final native int SpatialReference_SetStatePlane__SWIG_3(long var0, SpatialReference var2, int var3);

    public static final native int SpatialReference_AutoIdentifyEPSG(long var0, SpatialReference var2);

    public static final native int SpatialReference_SetProjection(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_SetProjParm(long var0, SpatialReference var2, String var3, double var4);

    public static final native double SpatialReference_GetProjParm__SWIG_0(long var0, SpatialReference var2, String var3, double var4);

    public static final native double SpatialReference_GetProjParm__SWIG_1(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_SetNormProjParm(long var0, SpatialReference var2, String var3, double var4);

    public static final native double SpatialReference_GetNormProjParm__SWIG_0(long var0, SpatialReference var2, String var3, double var4);

    public static final native double SpatialReference_GetNormProjParm__SWIG_1(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_SetACEA(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11, double var13);

    public static final native int SpatialReference_SetAE(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetBonne(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetCEA(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetCS(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetEC(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11, double var13);

    public static final native int SpatialReference_SetEckertIV(long var0, SpatialReference var2, double var3, double var5, double var7);

    public static final native int SpatialReference_SetEckertVI(long var0, SpatialReference var2, double var3, double var5, double var7);

    public static final native int SpatialReference_SetEquirectangular(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetEquirectangular2(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11);

    public static final native int SpatialReference_SetGaussSchreiberTMercator(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11);

    public static final native int SpatialReference_SetGS(long var0, SpatialReference var2, double var3, double var5, double var7);

    public static final native int SpatialReference_SetGH(long var0, SpatialReference var2, double var3, double var5, double var7);

    public static final native int SpatialReference_SetGEOS(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetGnomonic(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetHOM(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11, double var13, double var15);

    public static final native int SpatialReference_SetHOM2PNO(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17);

    public static final native int SpatialReference_SetKrovak(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11, double var13, double var15);

    public static final native int SpatialReference_SetLAEA(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetLCC(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11, double var13);

    public static final native int SpatialReference_SetLCC1SP(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11);

    public static final native int SpatialReference_SetLCCB(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11, double var13);

    public static final native int SpatialReference_SetMC(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetMercator(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11);

    public static final native int SpatialReference_SetMollweide(long var0, SpatialReference var2, double var3, double var5, double var7);

    public static final native int SpatialReference_SetNZMG(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetOS(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11);

    public static final native int SpatialReference_SetOrthographic(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetPolyconic(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetPS(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11);

    public static final native int SpatialReference_SetRobinson(long var0, SpatialReference var2, double var3, double var5, double var7);

    public static final native int SpatialReference_SetSinusoidal(long var0, SpatialReference var2, double var3, double var5, double var7);

    public static final native int SpatialReference_SetStereographic(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11);

    public static final native int SpatialReference_SetSOC(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetTM(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11);

    public static final native int SpatialReference_SetTMVariant(long var0, SpatialReference var2, String var3, double var4, double var6, double var8, double var10, double var12);

    public static final native int SpatialReference_SetTMG(long var0, SpatialReference var2, double var3, double var5, double var7, double var9);

    public static final native int SpatialReference_SetTMSO(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11);

    public static final native int SpatialReference_SetVDG(long var0, SpatialReference var2, double var3, double var5, double var7);

    public static final native int SpatialReference_SetWellKnownGeogCS(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_SetFromUserInput(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_CopyGeogCSFrom(long var0, SpatialReference var2, long var3, SpatialReference var5);

    public static final native int SpatialReference_SetTOWGS84(long var0, SpatialReference var2, double var3, double var5, double var7, double var9, double var11, double var13, double var15);

    public static final native int SpatialReference_GetTOWGS84(long var0, SpatialReference var2, double[] var3);

    public static final native int SpatialReference_SetLocalCS(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_SetGeogCS__SWIG_0(long var0, SpatialReference var2, String var3, String var4, String var5, double var6, double var8, String var10, double var11, String var13, double var14);

    public static final native int SpatialReference_SetGeogCS__SWIG_1(long var0, SpatialReference var2, String var3, String var4, String var5, double var6, double var8, String var10, double var11, String var13);

    public static final native int SpatialReference_SetGeogCS__SWIG_2(long var0, SpatialReference var2, String var3, String var4, String var5, double var6, double var8, String var10, double var11);

    public static final native int SpatialReference_SetGeogCS__SWIG_3(long var0, SpatialReference var2, String var3, String var4, String var5, double var6, double var8, String var10);

    public static final native int SpatialReference_SetGeogCS__SWIG_4(long var0, SpatialReference var2, String var3, String var4, String var5, double var6, double var8);

    public static final native int SpatialReference_SetProjCS__SWIG_0(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_SetProjCS__SWIG_1(long var0, SpatialReference var2);

    public static final native int SpatialReference_ImportFromWkt(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_ImportFromProj4(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_ImportFromUrl(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_ImportFromESRI(long var0, SpatialReference var2, Vector var3);

    public static final native int SpatialReference_ImportFromEPSG(long var0, SpatialReference var2, int var3);

    public static final native int SpatialReference_ImportFromEPSGA(long var0, SpatialReference var2, int var3);

    public static final native int SpatialReference_ImportFromPCI__SWIG_0(long var0, SpatialReference var2, String var3, String var4, double[] var5);

    public static final native int SpatialReference_ImportFromPCI__SWIG_1(long var0, SpatialReference var2, String var3, String var4);

    public static final native int SpatialReference_ImportFromPCI__SWIG_2(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_ImportFromUSGS__SWIG_0(long var0, SpatialReference var2, int var3, int var4, double[] var5, int var6);

    public static final native int SpatialReference_ImportFromUSGS__SWIG_1(long var0, SpatialReference var2, int var3, int var4, double[] var5);

    public static final native int SpatialReference_ImportFromUSGS__SWIG_2(long var0, SpatialReference var2, int var3, int var4);

    public static final native int SpatialReference_ImportFromUSGS__SWIG_3(long var0, SpatialReference var2, int var3);

    public static final native int SpatialReference_ImportFromXML(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_ImportFromMICoordSys(long var0, SpatialReference var2, String var3);

    public static final native int SpatialReference_ExportToWkt(long var0, SpatialReference var2, String[] var3);

    public static final native int SpatialReference_ExportToPrettyWkt__SWIG_0(long var0, SpatialReference var2, String[] var3, int var4);

    public static final native int SpatialReference_ExportToPrettyWkt__SWIG_1(long var0, SpatialReference var2, String[] var3);

    public static final native int SpatialReference_ExportToProj4(long var0, SpatialReference var2, String[] var3);

    public static final native int SpatialReference_ExportToPCI(long var0, SpatialReference var2, String[] var3, String[] var4, double[] var5);

    public static final native int SpatialReference_ExportToUSGS(long var0, SpatialReference var2, int[] var3, int[] var4, double[] var5, int[] var6);

    public static final native int SpatialReference_ExportToXML__SWIG_0(long var0, SpatialReference var2, String[] var3, String var4);

    public static final native int SpatialReference_ExportToXML__SWIG_1(long var0, SpatialReference var2, String[] var3);

    public static final native int SpatialReference_ExportToMICoordSys(long var0, SpatialReference var2, String[] var3);

    public static final native long SpatialReference_CloneGeogCS(long var0, SpatialReference var2);

    public static final native long SpatialReference_Clone(long var0, SpatialReference var2);

    public static final native int SpatialReference_Validate(long var0, SpatialReference var2);

    public static final native int SpatialReference_StripCTParms(long var0, SpatialReference var2);

    public static final native int SpatialReference_FixupOrdering(long var0, SpatialReference var2);

    public static final native int SpatialReference_Fixup(long var0, SpatialReference var2);

    public static final native int SpatialReference_MorphToESRI(long var0, SpatialReference var2);

    public static final native int SpatialReference_MorphFromESRI(long var0, SpatialReference var2);

    public static final native long new_CoordinateTransformation(long var0, SpatialReference var2, long var3, SpatialReference var5);

    public static final native void delete_CoordinateTransformation(long var0);

    public static final native void CoordinateTransformation_TransformPoint__SWIG_0(long var0, CoordinateTransformation var2, double[] var3);

    public static final native void CoordinateTransformation_TransformPoint__SWIG_1(long var0, CoordinateTransformation var2, double[] var3, double var4, double var6, double var8);

    public static final native void CoordinateTransformation_TransformPoint__SWIG_2(long var0, CoordinateTransformation var2, double[] var3, double var4, double var6);

    public static final native void CoordinateTransformation_TransformPoints(long var0, CoordinateTransformation var2, double[][] var3);

    static {
        NativeLoader.load();
    }
}

