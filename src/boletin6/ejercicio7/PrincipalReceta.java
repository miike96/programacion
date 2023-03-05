package boletin6.ejercicio7;


public class PrincipalReceta {

    public static void main(String[] args) {

        try{
            Ingrediente ingrediente1 = new Ingrediente("Leche", 100);
            Ingrediente ingrediente2 = new Ingrediente("Azucar", 50);
            Ingrediente ingrediente3 = new Ingrediente("Huevos", 2);
            Ingrediente ingrediente4 = new Ingrediente("Harina", 100);

            Receta receta1 = new Receta("Tarta de manzana", 4);
            receta1.annadirIngrediente(ingrediente4);
            receta1.annadirIngrediente(ingrediente1);
            receta1.annadirIngrediente(ingrediente2);
            receta1.annadirIngrediente(ingrediente3);

            Recetario recetario1 = new Recetario();
            recetario1.annadirReceta(receta1);


            System.out.println(ingrediente1);
            System.out.println(ingrediente2);
            System.out.println(ingrediente3);
            System.out.println(ingrediente4);

            System.out.println(receta1);
            System.out.println();
            System.out.println(recetario1);
        } catch (RecetaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fin del programa");
    }
    
}
