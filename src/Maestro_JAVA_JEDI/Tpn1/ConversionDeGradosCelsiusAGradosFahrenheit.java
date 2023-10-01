package Maestro_JAVA_JEDI.Tpn1;

public class ConversionDeGradosCelsiusAGradosFahrenheit {
    /*
     * Escribir un programa en Java que convierta una temperatura en grados Celsius
     * a grados Fahrenheit. Buscar lafórmulaconlaqueseresuelve.
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        scanner.close();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
}