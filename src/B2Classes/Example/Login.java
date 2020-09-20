package B2Classes.Example;

import java.util.Scanner;

public class Login {

    public static boolean login (Customer customer) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please log in");

        System.out.print("enter your ID number :");
        String identityNumber = scanner.nextLine();

        System.out.print("enter your password :");
        String password = scanner.nextLine();


        if (customer.getIdentityNumber().equals(identityNumber) && customer.getPassword().equals(password)) {

            return true;

        } else  {

            System.out.println("Identity number or password  is incorrect please try again");
            return false;
        }






    }


}
