package excepciones;

public class PlanetasException extends Exception{

    public PlanetasException(String message) {
        super(message);
    }

    public PlanetasException(Throwable cause) {
        super(cause);
    }

    public PlanetasException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlanetasException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
