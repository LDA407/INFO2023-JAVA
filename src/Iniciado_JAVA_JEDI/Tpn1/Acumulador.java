package Iniciado_JAVA_JEDI.Tpn1;

public class Acumulador {
    /**
     * Se le solicita que guarde en un espacio de memoria la acumulación de quince
     * multiplicaciones entre dos números enteros divididos por el número de la
     * multiplicación. Por ejemplo: Numero1*Numero2/1 + Numero1*Numero2/2 + … +
     * Numero1*Numero2/15 El resultado mostrarlo por pantalla.
     */

    public static void acomulador_con_for() {
        /*
            se creo esta funcion para comparar los valores nada mas
         */
        int numero1 = 5;
        int numero2 = 3;

        double acumulador = 0.0;

        for (int i = 1; i <= 15; i++) {
            double producto = numero1 * numero2;
            double resultado = producto / i;
            acumulador += resultado;
        }

        System.out.println("El resultado acumulado es: " + acumulador);
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 3;

        double r = acumulacion_de_multiplicaciones(n1, n2, 1, 15);

        System.out.println("El resultado de la acumulación de las multiplicaciones es: " + r);

        System.out.println("acomulador_con_for");
        acomulador_con_for();
    }

    public static double acumulacion_de_multiplicaciones(
            int Numero1,
            int Numero2,
            int i,
            int n
        ) {
            /*  
                se establece el valor i a 1 como valor inicial de la iteracion
                se establece el valor de n a 15 como valor final
            */
        switch (i <= n ? 1 : 0) {
            case 1:
                double resultado = Numero1 * Numero2 / (double) i;
                i += 1;//se incrementa el valor de i a mas 1
                return resultado + acumulacion_de_multiplicaciones(Numero1, Numero2, i, n);
            default:
                return 0;
        }
    }

}