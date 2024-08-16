package reto2;

public class Funciones {

    // Método sin parámetros ni retorno:
    public void saludo(){
        System.out.println("Hola, bienvenido al repositorio!");
    }

    // Método con parámetros:
    public void saludoPersonalizado(String nombre, String apellido){
        System.out.println("Hola, bienvenido " + nombre + " " + apellido);
    }

    // Método con parámetros y retorno:
    public double areaCirculo(double radio) {
        final double PI = 3.1415;
        return PI * Math.pow(radio, 2);
    }

    // Ejemplos de métodos propios de Java:
    public void metodosJava() {
        String nombre = "Jhon";
        System.out.println(nombre.toUpperCase()); // Convierte el nombre a MAYÚSCULA.
        System.out.println(nombre.toLowerCase()); // Convierte el nombre a MINÚSCULA.
    }

    /*
    * Método en un método:
    *  Java no es posible anidar métodos directamente, pero existe una alternativa:
    */
    public void primerMetodo() {
        int edad = 18;
        class ClaseInterna {
            public void metodoInterno() {
                System.out.println(edad);
            }
        }
        ClaseInterna obj = new ClaseInterna();
        obj.metodoInterno();
    }

}
