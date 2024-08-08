package reto1;
import java.util.Scanner;

/*
* Este reto podrás encontrarlo en:
*  https://retosdeprogramacion.com/roadmap/
*/

public class Main {
    // Return:
    public static int areaTriangulo(int base, int altura) {
        return base * altura;
    }

    public static void main(String[] args) {

        // Operadores y estructuras de control.

        // Operadores Aritméticos:
        int valor1 = 45;
        int valor2 = 66;

        System.out.println("Suma: " + (valor1 + valor2));
        System.out.println("Resta: " + (valor1 - valor2));
        System.out.println("Multiplicacion: " + (valor1 * valor2));
        System.out.println("Division: " + (valor1 / valor2));
        System.out.println("Modulo: " + (valor1 % valor2));

        // Operadores de Asignacion:
        int valor3 = 12;  // Asignacion simple.
        System.out.println(valor3);

        valor1 += 12;
        System.out.println(valor1);

        valor1 -= 12;
        System.out.println(valor1);

        valor1 *= 2;
        System.out.println(valor1);

        valor1 /= 12;
        System.out.println(valor1);

        valor1 %= 2;
        System.out.println(valor1);

        // Operadores de comparación:
        boolean comparando = valor1 > valor2;
        System.out.println(comparando);

        comparando = valor1 < valor2;
        System.out.println(comparando);

        comparando = valor1 >= valor2;
        System.out.println(comparando);

        comparando = valor1 <= valor2;
        System.out.println(comparando);

        comparando = valor1 != valor2;
        System.out.println(comparando);

        comparando = valor1 == valor2;
        System.out.println(comparando);

        // Operadores Lógicos:
        boolean firstExpression = true;
        boolean secondExpression = false;

        System.out.println("AND: &&: " + (firstExpression && secondExpression));
        System.out.println("OR: ||: " + (firstExpression || secondExpression));
        System.out.println("NOT: !(): " + !(firstExpression));

        // Operadores de incremento y decremento.
        ++valor1;  // suma -> prefijo.
        System.out.println(valor1);

        --valor1;  // resta -> prefijo.
        System.out.println(valor1);

        valor1++;  // suma -> sufijo.
        System.out.println(valor1);

        valor1--; // resta -> sufijo.
        System.out.println(valor1);


        // Estructuras de control.
        // Condicionales:
        // if, else, else if, switch.

        if (valor1 > valor2) {
            System.out.println(valor1 + " es mayor que " + valor2);
        } else if (valor2 > valor1) {
            System.out.println(valor2 + " es mayor que " + valor1);
        } else {
            System.out.println(valor1 + " y " + valor2 + " son iguales.");
        }

        // Switch:
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un día de la semana.");
        String dia = input.nextLine();
        String lowerCaseDia = dia.toLowerCase();

        switch (lowerCaseDia) {
            case "lunes":
                System.out.println("Estudiar Algebra lineal.");
                break;
            case "martes":
                System.out.println("Estudiar Java.");
                break;
            case "miercoles":
                System.out.println("Estudiar Git.");
                break;
            case "jueves":
                System.out.println("Estudiar inglés.");
                break;
            case "viernes":
                System.out.println("Estudiar Java #2.");
                break;
            case "sabado":
                System.out.println("Realizar trabajos de la universidad.");
                break;
            case "domingo":
                System.out.println("Descansa, te lo mereces :)");
                break;
        }

        // Bucles.
        // for:
        for (int contador = 0; contador <= 5; contador ++) {
            System.out.println(contador);
        }

        // for each:
        String[] nombres = {"Jhon", "Sara", "Alex", "Maria"};
        for (String nombre: nombres){
            System.out.println(nombre);
        }

        // control de transferencia:
        // Break:
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Es 5...");
                break;
            }
        }

        // Continue:
        for (int i = 0 ; i < 20 ; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }

        // Return:
        int area = areaTriangulo(12, 4);
        System.out.println("El area es: " + area);


        // Colocando en práctica lo aprendido:
        /*
         * Crea un programa que imprima por consola todos los números comprendidos
         * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
         * */

        // Solucion:
        for (int numero = 10 ; numero <= 55 ; numero++) {
            if (numero % 3 == 0) {
                continue;
            } else if (numero == 16) {
                continue;
            } else if (numero == 55) {
                System.out.println(numero);
            } else if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }

}
