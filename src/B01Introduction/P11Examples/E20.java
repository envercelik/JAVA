package B01Introduction.P11Examples;

import java.util.Scanner;

public class E20 {

    public static void main(String[] args) {
        //Calculator

        Scanner scanner = new Scanner(System.in);
        showMenu();


        while (true) {

            System.out.print("Select : ");
            int selected;

            boolean isAnInteger = scanner.hasNextInt();
            if (isAnInteger) {
                selected = scanner.nextInt();

                if (selected < 1 || selected > 4 )
                {
                    System.out.println("Invalid value please  select menu number");
                    continue;
                }


            } else {

                System.out.println("Please enter an integer");
                continue;
            }



            System.out.print("Enter number 1 : ");
            int number1 = scanner.nextInt();


            System.out.print("Enter number 2 : ");
            int number2 = scanner.nextInt();


            switch (selected) {
                case 1 -> {
                    sum(number1, number2);
                }
                case 2 -> {
                    deduct(number1, number2);
                }
                case 3 -> {
                    product(number1, number2);
                }
                case 4 -> {
                    divide(number1, number2);
                }
                case 5 -> {
                    showMenu();
                }
                default -> System.out.println("Invalid Value");
            }



        }



    }




    public static void showMenu () {

        System.out.println("1- Sum");
        System.out.println("2- Deduct");
        System.out.println("3- Product");
        System.out.println("4- Divide");
        System.out.println("5- Show menu");
        System.out.println("Q- Quit");


    }

    public static void sum (int number1 , int number2) {

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
    }


    public static void deduct (int number1 , int number2) {

        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
    }



    public static void product (int number1 , int number2) {

        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
    }



    public static void divide (int number1 , int number2) {

        if ( number2 == 0) {
            System.out.println("Number 2 is not to be zero");
        } else {
            System.out.println(number1 + " / " + number2 + " = " + ((double)number1 / number2));
        }


    }


}
