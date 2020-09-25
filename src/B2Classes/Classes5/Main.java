package B2Classes.Classes5;

public class Main {

    public static void main(String[] args) {


        double sum = Calculator.sum(1,2,3,4,5,6,7,8,9);
        System.out.println(sum);

        double areaOfCircle = Calculator.areaOfCircle(2);
        System.out.println(areaOfCircle);


        System.out.println(Calculator.PI);
        Calculator calculator = new Calculator();
        System.out.println(calculator.PI);
        test();

    }

    public static void test () {

    }

}



/*

-static anahtar kelimesi ile sınıfa özgü özellik ve methodlar tanımlanır.

-Bir sınıfın  static alanlarını o sınıfın tüm örnekleri ortak kullanır. (nesneye özel alan değil sınıfa özel)

-static alanlara sınıfın örnekleri üzerinden veya doğrudan sınıf üzerinden erişilebilir(nesne oluşturmadan).
 *sınıf üzerinden erişirsek ilk çağrıldığı yerde sınıfın bir örneği olşur ve program çalıştığı sürece bu örnek hafızada
  turulur. Başka örnek oluşmaz. Ayrıca constructor çağrılmaz varsa static blok çalıştırılır.
 *örnek oluşturulurken ise constructor çalışır

*static method içerisinden statik olmayan method doğrudan çağırılmaz. (nesne üzerinden çağırılabilir.)

*static methodlar genellikle utility classlarda  kullanılır.

*neden tüm classları static tanımlamayız ? = Bellek tasarrufu
 normal nesneler ile işimiz bittiğinde bellekten silinir. static nesneler ise program çalıştığı sürece bellekte tutulur.



*/