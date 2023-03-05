package boletin6.ejercicio7;

public class RecetaException extends Exception {

    public RecetaException() {
    }

    public RecetaException(String message) {
        super(message);
    }

    public RecetaException(Throwable cause) {
        super(cause);
    }

    public RecetaException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecetaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
