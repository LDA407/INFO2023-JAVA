package PadawanJavaJedi.trabajoPractico1;

import java.util.Scanner;
import publicClases.MyScanner;

public class PromedioDeEdad {
    /**
     * Guarde en diferentes espacios de memoria distintos valores de edad y los
     * nombres de esas personas, luego saque su promedio e imprima por pantalla el
     * nombre de la persona, su edad. Por último imprimir el promedio de sus edades.
     */

    public static void main(String[] args) {
        int cantidadPersonas = MyScanner.getInt("Ingrese la cantidad de personas: ");

        String[] nombres = new String[cantidadPersonas];
        int[] edades = new int[cantidadPersonas];

        int sumaEdades = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            nombres[i] = MyScanner.getString("Ingrese el nombre de la persona " + (i + 1) + ": ");
            edades[i] = MyScanner.getInt("Ingrese la edad de " + nombres[i] + ": ");
            sumaEdades += edades[i];
        }

        double promedio = (double) sumaEdades / cantidadPersonas;

        System.out.println("Nombres y edades de las personas:");
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println(nombres[i] + ": " + edades[i] + " años");
        }

        System.out.println("El promedio de edades es: " + promedio);
    }
}