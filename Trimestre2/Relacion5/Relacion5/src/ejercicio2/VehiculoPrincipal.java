package ejercicio2;

import java.util.Scanner;

public class VehiculoPrincipal {

    public static final int MAX_VEHICULOS = 200;
    private static Scanner teclado = new Scanner(System.in);

    //Decladrar un array de vehiculos
    private Vehiculos[] vehiculos;

   /**
    * Constructor de la clase VehiculoPrincipal
    * @param args
    * @throws VehiculosException
    */

    public VehiculoPrincipal() {
        vehiculos = new Vehiculos[MAX_VEHICULOS];
    }
     /**
      * Metodo main que crea un objeto de la clase VehiculoPrincipal y llama al metodo altaVehiculo
      * @param args
     * @throws VehiculosException
      */
    public static void main(String[] args) throws VehiculosException {
        VehiculoPrincipal vehiculoPrincipal = new VehiculoPrincipal();
        vehiculoPrincipal.altaVehiculo();
        vehiculoPrincipal.mostrarVehiculos();
        System.out.println("Fin del programa");
    }

    /**
     * Declaramos un metodo booleano que nos permita dar de alta un vehiculo y que nos devuelva true si se ha dado de alta correctamente
     * y false si no se ha dado de alta correctamente
     * @param vehiculo
     * @return
     * @throws VehiculosException
     */

    public boolean altaVehiculo() throws VehiculosException {

        //Declaramos un objeto de la clase Vehiculos y lo inicializamos a null para que no de error de compilacion
        Vehiculos vehiculo = null;
        String tipoVehiculo = "";
        //Declaramos una variable booleana que nos permita controlar si se ha dado de alta correctamente el vehiculo
        boolean respuesta = false;
        
        //Declaramos un bucle while que nos permita controlar si se ha dado de alta correctamente el vehiculo
        while(!respuesta) {
            System.out.println("Introduce el tipo de vehiculo: ");
            System.out.println("Coche, Microbus, Furgoneta");
            tipoVehiculo = teclado.nextLine().toLowerCase();
            /*
             * Declaramos un switch que nos permita controlar si se ha dado de alta correctamente el vehiculo
             * Si se ha dado de alta correctamente el vehiculo nos devolvera true
             * Si no se ha dado de alta correctamente el vehiculo nos devolvera false
             * @param tipoVehiculo
             * @return respuesta
             * @throws VehiculosException
             */
            switch (tipoVehiculo) {
                case "coche":
                    respuesta = true;
                    break;
                case "microbus":
                    respuesta = true;
                    break;
                case "furgoneta":
                    respuesta = true;
                    break;
                default:
                    System.out.println("El tipo de vehiculo no es correcto");
                    break;
            }
        }

        respuesta = false;

        String matricula = "";
        //Declaramos un bucle while que nos permita controlar si se ha dado de alta correctamente la matricula
        while(!respuesta) {
            System.out.println("Introduce la matricula: ");
            System.out.println("Ejemplo: 1234ABC");
            matricula = teclado.nextLine().toUpperCase();
            if(matricula.length() >= 7 && matricula.length() <= 8) {
                respuesta = true;
            } else {
                System.out.println("La matricula no es correcta");
            }
        }

        respuesta = false;

        Gama gama = null;
        //Pedir la gama y validar que sea correcta
        while(!respuesta) {
            System.out.println("Introduce la gama: ");
            System.out.println("Baja, Media, Alta");
            String gamaString = teclado.nextLine().toUpperCase();
            /*
             * Declaramos un switch que nos permita controlar si se ha dado de alta correctamente la gama
             * Si se ha dado de alta correctamente la gama nos devolvera true
             * Si no se ha dado de alta correctamente la gama nos devolvera false
             * @param gamaString
             * @param gama
             * @param respuesta
             * @return
             */
            switch (gamaString) {
                case "BAJA":
                    gama = Gama.BAJA;
                    respuesta = true;
                    break;
                case "MEDIA":
                    gama = Gama.MEDIA;
                    respuesta = true;
                    break;
                case "ALTA":
                    gama = Gama.ALTA;
                    respuesta = true;
                    break;
                default:
                    System.out.println("La gama no es correcta");
                    break;
            }
        }

        respuesta = false;
        TipoCombustible tipoCombustible = null;

        //Pedir el tipo de combustible y validar que sea correcto
        while(!respuesta) {
            System.out.println("Introduce el tipo de combustible: ");
            System.out.println("Diesel, Gasolina");
            String tipoCombustibleString = teclado.nextLine().toUpperCase();
            /*
             * Declaramos un switch que nos permita controlar si se ha dado de alta correctamente el tipo de combustible
             * Si se ha dado de alta correctamente el tipo de combustible nos devolvera true
             * Si no se ha dado de alta correctamente el tipo de combustible nos devolvera false
             * @param tipoCombustibleString
             * @param tipoCombustible
             * @param respuesta
             * @return
             */
            switch (tipoCombustibleString) {
                case "DIESEL":
                    tipoCombustible = TipoCombustible.DIESEL;
                    respuesta = true;
                    break;
                case "GASOLINA":
                    tipoCombustible = TipoCombustible.GASOLINA;
                    respuesta = true;
                    break;
                default:
                    System.out.println("El tipo de combustible no es correcto");
                    break;
            }
        }
        /*
         * Declaramos un switch que nos permita controlar si se ha dado de alta correctamente el vehiculo
         * Si se ha dado de alta correctamente el vehiculo nos devolvera true
         * Si no se ha dado de alta correctamente el vehiculo nos devolvera false
         * @param tipoVehiculo
         * @param gama
         * @param tipoCombustible
         * @param matricula
         * @param vehiculo
         * @param teclado
         * @param respuesta
         * @param asientos
         * @param carga
         */
        switch (tipoVehiculo) {
            case "coche":
                vehiculo = new Coche(gama, tipoCombustible, matricula);
                break;
            case "microbus":
                int asientos = 0;
                respuesta = false;
                /*
                 * Declaramos un bucle while que nos permita controlar si se ha dado de alta correctamente el numero de asientos del microbus
                 * Si se ha dado de alta correctamente el numero de asientos nos devolvera true
                 * Si no se ha dado de alta correctamente el numero de asientos nos devolvera false
                 * @param asientos
                 * @param respuesta
                 * @param teclado
                 */
                while(!respuesta) {
                    System.out.println("Introduce el numero de asientos: ");
                    asientos = teclado.nextInt();
                    if(asientos >= 5 && asientos <= 9) {
                        respuesta = true;
                    } else {
                        System.out.println("El numero de asientos no es correcto");
                    }
                }
                vehiculo = new Microbus(gama, tipoCombustible, matricula, asientos);
                break;
            case "furgoneta":
                double capacidad = 0;  
                respuesta = false;
                /*
                 * Declaramos un bucle while que nos permita controlar si se ha dado de alta correctamente la capacidad de la furgoneta
                 * Si se ha dado de alta correctamente la capacidad nos devolvera true
                 * Si no se ha dado de alta correctamente la capacidad nos devolvera false
                 * @param capacidad
                 * @param respuesta
                 * @param teclado
                 */
                while(!respuesta) {
                    System.out.println("Introduce la capacidad: ");
                    capacidad = teclado.nextDouble();
                    if(capacidad >= 1 && capacidad <= 3) {
                        respuesta = true;
                    } else {
                        System.out.println("La capacidad no es correcta");
                    }
                }
                vehiculo = new Furgoneta(gama, tipoCombustible, matricula, capacidad);
                break;
        }

        respuesta = false;

        //Preguntamos por el numero de dias que va a alquilar el vehiculo
        int dias = 0;
        /*
         * Declaramos un bucle while que nos permita controlar si tiene el numero de dias correcto
         * Si tiene el numero de dias correcto nos devolvera true
         * Si no tiene el numero de dias correcto nos devolvera false
         * @param dias
         * @param respuesta
         * @param teclado
         * @param vehiculo
         */
        while(!respuesta) {
            System.out.println("Introduce el numero de dias que va a alquilar el vehiculo (minimo 1 día, máximo 7): ");
            dias = teclado.nextInt();
            if(dias >= 1 && dias <= 7) {
                respuesta = true;
            } else {
                System.out.println("El numero de dias no es correcto");
            }
        }

        //Mostramos el precio del alquiler
        System.out.println("El precio del alquiler es: " + vehiculo.getPrecioPorDia(dias) + "€");
        return altaVehiculo(vehiculo);
}

    //Metodo que da de alta un vehiculo en el array de vehiculos
    private boolean altaVehiculo(Vehiculos vehiculo) throws VehiculosException {
        boolean respuesta = false;
        //Recorremos el array de vehiculos para dar de alta el vehiculo
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] == null) {
                vehiculos[i] = vehiculo;
                respuesta = true;
                break;
            }
        }
        //Si no hay espacio para mas vehiculos nos devolvera un mensaje de error
        if(!respuesta) {
            throw new VehiculosException("No hay espacio para mas vehiculos");
        }
        return respuesta;
    }

    //Metodo que muestra los vehiculos del array
    public void mostrarVehiculos() {
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null) {
                System.out.println(vehiculos[i].toString());
            }
        }
    }
}
