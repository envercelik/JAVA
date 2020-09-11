package P1Introduction.P2SimpleJavaProgram;

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


package : Main sınıfının bulunduğu paketi belirtir.

public  : erişim belirleyicidir. Test sınıfına ve main methoduna başka dosyalardan erişilebilir özelliği katar.

static  : java da bir method static ise bu method sınıfa özgü methoddur. Yani bulunduğu classtan nesne oluşturulmasa dahi
          uygulama çalışır çalışmaz bu method ram e yüklenir.


String[] args : main methodu parametre olarak bir string dizisi bekliyor.


-System.out.println() : Bir fonksiyonun bu şekilde çağrılma nedeni gruplamadır. System altındaki out fonksiyonlarından
                        println fonksiyonunu çağır manasına gelir. Buna intellisense denir.


*/
