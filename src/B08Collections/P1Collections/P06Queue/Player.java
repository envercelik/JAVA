package B08Collections.P1Collections.P06Queue;

public class Player implements Comparable<Player>{

    private int id;
    private String name;


    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Player player) {

        if (this.id < player.id) {
            return -1;
        } else if (this.id > player.id) {
            return 1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
