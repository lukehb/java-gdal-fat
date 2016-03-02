# java-gdal-fat
An unofficial fat (uber) jar for the gdal java bindings that **doesn't** use a custom class loader.

Note: It is the java bindings for gdal 1.7.2.
The way this fat jar works is it is bundled with all the cross platform natives (about 18mb) and it extracts the relevant
native into a temp directory and then loads it.

Grab the uber jar here:

maven
-----
```xml
<dependency>
  <groupId>org.gdal</groupId>
  <artifactId>gdal-fat</artifactId>
  <version>1.7.2</version>
  <type>pom</type>
</dependency>
```

gradle
------
```groovy
compile 'org.gdal:gdal-fat:1.7.2'
```
