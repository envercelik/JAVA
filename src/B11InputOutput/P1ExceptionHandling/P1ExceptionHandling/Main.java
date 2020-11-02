package B11InputOutput.P1ExceptionHandling.P1ExceptionHandling;

public class Main {
    public static void main(String[] args) {

    }
}

/*


-Java programları çalışma anında (runtime) programın akışını durduran hatalar fırlatabilirler (exception)
 Örneğin : input-output hataları , veritabanı bağlantı hatası , aritmetik hatalar...
 *aslında bu hatalar bilinçli olarak fırlatılır.

-try-cath blogu sayesinde hata fırlatılabilecek kodlar kontrol edilir ve hata fırlatırsa yakalanır.
 Bu sayede eğer hata olmussa bir işlem hata olmamışsa başka işlem yaparak yolumuza devam ederiz.  (exception handling)

*try bloğundaki hata cath bloğuna parametre olarak verilir.
*tyr-catch yanına birde finaly bloğu varsa bu blok her türlü çalışır-veritabanı bağlantısı kesme , dosya kapama gibi
 durumlar için kullanışlıdır.
*birden fazla catch bloğu ile birden fazla türde exception yakalanabilir ve hata türüne göre işlem yapılabilir.



*Tüm exceptionlar Exception sınıfından türemiştir. Yapı :

Throwable ----> Exception ----> IOException
                          ----> SQLException
                          ----> ClassNotFoundException
                          ----> RuntimeException   ----> ArithmeticException
                                                   ----> NullPointerException
                                                   ----> NumberFormatException
                                                   ----> IndexOutOfBoundException --> ArrayIndexBoundOfException
                                                                                  --> StringOutOfBoundException


          ----> Error ---> StackOverFlowError
                      ---> VirtualMachineError
                      ---> OutOfMemoryError



Exception Türleri : checked - unchecked - error

-Runtime exceptionlardan türemeyen her class CheckedException kapsamına girer. Bu exceptionlara try-cath
 mekanizması kurmak zorunludur.(IO -SQl)

-RuntimeException dan türeyen her class UnCheckedException kapsamına girer. Bu exceptionlara try-cath mekanizması
 kurmak zorunlu değildir. Ama runtime da bir hata olursa program patlar.

-Error : Yakalayıp müdahale etme şansımız yok.

*/
