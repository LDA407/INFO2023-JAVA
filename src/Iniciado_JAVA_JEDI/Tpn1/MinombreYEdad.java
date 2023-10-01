package Iniciado_JAVA_JEDI.Tpn1;

public class MinombreYEdad {
    /**
     * Se le solicita que guarde en un espacio de memoria su nombre y apellido,
     * luego guarde su edad e imprimalos por pantalla. El mensaje debe tener el
     * siguiente formato: “Mi nombre es “ {Nombre} “Mi edad es” {Edad}
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre y apellido: ");
        String nombreApellido = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        scanner.close();

        System.out.println("Mi nombre es " + nombreApellido + " y mi edad es " + edad + " años.");
    }
}