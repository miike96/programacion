package excepciones;

public class DadosException extends Exception{

    public DadosException(String message) {
        super(message);
    }

    public DadosException(Throwable cause) {
        super(cause);
    }

    public DadosException(String message, Throwable cause) {
        super(message, cause);
    }

    public DadosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}