package ro.utcluj;

public class OutOfPaperException extends Throwable { //checked
    public OutOfPaperException(String message) {
        super(message);
    }
}
