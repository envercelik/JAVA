package B08Collections.P2Examples.E01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5.25);
        arrayList.add("Enver");

        for (Object i : arrayList) {
            System.out.println(i);
        }

        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList.size());

        ArrayList<String> cities = new ArrayList<>();
        arrayList.add("İstanbul");
        arrayList.add("Bursa");
        arrayList.add("Eskişehir");

        Collections.sort(cities);

        for (String city:cities) {
            System.out.println(city);
        }


    }

}

