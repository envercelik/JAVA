package P1Introduction.P8Methods;

public class Main {

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;

        sum(number1,number2);

        int sum = sum(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sum);

    }



    //method
    private static void sum(int number1, int number2) {

        System.out.println(number1+number2);
    }


    //method overloading
    private static void sum(int number1, int number2 , int number3) {

        System.out.println(number1+number2+number3);
    }


    //method overloading
    private static void sum(double number1, double number2) {

        System.out.println(number1+number2);
    }



    //variable arguments
    private static int sum(int... numbers) {
        int sum = 0;
        for (int number:numbers) {
            sum += number;
        }

        return sum;
    }

}


/*

Not : parametreler primitive ise methoda değişkenlerin kendisi değil değerleri gider.

*/