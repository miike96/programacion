package ejercicio3;

import java.time.LocalDate;

public abstract class Persona {

    private String nombre;
    private String textoMensaje;
    private LocalDate fechaMensaje;


    /**
     * Constructor de la clase Persona con parámetros
     */

    public Persona(String nombre, String textoMensaje, LocalDate fechaMensaje) {
        this.nombre = nombre;
        this.textoMensaje = textoMensaje;
        this.fechaMensaje = fechaMensaje;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTextoMensaje() {
        return textoMensaje;
    }

    public LocalDate getFechaMensaje() {
        return fechaMensaje;
    }

    

    
}
