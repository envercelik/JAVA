package B12Concurrency.P2Threads.P4ThreadPoolAndExecutorService;

public class Worker implements Runnable{

    private String name;
    private int taskId;


    public Worker(String name, int taskId) {
        this.name = name;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println(name + " is working...  Task id  :" + taskId);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        System.out.println(name + "  finished  task" + taskId);

    }
}
