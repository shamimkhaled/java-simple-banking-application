import java.util.ArrayList;

public class SimpleBankingApplication extends BankAccounts {
    private final ArrayList<SimpleBankingApplication> accountList;

    // Initialize the SimpleBankingApplication instances
    public SimpleBankingApplication(String accountName, int accountNumber, String creationDate, double accountBalance){
        super(accountName, accountNumber, creationDate, accountBalance);
        this.accountList = new ArrayList<SimpleBankingApplication>();
    }

    // Create the Bank Account Method - 1
    public void createBankAccount(String accountName, int accountNumber, String creationDate, double accountBalance) {
        // Create the SimpleBankingApplication class object
        SimpleBankingApplication account = new SimpleBankingApplication(accountName, accountNumber, creationDate, accountBalance);

        if (accountBalance < 100){
            System.out.println("Sorry, $100 minimum balance to open the account.");
        }
        else {
            accountList.add(account);
            System.out.println("Bank Account created successfully!");
        }
    }

    // Display the all bank accounts - 2
    public void displayAllBankAccounts() {
        int i = 1;
        for (SimpleBankingApplication account : accountList) {
            System.out.println(i+". Account Name: " + account.getAccountName() +
                    ", Account Number: " + account.getAccountNumber() +
                    ", Account Creation Date: " + account.getCreationDate() +
                    ", Account Balance: $" + account.getAccountBalance());
            i++;
        }
    }

    // Update the bank account balance - 3
    // String accountName,
    public void updateBankAccount(int accountNumber, double newBalance) {
        for (SimpleBankingApplication account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                //account.setAccountName(accountName);
                account.setAccountBalance(newBalance);
                System.out.println("Bank Account updated successfully!");
                return;
            }
        }
        System.out.println("Account Not Found or Not Exists!");
    }

    // Delete the bank account - 4
    public void deleteBankAccount(int accountNumber) {
        accountList.removeIf(account -> account.getAccountNumber() == accountNumber);
        System.out.println("Bank Account deleted successfully!");
    }

    // Create Deposit Balance method - 5
    public void depositBalance(int accountNumber, double amount) {
        for (SimpleBankingApplication account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                account.setAccountBalance(account.getAccountBalance() + amount);
                System.out.println("Deposited balance successfully!");
                return;
            }
        }
        System.out.println("Account Not Found or Not Exists!!");
    }

    // Create Withdraw Balance Method - 6
    public void withdrawalBalance(int accountNumber, double amount, double minimumBalance) {
        for (SimpleBankingApplication account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                if (account.getAccountBalance() - amount >= minimumBalance) {
                    account.setAccountBalance(account.getAccountBalance() - amount);
                    System.out.println("Balance withdrawn successfully!");
                } else {
                    System.out.println("Insufficient balance to withdraw!");
                }
                return;
            }
        }
        System.out.println("Account Not Found or Not Exists!");
    }

    // Search the account information based on account number
    public void searchAccount(int accountNumber) {
        for (SimpleBankingApplication account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println("Account Name: " + account.getAccountName() +
                        ", Account Number: " + account.getAccountNumber() +
                        ", Account Creation Date: " + account.getCreationDate() +
                        ", Account Balance: $" + account.getAccountBalance());
                return;
            }
        }
        System.out.println("Account Not Found or Not Exists!!");
    }




}





