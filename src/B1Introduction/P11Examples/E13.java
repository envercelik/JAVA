package B1Introduction.P11Examples;

import java.util.Scanner;

public class E13 {

    public static void main(String[] args) {

        //Kullanıcıdan alınan 2 değer arasındaki (değerler dahil) tüm asal sayıları bastıran program

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number :");
        int firsNumber = scanner.nextInt();


        System.out.print("Enter second number :");
        int secondNumber = scanner.nextInt();


        for (int i= firsNumber; i<=secondNumber; i++) {

            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }




    }


    public static boolean isPrimeNumber (int number) {

        if(number < 2) {

            return false;
        }


        for (int i=2; i<number; i++) {

            if(number % i == 0) {
                return false;
            }
        }


        return true;
    }

}

