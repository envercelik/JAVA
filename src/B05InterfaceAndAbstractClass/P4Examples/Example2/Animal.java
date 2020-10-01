package B05InterfaceAndAbstractClass.P4Examples.Example2;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void breathe() {
        System.out.println("Breathe in , breathe out , repeat");
    }


    public abstract void eat();

}
