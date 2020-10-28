package B08Collections.P2Examples.E05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Enver");
        names.add("Defne");
        names.add("Fırat");

        Collections.sort(names , new SortString() );

        for (String name : names) {
            System.out.println(name);
        }

    }
}

/*
Kendi nesnelerimizi sıralamanın diğer bir yolu ise Comparator interfacesini implemente  eden classi
Collection.sort() methoduna parametre olarak göndermektir.

-Avantajı ise classi parametre olarak gönderdiğimizden sıralama kosulunu (bükten kucuge - kucukten buyuge gibi)
 kolaylıkla değiştirebilmektir. Comparable interfacesinde ise compareTo methodunu değiştirmemiz gerekir.

-Örneğin String için compareTo methodu küçükten büyüğe yazılmıştır. Bu methodu tersine çevirmeden Stringleri
 buyukten - kucuge sıralamak istersek bu yöntemi kullanırız.

-Aynı mantığı kendi nesnelerimiz için de kullanabiliriz.


*/