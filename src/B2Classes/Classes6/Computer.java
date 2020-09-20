package B2Classes.Classes6;

public class Computer {

    private int memory;
    private String[] manufacturers;


    public Computer(int memory, String[] manufacturers) {
        this.memory = memory;
        this.manufacturers = manufacturers;
    }

    public int getMemory() {
        return memory;
    }

    public String[] getManufacturers() {

        String [] copyManufacturers = new String[manufacturers.length];

        for (int i=0; i<manufacturers.length; i++) {
            copyManufacturers[i] = manufacturers[i];
        }


        return copyManufacturers;
    }
}
