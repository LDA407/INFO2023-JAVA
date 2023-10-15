package PadawanJavaJedi.trabajoPractico1;

public class Descontador {
    /**
     * Se le solicita que guarde un número en un espacio de memoria y discretamente
     * dicho número 20 veces sin usar asignación. ¿Que operador podría usar para
     * hacerlo?
     */

    public static void main(String[] args) {
        int n = 20;
        descontador(n);
    }

    public static void descontador(int n) {
        switch (n) {
            case 0:
                System.out.println("El conteo ha llegado a 0");
                break;
            default:
                n -= 1;// con cada iteración decrece el valor de i a mas 1
                System.out.println("Número: " + n);
                descontador(n);
                break;
        }
    }
}