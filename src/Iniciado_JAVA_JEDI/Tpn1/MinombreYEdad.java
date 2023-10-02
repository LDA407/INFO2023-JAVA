package Iniciado_JAVA_JEDI.Tpn1;

public class MinombreYEdad {
    /**
     * Se le solicita que guarde en un espacio de memoria su nombre y apellido,
     * luego guarde su edad e imprimalos por pantalla. El mensaje debe tener el
     * siguiente formato: “Mi nombre es “ {Nombre} “Mi edad es” {Edad}
     */

    public static void miNombreYEdad(String[] args) {
        String nombreApellido = "David Lencina";
        int edad = 28;

        System.out.println("Mi nombre es " + nombreApellido + " y mi edad es " + edad + " años.");
    }
}