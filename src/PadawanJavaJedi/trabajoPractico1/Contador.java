package PadawanJavaJedi.trabajoPractico1;

public class Contador {
    /**
     * Se le solicita que guarde un número en un espacio de memoria e incremente
     * dicho número 20 veces sin usar asignación. ¿Que operador podría usar para
     * hacerlo?
     */

    public static void main(String[] args) {
        int n = 1;
        contador(n);
    }

    public static void contador(int n) {
        switch (n) {
            case 20:
                System.out.println("El conteo ha llegado a 20");
                break;
            default:
                n += 1;// con cada iteración se incrementa el valor de i a mas 1
                System.out.println("Número: " + n);
                contador(n);
                break;
        }
    }
}