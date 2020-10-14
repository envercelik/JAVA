package B05InterfaceAndAbstractClass.P6Examples.Example2;

public class Vektor {
    private String name;
    private int i;
    private int j;
    private int k;

    public Vektor(String name, int i, int j, int k) {
        this.name = name;
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
