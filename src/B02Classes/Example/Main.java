package B02Classes.Example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account account = new Account(124 , 1000);
        Customer customer = new Customer("464502","123456","Enver Çelik" ,
                                    "devcelikenver@gmail.com" , "05515534141" ,account);

        AccountManager accountManager = new AccountManager();



        System.out.println(  "Welcome to our bank "  + customer.getName());


        while (true) {

            if (Login.login(customer)) {

                showMenu();

                while (true) {

                    System.out.print("Select your transaction : ");
                    int transaction = scanner.nextInt();


                    if(transaction == -1) {

                        System.out.println("exiting the program...");
                        break;

                    } else if (transaction == 1 ) {

                        System.out.println("Your balance is " + customer.getAccount().getBalance());

                    } else if (transaction == 2) {

                        System.out.print("Amount ? :");
                        double amount = scanner.nextDouble();
                        accountManager.withdraw(account,amount);

                    } else if (transaction==3) {

                        System.out.print("Amount ? :");
                        double amount = scanner.nextDouble();
                        accountManager.deposit(account,amount);

                    } else if (transaction == 4) {
                        showMenu();

                    } else {

                        System.out.println("Invalid transaction");
                    }


                }

            }



        }



    }






    public static void showMenu () {


        System.out.println("***********************************");
        System.out.println("1 - Learn balance");
        System.out.println("2 - Withdraw");
        System.out.println("3 - Deposit");
        System.out.println("4 - Show Menu");
        System.out.println("press -1 for quit...");
        System.out.println("***********************************");

    }





}
