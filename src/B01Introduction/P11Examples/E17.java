package B01Introduction.P11Examples;

public class E17 {

    public static void main(String[] args) {

        //perfect number : pozitif bölenlerinin toplamı kendisine işit olan sayı

        System.out.println(isPerfect(6));




    }


    public static boolean isPerfect ( int number) {

        int sum = 0;

        if (number < 1 ) {

            return false;
        }


        for ( int i=1; i<number; i++) {

            if ( number % i == 0) {
                sum += i;
            }
        }


        return sum == number;
    }
}
