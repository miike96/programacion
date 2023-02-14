package ejercicio3;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Persona {

    private String nombre;
    private String mensajeTexto;
    private LocalDateTime fechaMensaje;

    /**
     * Constructor con parametros de la clase padre en la que
     * heredaran los hijos
     * @param nombre
     * @param mensajeTexto
     * @param fechaMensaje
     */

    public Persona(String nombre, String mensajeTexto, LocalDateTime fechaMensaje) {

        if(nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacio");

        if(mensajeTexto == null || mensajeTexto.isEmpty())
            throw new IllegalArgumentException("El mensaje no puede ser nulo o vacio");
        
        if(fechaMensaje == null)
            throw new IllegalArgumentException("La fecha no puede ser nula");

        this.nombre = nombre;
        this.mensajeTexto = mensajeTexto;
        this.fechaMensaje = fechaMensaje;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getMensajeTexto() {
        return mensajeTexto;
    }

    public LocalDateTime getFechaMensaje() {
        return fechaMensaje;
    }

    /**
     * Método para poder enviar un mensaje a otra persona. Recibirá como parámetro
     * la persona a la que se le quiere enviar el mensaje y el mensaje a enviar.
     * @param persona
     * @param mensaje
     */

    public void enviarMensaje(Persona persona, String mensaje) {

        if(persona == null)
            throw new IllegalArgumentException("La persona no puede ser nula");

        if(mensaje == null || mensaje.isEmpty())
            throw new IllegalArgumentException("El mensaje no puede ser nulo o vacio");

        persona.recibirMensaje(mensaje);
    }

    /**
     * Método para poder recibir un mensaje de otra persona. Recibirá como parámetro
     * el mensaje que se le ha enviado.
     * @param mensaje
     */

    public void recibirMensaje(String mensaje) {

        if(mensaje == null || mensaje.isEmpty())
            throw new IllegalArgumentException("El mensaje no puede ser nulo o vacio");

        this.mensajeTexto = mensaje;
        this.fechaMensaje = LocalDateTime.now();
    }
}

