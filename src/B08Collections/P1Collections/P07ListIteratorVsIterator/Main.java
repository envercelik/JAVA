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

        System.out.println("***********************************************");

        String[] channels = {"radio1","radio2","radio3","radio4"};

        Radio radio = new Radio(channels);


        for (String channel : radio) {
            System.out.println(channel);
        }
        //bu durumda aslında radio nun channel arraylisti üzerinde bizim channel arraylisti için yazdığımız iterator gezer.
        //fuck it

        Iterator<String> iterator = radio.iterator(); //önceki kullanımlar ile aynı - bunun ile de gezebiliriz.










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


*foreach elemanlar üzerinde Iterator ile gezinir.
*Map üzerinde iterator çalışmaz çünkü Map lerin Iterable interfacesi ile bir alakası yoktur. Bu nedenle
 Map ler üzerinde gezinmek için öncelikle set e dönüştürürüz.




***Kendi nesnelerimizin listeleri üzerinde Iterator ile gezinmek istersek Iterable interfacesini sınıfımıza
   implemente etmeliyiz.

   -Iterable sınıfını implemente eden sınıflar iterator() methodunu override etmek zorundadır. Bu method
    bir Iterator nesnesi döndüğünden kendimize ozel Iterator interfacesini implemente eden class yazmamız gerekir.

   -Kısaca Iterable implemente edilir. Override edilen iterator() methodu ise Iterator nesnesi döndürür.
   (bu iterator nesnesi -- nesnelerimizin listeleri üzerinde foreach ile gezindiğimizde otomatik kullanılır.)

   -Örneğin ArrayList , LinkedList ...  sınıflarında da benzer yapı kullanılır.



*/