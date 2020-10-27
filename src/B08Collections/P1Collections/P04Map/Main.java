package B08Collections.P1Collections.P04Map;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("book" ,"kitap");
        dictionary.put("pencil", "kalem");

        for (String item : dictionary.keySet()) {
            System.out.println(dictionary.get(item));
        }

        /*
        //*diğer bir bastırma yöntemi map i entrySet e dönüştürmektir.
        for (Map.Entry<String,String> entry : dictionary.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
        }
        */


        System.out.println(dictionary);
        System.out.println(dictionary.get("book"));
        dictionary.remove("book");
        System.out.println(dictionary.get("book"));



        Collection<String> dictionarValues = dictionary.values();
        for (String value : dictionarValues) {
            System.out.println(value);
        }



    }

}

/*

Map -> HashMap :

- Elemanları key-value olarak depolar. Her key e karşılık gelen bir değer bulunur.

-Bir key sadece bir kere var olabilir ancak bir değer birden fazla olabilir.
*Aynı key e farklı değer eklenirse değer değişir.

-Elemanlar eklenme sırasına göre depolanmaz.



Map -> LinkedHashMap :

-Elemanlar eklenme sırasına göre depolanır.



Map -> TreeMap :

-Elemanlar key e göre sıralı olarak  depolanır. (alfabetik-kucukten büyüğe gibi)




*/