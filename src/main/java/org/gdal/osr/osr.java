/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.osr;

import java.util.Vector;
import org.gdal.osr.osrConstants;
import org.gdal.osr.osrJNI;

public class osr
implements osrConstants {
    public static void UseExceptions() {
        osrJNI.UseExceptions();
    }

    public static void DontUseExceptions() {
        osrJNI.DontUseExceptions();
    }

    public static int ExceptionsAreAllowed() {
        return osrJNI.ExceptionsAreAllowed();
    }

    private osr() {
    }

    public static String GetWellKnownGeogCSAsWKT(String name) {
        return osrJNI.GetWellKnownGeogCSAsWKT__SWIG_0(name);
    }

    public static String GetUserInputAsWKT(String name) {
        return osrJNI.GetUserInputAsWKT__SWIG_0(name);
    }

    public static int GetWellKnownGeogCSAsWKT(String name, String[] argout) {
        return osrJNI.GetWellKnownGeogCSAsWKT__SWIG_1(name, argout);
    }

    public static int GetUserInputAsWKT(String name, String[] argout) {
        return osrJNI.GetUserInputAsWKT__SWIG_1(name, argout);
    }

    public static Vector GetProjectionMethods() {
        return osrJNI.GetProjectionMethods();
    }

    public static String[] GetProjectionMethodParameterList(String method, String[] username) {
        return osrJNI.GetProjectionMethodParameterList(method, username);
    }

    public static void GetProjectionMethodParamInfo(String method, String param, String[] usrname, String[] type, double[] defaultval) {
        osrJNI.GetProjectionMethodParamInfo(method, param, usrname, type, defaultval);
    }
}

