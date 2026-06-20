package mx.com.inscitech.fiducia.domain.construct;

public class ColumnInfo {

    private String tableName = null;
    private String propertyName = null;
    private String databaseColumn = null;
    private String javaClass = null;
    private String dataType = null;
    private String getter = null;
    private String setter = null;
    private String defaultValue = null;
    private String sequence = null;
    private String dateFormat = null;

    private boolean nullable = false;
    private boolean date = false;
    private boolean primaryKey = false;

    public ColumnInfo() {
        super();
    }

    public ColumnInfo(String tableName, String propertyName, String databaseColumn, String javaClass, String dataType, String getter, String setter, String defaultValue,
                      String sequence, String dateFormat, boolean nullable, boolean date) {
        super();

        this.tableName = tableName;
        this.propertyName = propertyName;
        this.databaseColumn = databaseColumn;
        this.javaClass = javaClass;
        this.dataType = dataType;
        this.getter = getter;
        this.setter = setter;
        this.defaultValue = defaultValue;
        this.sequence = sequence;
        this.dateFormat = dateFormat;
        this.nullable = nullable;
        this.date = date;
    }

    public ColumnInfo(String tableName, String propertyName, String databaseColumn, String javaClass, String dataType, String getter, String setter) {
        super();

        this.tableName = tableName;
        this.propertyName = propertyName;
        this.databaseColumn = databaseColumn;
        this.javaClass = javaClass;
        this.dataType = dataType;
        this.getter = getter;
        this.setter = setter;
    }

    public ColumnInfo(String tableName, String propertyName, String databaseColumn, boolean primaryKey) {
        super();

        this.tableName = tableName;
        this.propertyName = propertyName;
        this.databaseColumn = databaseColumn;
        this.primaryKey = primaryKey;
    }

    public ColumnInfo(String tableName, String propertyName) {
        super();

        this.tableName = tableName;
        this.propertyName = propertyName;
    }

    public ColumnInfo(String tableName) {
        super();

        this.tableName = tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setDatabaseColumn(String databaseColumn) {
        this.databaseColumn = databaseColumn;
    }

    public String getDatabaseColumn() {
        return databaseColumn;
    }

    public void setJavaClass(String javaClass) {
        this.javaClass = javaClass;
    }

    public String getJavaClass() {
        return javaClass;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataType() {
        return dataType;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getGetter() {
        return getter;
    }

    public void setSetter(String setter) {
        this.setter = setter;
    }

    public String getSetter() {
        return setter;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDate(boolean date) {
        this.date = date;
    }

    public boolean isDate() {
        return date;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

}
