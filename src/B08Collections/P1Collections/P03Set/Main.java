package B08Collections.P1Collections.P03Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Istanbul");
        hashSet.add("Ankara");
        hashSet.add("Bursa");
        hashSet.add("Eskişehir");
        hashSet.add("Eskişehir");


        linkedHashSet.add("Istanbul");
        linkedHashSet.add("Ankara");
        linkedHashSet.add("Bursa");
        linkedHashSet.add("Eskişehir");
        linkedHashSet.add("Eskişehir");


        treeSet.add("Istanbul");
        treeSet.add("Ankara");
        treeSet.add("Bursa");
        treeSet.add("Eskişehir");
        treeSet.add("Eskişehir");


        System.out.println("-----------HashSet------------------");
        for (String city : hashSet) {
            System.out.println(city);
        }

        System.out.println("-----------LinkedHashSet------------------");
        for (String city : linkedHashSet) {
            System.out.println(city);
        }


        System.out.println("-----------TreeSet------------------");
        for (String city : treeSet) {
            System.out.println(city);
        }

        System.out.println("------------------------------------------------------");

        System.out.println(hashSet.contains("Istanbul"));
        System.out.println(hashSet.isEmpty());
        hashSet.remove("Istanbul");
        System.out.println(hashSet.contains("Istanbul"));


    }

}

/*

Iterable -> Collection -> Set -> HashSet
Iterable -> Collection -> Set -> TreeSet
Iterable -> Collection -> Set -> LinkedHashSet

-Set interface i implemente eden class lar aynı değeri sadece bir kere depolar.



-HashSet :

- Elemanları hash-table mekanizmasına göre depolar. (Her elemanın bir key i vardır.)

-Elemanlar ekleme sırasına göre depolanmaz.


-LinkedHashSet :

-elemanlar yine hash-table mekanizmasına göre depolanır HashSet den farkı ise elemanlar ekleme sırasına göre depolanır.

-Treeset :

-elemanları ağaç yapısına göre depolar. (alfabetik- büyükten küçüğe gibi)


Performans :

HashSet       --> O(1) time complexity
LinkedHashSet --> O(1)
TreeSet       --> O(log(n))

Not : sıralı değerler eklendiğinde treeset daha hızlıdır.










*/