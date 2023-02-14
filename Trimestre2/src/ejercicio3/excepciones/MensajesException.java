package ejercicio3.excepciones;

public class MensajesException extends Exception {

    public MensajesException() {
    }

    public MensajesException(String message) {
        super(message);
    }

    public MensajesException(Throwable cause) {
        super(cause);
    }

    public MensajesException(String message, Throwable cause) {
        super(message, cause);
    }

    public MensajesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    
    
}
