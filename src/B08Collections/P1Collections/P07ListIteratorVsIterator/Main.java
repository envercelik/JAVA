package B08Collections.P1Collections.P07ListIteratorVsIterator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ankara");
        list.add("Istanbul");
        list.add("Bursa");

        Set<String> set = new HashSet<>();

        set.add("Ankara");
        set.add("Istanbul");
        set.add("Bursa");

        Iterator<String> iterator1 = list.iterator();
        Iterator<String> iterator2 = set.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("---------------------------");

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        //iteratorler sona gitti geri dönemeyiz.
        System.out.println("---------------------------");
        System.out.println("---------------------------");





        //ListIterator

        List<String> countries = new ArrayList<>();

        countries.add("Turkey");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Italy");

        ListIterator<String> listIterator = countries.listIterator();


        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("--------------------------");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }









    }

}

/*

-iteratorler collection framework nesneleri üzerinde gezen nesnelerdir.


ListIterator :

-Sadece List interface yi implemente eden classlarda kullanılabilir.
 next(),previous() ve add() methodları bulunur.
 *ekleme listIerator üzerinden yapılırsa eleman ekledikçe ListIterator de ilerler.



Iterator :

-Set , Queue , ve List interfacelerini implemente eden classlarda kullanılabilir.
 previous() methodu yoktur. Yani elemanlar üzerinde ileri doğru gizindik diyelim geri dönemeyiz.


*foreach elemanar üzerinde Iterator ile gezinir.


*/