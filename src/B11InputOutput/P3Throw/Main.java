package B11InputOutput.P3Throw;



public class Main {
    public static void main(String[] args) {

        AccountManager accountManager = new AccountManager();
        accountManager.deposit(50);

        try {
            accountManager.withdraw(60);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }


    }
}

/*
Bazen bir methodun hata fırlatmasını isteriz. Bu sayede method çağrılan yerde try-cath bloğuna alınmak zorunda kalır.
Böyle durumlarda fırlatacağımız hataya göre kendi Exception sınıfımızı yazmak mantıklıdır.
*/

