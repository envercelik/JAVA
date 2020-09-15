package B2Classes.Classes3;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        //car.model = "Carrera";  //hata çünü model özelliği private tanımlanmış

        car.setModel("Carrera");
        System.out.println(car.getModel());



    }
}



/*

Eğer nesnenin özellikleri veya metodları private tanımlanmışsa başka sınıflardan bu özellik ve metodlara erişilemez.
Eğer public tanımlarsak erişebiliriz.

-Genel olarak özellikler private tanımlanıp bu özelliklere erişen metodlar(getters and setters) ise public tanımlanır.
Böylece doğrudan değer ataması engellenir. Atanan değerler bir metoddan geçirilerek dolaylı yoldan
atanmış olur. Sonuç olarak  veri kontrolü ve güvenliği arttırılmış olur. (encapsulation)

-this anahtar kelimesi bir sınıf içerisinde kullanılırsa o sınıfın referansıdır.

*/