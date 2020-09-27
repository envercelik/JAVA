package B01Introduction.P11Examples;

import java.util.Scanner;

public class E10 {


    public static void main(String[] args) {

        //Girilen vize ve final notuna göre ortalama ve harf notu hesapla

        Scanner scanner = new Scanner(System.in);


        System.out.print("Visa : ");
        int visaNote = scanner.nextInt();

        System.out.print("Final : ");
        int finalNote = scanner.nextInt();

        int note = (int)(visaNote * 0.4 + finalNote * 0.6);

        if ( note > 90 ) {

            System.out.println(note  + " --> A1");

        } else if ( note > 80) {

            System.out.println(note  + " --> A2");

        } else if ( note > 70) {

            System.out.println(note  + " --> B1");

        } else if ( note > 65) {

            System.out.println(note  + " --> B2");

        } else if ( note > 60) {

            System.out.println(note  + " --> C");

        } else {

            System.out.println(note  + " --> F3");

        }



    }



}
