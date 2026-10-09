package mx.com.inscitech.clients.domain;



public class Claves {
    
    public Long cveNumClave;

    
    public Long cveNumSecClave;

    public Claves() {

    }
    
    public Long getCveNumClave() {
        return cveNumClave;
    }

    public void setCveNumClave(final Long cveNumClave) {
        this.cveNumClave = cveNumClave;
    }

    public Long getCveNumSecClave() {
        return cveNumSecClave;
    }

    public void setCveNumSecClave(final Long cveNumSecClave) {
        this.cveNumSecClave = cveNumSecClave;
    }

    @Override
    public String toString() {
        return  this.cveNumSecClave+"-"+this.cveNumSecClave;
    }
}
