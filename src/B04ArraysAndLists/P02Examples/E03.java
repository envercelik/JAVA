package B04ArraysAndLists.P02Examples;

import java.util.Scanner;

public class E03 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);

        System.out.println("Avarage : " + getAvarage(myIntegers));


    }


    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values : \r");
        int[] values = new int[number];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }


    public static double getAvarage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / (double) array.length;
    }


}
