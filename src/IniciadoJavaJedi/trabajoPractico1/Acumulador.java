package IniciadoJavaJedi.trabajoPractico1;

public class Acumulador {
    /**
     * Se le solicita que guarde en un espacio de memoria la acumulación de quince
     * multiplicaciones entre dos números enteros divididos por el número de la
     * multiplicación. Por ejemplo: Numero1*Numero2/1 + Numero1*Numero2/2 + … +
     * Numero1*Numero2/15 El resultado mostrarlo por pantalla.
     */

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 3;
        System.out.println(acumulacion_de_multiplicaciones(n1, n2, 1));
    }

    public static double acumulacion_de_multiplicaciones(
            int Numero1,
            int Numero2,
            int i) {
        /*
         * se establece el valor i como valor inicial de la iteración
         */

        switch (i) {
            case 15:
                return 0;
            default:
                double resultado = Numero1 * Numero2 / (double) i;
                i += 1;// con cada iteración se incrementa el valor de i a mas 1
                return resultado + acumulacion_de_multiplicaciones(Numero1, Numero2, i);
        }
    }
}