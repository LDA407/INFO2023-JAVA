package Maestro_JAVA_JEDI.Tpn1;

public class CalculoDelAreaDeUnCirculo {
    /*
     * Escribir un programa en Java que calcule el área de un círculo con un radio
     * de 5 unidades. Buscarlafórmulaconlaquese resuelve.
     */

    public static void main(String[] args) {
        double radio = 5.0;

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo con radio " + radio + " unidades es: " + area + " unidades cuadradas.");
    }
}