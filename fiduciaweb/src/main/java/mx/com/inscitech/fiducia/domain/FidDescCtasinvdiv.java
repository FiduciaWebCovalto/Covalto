package mx.com.inscitech.fiducia.domain;


import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FID_DESC_CTASINVDIV_PK", columns = { "FDC_CONTRATO", "FDC_CLAVE_INV", "FDC_SECUENCIAL", "FDC_FEC_OPER" }, sequences = { "MANUAL" })
public class FidDescCtasinvdiv extends DomainObject {


    public FidDescCtasinvdiv() {
        super();
        this.pkColumns = 4;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_DESC_CTASINVDIV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getSelect() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_DESC_CTASINVDIV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE FID_DESC_CTASINVDIV SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        for (int i = 0; i < pkValues.size(); i++) {
            values.add(pkValues.get(i));
        }
        ;

        fields = fields.substring(0, fields.length() - 2).trim();
        conditions = conditions.substring(4).trim();
        sql += fields + " WHERE " + conditions;
        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getInsert() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO FID_DESC_CTASINVDIV ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FID_DESC_CTASINVDIV WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FidDescCtasinvdiv instance = (FidDescCtasinvdiv) compareWith;
        boolean equalObjects = true;
        return equalObjects;
    }

    public Object selectAsObject() {
        FidDescCtasinvdiv result = new FidDescCtasinvdiv();
        DataRow objectData = null;
        objectData = selectAsDataRow();


        return result;

    }

}
