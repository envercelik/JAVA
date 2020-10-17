package B12Concurrency.P1Concurrency.P2Examples.E01;

public class Main {
    public static void main(String[] args) {

        Cronometer cronometer1 = new Cronometer("thread1");
        Cronometer cronometer2 = new Cronometer("thread2");
        Cronometer cronometer3 = new Cronometer("thread3");

        cronometer1.start();
        cronometer2.start();
        cronometer3.start();
    }
}
