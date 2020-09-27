package B03Inheritance.P3Example2;

public class CustomerManager {

    BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }


    public void add (Customer customer) {
        //jdbc conneciton
        System.out.println("Customer added " + customer.getNameSurname());
        logger.log("customer added");


    }
}
