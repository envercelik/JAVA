package B01Introduction.P11Examples;

import java.util.Scanner;

public class E12 {

    public static void main(String[] args) {

        //faktoriel

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number for calculate factoriel  : ");
        int number = scanner.nextInt();

        int result = 1;

        for (int i=2; i<=number; i++)
        {
            result *=i;
        }
        System.out.println(number + "! = " + result);

    }
}
