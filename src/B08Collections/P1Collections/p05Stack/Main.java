package B08Collections.P1Collections.p05Stack;


import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        /*
        Vector<String> cities = new Vector<>();

        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Bursa");
        /*
        for (String city : cities) {
            System.out.println(city);
        }*/

        /*
        ListIterator iterator = cities.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
        /*
        Enumeration<String> enumeration = cities.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        */
        /*
        System.out.println(cities.firstElement());
        System.out.println(cities.lastElement());
        */


        Stack<String> cities = new Stack<>();

        cities.push("Istanbul");
        cities.push("Ankara");
        cities.push("Bursa");

        /*
        for (String city : cities) {
            System.out.println(city);
        }
        */

        //System.out.println(cities.peek());
        //System.out.println(cities.pop());
        /*for (String city : cities) {
            System.out.println(city);
        }*/

        while (!cities.empty()) {
            System.out.println(cities.pop());
        }


    }

}

/*

Iterable -> Collection -> List -> Vector -> Stack

-Thread işlemlerde ArrayListler yerine vektorler kullanılmalıdır çünkü vektorler synchronized methodlara sahip olduğundan
 daha güvenlidir. Tabi arraylistlere göre daha yavaştır. Bunun dışında arraylistler ile oldukça benzerdir.


-Stack : last in first out - son giren ilk çıkar mantığı ile çalışan liste veri yapısıdır.

push() stact e eleman ekler.
peek() son elemanı döner ( stackten çıkarmaz)
pop()  son eklenen elemanı stacten çıkarır ve döner.


*/