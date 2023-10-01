package Maestro_JAVA_JEDI.Tpn1;

public class CalculoDeLaFuerzaCentripeta {
    /*
     * Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
     * mantener un objeto en una trayectoria circular, dados su masa, la velocidad
     * angular y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r,
     * donde F_c es la fuerza centrípeta, m es la masa del objeto, v es la velocidad
     * angular y r es el radio de la trayectoria. Muestre el resultado por pantalla.
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la masa del objeto en kilogramos (m): ");
        double masa = scanner.nextDouble();

        System.out.print("Ingrese la velocidad angular en radianes por segundo (v): ");
        double velocidadAngular = scanner.nextDouble();

        System.out.print("Ingrese el radio de la trayectoria en metros (r): ");
        double radio = scanner.nextDouble();

        double fuerzaCentripeta = (masa * Math.pow(velocidadAngular, 2)) / radio;

        scanner.close();

        System.out.println("La fuerza centrípeta necesaria es: " + fuerzaCentripeta + " newtons");
    }
}