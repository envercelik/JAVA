package B05InterfaceAndAbstractClass.P4Examples.Example2;

public abstract class Bird extends Animal implements IFlyable{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
