package B01Introduction.P11Examples;

public class E18 {

    public static void main(String[] args) {

        //iki sayının ebobunu bulma
        System.out.println(getGreatestCommomDivisor(25,50));
        System.out.println(getGreatestCommomDivisor(7,17));
        System.out.println(getGreatestCommomDivisor(9,56));
        System.out.println(getGreatestCommomDivisor(1955,2549));




    }

    public static int getGreatestCommomDivisor ( int firstNumber , int secondNumber) {


        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }


        for (int i = firstNumber; i > 0; i--) {

            if (firstNumber % i == 0 && secondNumber % i == 0) {
                return i;
            }
        }


        return -1;

    }

}
