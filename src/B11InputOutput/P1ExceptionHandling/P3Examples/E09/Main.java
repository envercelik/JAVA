package B11InputOutput.P1ExceptionHandling.P3Examples.E09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {

            menu();
            int choosen = scanner.nextInt();

            if (choosen == 0) {
                break;
            }


            try {

                System.out.print("number1 : ");
                int number1 = scanner.nextInt();

                System.out.print("number2 : ");
                int number2 = scanner.nextInt();
                scanner.nextLine();


                switch (choosen) {

                    case 1:
                        Calculator.sum(number1 , number2);
                        break;

                    case 2:
                        Calculator.division(number1,number2);
                        break;

                    default:
                        System.out.println("invalid value");

                }


            } catch (ArithmeticException e) {
                System.out.println("number2 cannot be zero");
            } catch (InputMismatchException e) {
                System.out.println("please enter only numbers");
            }


        }


    }


    public static void menu() {
        System.out.println("0 - quit");
        System.out.println("1 - sum");
        System.out.println("2 - division");

    }
}




/*



*/