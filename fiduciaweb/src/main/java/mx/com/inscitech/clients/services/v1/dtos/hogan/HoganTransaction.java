package mx.com.inscitech.clients.services.v1.dtos.hogan;


public class HoganTransaction {
    
    //TODO: Add java validation annotations?
    private String description; // Transaction description length: 42 Requiered: true
    private String date; // To be confirmed if has to be sent or not length: 5 Requiered: true
    private String time; // To be confirmed if has to be sent or not length: 7 Requiered: true
    private String amount; // Transaction amount length: 15 Requiered: true
    private String sourceAccount; // Source account length: 25 Requiered: true
    private String destinationAccount; // Destination account length: 25 Requiered: true
    
    public HoganTransaction() {
        super();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }
}
