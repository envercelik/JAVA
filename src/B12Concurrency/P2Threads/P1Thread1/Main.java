package B12Concurrency.P2Threads.P1Thread1;

public class Main {
    public static void main(String[] args) {



        Printer printer1 = new Printer("printer1");
        Printer printer2 = new Printer("printer2");

        printer1.start();
        printer2.start();

        System.out.println("main thread is working");
    }
}

/*

Bir sınıfın thread olarak çalışabilmesi için Thread sınıfını extend etmeli ve run method unu override etmelidir.
run methodu thread başlayınca tetiklenen methoddur.




*/