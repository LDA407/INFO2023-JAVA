package MaestroJavaJedi.trabajoPractico1;

import publicClases.MyScanner;

public class CalculoDeLaMediaAritmetica {
    /*
     * Escribir un programa en Java que calcule la media aritmética de un conjunto
     * de números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1,
     * n2, ..., nk son los números y k es el número total de elementos. Utilicen
     * variables y constantes según corresponda. Muestre el resultado por pantalla.
     */

    public static void main(String[] args) {

        int k = MyScanner.getInt("Ingrese el número total de elementos: ");

        double a = 0.0;

        for (int i = 1; i <= k; i++) {
            double n = MyScanner.getDouble("Ingrese el número " + i + ": ");
            a += n;
        }

        double media = a / k;

        System.out.println("La media aritmética de los números ingresados es: " + media);
    }
}