package B01Introduction.P11Examples;

import java.util.Scanner;

public class E14 {

    public static void main(String[] args) {

        //find max and min number number

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number : ");
        int number1 = scanner.nextInt();

        System.out.print("Second number : ");
        int number2 = scanner.nextInt();


        System.out.print("Third number : ");
        int number3 = scanner.nextInt();


        System.out.println("Max number: " + findMaxNumber(number1 , number2 ,number3));
        System.out.println("Min number: " + findMinNumber(number1 , number2 ,number3));



    }


    public static int findMaxNumber (int number1 , int number2 , int number3) {

        int maxNumber = number1;

        if (maxNumber < number2) {

            maxNumber = number2;
        }


        if (maxNumber < number3) {

            maxNumber = number3;
        }


        return maxNumber;



    }

    public static int findMinNumber (int number1 , int number2 , int number3) {

        int minNumber = number1;

        if (minNumber > number2) {

            minNumber = number2;
        }


        if (minNumber > number3) {

            minNumber = number3;
        }


        return minNumber;



    }

}


