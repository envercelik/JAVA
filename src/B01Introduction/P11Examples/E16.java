package B01Introduction.P11Examples;

public class E16 {

    public static void main(String[] args) {

        //polindrome Number  : tersten okunusu aynı olan sayılar

        System.out.println(isPolindrome(123));
        System.out.println(isPolindrome(121));





    }


    public static boolean isPolindrome (int number) {

        int savedNumber = number;
        int reversedNumber = 0;
        int count = 1;

        while (number > 0 ) {

            reversedNumber += (number%10) * count;
            number = number/10;
            count *=10;

        }


        return savedNumber == reversedNumber;


    }


}
