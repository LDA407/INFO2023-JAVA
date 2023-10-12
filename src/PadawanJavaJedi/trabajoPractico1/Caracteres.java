package PadawanJavaJedi.trabajoPractico1;

public class Caracteres {
    /**
     * Guarde en distintos espacios de memoria los caracteres de su nombre en
     * unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar en el char?
     * ¿Qué es unicode?
     */

    public static void main(String[] args) {
        char a = '\u0041';
        char b = '\u0042';
        char c = '\u0043';

        System.out.println("Caracter a: " + a);
        System.out.println("Caracter b: " + b);
        System.out.println("Caracter c: " + c);
    }
}