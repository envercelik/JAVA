package B02Classes.Example2;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean dublex;


    public Printer(int tonerLevel, boolean dublex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.dublex = dublex;
        this.pagesPrinted = 0;
    }


    public int addToner (int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <=100) {

            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }

        } else {
            return -1;
        }
    }

    public int printPages (int pages) {
        int pagesToprint = pages;
        if (this.dublex) {
            pagesToprint = (pages/2) + (pages%2);
            System.out.println("Printing in dublex mode");
        }
        this.pagesPrinted += pagesToprint;
        return pagesToprint;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
