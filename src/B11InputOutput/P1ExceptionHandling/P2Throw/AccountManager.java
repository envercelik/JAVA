package B11InputOutput.P1ExceptionHandling.P2Throw;

public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {
        if (getBalance() >= amount) {
            balance = getBalance() - amount;
        }else {
            throw new BalanceInsufficentException("Yetersiz bakiye");
        }

    }

    public double getBalance() {
        return balance;
    }


}
