package B3Inheritance.P4Example3;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;



    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;

    }



    public void chew() {
        System.out.println("Dog.chew() called");
    }

    private void moveLegs() {
        System.out.println("Dog.moveLegs() called");
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }


    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }


    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs();
        super.move(speed);
    }




}
