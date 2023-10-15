package MaestroJavaJedi.trabajoPractico1;

import publicClases.MyScanner;

public class CalculoDeLaHipotenusaDeUnTriangulo {
    /*
     * Escribir un programa en Java que calcule la hipotenusa de un triángulo
     * rectángulo, dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2
     * + b^2, donde h es la hipotenusa, a y b son los catetos.
     */

    public static void main(String[] args) {
        double a = MyScanner.getDouble("Ingrese la longitud del cateto (a): ");
        double b = MyScanner.getDouble("Ingrese la longitud del cateto (b): ");

        double hipotenusa = Math.sqrt(
            Math.pow(a, 2) + Math.pow(b, 2)
        );

        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}