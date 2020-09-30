package B04ArraysAndLists.P08LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Bursa");
        placesToVisit.add("Eskişehir");
        placesToVisit.add("İzmir");
        placesToVisit.add("İstanbul");
        placesToVisit.add("Ankara");

        printList(placesToVisit);
        System.out.println("----------------------------------");

        placesToVisit.add(1,"Pamukkale");
        placesToVisit.remove("İzmir");
        placesToVisit.remove(4);
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> placesToVisit) {
        Iterator<String> i = placesToVisit.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }

    }

    private static  boolean addInOrder (LinkedList<String> linkedList , String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
            } else if (comparison < 0) {

            }
        }
        stringListIterator.add(newCity);
        return true;


    }

}


/*

-Linked listler array listlerin perforamans sorununu çözen liste veri yapısıdır. Basitçe liste elemnalarının
birbirine bağlanması (birbirlerinin adreslerini tutması) ile oluşturulur.

-Örneğin array listte bir eleman sildiğimizde diğer tüm elemanlar kaydırılırken linked listeler de bir iterator
liste üzerinde dolaşır ve sadece 2 objenin referansı değişir

-linkedlistlerin dezavantajı ise bellek miktarıdır  çünkü hem kendi değerlerini hem de göstereceği elemanın
 referansı tutar.


-java da linked liste üzerinde gezen iterator bir interface dir ve linked listeler ile ilgili olarak bir çok
 methoda sahiptir.

-hasNext()      : iteratorün gösterdiği elemandan sonra bir sonraki eleman varsa true döner.
-hasPrevious()  : iteratorün gösterdiği elemandan sonra bir önceki eleman varsa true döner.

-next()         : iteratör gösterdiği elemanın referansını döner ve listenin bir sonraki elemanına geçer.
-previous()     : iteratör gösterdiği elemanın referansını döner ve listenin bir önceki elemanına geçer.


*** Linked list üzerinde ileri geri yaptığımızda bir problem oluşur. (linked list veri yapısı gereği)
    iteratörün listenin ortalarında bir elemanı gösterdiğini düşünelim. next() dediğimizde bu elemanı döndürüp
    sonraki elemanı gösterecekir. Peki şimdi bir önceki elamanı  göstermek istersek ne olur ?
    iteratör sonraki elemanı gösterdiğinden previous() dediğimizde yine aynı elemanı dönecektir.
    (iteratör sonraki elemana geçmişti çünkü)
    Sonuç olarak önceki elemeanı gösteremedik.

    Çözüm : Yön değişikliği olduğunda, yöne göre bir kere daha next() veya  previous() yapmaktır.
            (yön değişikliğini algılamak için bir kontrol değişkeni tanımlanır (boolean forward = true))




*/