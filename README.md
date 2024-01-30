# Java - Simple Banking Console Application Documentation
## Overview
This is a console-based simple banking application implemented in Java. The application allows users to perform various banking operations such as creating a new account, displaying all accounts, updating an account, deleting an account, depositing and withdrawing amounts, searching for an account, and exiting the application.

## Classes
### BankAccounts.java Class
#### Attributes:

- accountName (String): Represents the account holder's name.
- accountNumber (int): Represents the unique account number.
- creationDate (String): Represents the date when the account was created.
- accountBalance (double): Represents the current balance of the account.

#### Methods:
- BankAccounts(): Constructor of the class
- getAccountName(): Returns the account holder's name.
- getAccountNumber(): Returns the account number.
- getCreationDate(): Returns the creation date of the account.
- getAccountBalance(): Returns the current balance of the account.
- setAccountBalance(double balance): Sets the balance of the account.

### SimpleBankingApplication.java Class
Inherits From: BankAccounts Class

#### Attributes:
accountList (ArrayList of SimpleBankingApplication): Represents a collection of bank accounts.

#### Methods:
- createBankAccount(String name, int accountNumber, String creationDate, double initialBalance): Creates a new bank account and adds it to the collection.
- displayAllBankAccounts(): Displays information for all accounts in the collection.
- updateBankAccount(int accountNumber, double newBalance): Updates the balance of a specific account.
- deleteBankAccount(int accountNumber): Deletes a specific account from the collection.
- depositBalance(int accountNumber, double amount): Deposits an amount into a specific account.
- withdrawalBalance(int accountNumber, double amount, double minimumBalance): Withdraws an amount from a specific account if the balance is sufficient.
- searchAccount(int accountNumber): Searches for and displays information about a specific account.
### Main.java Class
- Contains the main method where the application execution starts.
- Implements the user interface and menu system for interacting with the banking functionalities.
#### Usage
- Creating a New Account: Choose option 1 from the menu. Enter account holder's name, account number, creation date, and initial balance.
- Displaying All Accounts: Choose option 2 from the menu.

- Updating an Account: Choose option 3 from the menu. Enter the account number to update. Enter the new balance.

- Deleting an Account: Choose option 4 from the menu. Enter the account number to delete.

- Depositing an Amount: Choose option 5 from the menu. Enter the account number to deposit into. Enter the deposit amount.

- Withdrawing an Amount: Choose option 6 from the menu. Enter the account number to withdraw from. Enter the withdrawal amount and the minimum balance.

- Searching for an Account: Choose option 7 from the menu. Enter the account number to search.

- Exiting the Application: Choose option 8 from the menu.
### Notes
- Minimum balance constraints are implemented for withdrawal operations.
- No database is used; account data is stored in an in-memory ArrayList.
- The application runs in an infinite loop until the user chooses to exit.
## Color Reference

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
| Example Color | ![#0a192f](https://via.placeholder.com/10/0a192f?text=+) #0a192f |
| Example Color | ![#f8f8f8](https://via.placeholder.com/10/f8f8f8?text=+) #f8f8f8 |
| Example Color | ![#00b48a](https://via.placeholder.com/10/00b48a?text=+) #00b48a |
| Example Color | ![#00d1a0](https://via.placeholder.com/10/00b48a?text=+) #00d1a0 |


## Authors

- [@shamimkhaled](https://www.github.com/shamimkhaled)

