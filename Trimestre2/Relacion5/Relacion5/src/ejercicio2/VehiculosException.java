package ejercicio2;

public class VehiculosException extends Exception {

    public VehiculosException() {
    }

    public VehiculosException(String message) {
        super(message);
    }

    public VehiculosException(Throwable cause) {
        super(cause);
    }

    public VehiculosException(String message, Throwable cause) {
        super(message, cause);
    }

    public VehiculosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
