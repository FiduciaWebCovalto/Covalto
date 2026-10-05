package mx.com.inscitech.fiducia.common.beans;


/**
 * Clase que permite describir parametros que se le pasaran a los querys a ejecutar
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ParametroQueryBean {

    // TODO: Agregar una propiedad para especificar el formato

    /**
     * Variable para almacenar el nombre con el cual se hara la busqueda en el request
     * para obtener el valor
     */
    private String name;

    /**
     * Nombre de la variable en el SQL
     */
    private String sqlName;

    /**
     * Tipo de clausula a usar
     */
    private String clauseType; // AND, OR

    /**
     * Condicion que se usara
     */
    private String conditionType; // =, <, >, <>, like, not like, in, not in

    /**
     * En dado caso de que el parametro sea para ordenamiento, se tomara el valor de esta propiedad
     */
    private String orderClause;

    /**
     * Indica si el parametro es para ordenamiento
     */
    private boolean order = false;

    /**
     * Indica si el parametro es de salida
     */
    private boolean out = false;

    /**
     * En dado caso de que el parametro sea para agrupamiento, se tomara el valor de esta propiedad
     */
    private String groupClause;

    /**
     * Indica si el parametro es para ordenamiento
     */
    private boolean group;

    /**
     * Indica el tipo de parametro, usado para parametros de salida
     */
    private String type;

    /**
     * Variable en la que se almacena el indice de un parametro en caso de ser de salida.
     * Esta variable es de uso interno
     */
    private int index;

    /**
     * Variable para almacenar el patron de conversion en caso de ser necesario.
     */
    private String pattern;


    /**
     * Variable en la que se almacena el valor del parametro.
     */
    private Object value;

    private boolean buildSQL = true;
    
    /**
     * Constructor por default, todos los parametros son nulos order es false al igual que out
     */
    public ParametroQueryBean() {
    }

    /**
     * Constructor que permite hacer set a todos los parametros
     */
    public ParametroQueryBean(String name, String sqlName, String clauseType, String conditionType, String orderClause, boolean order, boolean out, String groupClause,
                              boolean group, String type, int index, String pattern, Object value, boolean buildSQL) {
        this.name = name;
        this.sqlName = sqlName;
        this.clauseType = clauseType;
        this.conditionType = conditionType;
        this.orderClause = orderClause;
        this.order = order;
        this.out = out;
        this.groupClause = groupClause;
        this.group = group;
        this.type = type;
        this.index = index;
        this.pattern = pattern;
        this.value = value;
        this.buildSQL = buildSQL;
    }

    public ParametroQueryBean(String name, String type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public ParametroQueryBean(String name, String type, Object value, boolean out) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.out = out;
    }

    public ParametroQueryBean(String name, String type, Object value, boolean out, String pattern) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.out = out;
        this.pattern = pattern;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }


    public String getSqlName() {
        return sqlName;
    }


    public void setClauseType(String clauseType) {
        this.clauseType = clauseType;
    }


    public String getClauseType() {
        return clauseType;
    }


    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }


    public String getConditionType() {
        return conditionType;
    }


    public void setOrderClause(String orderClause) {
        this.orderClause = orderClause;
    }


    public String getOrderClause() {
        return orderClause;
    }


    public void setOrder(boolean order) {
        this.order = order;
    }


    public boolean isOrder() {
        return order;
    }


    public void setGroupClause(String groupClause) {
        this.groupClause = groupClause;
    }


    public void setOut(boolean out) {
        this.out = out;
    }


    public boolean isOut() {
        return out;
    }


    public String getGroupClause() {
        return groupClause;
    }


    public void setGroup(boolean group) {
        this.group = group;
    }


    public boolean isGroup() {
        return group;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getType() {
        return type;
    }


    public void setIndex(int index) {
        this.index = index;
    }


    public int getIndex() {
        return index;
    }


    public void setPattern(String pattern) {
        this.pattern = pattern;
    }


    public String getPattern() {
        return pattern;
    }


    public void setValue(Object value) {
        this.value = value;
    }


    public Object getValue() {
        return value;
    }

    public void setBuildSQL(boolean buildSQL) {
        this.buildSQL = buildSQL;
    }

    public boolean isBuildSQL() {
        return buildSQL;
    }
}
