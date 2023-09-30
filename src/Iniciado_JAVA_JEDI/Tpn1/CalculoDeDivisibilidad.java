package Iniciado_JAVA_JEDI.Tpn1;

public class CalculoDeDivisibilidad {
  /*
    Se le solicita que guarden dos números enteros y los sumen, determine si el
    primer número es divisible por el segundo número y muestre el resultado.
   */

  int a = 2;
  int b = 4;

  public void main() {
    System.out.println(String.format("La suam de 2 y 4 es igual a %c", ( a + b)));
  }

  public void es_divisible() {
    if (a % b == 0) {
      System.out.println("El numero 2 es divisible por 4");
    } else {
      System.out.println("El numero 2 no es divisible por 4");
    }
  }
}