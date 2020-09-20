package B2Classes.Classes7;

public class MotherBoard {

    private String model;
    private Ram ram;  //composition
    private DisplayCard displayCard; //composition


    public MotherBoard(String model, Ram ram, DisplayCard displayCard) {
        this.model = model;
        this.ram = ram;
        this.displayCard = displayCard;
    }


    public String getModel() {
        return model;
    }

    public Ram getRam() {
        return ram;
    }

    public DisplayCard getDisplayCard() {
        return displayCard;
    }
}
