package P1Introduction.P10Examples;

public class E4 {

    //Leap year Calculator

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));



    }


    public static boolean isLeapYear (int year) {

        if (year >=1  && year <= 9999 ) {

            return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;

        }else {

            return false;
        }


    }


}


