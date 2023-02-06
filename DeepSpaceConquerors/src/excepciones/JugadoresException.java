package excepciones;

public class JugadoresException extends Exception{

    public JugadoresException(String message) {
        super(message);
    }

    public JugadoresException(Throwable cause) {
        super(cause);
    }

    public JugadoresException(String message, Throwable cause) {
        super(message, cause);
    }

    public JugadoresException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
