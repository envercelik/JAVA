package B02Classes.Classes3;

public class Car {

    //fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


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
