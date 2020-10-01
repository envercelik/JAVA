package B05InterfaceAndAbstractClass.P4Examples.Example2;

public abstract class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    public abstract void fly();
}
