package B11InputOutput.P1ExceptionHandling.P3Examples.E02;

public class Main {

    public static void main(String[] args) {

        try {
            int number = 10/0;
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("this statement is working :)");

    }
}
