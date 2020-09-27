package B01Introduction.P11Examples;

public class E8 {

    public static void main(String[] args) {

        //armstrong number
        //1634 = 1^4+6^4+3^4+4^4 ise sayı amstrong sayıdır (kuvvet olan 4 basamak sayısıdır)


        int number = 1634;
        int sum = 0;
        int savedNumber = number;
        int decimalPlaces = 0;

        while (number > 0 ) {
            number /= 10;
            decimalPlaces++;
        }



        number = savedNumber;
        while (number > 0) {

            sum += Math.pow (number%10 , decimalPlaces);
            number /= 10;

        }

        if (sum == savedNumber) {
            System.out.println( savedNumber + " is a armstrong number");
        }
        else {
            System.out.println( savedNumber + " is not a armstrong number");
        }





    }
}
