package Padawan_JAVA_JEDI.Tpn1;

public class PromedioDeEdad {
    /**
     * Guarde en diferentes espacios de memoria distintos valores de edad y los
     * nombres de esas personas, luego saque su promedio e imprima por pantalla el
     * nombre de la persona, su edad. Por último imprimir el promedio de sus edades.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = scanner.nextInt();

        String[] nombres = new String[cantidadPersonas];
        int[] edades = new int[cantidadPersonas];

        int sumaEdades = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.next();

            System.out.print("Ingrese la edad de " + nombres[i] + ": ");
            edades[i] = scanner.nextInt();

            sumaEdades += edades[i];
        }

        scanner.close();

        double promedio = (double) sumaEdades / cantidadPersonas;

        System.out.println("Nombres y edades de las personas:");
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println(nombres[i] + ": " + edades[i] + " años");
        }

        System.out.println("El promedio de edades es: " + promedio);
    }
}