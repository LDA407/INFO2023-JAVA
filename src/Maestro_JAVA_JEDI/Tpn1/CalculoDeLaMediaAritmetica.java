package Maestro_JAVA_JEDI.Tpn1;

public class CalculoDeLaMediaAritmetica {
    /*
     * Escribir un programa en Java que calcule la media aritmética de un conjunto
     * de números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1,
     * n2, ..., nk son los números y k es el número total de elementos. Utilicen
     * variables y constantes según corresponda. Muestre el resultado por pantalla.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de elementos: ");
        int k = scanner.nextInt();

        double suma = 0.0;

        for (int i = 1; i <= k; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double media = suma / k;

        scanner.close();

        System.out.println("La media aritmética de los números ingresados es: " + media);
    }
}