package B03Inheritance.P3Example2;

public class Main {
    public static void main(String[] args) {
        //polymophism
        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger() , new FileLogger() ,new EmailLogger()};

        loggers[0].log("log message");
        loggers[1].log("log message");
        loggers[2].log("log message");

        Customer customer = new Customer("Enver Çelik");

        CustomerManager customerManager = new CustomerManager(loggers[0]);

        customerManager.add(customer);



    }
}
