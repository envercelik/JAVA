package B11InputOutput.P1ExceptionHandling.P2Examples.E04;

public class Main {

    public static void main(String[] args) {

        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }


        System.out.println("this statement is working");

    }
}
