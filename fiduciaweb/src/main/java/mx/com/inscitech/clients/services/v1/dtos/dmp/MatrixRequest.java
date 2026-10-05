package mx.com.inscitech.clients.services.v1.dtos.dmp;


public class MatrixRequest {

    private Information objectRequest;

    public MatrixRequest() {
        super();
    }

    public MatrixRequest(Information objectRequest) {
        this.objectRequest = objectRequest;
    }

    public void setObjectRequest(Information objectRequest) {
        this.objectRequest = objectRequest;
    }

    public Information getObjectRequest() {
        return objectRequest;
    }
}
