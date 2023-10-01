package Maestro_JAVA_JEDI.Tpn1;

public class CalculoDeLaHipotenusaDeUnTriangulo {
    /*
     * Escribir un programa en Java que calcule la hipotenusa de un triángulo
     * rectángulo, dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2
     * + b^2, donde h es la hipotenusa, a y b son los catetos.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer cateto (a): ");
        double catetoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo cateto (b): ");
        double catetoB = scanner.nextDouble();

        scanner.close();

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}