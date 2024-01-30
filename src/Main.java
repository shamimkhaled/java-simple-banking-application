//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleBankingApplication s_bank_app = new SimpleBankingApplication("Shamim",123, "30-1-2024", 100);
        // Console Menu Implementation for this Simple Banking Application
        while(true){
            // Console Option
            System.out.println("\n-----Simple Banking Application Console Menu-----");
            System.out.println("1. Create a new account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Update an account");
            System.out.println("4. Delete an account");
            System.out.println("5. Deposit an amount");
            System.out.println("6. Withdraw an amount");
            System.out.println("7. Search for an account");
            System.out.println("8. Exit");
            System.out.println("-----------------------------");

            // Choice option
            System.out.print("Enter your choice between (1-8): ");
            int choice = scanner.nextInt();


            // Switch Operation for all console menu option
            switch (choice) {
                case 1:
                    // Create the Bank Account Option - 1
                    System.out.print("Enter the account holder's name: ");
                    String actName = scanner.next();
                    System.out.print("Enter the account number: ");
                    int actNumber = scanner.nextInt();
                    System.out.print("Enter creation date: ");
                    String creationDate = scanner.next();
                    System.out.print("Enter the account opening balance($100): $");
                    double initActBalance = scanner.nextDouble();

                    s_bank_app.createBankAccount(actName, actNumber, creationDate, initActBalance);
                    break;

                case 2:
                    // Display All Bank Accounts Information Option - 2
                    s_bank_app.displayAllBankAccounts();
                    break;

                case 3:
                    // Update Bank Account Information Option - 3
                    System.out.print("Enter the account number to update: ");
                    int actNumToUpdate = scanner.nextInt();
                    //System.out.print("Enter the new balance: $");
                    //String acctName = scanner.next();
                    System.out.print("Enter the new balance: $");
                    double newBalance = scanner.nextDouble();

                    s_bank_app.updateBankAccount(actNumToUpdate, newBalance);
                    break;

                case 4:
                    // Delete the Bank Account Option - 4
                    System.out.print("Enter the account number to delete: ");
                    int actNumDelete = scanner.nextInt();
                    s_bank_app.deleteBankAccount(actNumDelete);
                    break;

                case 5:
                    // Deposit the Balance Option - 5
                    System.out.print("Enter the account number to deposit into: ");
                    int actNumToDeposit = scanner.nextInt();
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();

                    s_bank_app.depositBalance(actNumToDeposit, depositAmount);
                    break;

                case 6:
                    // Withdraw the Balance Option - 6
                    System.out.print("Enter the account number to withdraw from: ");
                    int actNumToWithdraw = scanner.nextInt();
                    double minBalance = 100;
                    System.out.println("Withdraw the balance to keep minimum balance: $"+minBalance);
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();

                    s_bank_app.withdrawalBalance(actNumToWithdraw, withdrawalAmount, minBalance);
                    break;

                case 7:
                    // Search the Account Information Option - 7
                    System.out.print("Enter account number to search: ");
                    int actToSearch = scanner.nextInt();
                    s_bank_app.searchAccount(actToSearch);
                    break;

                case 8:
                    // Exit Option - 8
                    System.out.println("Exit the application!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }

        }


    }
}