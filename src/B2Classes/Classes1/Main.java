package B2Classes.Classes1;

public class Main {

    public static void main(String[] args) {

    }

}



/*

-Classlar birer taslaktır(blueprint)  ve gerektiği zaman bu taslakların birebir kopyası nesneler(instance) oluşturulur.
 Referans ise bu class lardan oluşturulan nesnelerin adresini tutabilen değişken isimleridir.

-Classları bir manada gerçek dünya nesnelerinin yeni veri tipi olarak programlamaya aktarılması olarak düşünebiliriz.
 Çevremizde gördüğümüz çoğu nesne bir state:durum ve behavior:davranış'a sahiptir.
 Örneğin : Televizyon kumandasının bir tuşunu düşünelim
           state : rengi , şekli , şemali,konumu
           bahaviour: televizyonu açıp  kapaması
Bir nesne javaya aktarılırken ise--> states     : variables
                                     behaviours : methods    olarak karşılık bulur.


-Minumum çalışan java projesi en az 1 class ve 1 main methoddan oluşur. Program main methoddan çalışmaya başlar.
 Bu örnek bir Main class ve main methoddan oluşmaktadır. (en basit java programı)

 not : main metodu static tanımlandığından program derlenince doğrudan ram'e yüklenir. Bu sayede Main sınıfından
       nesne oluşturulmadan programımız çalışmaktadır.

-public ise erişim belirleyicidir ve bu class a başka java dosyalarından erişilebilir manasındadır.


*/