package B03Inheritance.P3Example2;

public class DatabaseLogger extends BaseLogger{

    @Override
    public void log(String logMessage) {
        System.out.println("Logged to database : " + logMessage);
    }
}
