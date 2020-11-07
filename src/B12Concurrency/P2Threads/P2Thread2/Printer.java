package B12Concurrency.P2Threads.P2Thread2;

public class Printer implements Runnable{

    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name + " thread is working");

        for (int i=0; i<10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }




    }


}
