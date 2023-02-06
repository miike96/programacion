package excepciones;

public class CartasException extends Exception{

    public CartasException(String message) {
        super(message);
    }

    public CartasException(Throwable cause) {
        super(cause);
    }

    public CartasException(String message, Throwable cause) {
        super(message, cause);
    }

    public CartasException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    
    
}
