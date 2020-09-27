package B01Introduction.P11Examples;

public class E2 {

    public static void main(String[] args) {

        //MegaBytes Converter
        printMegaBytesAndKiloBytes(2500);

    }


    public static void printMegaBytesAndKiloBytes ( int kiloBytes) {

        if ( kiloBytes < 0) {

            System.out.println("Invalid Value");

        } else {

            int megaBytes = kiloBytes / 1024;
            int remainKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainKiloBytes + " KB");

        }

    }



}

