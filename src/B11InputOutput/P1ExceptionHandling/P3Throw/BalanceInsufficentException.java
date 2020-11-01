package B11InputOutput.P1ExceptionHandling.P3Throw;

public class BalanceInsufficentException extends Exception{
    String message;

    public BalanceInsufficentException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
