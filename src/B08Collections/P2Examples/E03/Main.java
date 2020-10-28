package B08Collections.P2Examples.E03;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String sentence = "Hicbir seyi istemedim seni istedigim kadar";

        Map<Character ,Integer> frequency  = new TreeMap<>();


        for (int i=0; i<sentence.length(); i++) {

            char c = sentence.charAt(i);

            if (frequency.containsKey(c)) {

                frequency.replace(c , frequency.get(c)+1);
            } else {
                frequency.put(c,1);
            }

        }


        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println("Character : " + entry.getKey() + " frequency : " + entry.getValue());
        }


    }
}


