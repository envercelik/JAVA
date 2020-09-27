package B01Introduction.P11Examples;

import java.util.Scanner;

public class E9 {

    public static void main(String[] args) {

         /*
           SAYI TAHMİN OYUNU :
             -Sistem iki basamakli bir sayı üretmeli, kullanıcı bu sayıyı tahmin etmeli
             -Kullanıcı sayıyı bilirse 10000 tl
             -Yerlerini faktlı olarak bilirse 5000 tl
             -sadece tek basamak bilirse 1000tl kazansın
        */


        Scanner scanner = new Scanner(System.in);

        while (true)

        {
            int randomNumber = (int) (Math.random()*90+10);
            System.out.println("Enter a 2 digit number :");
            int guess = scanner.nextInt();

            System.out.println("Random Number : " + randomNumber + " Guess : "  + guess);


            if(randomNumber == guess)
            {
                System.out.println("You won 10000 TL, congratulations");
            }
            else
            {

                int guessb1 = guess%10;
                int guessb2 = guess/10;


                int randomb1 = randomNumber%10;
                int randomb2 = randomNumber/10;



                if(guessb1 == randomb2 && guessb2==randomb1)
                {
                    System.out.println("You won 500 TL, congratulations");
                }
                else
                if(guessb1 == randomb1 || guessb1==randomb2 || guessb2==randomb1 || guessb2==randomb2)
                {
                    System.out.println("You won 1000 TL, congratulations\"");
                }
                else
                {
                    System.out.println("Try again");
                }
            }

        }








    }
}
