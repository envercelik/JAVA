package B08Collections.P2Examples.E08;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        TvController tvController = new TvController();

        tvController.addChannel("channel1");
        tvController.addChannel("channel2");
        tvController.addChannel("channel3");

        Iterator iterator = tvController.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }





    }
}
