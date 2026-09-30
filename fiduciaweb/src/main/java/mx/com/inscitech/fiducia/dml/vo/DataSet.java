package mx.com.inscitech.fiducia.dml.vo;

import java.io.Serializable;

import java.util.ArrayList;

public class DataSet implements Serializable {

    @SuppressWarnings("compatibility:-9190437407084213538")
    private static final long serialVersionUID = -297451674153789474L;

    private boolean onError;
    private String errorMessage;
    private int sqlErrorCode;
    private Exception theException;

    private ArrayList<DataRow> arDatos;
    private String strOrderByFields;

    public DataSet() {
        onError = false;
        arDatos = new ArrayList<>();
    }

    public int getRowCount() {
        return arDatos.size();
    }

    public void addRow(DataRow row) {
        arDatos.add(row);
    }

    public DataRow getRow(int id) {
        return arDatos.get(id);
    }

    public ArrayList<DataRow> getRows() {
        return arDatos;
    }

    public void removeRow(int id) {
        arDatos.remove(id);
    }

    public String getOrderByFields() {
        return strOrderByFields;
    }

    public void setOrderByFields(String strOrderByFields) {
        this.strOrderByFields = strOrderByFields;
    }

    /** TODO: No sirve para muchos registros, todos los datos se presentan como String **/
    public String toJSON() {
        String result = "";
        DataRow row = null;
        ArrayList<String> fieldNames = null;

        if (arDatos.size() <= 0) {
            result = "[]";
        } else {
            result = "[";
            for (int i = 0; i < arDatos.size(); i++) {
                row = arDatos.get(i);
                if (fieldNames == null) {
                    fieldNames = row.getFieldNames();
                }

                result += "{";

                for (int j = 0; j < fieldNames.size(); j++) {
                    result += "\"" + fieldNames.get(j) + "\":\"" + row.getData(fieldNames.get(j)) + "\"";
                    if (j != fieldNames.size() - 1)
                        result += ",";
                }

                result += ",\"ROWNUM\":" + i + "}";
                if (i != arDatos.size() - 1)
                    result += ",";
            }
            result += "]";
        }

        return result;
    }

    public void close() {
        for (int i = 0; i < arDatos.size(); i++) {
            (arDatos.get(i)).close();
        }

        arDatos.clear();
        arDatos = null;
    }


    public void setOnError(boolean onError) {
        this.onError = onError;
    }


    public boolean isOnError() {
        return onError;
    }


    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    public String getErrorMessage() {
        return errorMessage;
    }


    public void setTheException(Exception theException) {
        this.theException = theException;
    }


    public Exception getTheException() {
        return theException;
    }


    public void setSqlErrorCode(int sqlErrorCode) {
        this.sqlErrorCode = sqlErrorCode;
    }


    public int getSqlErrorCode() {
        return sqlErrorCode;
    }
}
