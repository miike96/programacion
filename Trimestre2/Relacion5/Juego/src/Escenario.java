public class Escenario {

    private String nombre;
    private String descripcion;
    //Lista de objetos en el escenario
    private GameObject[] objetos = new GameObject[16];
    //Lista de personajes
    private String[] personajes = new String[16];  
    
    public Escenario(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void addObjeto(GameObject objeto) {
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] == null) {
                objetos[i] = objeto;
                break;
            }
        }
    }

    public void addPersonaje(String personaje) {
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] == null) {
                personajes[i] = personaje;
                break;
            }
        }
    }

    public void mostrarEscenario() {
        System.out.println("Nombre del escenario: " + nombre);
        System.out.println("Descripción del escenario: " + descripcion);
        System.out.println("Objetos del escenario: ");
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] != null) {
                System.out.println(objetos[i].getNombre());
            }
        }
        System.out.println("Personajes del escenario: ");
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                System.out.println(personajes[i]);
            }
        }
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

    public GameObject[] getObjetos() {
        return objetos;
    }

    public void setObjetos(GameObject[] objetos) {
        this.objetos = objetos;
    }

    public String[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String[] personajes) {
        this.personajes = personajes;
    }

    
}
