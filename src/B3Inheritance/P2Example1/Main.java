package B3Inheritance.P2Example1;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("1","Enver Çelik", "0551553" ,"enver@enver.com");
        System.out.println(customer.getNameSurname());
        customer.showInformation();

        Employee employee = new Employee("1","Fırat Çelik" ,"0551553",4000);
        System.out.println(employee.getNameSurname());
        employee.showInformation();






    }
}
