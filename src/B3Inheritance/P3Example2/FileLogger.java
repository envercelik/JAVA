package B3Inheritance.P3Example2;

public class FileLogger extends BaseLogger{

    @Override
    public void log(String logMessage) {
        System.out.println("Logged to file : " + logMessage);
    }
}
