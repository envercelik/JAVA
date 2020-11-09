package B12Concurrency.P2Threads.P3Synchronized;

import java.util.ArrayList;
import java.util.Random;

public class ListWorker {

    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    Object lock1 = new Object();
    Object lock2 = new Object();


    public void addValueToList1() {

        synchronized (lock1) {


            try {
                Thread.sleep(1);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

            list1.add(random.nextInt(100));

        }
    }



    public  void  addValueToList2() {

        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

            list2.add(random.nextInt(100));
        }



    }

    public  void addValues() {

        for (int i=0; i<1000; i++) {
            addValueToList1();
            addValueToList2();
        }

    }


    public void work() {


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                addValues();
            }
        });



        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                addValues();
            }
        });





        long startTime = System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }


        long endTime = System.currentTimeMillis();

        System.out.println("List1 : " + list1.size() + " List2 : " + list2.size());
        System.out.println("Time : " + (endTime-startTime));



    }




}
