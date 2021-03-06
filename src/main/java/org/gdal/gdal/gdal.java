/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import java.util.Enumeration;
import java.util.Vector;
import org.gdal.gdal.Band;
import org.gdal.gdal.ColorTable;
import org.gdal.gdal.Dataset;
import org.gdal.gdal.Driver;
import org.gdal.gdal.GCP;
import org.gdal.gdal.ProgressCallback;
import org.gdal.gdal.XMLNode;
import org.gdal.gdal.gdalJNI;
import org.gdal.ogr.Layer;

public class gdal {

    private gdal() {
    }


    public static String[] GeneralCmdLineProcessor(String[] args, int nOptions) {
        int i;
        Vector vArgs = new Vector();
        for (i = 0; i < args.length; ++i) {
            vArgs.addElement(args[i]);
        }
        vArgs = gdal.GeneralCmdLineProcessor(vArgs, nOptions);
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
        return gdal.GeneralCmdLineProcessor(args, 0);
    }

    public static double[] InvGeoTransform(double[] gt_in) {
        double[] gt_out = new double[6];
        if (gdal.InvGeoTransform(gt_in, gt_out) == 1) {
            return gt_out;
        }
        return null;
    }

    public static void Debug(String msg_class, String message) {
        gdalJNI.Debug(msg_class, message);
    }

    public static int PushErrorHandler(String pszCallbackName) {
        return gdalJNI.PushErrorHandler__SWIG_0(pszCallbackName);
    }

    public static int PushErrorHandler() {
        return gdalJNI.PushErrorHandler__SWIG_1();
    }

    public static void Error(int msg_class, int err_code, String msg) {
        gdalJNI.Error(msg_class, err_code, msg);
    }

    public static void PopErrorHandler() {
        gdalJNI.PopErrorHandler();
    }

    public static void ErrorReset() {
        gdalJNI.ErrorReset();
    }

    public static String EscapeString(byte[] len, int scheme) {
        return gdalJNI.EscapeString__SWIG_0(len, scheme);
    }

    public static String EscapeString(String str, int scheme) {
        return gdalJNI.EscapeString__SWIG_1(str, scheme);
    }

    public static int GetLastErrorNo() {
        return gdalJNI.GetLastErrorNo();
    }

    public static int GetLastErrorType() {
        return gdalJNI.GetLastErrorType();
    }

    public static String GetLastErrorMsg() {
        return gdalJNI.GetLastErrorMsg();
    }

    public static void PushFinderLocation(String pszLocation) {
        gdalJNI.PushFinderLocation(pszLocation);
    }

    public static void PopFinderLocation() {
        gdalJNI.PopFinderLocation();
    }

    public static void FinderClean() {
        gdalJNI.FinderClean();
    }

    public static String FindFile(String pszClass, String pszBasename) {
        return gdalJNI.FindFile(pszClass, pszBasename);
    }

    public static Vector ReadDir(String pszDirName) {
        return gdalJNI.ReadDir(pszDirName);
    }

    public static void SetConfigOption(String pszKey, String pszValue) {
        gdalJNI.SetConfigOption(pszKey, pszValue);
    }

    public static String GetConfigOption(String pszKey, String pszDefault) {
        return gdalJNI.GetConfigOption__SWIG_0(pszKey, pszDefault);
    }

    public static String GetConfigOption(String pszKey) {
        return gdalJNI.GetConfigOption__SWIG_1(pszKey);
    }

    public static String CPLBinaryToHex(byte[] nBytes) {
        return gdalJNI.CPLBinaryToHex(nBytes);
    }

    public static byte[] CPLHexToBinary(String pszHex) {
        return gdalJNI.CPLHexToBinary(pszHex);
    }

    public static void FileFromMemBuffer(String pszFilename, byte[] nBytes) {
        gdalJNI.FileFromMemBuffer(pszFilename, nBytes);
    }

    public static int Unlink(String pszFilename) {
        return gdalJNI.Unlink(pszFilename);
    }

    public static int HasThreadSupport() {
        return gdalJNI.HasThreadSupport();
    }

    public static double GDAL_GCP_GCPX_get(GCP gcp) {
        return gdalJNI.GDAL_GCP_GCPX_get(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_GCPX_set(GCP gcp, double dfGCPX) {
        gdalJNI.GDAL_GCP_GCPX_set(GCP.getCPtr(gcp), gcp, dfGCPX);
    }

    public static double GDAL_GCP_GCPY_get(GCP gcp) {
        return gdalJNI.GDAL_GCP_GCPY_get(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_GCPY_set(GCP gcp, double dfGCPY) {
        gdalJNI.GDAL_GCP_GCPY_set(GCP.getCPtr(gcp), gcp, dfGCPY);
    }

    public static double GDAL_GCP_GCPZ_get(GCP gcp) {
        return gdalJNI.GDAL_GCP_GCPZ_get(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_GCPZ_set(GCP gcp, double dfGCPZ) {
        gdalJNI.GDAL_GCP_GCPZ_set(GCP.getCPtr(gcp), gcp, dfGCPZ);
    }

    public static double GDAL_GCP_GCPPixel_get(GCP gcp) {
        return gdalJNI.GDAL_GCP_GCPPixel_get(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_GCPPixel_set(GCP gcp, double dfGCPPixel) {
        gdalJNI.GDAL_GCP_GCPPixel_set(GCP.getCPtr(gcp), gcp, dfGCPPixel);
    }

    public static double GDAL_GCP_GCPLine_get(GCP gcp) {
        return gdalJNI.GDAL_GCP_GCPLine_get(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_GCPLine_set(GCP gcp, double dfGCPLine) {
        gdalJNI.GDAL_GCP_GCPLine_set(GCP.getCPtr(gcp), gcp, dfGCPLine);
    }

    public static String GDAL_GCP_Info_get(GCP gcp) {
        return gdalJNI.GDAL_GCP_Info_get(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_Info_set(GCP gcp, String pszInfo) {
        gdalJNI.GDAL_GCP_Info_set(GCP.getCPtr(gcp), gcp, pszInfo);
    }

    public static String GDAL_GCP_Id_get(GCP gcp) {
        return gdalJNI.GDAL_GCP_Id_get(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_Id_set(GCP gcp, String pszId) {
        gdalJNI.GDAL_GCP_Id_set(GCP.getCPtr(gcp), gcp, pszId);
    }

    public static double GDAL_GCP_get_GCPX(GCP gcp) {
        return gdalJNI.GDAL_GCP_get_GCPX(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_set_GCPX(GCP gcp, double dfGCPX) {
        gdalJNI.GDAL_GCP_set_GCPX(GCP.getCPtr(gcp), gcp, dfGCPX);
    }

    public static double GDAL_GCP_get_GCPY(GCP gcp) {
        return gdalJNI.GDAL_GCP_get_GCPY(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_set_GCPY(GCP gcp, double dfGCPY) {
        gdalJNI.GDAL_GCP_set_GCPY(GCP.getCPtr(gcp), gcp, dfGCPY);
    }

    public static double GDAL_GCP_get_GCPZ(GCP gcp) {
        return gdalJNI.GDAL_GCP_get_GCPZ(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_set_GCPZ(GCP gcp, double dfGCPZ) {
        gdalJNI.GDAL_GCP_set_GCPZ(GCP.getCPtr(gcp), gcp, dfGCPZ);
    }

    public static double GDAL_GCP_get_GCPPixel(GCP gcp) {
        return gdalJNI.GDAL_GCP_get_GCPPixel(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_set_GCPPixel(GCP gcp, double dfGCPPixel) {
        gdalJNI.GDAL_GCP_set_GCPPixel(GCP.getCPtr(gcp), gcp, dfGCPPixel);
    }

    public static double GDAL_GCP_get_GCPLine(GCP gcp) {
        return gdalJNI.GDAL_GCP_get_GCPLine(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_set_GCPLine(GCP gcp, double dfGCPLine) {
        gdalJNI.GDAL_GCP_set_GCPLine(GCP.getCPtr(gcp), gcp, dfGCPLine);
    }

    public static String GDAL_GCP_get_Info(GCP gcp) {
        return gdalJNI.GDAL_GCP_get_Info(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_set_Info(GCP gcp, String pszInfo) {
        gdalJNI.GDAL_GCP_set_Info(GCP.getCPtr(gcp), gcp, pszInfo);
    }

    public static String GDAL_GCP_get_Id(GCP gcp) {
        return gdalJNI.GDAL_GCP_get_Id(GCP.getCPtr(gcp), gcp);
    }

    public static void GDAL_GCP_set_Id(GCP gcp, String pszId) {
        gdalJNI.GDAL_GCP_set_Id(GCP.getCPtr(gcp), gcp, pszId);
    }

    public static int GCPsToGeoTransform(GCP[] nGCPs, double[] argout, int bApproxOK) {
        return gdalJNI.GCPsToGeoTransform__SWIG_0(nGCPs, argout, bApproxOK);
    }

    public static int GCPsToGeoTransform(GCP[] nGCPs, double[] argout) {
        return gdalJNI.GCPsToGeoTransform__SWIG_1(nGCPs, argout);
    }

    public static int ComputeMedianCutPCT(Band red, Band green, Band blue, int num_colors, ColorTable colors, ProgressCallback callback) {
        return gdalJNI.ComputeMedianCutPCT__SWIG_0(Band.getCPtr(red), red, Band.getCPtr(green), green, Band.getCPtr(blue), blue, num_colors, ColorTable.getCPtr(colors), colors, callback);
    }

    public static int ComputeMedianCutPCT(Band red, Band green, Band blue, int num_colors, ColorTable colors) {
        return gdalJNI.ComputeMedianCutPCT__SWIG_2(Band.getCPtr(red), red, Band.getCPtr(green), green, Band.getCPtr(blue), blue, num_colors, ColorTable.getCPtr(colors), colors);
    }

    public static int DitherRGB2PCT(Band red, Band green, Band blue, Band target, ColorTable colors, ProgressCallback callback) {
        return gdalJNI.DitherRGB2PCT__SWIG_0(Band.getCPtr(red), red, Band.getCPtr(green), green, Band.getCPtr(blue), blue, Band.getCPtr(target), target, ColorTable.getCPtr(colors), colors, callback);
    }

    public static int DitherRGB2PCT(Band red, Band green, Band blue, Band target, ColorTable colors) {
        return gdalJNI.DitherRGB2PCT__SWIG_2(Band.getCPtr(red), red, Band.getCPtr(green), green, Band.getCPtr(blue), blue, Band.getCPtr(target), target, ColorTable.getCPtr(colors), colors);
    }

    public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt, int eResampleAlg, double WarpMemoryLimit, double maxerror, ProgressCallback callback) {
        return gdalJNI.ReprojectImage__SWIG_0(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt, eResampleAlg, WarpMemoryLimit, maxerror, callback);
    }

    public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt, int eResampleAlg, double WarpMemoryLimit, double maxerror) {
        return gdalJNI.ReprojectImage__SWIG_2(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt, eResampleAlg, WarpMemoryLimit, maxerror);
    }

    public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt, int eResampleAlg, double WarpMemoryLimit) {
        return gdalJNI.ReprojectImage__SWIG_3(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt, eResampleAlg, WarpMemoryLimit);
    }

    public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt, int eResampleAlg) {
        return gdalJNI.ReprojectImage__SWIG_4(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt, eResampleAlg);
    }

    public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt, String dst_wkt) {
        return gdalJNI.ReprojectImage__SWIG_5(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt, dst_wkt);
    }

    public static int ReprojectImage(Dataset src_ds, Dataset dst_ds, String src_wkt) {
        return gdalJNI.ReprojectImage__SWIG_6(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds, src_wkt);
    }

    public static int ReprojectImage(Dataset src_ds, Dataset dst_ds) {
        return gdalJNI.ReprojectImage__SWIG_7(Dataset.getCPtr(src_ds), src_ds, Dataset.getCPtr(dst_ds), dst_ds);
    }

    public static int ComputeProximity(Band srcBand, Band proximityBand, Vector options, ProgressCallback callback) {
        return gdalJNI.ComputeProximity__SWIG_0(Band.getCPtr(srcBand), srcBand, Band.getCPtr(proximityBand), proximityBand, options, callback);
    }

    public static int ComputeProximity(Band srcBand, Band proximityBand, Vector options) {
        return gdalJNI.ComputeProximity__SWIG_2(Band.getCPtr(srcBand), srcBand, Band.getCPtr(proximityBand), proximityBand, options);
    }

    public static int ComputeProximity(Band srcBand, Band proximityBand) {
        return gdalJNI.ComputeProximity__SWIG_3(Band.getCPtr(srcBand), srcBand, Band.getCPtr(proximityBand), proximityBand);
    }

    public static int RasterizeLayer(Dataset dataset, int[] bands, Layer layer, double[] burn_values, Vector options, ProgressCallback callback) {
        return gdalJNI.RasterizeLayer__SWIG_0(Dataset.getCPtr(dataset), dataset, bands, layer, burn_values, options, callback);
    }

    public static int RasterizeLayer(Dataset dataset, int[] bands, Layer layer, double[] burn_values, Vector options) {
        return gdalJNI.RasterizeLayer__SWIG_2(Dataset.getCPtr(dataset), dataset, bands, layer, burn_values, options);
    }

    public static int RasterizeLayer(Dataset dataset, int[] bands, Layer layer, double[] burn_values) {
        return gdalJNI.RasterizeLayer__SWIG_3(Dataset.getCPtr(dataset), dataset, bands, layer, burn_values);
    }

    public static int RasterizeLayer(Dataset dataset, int[] bands, Layer layer) {
        return gdalJNI.RasterizeLayer__SWIG_5(Dataset.getCPtr(dataset), dataset, bands, layer);
    }

    public static int Polygonize(Band srcBand, Band maskBand, Layer outLayer, int iPixValField, Vector options, ProgressCallback callback) {
        return gdalJNI.Polygonize__SWIG_0(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, outLayer, iPixValField, options, callback);
    }

    public static int Polygonize(Band srcBand, Band maskBand, Layer outLayer, int iPixValField, Vector options) {
        return gdalJNI.Polygonize__SWIG_2(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, outLayer, iPixValField, options);
    }

    public static int Polygonize(Band srcBand, Band maskBand, Layer outLayer, int iPixValField) {
        return gdalJNI.Polygonize__SWIG_3(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, outLayer, iPixValField);
    }

    public static int FillNodata(Band targetBand, Band maskBand, double maxSearchDist, int smoothingIterations, Vector options, ProgressCallback callback) {
        return gdalJNI.FillNodata__SWIG_0(Band.getCPtr(targetBand), targetBand, Band.getCPtr(maskBand), maskBand, maxSearchDist, smoothingIterations, options, callback);
    }

    public static int FillNodata(Band targetBand, Band maskBand, double maxSearchDist, int smoothingIterations, Vector options) {
        return gdalJNI.FillNodata__SWIG_2(Band.getCPtr(targetBand), targetBand, Band.getCPtr(maskBand), maskBand, maxSearchDist, smoothingIterations, options);
    }

    public static int FillNodata(Band targetBand, Band maskBand, double maxSearchDist, int smoothingIterations) {
        return gdalJNI.FillNodata__SWIG_3(Band.getCPtr(targetBand), targetBand, Band.getCPtr(maskBand), maskBand, maxSearchDist, smoothingIterations);
    }

    public static int SieveFilter(Band srcBand, Band maskBand, Band dstBand, int threshold, int connectedness, Vector options, ProgressCallback callback) {
        return gdalJNI.SieveFilter__SWIG_0(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Band.getCPtr(dstBand), dstBand, threshold, connectedness, options, callback);
    }

    public static int SieveFilter(Band srcBand, Band maskBand, Band dstBand, int threshold, int connectedness, Vector options) {
        return gdalJNI.SieveFilter__SWIG_2(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Band.getCPtr(dstBand), dstBand, threshold, connectedness, options);
    }

    public static int SieveFilter(Band srcBand, Band maskBand, Band dstBand, int threshold, int connectedness) {
        return gdalJNI.SieveFilter__SWIG_3(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Band.getCPtr(dstBand), dstBand, threshold, connectedness);
    }

    public static int SieveFilter(Band srcBand, Band maskBand, Band dstBand, int threshold) {
        return gdalJNI.SieveFilter__SWIG_4(Band.getCPtr(srcBand), srcBand, Band.getCPtr(maskBand), maskBand, Band.getCPtr(dstBand), dstBand, threshold);
    }

    public static int RegenerateOverviews(Band srcBand, Band[] overviewBandCount, String resampling, ProgressCallback callback) {
        return gdalJNI.RegenerateOverviews__SWIG_0(Band.getCPtr(srcBand), srcBand, overviewBandCount, resampling, callback);
    }

    public static int RegenerateOverviews(Band srcBand, Band[] overviewBandCount, String resampling) {
        return gdalJNI.RegenerateOverviews__SWIG_2(Band.getCPtr(srcBand), srcBand, overviewBandCount, resampling);
    }

    public static int RegenerateOverviews(Band srcBand, Band[] overviewBandCount) {
        return gdalJNI.RegenerateOverviews__SWIG_3(Band.getCPtr(srcBand), srcBand, overviewBandCount);
    }

    public static int RegenerateOverview(Band srcBand, Band overviewBand, String resampling, ProgressCallback callback) {
        return gdalJNI.RegenerateOverview__SWIG_0(Band.getCPtr(srcBand), srcBand, Band.getCPtr(overviewBand), overviewBand, resampling, callback);
    }

    public static int RegenerateOverview(Band srcBand, Band overviewBand, String resampling) {
        return gdalJNI.RegenerateOverview__SWIG_2(Band.getCPtr(srcBand), srcBand, Band.getCPtr(overviewBand), overviewBand, resampling);
    }

    public static int RegenerateOverview(Band srcBand, Band overviewBand) {
        return gdalJNI.RegenerateOverview__SWIG_3(Band.getCPtr(srcBand), srcBand, Band.getCPtr(overviewBand), overviewBand);
    }

    public static Dataset AutoCreateWarpedVRT(Dataset src_ds, String src_wkt, String dst_wkt, int eResampleAlg, double maxerror) {
        long cPtr = gdalJNI.AutoCreateWarpedVRT__SWIG_0(Dataset.getCPtr(src_ds), src_ds, src_wkt, dst_wkt, eResampleAlg, maxerror);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public static Dataset AutoCreateWarpedVRT(Dataset src_ds, String src_wkt, String dst_wkt, int eResampleAlg) {
        long cPtr = gdalJNI.AutoCreateWarpedVRT__SWIG_1(Dataset.getCPtr(src_ds), src_ds, src_wkt, dst_wkt, eResampleAlg);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public static Dataset AutoCreateWarpedVRT(Dataset src_ds, String src_wkt, String dst_wkt) {
        long cPtr = gdalJNI.AutoCreateWarpedVRT__SWIG_2(Dataset.getCPtr(src_ds), src_ds, src_wkt, dst_wkt);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public static Dataset AutoCreateWarpedVRT(Dataset src_ds, String src_wkt) {
        long cPtr = gdalJNI.AutoCreateWarpedVRT__SWIG_3(Dataset.getCPtr(src_ds), src_ds, src_wkt);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public static Dataset AutoCreateWarpedVRT(Dataset src_ds) {
        long cPtr = gdalJNI.AutoCreateWarpedVRT__SWIG_4(Dataset.getCPtr(src_ds), src_ds);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public static void ApplyGeoTransform(double[] padfGeoTransform, double dfPixel, double dfLine, double[] pdfGeoX, double[] pdfGeoY) {
        gdalJNI.ApplyGeoTransform(padfGeoTransform, dfPixel, dfLine, pdfGeoX, pdfGeoY);
    }

    public static int InvGeoTransform(double[] gt_in, double[] gt_out) {
        return gdalJNI.InvGeoTransform(gt_in, gt_out);
    }

    public static String VersionInfo(String request) {
        return gdalJNI.VersionInfo__SWIG_0(request);
    }

    public static String VersionInfo() {
        return gdalJNI.VersionInfo__SWIG_1();
    }

    public static void AllRegister() {
        gdalJNI.AllRegister();
    }

    public static void GDALDestroyDriverManager() {
        gdalJNI.GDALDestroyDriverManager();
    }

    public static int GetCacheMax() {
        return gdalJNI.GetCacheMax();
    }

    public static void SetCacheMax(int nBytes) {
        gdalJNI.SetCacheMax(nBytes);
    }

    public static int GetCacheUsed() {
        return gdalJNI.GetCacheUsed();
    }

    public static int GetDataTypeSize(int eDataType) {
        return gdalJNI.GetDataTypeSize(eDataType);
    }

    public static int DataTypeIsComplex(int eDataType) {
        return gdalJNI.DataTypeIsComplex(eDataType);
    }

    public static String GetDataTypeName(int eDataType) {
        return gdalJNI.GetDataTypeName(eDataType);
    }

    public static int GetDataTypeByName(String pszDataTypeName) {
        return gdalJNI.GetDataTypeByName(pszDataTypeName);
    }

    public static String GetColorInterpretationName(int eColorInterp) {
        return gdalJNI.GetColorInterpretationName(eColorInterp);
    }

    public static String GetPaletteInterpretationName(int ePaletteInterp) {
        return gdalJNI.GetPaletteInterpretationName(ePaletteInterp);
    }

    public static String DecToDMS(double dfAngle, String pszAxis, int nPrecision) {
        return gdalJNI.DecToDMS__SWIG_0(dfAngle, pszAxis, nPrecision);
    }

    public static String DecToDMS(double dfAngle, String pszAxis) {
        return gdalJNI.DecToDMS__SWIG_1(dfAngle, pszAxis);
    }

    public static double PackedDMSToDec(double dfPacked) {
        return gdalJNI.PackedDMSToDec(dfPacked);
    }

    public static double DecToPackedDMS(double dfDec) {
        return gdalJNI.DecToPackedDMS(dfDec);
    }

    public static XMLNode ParseXMLString(String pszXMLString) {
        long cPtr = gdalJNI.ParseXMLString(pszXMLString);
        return cPtr == 0 ? null : new XMLNode(cPtr, true);
    }

    public static String SerializeXMLTree(XMLNode xmlnode) {
        return gdalJNI.SerializeXMLTree(XMLNode.getCPtr(xmlnode), xmlnode);
    }

    public static int GetDriverCount() {
        return gdalJNI.GetDriverCount();
    }

    public static Driver GetDriverByName(String name) {
        long cPtr = gdalJNI.GetDriverByName(name);
        return cPtr == 0 ? null : new Driver(cPtr, false);
    }

    public static Driver GetDriver(int i) {
        long cPtr = gdalJNI.GetDriver(i);
        return cPtr == 0 ? null : new Driver(cPtr, false);
    }

    public static Dataset Open(String name, int eAccess) {
        long cPtr = gdalJNI.Open__SWIG_0(name, eAccess);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public static Dataset Open(String name) {
        long cPtr = gdalJNI.Open__SWIG_1(name);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public static Dataset OpenShared(String name, int eAccess) {
        long cPtr = gdalJNI.OpenShared__SWIG_0(name, eAccess);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public static Dataset OpenShared(String name) {
        long cPtr = gdalJNI.OpenShared__SWIG_1(name);
        return cPtr == 0 ? null : new Dataset(cPtr, true);
    }

    public static Driver IdentifyDriver(String pszDatasource, Vector papszSiblings) {
        long cPtr = gdalJNI.IdentifyDriver__SWIG_0(pszDatasource, papszSiblings);
        return cPtr == 0 ? null : new Driver(cPtr, false);
    }

    public static Driver IdentifyDriver(String pszDatasource) {
        long cPtr = gdalJNI.IdentifyDriver__SWIG_1(pszDatasource);
        return cPtr == 0 ? null : new Driver(cPtr, false);
    }

    public static Vector GeneralCmdLineProcessor(Vector papszArgv, int nOptions) {
        return gdalJNI.GeneralCmdLineProcessor__SWIG_0(papszArgv, nOptions);
    }

    public static Vector GeneralCmdLineProcessor(Vector papszArgv) {
        return gdalJNI.GeneralCmdLineProcessor__SWIG_1(papszArgv);
    }

}

