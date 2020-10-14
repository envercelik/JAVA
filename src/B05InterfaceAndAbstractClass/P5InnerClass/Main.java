package B05InterfaceAndAbstractClass.P5InnerClass;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        /*
        GearBox mcLaren = new GearBox(6);

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
        */


        //local inner class (main methoduna özel)
        /*
        class ClickListener implements Button.OnClickListener {

            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        */



                                     //anonim inner class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });


        listen();


    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice  = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}

/*

-inner class bir sınıf içerisinde başka bir sınıf tanımlanmasıdır.

-en önemli özelliği iç sınıflar üst sınıfların özellik ve methodlarına doğrudan erişebilir. (private olsa bile)
*nesne üretmek koşulu ile üst sınıf alt sınıfın özellik ve methodlarına doğrudan erişebilir. (private olsa bile)

-Eğer bir sınıfın bir nesneye ihtiyacı var ve sadece bu sınıfın bu nesneye ihtiyacı varsa inner class
 kullanmak mantıklıdır.

-Bir blog içerisinde (method...) tanımlanan classlara local inner class denir ve sadece tanımlandığı blog
 içerisinde kullanılır.

-anonim inner classlar ise local inner classlardır ama isimleri yoktur. Bir sınıf oluşturup bu sınıfa extend veya
 implemente edip bu sunıftan bir nesne üretmek yerine nesneyi oluşturduğumuz yerde sınıf tanımlanır ve atanır.
 Bir ismi olmadığı için tek kullanımlık sınıf gibi düşünebiliriz.
 *çeşit çeşit sınıf üretmek yerine çeşit çeşit nesne oluşturmuş ve gereken yerde kullanmış oluruz.



*inner classlardan nesne üretmek için üst class tan alt class lara doğru sırasıyla nesne üretmek gerekir.
*eğer inner class static ise nesne üretilmeden erişilebilir.

*/


