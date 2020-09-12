package P1Introduction.P9ScannerAndMathClasses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner Class

        Scanner scanner = new Scanner(System.in); //Scanner sınıfından bir obje oluşturduk


        System.out.print("Enter a floating-point number : ");
        double number = scanner.nextDouble();


        System.out.print("Enter a integer number : ");
        double number2 = scanner.nextInt();

        scanner.nextLine(); //dummy : eğer bunu nuraya koymassak integer değer girildiğinde basılan
        //enter değeri (\n) string olarak nameSurname e atılırdı


        String nameSurname = scanner.next(); //sadece ilk kelimeyi alır.
        nameSurname = scanner.nextLine(); //tüm içeriği alır.



        //karakter okumak için next.Char() yok  alternatif çözüm :
        char character = scanner.next().charAt(0); //ilk karakteri aldık






        //Math Class


        System.out.println("PI :" + Math.PI);

        System.out.println(Math.abs(-5)); //mulak değer
        System.out.println(Math.ceil(7.3)); //yukarı yuvarlama
        System.out.println(Math.sqrt(4));  //karakök
        System.out.println(Math.pow(2,3)); //2 nin kübü
        System.out.println(Math.random()); //0-1 arasında rasgele ondalıklı sayı oluşturur. (1 dahil değildir)
        //...





    }
}


/*
 Scanner kullanıcıdan input almak , Math ise matematiksel işlemleri yapmak için java için yazılmış hazır
 sınıflardır. Örneğin matematiksel işlemler için yeni bir sınıf yazmak yerine hazır yazılmışını
 kullanarak tekerleği yeniden icat etmemiş oluruz.

 Not : Math sınıfı Java.lang paketinde olduğundan projeye dahil etmemize gerek yoktur. (default dahil zaten)

*/
