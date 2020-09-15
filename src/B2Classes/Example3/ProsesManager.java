package B2Classes.Example3;

public class ProsesManager {


    public static void deposit (Account account , double depositAmount) {


        account.setBalance( account.getBalance() +  depositAmount );
        System.out.println("Deposit of " +  depositAmount  + " processed. Current balance is  = "  + account.getBalance());
    }



    public static void withdraw (Account account , double withdrawAmount) {

        if( (account.getBalance() - withdrawAmount) < 0 ) {
            System.out.println("Only " + account.getBalance()  + " available. Withdrawal not processed");
        } else {
            account.setBalance(account.getBalance() - withdrawAmount);
            System.out.println("Withdrawel of " + withdrawAmount + " processed. Remaining balance = " + account.getBalance());
        }

    }


}
