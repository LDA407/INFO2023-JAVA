package MaestroJavaJedi.trabajoPractico1;

import publicClases.MyScanner;

public class ConversionDeGradosCelsiusAGradosFahrenheit {
    /*
     * Escribir un programa en Java que convierta una temperatura en grados Celsius
     * a grados Fahrenheit. Buscar lafórmulaconlaqueseresuelve.
     */

     public static void main(String[] args) {

        double celsius = MyScanner.getDouble("Ingrese la temperatura en grados Celsius: ");
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
}