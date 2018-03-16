open module org.gdal{
    requires java.desktop;
    requires java.logging;
    exports org.gdal;
    exports org.gdal.gdal;
    exports org.gdal.gdalconst;
    exports org.gdal.ogr;
    exports org.gdal.osr;
}
