package day61_exeption_hendeling;

public class insufficientBalanceException extends RuntimeException{
    public insufficientBalanceException() {
    }

    public insufficientBalanceException(String message) {
        super(message);
    }
}
