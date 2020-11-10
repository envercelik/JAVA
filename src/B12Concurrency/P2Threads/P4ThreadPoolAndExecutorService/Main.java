package B12Concurrency.P2Threads.P4ThreadPoolAndExecutorService;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2); //aynı anda en fazla 2 thread çalışsın
        //yani aynı anda thread havuzunda en fazla 2 thread bulunabilir.

        for (int i=1; i<=10; i++) {
            executorService.submit(new Worker("worker"+i , i));
        }

        executorService.shutdown(); //işler bitene kadar bekle sonra executor ı kapat

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS); //executor bir gün içinde işini bitirmesse  kapat.
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }


        System.out.println("All tasks finished...");

    }


}


/*

Bir prosses te yüzlerce thread olabilir ve bunların aynı anda çalışması belleği yorabilir. Bunları join methodu ile
grup grup çalıştırabiliriz ama yüzlerce thread i bu şekilde manuel olarak yönetmek mantıklı değildir.


Bu nedenle Thread pool ve Executor secvice kullanırız. Executor Service bir thread havuzunu yönetir.
Thread havuzuna verilen int paramtre ile aynı an da kaç tane thread çalışabileceği belirlenir. Hangi threadlerin
hangi sırada çalışacağını ise Executor service belirler.




*/