package B1Introduction.P11Examples;

import java.util.Scanner;

public class E6 {

    /*
        Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle endeksini hesaplaplayın
        Beden kitle endeksi = kilo(kg) / (boy(m)*boy(m))
        18.5 altı zayıf
        18.5-25 arası normal
        25-30  arası kilolu
        30 ve üstü obez
    */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter your weight :");
        int weight = scanner.nextInt();

        System.out.print("please enter your height :");
        double height = scanner.nextDouble();

        double bodyMassIndex = weight / (height * height);
        System.out.println("Your body mass index is : " + bodyMassIndex);

        if(bodyMassIndex < 18.5) {
            System.out.println("You are thin");

        } else if ( bodyMassIndex < 25) {
            System.out.println("You are normal");

        } else if ( bodyMassIndex < 30 ) {
            System.out.println("You are fat");

        } else {
            System.out.println("You are obeze");
        }



    }

}
