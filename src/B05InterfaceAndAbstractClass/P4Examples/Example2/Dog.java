package B05InterfaceAndAbstractClass.P4Examples.Example2;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }


}
