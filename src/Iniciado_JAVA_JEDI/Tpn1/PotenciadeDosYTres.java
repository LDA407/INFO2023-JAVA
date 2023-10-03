package Iniciado_JAVA_JEDI.Tpn1;

public class PotenciadeDosYTres {
    /**
     * Se le solicita que guarde en un espacio de memoria un número y luego haga la
     * potencia de ese número al cuadrado y al cubo.
     */

    public static void printer(String a, double b) {
        System.out.println(String.format(a, b));
    }

    public static void alCuadrado(int n) {
        printer("El número elevado al cuadrado es %.2f", (double)Math.pow(n, 2));
    }

    public static void alCubo(int n) {
        printer("El número elevado al cubo es %.2f", (double)Math.pow(n, 3));
    }

    public static void main(String[] args) {
        alCuadrado(5);
        alCubo(4);
    }
}