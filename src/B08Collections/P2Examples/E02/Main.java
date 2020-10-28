package B08Collections.P2Examples.E02;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Player> players = new HashSet<>();

        players.add(new Player("1" ,"Enver"));
        players.add(new Player("1" , "Enver"));


        for (Player player:players) {
            System.out.println(player);
        }






    }
}


/*

Nesnelerimizin değerleri aynı olsa bile HashSet de depolanır çünkü şuan 2 farklı nesnemiz var.
Bunun olmaması için Player sınıfına hashcode ve equals methodlarını yazdık.

Aynı mantık maplar için de geçerlidir.
*/