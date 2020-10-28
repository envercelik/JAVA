package B08Collections.P2Examples.E04;

public class Player implements Comparable<Player>{
    private int id;
    private String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "id=" + id + ", name= " + name;
    }


    @Override
    public int compareTo(Player player) {

        if (player.id < this.id) {
            return 1;
        } else if (player.id > this.id) {
            return -1;
        } else
            return 0;

    }
}
