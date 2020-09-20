package B2Classes.Classes6;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer(2048 , new String[]{"Hp","Dell"});
        int memory = computer.getMemory();
        String[] manufacturers = computer.getManufacturers();


    }

}


/*

Immutable class : içeriği sonradan değiştirilemeyen class lardır.

Bir sınıfın immutable olabilmesi için :

- Tüm değişkenler private tanımlanmalıdır.
- Setter metodlar olmamalı veya private tanımlanmalı
- Getter metodlar da herhangi bir referans döndürmemeli (değerleri döndürmeli)



*/