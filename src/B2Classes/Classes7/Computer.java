package B2Classes.Classes7;

public class Computer {

    private MotherBoard motherBoard;  //composition
    private Display display;    //composition

    public Computer(MotherBoard motherBoard, Display display) {
        this.motherBoard = motherBoard;
        this.display = display;
    }



    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Display getDisplay() {
        return display;
    }
}
