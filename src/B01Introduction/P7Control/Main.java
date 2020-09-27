package B01Introduction.P7Control;

public class Main {

    public static void main(String[] args) {

        int age = 25;

        //if
        if ( age > 18) {
            System.out.println("you have permission to enter");
        }


        //if-else
        if( age > 18 ) {
            System.out.println("you have permission to enter");
        } else {
            System.out.println("you don't have permission to enter");
        }


        //if -  else if - else
        int note = 70;
        if( note > 90 ) {
            System.out.println("A1");
        } else if(note > 80) {
            System.out.println("A2");
        } else if(note > 70) {
            System.out.println("B1");
        } else if(note > 65) {
            System.out.println("B2");
        } else if(note > 60 ) {
            System.out.println("C");
        } else {
            System.out.println("F3");
        }





        //single statement if
        if ( age > 18)
            System.out.println("you have permission to enter");


        //single statement if-else
        if( age > 18 )
            System.out.println("you have permission to enter");
        else
            System.out.println("you don't have permission to enter");




        //short if (ternary)
        int s1=10 , s2 = 7 , s3 = 0;
        s3 = (s1>s2) ? (s1-s2) : (s2-s1);




        //switch-case
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("Your choice is " + choice);
                break;

            case 2:
                System.out.println("Your choice is " + choice);
                break;

            case 3:
                System.out.println("Your choice is " + choice);
                break;

            default:
                System.out.println("invalid value");
        }


    }
}
