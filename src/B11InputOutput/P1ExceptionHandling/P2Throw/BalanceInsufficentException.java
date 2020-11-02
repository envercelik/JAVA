package B11InputOutput.P1ExceptionHandling.P2Throw;

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
