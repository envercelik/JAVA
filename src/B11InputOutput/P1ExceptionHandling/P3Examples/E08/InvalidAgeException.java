package B11InputOutput.P1ExceptionHandling.P3Examples.E08;

public class InvalidAgeException extends ArithmeticException{


    public InvalidAgeException(String s) {
        super(s);
    }


    @Override
    public void printStackTrace() {
        System.out.println("Invalid age exception bro");

    }
}
