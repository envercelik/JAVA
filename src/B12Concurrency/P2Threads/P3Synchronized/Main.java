package B12Concurrency.P2Threads.P3Synchronized;

public class Main {
    public static void main(String[] args) {

        ListWorker listWorker = new ListWorker();

        listWorker.work();



    }
}



/*

-Bir method synchorized anahtar kelimesi ile tanımlanırsa bu methodu aynı anda sadece bir thread kullanabilir.

-Peki neden böyle bir mekanizma var ?
 Eğer birden fazla thread aynı alan üzerinde değişiklik yapıyorsa ve bir thread gerekli değişikliği yapmadan diğer thread
 araya girerse ortalık karışabilir. (ortalık karışacak vaziyet alın :))

 Bu gibi durumlarda threadler işini sırayla yapsın abi ozaman diyorsak bu mekanizmayı kullanırız.


-Tabi dikkat edilmesi gerek bir nokta var. Eğer bir sınıfın bir methodu synchorized tanımlanırsa aslında o sınıfa
 ait sadece bir anahtar tanımlanır. Bu durumda anahtarı alan thread bu sınıfta  işini bitirmeden diğer threadler
 bu sınıfa ait herhangi bir methodu kullanamaz. Bu da thread kullanmanın avantajını ortadan kaldırır.

 Bu durumun önüne geçmek için synchorized method tanımlaması yerine synchorized(){} kod blokları kullanılır ve
 her synchorized bloğa bir lock(anahtar) verilir. Böylece bir thread bir anahtarı alıp bir synchorized kod bloğunu
 çalıştırırken diğer thread diğer anahtarı alıp başka bir synchorized kod bloğunu çalıştırabilir.

 Benim eyyorlamam bu kadar hayırlı işler


 * join() : threadlerin işi bitmeden başka threadler araya girmesin.






*/
