package day61_exeption_hendeling;

public class BreakTimeException extends RuntimeException{

    public BreakTimeException() {
    }

    public BreakTimeException(String message) {
        super(message);
    }
}
