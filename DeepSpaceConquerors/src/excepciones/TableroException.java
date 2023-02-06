package excepciones;

public class TableroException extends Exception{

    public TableroException(String message) {
        super(message);
    }

    public TableroException(Throwable cause) {
        super(cause);
    }

    public TableroException(String message, Throwable cause) {
        super(message, cause);
    }

    public TableroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
 
}
