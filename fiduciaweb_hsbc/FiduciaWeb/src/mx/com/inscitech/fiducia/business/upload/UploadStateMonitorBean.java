package mx.com.inscitech.fiducia.business.upload;


public class UploadStateMonitorBean {
    
    private int processID = 0;
    
    private boolean started = false;
    private boolean finished = false;
    private boolean succeeded = false;
    
    private int percent = 0; 
    private long totalRecords = 0;
    
    private String startedAt = "00:00:00";
    private String endedAt = "00:00:00";
    private String elapsedTime = "0s";
    private String outputMessage = "No Message";
    
    public UploadStateMonitorBean() {
        super();
    }

    public void setProcessID(int processID) {
        this.processID = processID;
    }

    public int getProcessID() {
        return processID;
    }

    public void setOutputMessage(String outputMessage) {
        this.outputMessage = outputMessage;
    }

    public String getOutputMessage() {
        return outputMessage;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public boolean getStarted() {
        return started;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public boolean getSucceeded() {
        return succeeded;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean getFinished() {
        return finished;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public long getTotalRecords() {
        return totalRecords;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setEndedAt(String endedAt) {
        this.endedAt = endedAt;
    }

    public String getEndedAt() {
        return endedAt;
    }
}
