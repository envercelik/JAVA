package B07Packages.Package1;

import B07Packages.Package1.mathematics.Arithmethic;
import B07Packages.Package1.mathematics.Log;

import java.util.Scanner;

public class  Main {
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

-Farklı paketlerde aynı isimde classlar oluşturabiliriz. Bu sayede büyük projelerde aynı isme sahip sınıfların
 çakışmasını engellemiş oluruz.

-Java development kit bir jar topluluğudur. Her jar içerisinde bir çok paket barındıran bir container görevi
 görür. Her paket içerisinde ise belli işlere özel bir çok sınıf bulunur.

-Kendi paketlerimizi build ederek kendi jar dosyalarımızı oluşturabilir ve faklı projelere ekleyerek kullanabiliriz.

-Bir class içerisinde bir paketi kullanmak için onu import etmemiz gerekir.

-Javada kullanıma hazır bir çok built-in paket bulunur. import java. dediğimizde intelij-idea birçok paketi bize önerir.
 Örneğin java.util paketindeki Scanner classini projemize dahil ettik.

-java.util.* diyerek bu paketteki tüm classları projemize dahil edebiliriz.

-Ayrıca kendi paketlerimizi yazıp sınıfımıza import edebiliriz.
 Örneğin kendi yazdığımız mathematics paketinde bulununan Arithmetic classini projemize dahil ettik.


Access Modifiers :

public ->

-Bir sınıf veya method veya özellik public tanımlanmış ise paketin içindeki veya paketin dışındaki tüm classlar erişebilir.


default->

-Eğer bir class a erişim belirleyici verilmesse default erişim belirleyicisine sahip olur.

-Bir sınıf veya method veya özellik default tanımlanmış ise sadece aynı pakette bulunan classlar erişebilir.



private->

-Bir class private tanımlanamaz.

-Bir özellik veya method private tanımlanmış ise bu alanlara sadece kendi classından erişebiliriz.


protected->

-Bir class protected tanımlanamaz.

-Bir özellik veya method protected tanımlanmış ise bu alanlara  aynı pakette bulunan classlar veya farklı pakette
 sadece bu classı extend eden classlar erişebilir.




 Final Anahtar kelimesi :

 -Bir özellik final tanımlanırsa değeri bir kez tanımlanırken veya constructor ile verilir ve bir daha değiştirilemez.
  *Constructor ile atama yapınca her obje için bir kere değer ataması yapmış oluruz

 -Bir method final tanımlanırsa alt classlar bu methodu override edemez.

 -Bir class final tanımlanırsa extend edilemez.

 -Bir methodun paramtresi final ise o method içinde final paramtrenin değeri değiştirilemez.



 */