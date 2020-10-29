package B08Collections.P1Collections.P06Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> peopleQueue = new LinkedList<>();
        peopleQueue.offer("Enver");
        peopleQueue.offer("Fırat");
        peopleQueue.offer("Defne");
        peopleQueue.offer("Engin");

        System.out.println(peopleQueue.peek());
        System.out.println(peopleQueue.poll());
        System.out.println(peopleQueue.peek());


    }
}

/*

Iterable -> Collection -> Queue -> LinkedList
Iterable -> Collection -> List  -> LinkedList

*Linked list List referansına atanırsa liste gibi Queue referansına atanırsa kuyruk özelliği taşır.

-Kuyruklar ilk gelen ilk çıkar mantığında çalışan  veri yapısıdır.

add()     :  eleman ekler - ekleyemesse hata fırlatır.
offer()   :  elaman ekler - ekleyemesse false döner.

remove()  : Kuyruğun başındaki elemanı kuyruktan çıkarır. - kuyruk boşsa hata fırlatır
poll()    : Kuyruğun başındaki elemanı kuyruktan çıkarır. - kuyruk boşsa null döner

element() : Kuyruğun en başındaki elemanı döner - kuyruk boşsa hata fırlatır
peek()    : Kuyruğun en başındaki elemanı döner - kuyruk boşsa null döner



Iterable -> Collection -> Queue -> PriorityQueue

-Elemanlar kuyruğa önceliklerine göre eklenirler.

Örneğin bir int PriorityQueue de öncelik küçük sayılardadır.
Örneğin bir string PriorityQueue de öncelik alfabetik olarak önce gelen stringtedir.





*/