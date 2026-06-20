package mx.com.inscitech.fiducia.common.export.txt;

import java.util.Arrays;


public class TxtDataStructure {

    private static final String LONG_STRING = "                                                                                                       ";

    private String fillWith = "";
    private String fieldName = "";
    private String fieldFormat = ""; //To uppercase, to date, add info, decimal, special numbers
    private String fieldType = "";
    private String simpleFormat = "";
    private DataTransfomer transformer = null;
    private int fieldSize = 0;

    public TxtDataStructure() {
        super();
    }

    public TxtDataStructure(DataTransfomer transformer) {
        this.transformer = transformer;
    }

    public TxtDataStructure(String fieldName, String fieldFormat, String fieldType, int fieldSize) {
        this.fieldName = fieldName;
        this.fieldFormat = fieldFormat;
        this.fieldType = fieldType;
        this.fieldSize = fieldSize;
    }

    public TxtDataStructure(String fieldName, String fieldFormat, String fieldType, int fieldSize, String simpleFormat) {
        this.fieldName = fieldName;
        this.fieldFormat = fieldFormat;
        this.fieldType = fieldType;
        this.fieldSize = fieldSize;
        this.simpleFormat = simpleFormat;
    }

    public TxtDataStructure(String fieldName, String fieldFormat, String fieldType, int fieldSize, DataTransfomer transformer) {
        this.fieldName = fieldName;
        this.fieldFormat = fieldFormat;
        this.fieldType = fieldType;
        this.fieldSize = fieldSize;
        this.transformer = transformer;
    }

    public TxtDataStructure(String fieldName, String fieldFormat, String fieldType, int fieldSize, String simpleFormat, DataTransfomer transformer) {
        this.fieldName = fieldName;
        this.fieldFormat = fieldFormat;
        this.fieldType = fieldType;
        this.fieldSize = fieldSize;
        this.simpleFormat = simpleFormat;
        this.transformer = transformer;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldFormat(String fieldFormat) {
        this.fieldFormat = fieldFormat;
    }

    public String getFieldFormat() {
        return fieldFormat;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setSimpleFormat(String simpleFormat) {
        this.simpleFormat = simpleFormat;
    }

    public String getSimpleFormat() {
        return simpleFormat;
    }

    public void setTransformer(DataTransfomer transformer) {
        this.transformer = transformer;
    }

    public DataTransfomer getTransformer() {
        return transformer;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFillWith(String fillWith) {
        this.fillWith = fillWith;
    }

    public String getFillWith() {
        return fillWith;
    }

    public String getValue(String value) {
        if (transformer != null)
            return transformer.doTransform(value);
        if (value == null || "null".equals(value))
            return "";

        if (!"".equals(simpleFormat)) {
            value = String.format(simpleFormat, value);
        }

        String tmpLongString = LONG_STRING;
        if (!"".equals(fillWith)) {
            tmpLongString = LONG_STRING.replace(" ", fillWith);
        }

        if (fieldSize > 0) {
            value = (value + tmpLongString).substring(0, fieldSize);
        }

        return value;
    }

    public String getValue(String[] values) {
        if (transformer != null)
            return transformer.doTransform(values);
        if (values == null || values.length <= 0)
            return "";

        if (!"".equals(simpleFormat)) {
            return String.format(simpleFormat, Arrays.asList(values));
        }

        String newValue = "";
        for (String s : values) {
            newValue += s;
        }

        if (fieldSize > 0) {
            newValue = (newValue + LONG_STRING).substring(0, fieldSize);
        }

        return newValue;
    }
}
