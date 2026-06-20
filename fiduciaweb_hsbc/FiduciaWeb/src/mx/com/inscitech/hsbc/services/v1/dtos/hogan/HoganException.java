package mx.com.inscitech.hsbc.services.v1.dtos.hogan;

import java.util.List;

public class HoganException {

    private String correlationId;
    private String exceptionCode;
    private String timeStamp;
    private String message;
    private List<String> causes;
    private List<HoganException> exceptionStack;

    public HoganException() {
        super();
    }

    public HoganException(String correlationId, String exceptionCode, String timeStamp, String message, List<String> causes, List<HoganException> exceptionStack) {
        this.correlationId = correlationId;
        this.exceptionCode = exceptionCode;
        this.timeStamp = timeStamp;
        this.message = message;
        this.causes = causes;
        this.exceptionStack = exceptionStack;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setCauses(List<String> causes) {
        this.causes = causes;
    }

    public List<String> getCauses() {
        return causes;
    }

    public void setExceptionStack(List<HoganException> exceptionStack) {
        this.exceptionStack = exceptionStack;
    }

    public List<HoganException> getExceptionStack() {
        return exceptionStack;
    }
}
