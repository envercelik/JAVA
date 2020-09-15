package B2Classes.Example3;

public class Test {


    public static void main(String[] args) {

        Account account = new Account(124 , 1000);
        Customer customer = new Customer(123,"Enver Çelik" , "devcelikenver@gmail.com" , "05515534141" ,account);

        ProsesManager.deposit(customer.getAccount() , 1500);
        ProsesManager.withdraw(customer.getAccount() ,2000);
        ProsesManager.withdraw(customer.getAccount() ,5000);

        System.out.println(customer);




    }










}
