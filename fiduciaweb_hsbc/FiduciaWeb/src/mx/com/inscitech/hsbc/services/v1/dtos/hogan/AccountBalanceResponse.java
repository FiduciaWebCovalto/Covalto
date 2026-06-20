package mx.com.inscitech.hsbc.services.v1.dtos.hogan;


public class AccountBalanceResponse {

    private ReturnCodes returnCodes;
    private AccountBalance accountBalance;

    public AccountBalanceResponse() {
        super();
    }

    public AccountBalanceResponse(ReturnCodes returnCodes, AccountBalance accountBalance) {
        this.returnCodes = returnCodes;
        this.accountBalance = accountBalance;
    }

    public void setReturnCodes(ReturnCodes returnCodes) {
        this.returnCodes = returnCodes;
    }

    public ReturnCodes getReturnCodes() {
        return returnCodes;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }
}
