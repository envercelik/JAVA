package B01Introduction.P11Examples;

public class E3 {

    public static void main(String[] args) {

        //Barking Dog

        System.out.println(shouldWakeUp(true , 1));
        System.out.println(shouldWakeUp(false , 2));
        System.out.println(shouldWakeUp(true , 8));


    }


    public static boolean shouldWakeUp (boolean barking , int hourOfDay) {


        if ( hourOfDay < 0 || hourOfDay > 23 ) {

            return false;
        }


        if ( hourOfDay < 8 || hourOfDay > 22) {

            return barking;


        }

        return false;



    }
}
