public class BankAccounts {
    private String accountName;
    private int accountNumber;
    private String creationDate;
    private double accountBalance;

    // Initialize the BankAccounts instances
    public BankAccounts(String accountName, int accountNumber, String creationDate, double accountBalance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.creationDate = creationDate;
        this.accountBalance = accountBalance;
    }

    // Getter Method
    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    // Setter Method to set the accountBalance and accountName
    /*
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


}
