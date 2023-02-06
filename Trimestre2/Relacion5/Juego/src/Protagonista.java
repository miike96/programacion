public class Protagonista {

    private String nombre;
    //Array de inventario de objetos con un máximo de 16 objetos
    private GameObject[] inventario = new GameObject[16];
    //Array de objetos equipados con un máximo de 4 objetos
    private GameObject[] equipados = new GameObject[4];
    //Array de objetos usados con un máximo de 4 objetos
    private GameObject[] usados = new GameObject[4];
    //Array de objetos consumidos con un máximo de 4 objetos
    private GameObject[] consumidos = new GameObject[4];
    //Array de objetos desechados con un máximo de 4 objetos
    private GameObject[] desechados = new GameObject[4];

    public Protagonista(String nombre) {
        this.nombre = nombre;
    }

    public void addObjeto(GameObject objeto) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                inventario[i] = objeto;
                break;
            }
        }
    }

    public void equiparObjeto(GameObject objeto) {
        for (int i = 0; i < equipados.length; i++) {
            if (equipados[i] == null) {
                equipados[i] = objeto;
                break;
            }
        }
    }

    public void usarObjeto(GameObject objeto) {
        for (int i = 0; i < usados.length; i++) {
            if (usados[i] == null) {
                usados[i] = objeto;
                break;
            }
        }
    }

    public void consumirObjeto(GameObject objeto) {
        for (int i = 0; i < consumidos.length; i++) {
            if (consumidos[i] == null) {
                consumidos[i] = objeto;
                break;
            }
        }
    }

    public void deshacerObjeto(GameObject objeto) {
        for (int i = 0; i < desechados.length; i++) {
            if (desechados[i] == null) {
                desechados[i] = objeto;
                break;
            }
        }
    }

    public void mostrarInventario() {
        System.out.println("Nombre del protagonista: " + nombre);
        System.out.println("Objetos del inventario: ");
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null) {
                System.out.println(inventario[i].getNombre());
            }
        }
        System.out.println("Objetos equipados: ");
        for (int i = 0; i < equipados.length; i++) {
            if (equipados[i] != null) {
                System.out.println(equipados[i].getNombre());
            }
        }
        System.out.println("Objetos usados: ");
        for (int i = 0; i < usados.length; i++) {
            if (usados[i] != null) {
                System.out.println(usados[i].getNombre());
            }
        }
        System.out.println("Objetos consumidos: ");
        for (int i = 0; i < consumidos.length; i++) {
            if (consumidos[i] != null) {
                System.out.println(consumidos[i].getNombre());
            }
        }
        System.out.println("Objetos desechados: ");
        for (int i = 0; i < desechados.length; i++) {
            if (desechados[i] != null) {
                System.out.println(desechados[i].getNombre());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GameObject[] getInventario() {
        return inventario;
    }

    public void setInventario(GameObject[] inventario) {
        this.inventario = inventario;
    }

    public GameObject[] getEquipados() {
        return equipados;
    }

    public void setEquipados(GameObject[] equipados) {
        this.equipados = equipados;
    }

    public GameObject[] getUsados() {
        return usados;
    }

    public void setUsados(GameObject[] usados) {
        this.usados = usados;
    }

    public GameObject[] getConsumidos() {
        return consumidos;
    }

    public void setConsumidos(GameObject[] consumidos) {
        this.consumidos = consumidos;
    }

    public GameObject[] getDesechados() {
        return desechados;
    }

    public void setDesechados(GameObject[] desechados) {
        this.desechados = desechados;
    }

    public void moverse() {
        System.out.println("El protagonista se mueve");

    }

    public void setEscenario(Escenario escenario) {
        System.out.println("El protagonista se sitúa en el escenario");
    }
    
    public void mostrarEscenario() {
        System.out.println("El protagonista se muestra en el escenario");
    }

    public void mostrarObjeto() {
        System.out.println("El protagonista se muestra en el objeto");
    }

    public void mostrarProtagonista() {
        System.out.println("El protagonista se muestra en el personaje");
    }

    public void cogerObjeto() {
        System.out.println("El protagonista coge el objeto");

    }

    public void guardarPartida() {
      // TODO document why this method is empty
    }

    public void cargarPartida() {
      // TODO document why this method is empty
    }


}
