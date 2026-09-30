package mx.com.inscitech.fiducia.procesos;

public class ProcessFailureException extends Exception {

    public ProcessFailureException() {
        super();
    }

    public ProcessFailureException(String description) {
        super(description);
    }

    public ProcessFailureException(Exception e) {
        super(e);
    }

}
