package B01Introduction.P11Examples;

public class E5 {

    public static void main(String[] args) {
        //Decimal Comporator

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));






    }

    public static boolean areEqualByThreeDecimalPlaces (double number1 , double number2) {

       number1 *=1000;
       number2 *=1000;

       int number1int = (int) number1;
       int number2int = (int) number2;


       return number1int % 1000 == number2int % 1000;



    }

}
