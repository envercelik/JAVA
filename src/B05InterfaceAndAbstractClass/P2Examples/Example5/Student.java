package B05InterfaceAndAbstractClass.P2Examples.Example5;

public class Student implements Comparable<Student>{

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id : " + id + " name : " + name;
    }

    @Override
    public int compareTo(Student o) {
        /*
        //id ye göre sıralama
        if (this.id < o.id) {
            return -1;
        } else if (this.id > o.id) {
            return 1;
        } else return 0;
        */

        //name e göre sıralama

        if (this.name.compareTo(o.name) < 0) {
            return -1;
        } else if (this.name.compareTo(o.name) > 0) {
            return 1;
        } else return 0;





    }
}
