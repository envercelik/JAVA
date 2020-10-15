package B08Collections.P01Collection2;


import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("book" ,"kitap");
        dictionary.put("pencil", "kalem");

        for (String item : dictionary.keySet()) {
            System.out.println(dictionary.get(item));
        }

        System.out.println(dictionary);
        System.out.println(dictionary.get("book"));
        dictionary.remove("book");
        System.out.println(dictionary.get("book"));


    }

}

/*

Hash Map : anatar değer ikilisini kullanan Collection dır.

*/