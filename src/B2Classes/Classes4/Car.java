package B2Classes.Classes4;

public class Car {

    //fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //constructors
    public Car() {
        //default constructor
    }

    public Car(int doors, int wheels, String model, String engine, String colour) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public Car(int doors, int wheels) {
        this.doors = doors;
        this.wheels = wheels;

    }


    public Car(int doors, int wheels , String model) {
        this(doors , wheels);
        this.model = model;
    }





    //getters and setters
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {

        if(doors > 0) {
            this.doors = doors;
        }
        else {
            System.out.println("invalid doors value");
            this.doors = 0;
        }
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model.toLowerCase();

    }



}
