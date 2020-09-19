package B1Introduction.P11Examples;

import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {

        //Döngüler ile atm programı

        Scanner scanner = new Scanner(System.in);

        double balance =  1000d;

        String transactions = "1- Learn balance \n" +
                              "2- Withdraw \n" +
                              "3- Deposit \n" +
                              "Q- quit ";
        System.out.println("***********************************");
        System.out.println(transactions);
        System.out.println("***********************************");


        while (true) {

            System.out.print("Choose your transaction : ");
            String transaction = scanner.nextLine();

            if(transaction.equals("q")) {
                System.out.println("exiting the program...");
                break;

            } else if (transaction.equals("1") ) {
                System.out.println("Your balance is " + balance);

            } else if (transaction.equals("2")) {
                System.out.print("Amount ? :");
                double amount = scanner.nextDouble();
                scanner.nextLine(); //dummy

                if ( balance - amount < 0) {
                    System.out.println("insufficient balance ... Your balance is : " + balance);
                }
                else {
                    balance -= amount;
                    System.out.println("Your new balance : " + balance);
                }

            } else if (transaction.equals("3")) {
                System.out.print("Amount ? :");
                double amount = scanner.nextDouble();
                scanner.nextLine(); //dummy
                balance += balance;
                System.out.println("Your new balance : " + balance);

            } else {

                System.out.println("Invalid transaction");
            }





        }











    }

}
