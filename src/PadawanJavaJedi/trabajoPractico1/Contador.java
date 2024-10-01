package PadawanJavaJedi.trabajoPractico1;

public class Contador {
    /**
     * Se le solicita que guarde un número en un espacio de memoria e incremente
     * dicho número 20 veces sin usar asignación. ¿Que operador podría usar para
     * hacerlo?
     */

    public static void main(String[] args) {
        System.out.println("Iniciando conteo...");
        contador(1);
    }

    public static void contador(int n) {
        if (n <= 20) {
            System.out.println("Número: " + n);
            contador(n + 1); // Incrementa "n" en cada llamada recursiva
        } else {
            System.out.println("El conteo ha llegado a 20");
        }
    }
}