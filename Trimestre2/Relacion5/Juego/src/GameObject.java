public class GameObject {

    private String nombre;
    private String descripcion;

    public GameObject(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void mostrarObjeto() {
        System.out.println("Nombre del objeto: " + nombre);
        System.out.println("Descripción del objeto: " + descripcion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
