package B08Collections.P1Collections.P02List.P02LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

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

Iterable->Colleciton->List->LinkedList

-Verileri her veri başka bir veriyi rererans edecek şekilde bağlı liste yapısında tutar.


ArrayList - LinkedList  performans karşılaştırması :

- ArrayList  eleman eklenince veya silinince tüm elemanları kaydırır. Linked listte ise sadece 2 referans değişir.
  Bu nedenle veri sayısı eğer çok fazla ise LinkedList ile Arraylist arasında büyük bir performans farkı oluşur.





*/