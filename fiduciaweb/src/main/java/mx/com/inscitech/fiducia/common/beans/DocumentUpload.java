package mx.com.inscitech.fiducia.common.beans;

import java.time.Instant;

public class DocumentUpload {
    
    private int index = 0;
    private String id = null;
    private boolean mandatory = false;
    private String name = null;
    private boolean exipired = false;
    private String expirationDate = Instant.now().toString();
    
    public DocumentUpload() {
        super();
    }

    public DocumentUpload(int index, String id, boolean mandatory, String name) {
        this.index = index;
        this.id = id;
        this.mandatory = mandatory;
        this.name = name;
    }

    public DocumentUpload(boolean mandatory, String name, boolean exipired, String expirationDate) {
        this.mandatory = mandatory;
        this.name = name;
        this.exipired = exipired;
        this.expirationDate = expirationDate;
    }

    public DocumentUpload(int index, String id, boolean mandatory, String name, boolean exipired, String expirationDate) {
        this.index = index;
        this.id = id;
        this.mandatory = mandatory;
        this.name = name;
        this.exipired = exipired;
        this.expirationDate = expirationDate;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setExipired(boolean exipired) {
        this.exipired = exipired;
    }

    public boolean isExipired() {
        return exipired;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
