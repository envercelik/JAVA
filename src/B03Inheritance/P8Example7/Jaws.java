package B03Inheritance.P8Example7;

public class Jaws extends Movie{

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}
