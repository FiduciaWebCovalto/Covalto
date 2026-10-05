package mx.com.inscitech.fiducia.domain.base;

public class DMLObject {

    private String sql = null;
    private Object[] parameters = null;

    public DMLObject() {
        super();
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }

    public Object[] getParameters() {
        return parameters;
    }

}
