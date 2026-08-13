class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BAccount {
    double balance = 1000;

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } 
        else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        }
    }
}

public class InsufficientBalanceDemo {

    public static void main(String[] args) {

        BAccount account = new BAccount();

        try {
            account.withdraw(1500);
        } 
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}