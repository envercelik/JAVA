package B2Classes.Classes2;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.model = "porsche";
        System.out.println(car.model);


    }




}

/*

-Car yeni veri tipimiz. car ise Car nesnelerinin adresini tutabilen bir referanstır.

-Memory iki alan vardır. Stack ve Heap alanı. Primitive veri tipleri değerleriyle birlikte stack te tutulur.
 Referanslar stackte tutulurken referansların gösterdiği nesneler heap alanında tutulur. Yani adres stack te
 adresin belittiği nesne ise heap alanında oluşur.

-Bir nesnenin özellik ve metodlarına referans üzerinden '.' operatörü ile erişilir.



- car nesnesinin özelllik ve metodlarına . operatörü ile erişmeye çalıştığımızda intelij idea Car sınıfına yazmadığımız
 bazı özellik ve metodlar önermektedir. Bunun sebebi java'da her sınıfın Object sınıfının alt sınıfı olmasıdır.
 (intelij idea gizli olarak ekler)



 */