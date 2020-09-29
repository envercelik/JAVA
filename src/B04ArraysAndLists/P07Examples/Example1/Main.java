package B04ArraysAndLists.P07Examples.Example1;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide" , "Enver çelik" , 50); //fakir
        bank.addCustomer("Adelaide" , "Steve job" , 50000);
        bank.addCustomer("Adelaide" , "Bill gates" , 50000000);

        bank.addBranch("Sydney");

        bank.addCustomer("Sydney" , "Banker bilo" ,100000);

        bank.addCustomerTransaction("Adelaide" , "Enver çelik" , 70);
        bank.addCustomerTransaction("Adelaide" , "Enver çelik" , 50);
        bank.addCustomerTransaction("Adelaide" , "Enver çelik" , 100);



        bank.listCustomers("Adelaide" , false);
        System.out.println("------------------------------------------");
        bank.listCustomers("Adelaide" , true);
        System.out.println("------------------------------------------");
        bank.listCustomers("Sydney" , true);




    }
}
