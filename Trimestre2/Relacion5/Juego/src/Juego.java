import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

public class Juego {
    /**
     * Se va a implementar un juego de rol en el que el jugador
     * va a poder interactuar con un escenario y con los personajes
     * que se encuentren en él. El jugador va a poder moverse por el
     * escenario, interactuar con los personajes y con los objetos
     * que se encuentren en el escenario. El jugador va a poder
     * coger objetos del escenario y guardarlos en su inventario.
     * El jugador va a poder hablar con los personajes y realizar
     * acciones con ellos. El jugador va a poder guardar su partida
     * y cargarla cuando quiera.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // // Se crea el escenario
        // Escenario escenario = new Escenario("Escenario 1", "Escenario de prueba");
        // // Se crea el jugador
        // Protagonista jugador = new Protagonista("Jugador 1");
        // // Se crea el objeto
        // GameObject objeto = new GameObject("Objeto 1", "Objeto de prueba");
        // // Se añade el objeto al escenario
        // escenario.addObjeto(objeto);
        // // Se añade el protagonista al escenario
        // escenario.addPersonaje(jugador.getNombre());
        // // Se añade el escenario al protagonista
        // jugador.setEscenario(escenario);
        // // Se mueve el jugador al escenario
        // jugador.moverse();
        // // Se muestra el escenario
        // jugador.mostrarEscenario();
        // // Se muestra el inventario del jugador
        // jugador.mostrarInventario();
        // // Se muestra el objeto
        // objeto.mostrarObjeto();
        // // Se muestra el protagonista
        // jugador.mostrarProtagonista();
        menu();
    }

    public static void menu() {
        Protagonista jugador = new Protagonista("Miguel López Rodríguez");
        // Se muestra el menú
        // Se saluda al jugador
        System.out.println("Bienvenido al juego " + jugador.getNombre());
        // Descripción del juego
        System.out.println("Bienvenido a Gorilla Island. Una aventura gráfica en modo texto para los alumnos de 1º de DAM del IES Miravent");
        //Acciones del jugador en el juego
        System.out.println("MIRAR: Permite leer la descripción de un objeto o personaje");
        System.out.println("COGER: Permite coger un objeto del escenario y guardarlo en el inventario");
        System.out.println("USAR: Permite usar un objeto del inventario");
        System.out.println("HABLAR: Permite hablar con un personaje");
        System.out.println("GUARDAR: Permite guardar la partida");
        System.out.println("CARGAR: Permite cargar una partida guardada");
        System.out.println("SALIR: Permite salir del juego");

        //Descripcion del escenario
        System.out.println("Estás en una isla desierta. En el centro de la isla hay una cabaña. Alrededor de la cabaña hay un bosque. Al norte hay un acantilado. Al sur hay un lago. Al este hay un río. Al oeste hay un monte.");
        // Se muestra el menú
        System.out.println("Menú del juego");
        System.out.println("1. Moverse");
        System.out.println("2. Coger objeto");
        System.out.println("3. Guardar partida");
        System.out.println("4. Cargar partida");
        System.out.println("5. Salir");
        // Se pide al jugador que elija una opción
        System.out.println("Elige una opción: ");
        int opcion = 0;
        switch (opcion) {
            case 1:
                // Se mueve el jugador
                jugador.moverse();
                break;
            case 2:
                // Se coge un objeto
                jugador.cogerObjeto();
                break;
            case 3:
                // Se guarda la partida
                jugador.guardarPartida();
                break;
            case 4:
                // Se carga la partida
                jugador.cargarPartida();
                break;
            case 5:
                // Se sale del juego
                System.out.println("Gracias por jugar a Gorilla Island");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }

}