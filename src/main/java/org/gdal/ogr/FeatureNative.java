/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.ogr;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.gdal.ogr.Feature;
import org.gdal.ogr.ogrJNI;

class FeatureNative
extends WeakReference {
    private long swigCPtr;
    private static ReferenceQueue refQueue = new ReferenceQueue();
    private static Set refList = Collections.synchronizedSet(new HashSet());
    private static Thread cleanupThread = null;

    public FeatureNative(Feature javaObject, long cPtr) {
        super(javaObject, refQueue);
        if (cleanupThread == null) {
            FeatureNative nativeObject;
            while ((nativeObject = (FeatureNative)refQueue.poll()) != null) {
                nativeObject.delete();
            }
        }
        refList.add(this);
        this.swigCPtr = cPtr;
    }

    public void dontDisposeNativeResources() {
        refList.remove(this);
        this.swigCPtr = 0;
    }

    public void delete() {
        refList.remove(this);
        if (this.swigCPtr != 0) {
            ogrJNI.delete_Feature(this.swigCPtr);
        }
        this.swigCPtr = 0;
    }

    static {
        cleanupThread = new Thread(){

            public void run() {
                do {
                    try {
                        do {
                            FeatureNative nativeObject;
                            if ((nativeObject = (FeatureNative)refQueue.remove()) == null) {
                                continue;
                            }
                            nativeObject.delete();
                        } while (true);
                    }
                    catch (InterruptedException ie) {
                        continue;
                    }
                } while (true);
            }
        };
        try {
            cleanupThread.setName("FeatureNativeObjectsCleaner");
            cleanupThread.setDaemon(true);
            cleanupThread.start();
        }
        catch (SecurityException se) {
            cleanupThread = null;
        }
    }

}

