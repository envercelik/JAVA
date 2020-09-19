package B1Introduction.P6Examples;

public class Main {

    public static void main(String[] args) {





        //Example 1
        System.out.println(1.0 -0.1 -0.1 -0.1 -0.1 -0.1);

        System.out.println(1.0 - 0.9);




        //Example 2
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);




        //Example 3
        int number1 = 1;
        int number2 = 2;

        double number3 = (number1+number2) /2;
        double number4 = (number1+number2) /2d;
        System.out.println(number3);
        System.out.println(number4);







        //Example 4
        //1 pound   = 0.45359237 kg
        double numberOfPounds = 500d;
        double  convertedKilogram = numberOfPounds * 0.45359237d;
        System.out.println(numberOfPounds + " pounds = " + convertedKilogram  + " kg");





        //Example 5
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;

        double  myValuesTotal  = 100.00 * (myFirstValue + mySecondValue);
        System.out.println("myValuesTotal : " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00;
        System.out.println("The remainder : " + theRemainder );
        boolean isNoRemainder = (theRemainder==0) ? true : false;
        System.out.println("is no remainder : " + isNoRemainder );


        System.out.println( isNoRemainder ? "" : "got some remainder");



        //Ecample 6 : fahrenheit convert celcius : celcius = 5/9 * (fahrenheit-32)

        double fahrenheit = 100;
        double celsius = 5.0/9 * (fahrenheit-32);
        System.out.println(fahrenheit + " fahrenheit = " + celsius + " celsius");


    }
}
