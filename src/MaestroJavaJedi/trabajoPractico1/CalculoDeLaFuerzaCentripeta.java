package MaestroJavaJedi.trabajoPractico1;

import publicClases.MyScanner;

public class CalculoDeLaFuerzaCentripeta {
    /*
     * Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
     * mantener un objeto en una trayectoria circular, dados su masa, la velocidad
     * angular y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r,
     * donde F_c es la fuerza centrípeta, m es la masa del objeto, v es la velocidad
     * angular y r es el radio de la trayectoria. Muestre el resultado por pantalla.
     */

     public static void main(String[] args) {

        double masa = MyScanner.getDouble("Ingrese la masa del objeto en kilogramos (m): ");
        double velocidadAngular = MyScanner.getDouble("Ingrese la velocidad angular en radianes por segundo (v): ");
        double radio = MyScanner.getDouble("Ingrese el radio de la trayectoria en metros (r): ");
        
        double fuerzaCentripeta = (masa * Math.pow(velocidadAngular, 2)) / radio;

        System.out.println("La fuerza centrípeta necesaria es: " + fuerzaCentripeta + " newtons");
    }
}