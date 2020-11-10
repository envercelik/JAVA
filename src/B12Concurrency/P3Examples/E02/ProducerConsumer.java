package B12Concurrency.P3Examples.E02;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    Random random = new Random();
    ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(10);



    public void produce() {

        while (true) {

            try {
                Thread.sleep(1000);
                Integer value = random.nextInt(100);
                System.out.println("Producer is producing... : "  + value);
                blockingQueue.put(value); //eğer kuyruk tamamen dolu ise (10) bekler.

            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

        }


    }


    public void consume() {

        while (true) {

            try {
                Thread.sleep(5000);

                System.out.println("Consumer is consuming... : "  + blockingQueue.take());//eğer kuyruk tamamen boş ise bekler
                System.out.println("Queue size : " + blockingQueue.size());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

        }


    }


}
