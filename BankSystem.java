class BankAccount {
   
    int accountNumber;
    String accountHolderName;
    double balance;

    static int totalAccounts = 0;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }
}

public class BankSystem {
    public static void main(String[] args) {

 
        BankAccount acc1 = new BankAccount(11, "A", 5000);
        BankAccount acc2 = new BankAccount(12, "B", 3000);

        acc1.deposit(1500);
        acc1.withdraw(2000);

       
        acc2.deposit(500);
        acc2.withdraw(4000); 

        System.out.println("\nFinal Account Details:");
        acc1.displayBalance();
        acc2.displayBalance();

        System.out.println("Total Bank Accounts Created: " + BankAccount.totalAccounts);
    }
}