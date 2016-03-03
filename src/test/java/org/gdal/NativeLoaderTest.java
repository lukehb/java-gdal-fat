package org.gdal;

import org.gdal.gdal.gdalJNI;
import org.gdal.gdalconst.gdalconstJNI;
import org.gdal.ogr.ogrJNI;
import org.gdal.osr.SpatialReference;
import org.gdal.osr.osrJNI;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests loading of gdal natives.
 * @author Luke Bermingham
 */
public class NativeLoaderTest {

    @Test
    public void testLoadAndDoANativeCall() throws Exception {

        Assert.assertTrue(gdalJNI.isAvailable());
        Assert.assertTrue(gdalconstJNI.isAvailable());
        Assert.assertTrue(ogrJNI.isAvailable());
        Assert.assertTrue(osrJNI.isAvailable());

        SpatialReference srs = new SpatialReference();
        String proj4Input = "+proj=longlat +ellps=WGS84 +datum=WGS84 +no_defs".trim();
        srs.ImportFromProj4(proj4Input);
        String proj4Output = srs.ExportToProj4().trim();
        Assert.assertTrue(proj4Input.equals(proj4Output));
    }
}