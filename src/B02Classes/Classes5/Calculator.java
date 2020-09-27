package B02Classes.Classes5;

public class Calculator {

    public static final double  PI = 3.14;

    static {

        System.out.println("Calculator class called");
    }

    public static double sum (double... numbers) {

        double sum = 0d;

        for (double number : numbers) {

            sum += number;
        }

        return sum;

    }


    public static double areaOfCircle (double radius) {

        return PI * radius * radius;

    }




}
