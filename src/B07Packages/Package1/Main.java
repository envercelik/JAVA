package B07Packages.Package1;

import B07Packages.Package1.mathematics.Arithmethic;
import B07Packages.Package1.mathematics.Log;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name : "  + name);

        Arithmethic arithmethic = new Arithmethic();
        arithmethic.sum(5,7);

        Log log = new Log();
        log.logarithm();
    }
}


/*
Package : Basitçe birbiri ile alakalı sınıfların ayrı klasörlerde tutulmasıdır.En önemli amacı gruplama yapmaktır.

Ayrıntılar :

-Bir class içerisinde bir paketi kullanmak için onu import etmemiz gerekir.

-Javada kullanıma hazır bir çok built-in paket bulunur. import java. dediğimizde intelij-idea birçok paketi bize önerir.
 Örneğin java.util paketindeki Scanner classini projemize dahil ettik.

-java.util.* diyerek bu paketteki tüm classları projemize dahil edebiliriz.

-Ayrıca kendi paketlerimizi yazıp sınıfımıza import edebiliriz.
 Örneğin kendi yazdığımız mathematics paketinde bulununan Arithmetic classini projemize dahil ettik.





 */