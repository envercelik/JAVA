package B08Collections.P1Collections.P02List.P01ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Bursa");

        cities.remove("Istanbul");

        for (String city : cities) {
            System.out.println(city);
        }



    }

}

/*

Iterable -> Collection -> List -> ArrayList

-Verileri dizi yapısında sıralı olarak tutar.

-Temel dizilerde sonradan genişletme yapılamaz. ArrayListler ise temel dizilerin eleman ekledikçe genişleyen sildikçe
 küçülen halidir. (Arka planda yeni bir dizi oluşturur ve elemanları kopyalar.)

-Arraylist generic bir sınıftır. Bu sayede isteğimiz veri tipinde array list tanımlayabiliriz. Eğer veri tipi
 belirtmessek ArrayList Object tipinde tanımlanır.


*/

