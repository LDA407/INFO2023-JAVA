package Padawan_JAVA_JEDI.Tpn1;

public class Caracteres {
    /**
     * Guarde en distintos espacios de memoria los caracteres de su nombre en
     * unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar en el char?
     * ¿Qué es unicode?
     */

    public static void main(String[] args) {
        char letraA = '\u0041';
        char letraB = '\u0042';
        char letraC = '\u0043';

        System.out.println("Caracter 1: " + letraA);
        System.out.println("Caracter 2: " + letraB);
        System.out.println("Caracter 3: " + letraC);
    }
}