package tablero;

import dados.Dado;

public class Tablero {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Dado dadoA = new Dado(4, 2);
            Dado dadoB = new Dado(12, 1);
            Dado dadoC = new Dado(6, 10);
            System.out.println("Dado A " + dadoA.lanzar());
            System.out.println("Dado B " + dadoB.lanzar());
            System.out.println("Dado C " + dadoC.lanzar());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
