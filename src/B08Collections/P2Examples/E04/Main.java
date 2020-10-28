package B08Collections.P2Examples.E04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        players.add(new Player(5,"Enver"));
        players.add(new Player(1,"Fırat"));
        players.add(new Player(3,"Defne"));
        players.add(new Player(4,"Muhammet"));

        for (Player player : players) {
            System.out.println(player);
        }

        Collections.sort(players);

        System.out.println("Sorted :");

        for (Player player : players) {
            System.out.println(player);
        }



    }
}


/*

Bir sınıfın sıralanabilir olması için Comparable interfacesini implemente etmesi gerekir.
compareTo override edilerek sıralama koşulları ayarlanır.

*/