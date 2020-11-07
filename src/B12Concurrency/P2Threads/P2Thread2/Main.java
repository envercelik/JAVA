package B12Concurrency.P2Threads.P2Thread2;

public class Main {
    public static void main(String[] args) {

        Thread printer1 = new Thread(new Printer("Printer 1"));
        Thread printer2 = new Thread(new Printer("Printer 2"));

        printer1.start();
        printer2.start();

        System.out.println("main thread is working...");


    }
}


/*
Bir sınıfı thread olarak kullanabilmek için alternatif bir yöntem ise runnable interfacesi implemente etmesidir.
Mantık aynı olsa da başlatılma şekli faklıdır.

*/