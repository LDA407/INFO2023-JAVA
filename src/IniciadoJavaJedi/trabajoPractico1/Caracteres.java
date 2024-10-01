package IniciadoJavaJedi.trabajoPractico1;

public class Caracteres {
  /*
   * Guarde en distintos espacios de memoria los caracteres de su nombre y luego
   * imprimirlos por pantalla. ¿Por qué no puede usar en el char?
   */

  public static void main(String[] args) {
    char[] nombre = {'D', 'A', 'V', 'I', 'D'};
for (char c : nombre) {
    System.out.print(c);
}
  }
}