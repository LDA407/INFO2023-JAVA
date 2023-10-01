package Padawan_JAVA_JEDI.Tpn1;

public class Contador {
    /**
     * Se le solicita que guarde un número en un espacio de memoria e incremente
     * dicho número 20 veces sin usar asignación. ¿Que operador podría usar para
     * hacerlo?
     */

    static int factorial(int numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

    public static void main(String args[]) {
        System.out.println(factorial(5));
    }
}