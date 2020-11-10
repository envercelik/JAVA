package B12Concurrency.P3Examples.E02;

public class Main {

    public static void main(String[] args) {

        ProducerConsumer producerConsumer = new ProducerConsumer();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                producerConsumer.produce();
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                producerConsumer.consume();
            }
        });

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }





    }

}

/*

ArrayBlockingQueue : normal kuyruğun thread safe halidir. ( Threadler bu kuyruk yapısı ile synchorize çalışabilir.)

*/