package Padawan_JAVA_JEDI.Tpn1;

public class ConversionAKilogramos {
    /**
     * Guarde en un espacio de memoria sus libras y luego, en otro espacio de
     * memoria realice la conversión de esas libras a kilogramos. Utilice una
     * constante de los valores que no van a cambiar en esta conversión. Muestre el
     * resultado por pantalla
     */

    public static void main(String[] args) {
        final double LIBRAS_A_KILOGRAMOS = 0.45359237;

        double libras = 10.0;

        double kilogramos = libras * LIBRAS_A_KILOGRAMOS;

        System.out.println(libras + " libras equivalen a " + kilogramos + " kilogramos.");
    }
}