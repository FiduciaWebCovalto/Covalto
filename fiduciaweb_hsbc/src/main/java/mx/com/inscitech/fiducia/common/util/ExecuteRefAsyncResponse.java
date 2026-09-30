package mx.com.inscitech.fiducia.common.util;

public class ExecuteRefAsyncResponse {
    
    private boolean succedded = false;
    
    private String message = "";
    private String errorCode = "";
    private String errorMessage = "";    
    
    public ExecuteRefAsyncResponse() {
        super();
    }

    public void setSuccedded(boolean succedded) {
        this.succedded = succedded;
    }

    public boolean getSuccedded() {
        return succedded;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}