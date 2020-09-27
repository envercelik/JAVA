package B02Classes.Classes6;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer(2048 , new String[]{"Hp","Dell"});
        int memory = computer.getMemory();
        String[] manufacturers = computer.getManufacturers();






        //String immutable classtır.

        String name = new String("Enver"); //heap alanında tutulur.
        String surname = "Çelik"; //string poolda tutulur.

        name = "Fırat";  //string poola yeni değer eklendi . Öncekinin referansı yok (garbage collector siler)


        String mail = "enver@gmail.com"; //iki farklı değer oluşmaz. String poolda bir değer oluşur.
        String email = "enver@gmail.com";   //iki referans ta aynı değeri gösterir.



    }

}


/*

Immutable class : içeriği sonradan değiştirilemeyen class lardır.

Bir sınıfın immutable olabilmesi için :

- Tüm değişkenler private tanımlanmalıdır.
- Setter metodlar olmamalı veya private tanımlanmalı
- Getter metodlar da herhangi bir referans döndürmemeli (değerleri döndürmeli)



String class:

-string class bir immutable classtır. String değerleri memory de string pool da tutulur.

Örneğin bir string tanımladığımızda string pool da bunun değeri tutulur. Bu stringin değerini
değiştirdiğimizde ise  string poola yeni değer eklenir. Ve referansımız yeni string değerini
gösterir. Önceki referansız kaldığından garbage collector string pooldan bu değeri siler.

Veya iki farklı string tanımlayıp aynı değerleri atadığımızı düşünelim. String poolda iki farklı değer oluşmaz.
tek değer oluşur ve iki referansımızda aynı değeri gösterir. (2 den fazla da olsa mantık aynı)



*/