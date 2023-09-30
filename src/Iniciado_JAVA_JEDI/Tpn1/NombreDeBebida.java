package Iniciado_JAVA_JEDI.Tpn1;


public class NombreDeBebida {
    /*
     * Se le solicita que guarde en espacios de memoria distinta la información de:
     * El nombre de su última mascota y nombre de la última película vista. Por
     * último mostrarlo por pantalla con el siguiente formato: “Nombre de la próxima
     * bebida : ” {Nombre de mascota} {Nombre de pelicula}
     */

    static String nombreMascota = "Firulais";
    static String nombrePelicula = "Terminator";

    public static void dame_el_nombre(String[] args) {
        System.out.println(
            String.format(
                "Nombre de la próxima bebida : %s", nombreMascota + nombrePelicula 
        ));
    }
}