package org.gdal;

import org.gdal.gdal.gdalJNI;
import org.gdal.gdalconst.gdalconstJNI;
import org.gdal.ogr.ogrJNI;
import org.gdal.osr.osrJNI;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Logger;

/**
 * Extracts the relevant native from the resources folder into a temp folder and then
 * uses System.loadLibrary() to load that native.
 * @author Luke Bermingham
 */
public final class NativeLoader {

    private static final String windows32Native = "gdal32.dll";
    private static final String windows64Native = "gdal64.dll";
    private static final String nix32Native = "gdal32.so";
    private static final String nix64Native = "gdal64.so";
    private static final String osxNative = "gdal.jnilib";
    private static final Logger logger = Logger.getLogger(NativeLoader.class.getSimpleName());

    private NativeLoader(){}


    public static void main(String[] args){
        load();
        logger.info("Gdal is available: " + gdalJNI.isAvailable());
        logger.info("GdalConst is available: " + gdalconstJNI.isAvailable());
        logger.info("Ogr is available: " + ogrJNI.isAvailable());
        logger.info("Osr is available: " + osrJNI.isAvailable());
    }

    public static boolean load(){
        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")){
            return extractNativeAndLoad(osxNative);
        }
        else{
            boolean is32bit = is32bitArchitecture();
            boolean isWindows = (osName.contains("windows"));
            if(isWindows){
                return extractNativeAndLoad(is32bit ? windows32Native : windows64Native);
            }
            else{
                return extractNativeAndLoad(is32bit ? nix32Native : nix64Native);
            }
        }
    }

    private static boolean extractNativeAndLoad(String nativeName){
        logger.info("Going to try to load: " + nativeName);
        String tmpPath = System.getProperty("java.io.tmpdir");

        File nativeFileInTemp = new File(new File(tmpPath), nativeName);

        if(nativeFileInTemp.exists()){
            logger.info("Native found at: " + nativeFileInTemp.getAbsolutePath());
            return actualNativeLoad(nativeFileInTemp);
        }
        else{
            String nativeResource = "natives/" + nativeName;
            URL nativeUrl = Thread.currentThread().getContextClassLoader().getResource(nativeResource);
            if(nativeUrl != null){
                try {
                    //create temp file
                    if(nativeFileInTemp.createNewFile()){
                        File nativeFile = new File(nativeUrl.toURI());

                        //copy native file contents into temp file
                        Files.copy(
                                nativeFile.toPath(),
                                nativeFileInTemp.toPath(),
                                StandardCopyOption.REPLACE_EXISTING,
                                StandardCopyOption.COPY_ATTRIBUTES);

                        logger.info("Native file copied into: " + nativeFileInTemp.getAbsolutePath());
                        return actualNativeLoad(nativeFileInTemp);
                    }
                    else{
                        logger.warning("Could not create temp file: " + nativeFileInTemp.getAbsolutePath());
                    }
                } catch (Exception e) {
                    logger.warning("Could not copy file: " + e.getMessage());
                }
            }else{
                logger.warning("Could not find native file URL for getResource(" + nativeResource + ")");
            }
        }
        return false;
    }

    private static boolean actualNativeLoad(File nativeFileInTemp){
        if(nativeFileInTemp != null && nativeFileInTemp.exists()){
            try{
                System.load(nativeFileInTemp.getAbsolutePath());
                logger.info("Loaded native: " + nativeFileInTemp.getAbsolutePath());
                return true;
            }catch(Exception e){
                logger.warning("Could not load native: " + e.getMessage());
            }
        }
        return false;
    }

    private static boolean is32bitArchitecture()
    {
        String arch = System.getProperty("sun.arch.data.model");
        if(arch == null || arch.equals("")){
            // GNU JAVA does not return "sun.arch.data.model"
            return "x86".equals(System.getProperty("os.arch"));
        }
        else{
            return ("32".equals(arch));
        }
    }


}
