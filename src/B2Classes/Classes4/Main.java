package B2Classes.Classes4;

import B2Classes.Classes3.Car;

public class Main {

    public static void main(String[] args) {

        B2Classes.Classes3.Car car = new Car();

        //car.model = "Carrera";  //hata çünü model özelliği private tanımlanmış

        car.setModel("Carrera");
        System.out.println(car.getModel());



    }
}



/*

-Constructor : bir sınıfın yeni bir örneğini(nesne) oluşturduğumuzda çalışan metoddur.

-new Car(); dediğimizde Car(); nesne oluşturulurken çalışacak construcutor methodu ifade eder.

-Constructur a method overloading uygulanabilir ve paramtreye göre istenen constructor çağırılabilir.

this() : bir sınıf içerisinde o sınıfa ait herhangi bir constructor i çağımak için kullanılır.


*/