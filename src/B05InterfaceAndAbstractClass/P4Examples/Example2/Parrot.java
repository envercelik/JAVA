package B05InterfaceAndAbstractClass.P4Examples.Example2;

public class Parrot extends Bird{


    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println( getName() + " flying");
    }
}
