package B2Classes.Example;

public class Account {

    private int number;
    private double balance;

    public Account(int number, double balance) {
        setNumber(number);
        setBalance(balance);
    }



    //gettes and setter
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                '}';
    }
}
