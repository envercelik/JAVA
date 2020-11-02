package B11InputOutput.P1ExceptionHandling.P2Throw;



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
Bazen bir methodun exception fırlatmasını isteriz. Bu sayede method çağrılan yerde try-cath bloğuna alınmak zorunda kalır.
Böyle durumlarda fırlatacağımız exception a  göre kendi Exception sınıfımızı yazmak mantıklıdır.

-Eğer checked exception fırlatırsak methoda throws exception_türü  ifadesini eklemek zorundayız. Böylece javaya
bu methodun bir exception fırlatdığını ve bunun zorunlu olarak try-cath bloğunda kullanılması gerektiğini
bildirmiş oluruz.

- Unchecked exception fırlatırsak buna gerek yoktur. Tabi programcı bu exception ı yakalamassa program paket olur.

*Exception fırlatabilecek bir kodu try-cath bloğuna almak yerine  bu kodu yazdığımız methoda  throws exception_türü
ifadesini ekleyebiliriz  (alternatif) . Tabi bu durumda yine bu methodun kullanıldığı yerde try-cath bloğuna a
alınması gerekecektir. (yada bu method da hata fırlatabilir - hatta bu şekilde zincir olarak da ilerleyebilir.)
Ama eninde sonunda birinin bunu yakalaması lazım kullanmak istiyosa tabi :)

*/

