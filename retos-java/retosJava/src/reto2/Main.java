package reto2;
// Funciones y alcance.

/*
 * Este reto podrás encontrarlo en:
 *  https://retosdeprogramacion.com/roadmap/
 */

public class Main {
    public static void main(String[] args){

        // Accediendo a los métodos.
        Funciones resultado = new Funciones();

        // Imprimir métodos.
        System.out.print("Saludo Genérico: ");
        resultado.saludo();

        System.out.print("Saludo Personalizado: ");
        resultado.saludoPersonalizado("Jhon", "Mejia");

        double areaCirculo = resultado.areaCirculo(5);
        System.out.println("Área de un círculo: " + areaCirculo);

        System.out.println("Métodos propios de Java(toUpperCase, toLowerCase): ");
        resultado.metodosJava();

        System.out.println("Método anidado en otro método: ");
        resultado.primerMetodo();

    }
}
