package mx.com.inscitech.fiducia.domain.base;

import mx.com.inscitech.fiducia.dml.GenericDML;
import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.dml.vo.DataSet;

import mx.com.inscitech.fiducia.common.FiduciaWebBase;


public abstract class DomainObject extends FiduciaWebBase {

    // TODO: Table comments, Use logging

    protected Integer pkColumns = 0;
    protected boolean retrieveSQL = true;

    private String lastMessage = null;
    private String stackTrace = null;

    public String getStackTrace() {
        return stackTrace;
    }
    
    public String getLastMessage() {
        return lastMessage;
    }

    public DomainObject() {
        super();
    }

    //public abstract boolean doInsertSeq();
    //public abstract boolean retrieveAndUpdate(Object retrieveInfo);
    //public abstract boolean doUpdateFromObject();

    public abstract Object selectAsObject();

    public abstract boolean doCompare(Object compareWith);

    public abstract boolean validate();

    public abstract DMLObject getSelect();

    public abstract DMLObject getSelectByPK();

    public abstract DMLObject getInsert();

    public abstract DMLObject getUpdate();

    public abstract DMLObject getDelete();

    public DataRow selectAsDataRow() {
        DataRow result = null;
        DMLObject dmlData = null;

        dmlData = this.getSelectByPK();
        GenericDML genericDML = new GenericDML();

        result = genericDML.getDataRow(dmlData.getSql(), dmlData.getParameters());

        return result;
    }

    public DataSet selectAsDataSet() {
        DataSet result = null;

        DMLObject dmlData = null;
        dmlData = this.getSelect();

        GenericDML genericDML = new GenericDML();

        result = genericDML.getDataSet(dmlData.getSql(), dmlData.getParameters());

        genericDML = null;

        return result;
    }

    public boolean doInsert() {
        boolean result = false;

        DMLObject dmlData = null;
        dmlData = this.getInsert();

        GenericDML genericDML = new GenericDML();

        result = genericDML.executeUpdate(dmlData.getSql(), dmlData.getParameters());
        lastMessage = genericDML.getLastMessage();
        
        genericDML = null;

        return result;
    }

    public boolean doDelete() {
        boolean result = false;

        DMLObject dmlData = null;
        dmlData = this.getDelete();

        GenericDML genericDML = new GenericDML();

        result = genericDML.executeUpdate(dmlData.getSql(), dmlData.getParameters());
        lastMessage = genericDML.getLastMessage();
        
        genericDML = null;

        return result;
    }

    public boolean doUpdate() {
        boolean result = false;

        DMLObject dmlData = null;
        dmlData = this.getUpdate();

        GenericDML genericDML = new GenericDML();

        result = genericDML.executeUpdate(dmlData.getSql(), dmlData.getParameters());
        lastMessage = genericDML.getLastMessage();

        genericDML = null;

        return result;
    }

    protected Long retrieveSequence(String sequenceName) {
        Long sequenceValue = 0L;
        String possibleSequences = "|MAX|MANUAL|AUTO|";
        String sql = "";

        switch (possibleSequences.indexOf(sequenceName)) {
        case 1:
            sql = "SELECT MAX(CAMPO) AS SECUENCIA_VALUE FROM TABLA";
            break;
        case 5:
            sql = "";
            break;
        case 12:
            sql = "";
            break;
        default:
            sql = "SELECT " + sequenceName + ".NEXTVAL() AS SECUENCIA_VALUE FROM DUAL";
        }

        return sequenceValue;
    }

}
