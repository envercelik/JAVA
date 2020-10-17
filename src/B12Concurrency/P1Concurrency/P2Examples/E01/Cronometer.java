package B12Concurrency.P1Concurrency.P2Examples.E01;

public class Cronometer implements Runnable{

    Thread thread;
    String threadName;

    public Cronometer(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating... " + threadName);
    }


    @Override
    public void run() {

        System.out.println("working...  " + threadName );

        try {
            for (int i=1; i<=10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println("Thread intrupted : " + threadName );
        }

        System.out.println("Thread finished : " + threadName);


    }

    public void start() {
        System.out.println("Thread object is creating...");

        if (thread == null) {
            thread = new Thread(this , threadName);
            thread.start();
        }
    }



}
