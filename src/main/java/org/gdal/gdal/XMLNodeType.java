/*
 * Decompiled with CFR 0_110.
 */
package org.gdal.gdal;

import org.gdal.gdal.gdalJNI;

public final class XMLNodeType {
    public static final XMLNodeType CXT_Element = new XMLNodeType("CXT_Element", gdalJNI.CXT_Element_get());
    public static final XMLNodeType CXT_Text = new XMLNodeType("CXT_Text", gdalJNI.CXT_Text_get());
    public static final XMLNodeType CXT_Attribute = new XMLNodeType("CXT_Attribute", gdalJNI.CXT_Attribute_get());
    public static final XMLNodeType CXT_Comment = new XMLNodeType("CXT_Comment", gdalJNI.CXT_Comment_get());
    public static final XMLNodeType CXT_Literal = new XMLNodeType("CXT_Literal", gdalJNI.CXT_Literal_get());
    private static XMLNodeType[] swigValues = new XMLNodeType[]{CXT_Element, CXT_Text, CXT_Attribute, CXT_Comment, CXT_Literal};
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static XMLNodeType swigToEnum(int swigValue) {
        if (swigValue < swigValues.length && swigValue >= 0 && XMLNodeType.swigValues[swigValue].swigValue == swigValue) {
            return swigValues[swigValue];
        }
        for (int i = 0; i < swigValues.length; ++i) {
            if (XMLNodeType.swigValues[i].swigValue != swigValue) continue;
            return swigValues[i];
        }
        Class class_ = XMLNodeType.class;
        throw new IllegalArgumentException("No enum " + class_ + " with value " + swigValue);
    }

    private XMLNodeType(String swigName) {
        this.swigName = swigName;
        this.swigValue = swigNext++;
    }

    private XMLNodeType(String swigName, int swigValue) {
        this.swigName = swigName;
        this.swigValue = swigValue;
        swigNext = swigValue + 1;
    }

    private XMLNodeType(String swigName, XMLNodeType swigEnum) {
        this.swigName = swigName;
        this.swigValue = swigEnum.swigValue;
        swigNext = this.swigValue + 1;
    }
}

