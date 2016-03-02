package org.gdal;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests loading of gdal natives.
 * @author Luke Bermingham
 */
public class NativeLoaderTest {

    @Test
    public void testLoadAndDoANativeCall() throws Exception {
        NativeLoader.load();
        Assert.assertTrue(NativeLoader.gdalWorking());
    }
}