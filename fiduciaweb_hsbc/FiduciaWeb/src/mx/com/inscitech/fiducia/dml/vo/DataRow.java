package mx.com.inscitech.fiducia.dml.vo;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DataRow implements Serializable {

    @SuppressWarnings("compatibility:1235470106920307740")
    private static final long serialVersionUID = 2490982374418435141L;

    private Map dataRow;
    private ArrayList<String> fields;

    public DataRow() {
        dataRow = Collections.synchronizedMap(new HashMap<String, Object>());
        fields = new ArrayList<>();
    }

    public void addData(String key, Object value) {
        dataRow.put(key, value);
        fields.add(key);
    }

    public void removeData(String key, Object value) {
        dataRow.remove(value);
        fields.remove(key);
    }

    public Object getData(String key) {
        return dataRow.get(key);
    }

    public String getString(String key) {
        return getString(key, null);
    }

    public Integer getInteger(String key) {
        return getInteger(key, null);
    }

    public String getString(String key, String defaultValue) {
        return dataRow.get(key) == null ? defaultValue : "" + dataRow.get(key);
    }

    public Integer getInteger(String key, Integer defaultValue) {
        Integer result = defaultValue;
        Object theValue = null;

        if (dataRow.get(key) != null) {
            theValue = dataRow.get(key);
            if (theValue instanceof Integer) {
                result = (Integer) theValue;
            } else {
                result = Integer.parseInt("" + theValue);
            }
        }

        return result;
    }

    public int getFieldCount() {
        return fields.size();
    }

    public ArrayList<String> getFieldNames() {
        return fields;
    }

    public void close() {
        if (dataRow != null)
            dataRow.clear();
        if (fields != null)
            fields.clear();

        dataRow = null;
        fields = null;
    }
}
