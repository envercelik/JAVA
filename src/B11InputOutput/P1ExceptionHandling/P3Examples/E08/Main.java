package B11InputOutput.P1ExceptionHandling.P3Examples.E08;

public class Main {
    public static void main(String[] args) {

        int age = 13;

        try {
            enterTheBar(age);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
            System.out.println(e);
        }


    }


    public static void enterTheBar(int age) {

        if (age < 18) {
            throw new InvalidAgeException("Children under the age of 18 are not allowed to enter the bar");
        } else {
            System.out.println("Welcome");
        }

    }
}
