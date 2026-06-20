package mx.com.inscitech.fiducia.procesos;

public class ClientNotFoundException extends Exception {

    public ClientNotFoundException() {
        super();
    }

    public ClientNotFoundException(String description) {
        super(description);
    }

    public ClientNotFoundException(Exception e) {
        super(e);
    }

}
