package B1Introduction.P8Loops;

public class Main {
    public static void main(String[] args) {

        //while loop
        int i= 0;
        while (i<10) {
            System.out.print("i = " + i);
            i++;
        }


        //do-while loop
        int k = 0;

        do {
            System.out.print("k = " + k);
            k++;
        } while (k<10);




        //for loop
        for (int j=0; j<10; j++) {
            System.out.print("j = " + j);
        }



        //break
        for (int j=0; j<10; j++) {
            if (j==5)
                break;
            System.out.print("j = " + j);
        }



        //continue
        for (int j=0; j<10; j++) {
            if (j==5)
                continue;
            System.out.print("j = " + j);
        }
    }

}
