package B01Introduction.P11Examples;

public class E15 {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {


        System.out.println(getDurationString(255,25));
        System.out.println(getDurationString(12450));

    }



    public static String getDurationString (int minutes , int seconds) {

        if (minutes >=0 && seconds >=0 && seconds <=59) {

            int hour = minutes / 60;
            int minute = minutes % 60;

            return hour + "h " + minute + "m " + seconds + "s";



        } else {
            return INVALID_VALUE_MESSAGE;

        }


    }



    public static String getDurationString (int seconds) {

        if (seconds >=0) {

            int remainSecond = seconds % 60;
            int minutes = seconds / 60;
            return getDurationString(minutes ,remainSecond);



        } else {
            return INVALID_VALUE_MESSAGE;

        }


    }



}

