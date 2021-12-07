package ro.utcluj;

public class OutOfInkException extends RuntimeException{
    public OutOfInkException(String errorMessage) {
        super(errorMessage);
    }
}
