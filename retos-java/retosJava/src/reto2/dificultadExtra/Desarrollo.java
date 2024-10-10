package reto2.dificultadExtra;

public class Desarrollo {

    public int contadorPalabras (String palbra1, String palabra2) {
        int contadorNum = 0;
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println(palbra1 + " " + palabra2);
            } else if (numero % 3 == 0) {
                System.out.println(palbra1);
            } else if (numero % 5 == 0) {
                System.out.println(palabra2);
            } else {
                System.out.println(numero);
                contadorNum++;
            }
        }
        return contadorNum;
    }
}
