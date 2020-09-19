package B1Introduction.P2SimpleJavaProgram;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java");
    }
}


/*

-Her java programında en az bir sınıf vardır.

-Her java programında en az bir main method vardır. Ve program main methoddan çalışmaya başlar.

-Dosya adı ile dosya içerisindeki public class adı  aynı olmak zorundadır.

-Bir java dosyasında birden fazla class olabilir ama sadece bir tane public class olabilir.


package : Main sınıfının bulunduğu paketi belirtir. Paketler java proje dosyalarımızı organize etmek için kullanılır.


public  : Erişim belirleyicidir(access modifier). Erişim belirleyiciler Bir class , method veya değişkene erişim izni
          verilip verilmeyeceğini belirlemek için kullanılır. Örneğin Main class public olduğundan başka dosylardan
          Main class a erişilebilir. Aynı matıkla main methodu için de erişim izni vardır.


static  : java da bir method static ise bu method sınıfa özgü methoddur. Yani bulunduğu classtan nesne oluşturulmasa
          dahi uygulama çalışır çalışmaz bu method ram e yüklenir.


String[] args : main methodu parametre olarak bir string dizisi bekliyor.


-println() : Verilen parametreyi sistemin output una basan ve alt satıra geçen hazır bir methoddur.

* println() methodu doğrudan çağrılmak yerine System.out. şeklinde çağrılmasının sebebi classification (gruplamadır)
           Bu sayede benzer işleri yapan class lar ve method lar gruplanmış olur.

*  System. dedikten sonra çıkan öneriler java  değil ide getirmektedir. Bu özelliğe intellisense denir.


-Noktalı virgül ile sonlanan her ifade topluluğu statement dir.Örneğin System.out.println("Hello java"); bir statemendir.

*Java case-sensitive bir programlama dilidir.


*/
