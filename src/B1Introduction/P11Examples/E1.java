package B1Introduction.P11Examples;

public class E1 {

    public static void main(String[] args) {

        //speed converter

        speedConversion(10.5);


    }


    public static long toMilesPerHour (double kilometersPerHour) {

        if (kilometersPerHour < 0) {

            return -1;
        }

        return Math.round( kilometersPerHour / 1.609 );

    }


    public static  void speedConversion (double kilometersPerHour) {

        if (kilometersPerHour < 0 ) {

            System.out.println("Invalid Value");

        }else {

            long toMilesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour + " mi/h");

        }

    }

}



