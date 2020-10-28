package B08Collections.P2Examples.E02;

import java.util.Objects;

public class Player {

    private String id;
    private String name;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id : " + id  + " name : " + name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id.equals(player.id) &&
                name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
