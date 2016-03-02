/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

public interface ogrConstants {
    public static final int wkb25DBit = Integer.MIN_VALUE;
    public static final int wkb25Bit = Integer.MIN_VALUE;
    public static final int wkbUnknown = 0;
    public static final int wkbPoint = 1;
    public static final int wkbLineString = 2;
    public static final int wkbPolygon = 3;
    public static final int wkbMultiPoint = 4;
    public static final int wkbMultiLineString = 5;
    public static final int wkbMultiPolygon = 6;
    public static final int wkbGeometryCollection = 7;
    public static final int wkbNone = 100;
    public static final int wkbLinearRing = 101;
    public static final int wkbPoint25D = -2147483647;
    public static final int wkbLineString25D = -2147483646;
    public static final int wkbPolygon25D = -2147483645;
    public static final int wkbMultiPoint25D = -2147483644;
    public static final int wkbMultiLineString25D = -2147483643;
    public static final int wkbMultiPolygon25D = -2147483642;
    public static final int wkbGeometryCollection25D = -2147483641;
    public static final int OFTInteger = 0;
    public static final int OFTIntegerList = 1;
    public static final int OFTReal = 2;
    public static final int OFTRealList = 3;
    public static final int OFTString = 4;
    public static final int OFTStringList = 5;
    public static final int OFTWideString = 6;
    public static final int OFTWideStringList = 7;
    public static final int OFTBinary = 8;
    public static final int OFTDate = 9;
    public static final int OFTTime = 10;
    public static final int OFTDateTime = 11;
    public static final int OJUndefined = 0;
    public static final int OJLeft = 1;
    public static final int OJRight = 2;
    public static final int wkbXDR = 0;
    public static final int wkbNDR = 1;
    public static final int NullFID = -1;
    public static final String OLCRandomRead = "RandomRead";
    public static final String OLCSequentialWrite = "SequentialWrite";
    public static final String OLCRandomWrite = "RandomWrite";
    public static final String OLCFastSpatialFilter = "FastSpatialFilter";
    public static final String OLCFastFeatureCount = "FastFeatureCount";
    public static final String OLCFastGetExtent = "FastGetExtent";
    public static final String OLCCreateField = "CreateField";
    public static final String OLCTransactions = "Transactions";
    public static final String OLCDeleteFeature = "DeleteFeature";
    public static final String OLCFastSetNextByIndex = "FastSetNextByIndex";
    public static final String OLCStringsAsUTF8 = "StringsAsUTF8";
    public static final String ODsCCreateLayer = "CreateLayer";
    public static final String ODsCDeleteLayer = "DeleteLayer";
    public static final String ODrCCreateDataSource = "CreateDataSource";
    public static final String ODrCDeleteDataSource = "DeleteDataSource";
    public static final int OGRERR_NONE = 0;
    public static final int OGRERR_NOT_ENOUGH_DATA = 1;
    public static final int OGRERR_NOT_ENOUGH_MEMORY = 2;
    public static final int OGRERR_UNSUPPORTED_GEOMETRY_TYPE = 3;
    public static final int OGRERR_UNSUPPORTED_OPERATION = 4;
    public static final int OGRERR_CORRUPT_DATA = 5;
    public static final int OGRERR_FAILURE = 6;
    public static final int OGRERR_UNSUPPORTED_SRS = 7;
}

