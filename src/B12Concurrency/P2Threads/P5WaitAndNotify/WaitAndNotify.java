package B12Concurrency.P2Threads.P5WaitAndNotify;

public class WaitAndNotify {


    public void thread1Function () {

        synchronized (this) { //this : anahtar bu obje olsun.

            System.out.println("Thread1 is working...");
            System.out.println("Thread1 is waiting for thread2 to wake it up.");


            try {
                wait();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

            System.out.println("Thread 1 woke up and continues ");


        }

    }



}
