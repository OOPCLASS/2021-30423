package ro.utcluj;

public class OutOfInkException extends RuntimeException { //unchecked
    public OutOfInkException(String msg) {
        super(msg);
    }
}
