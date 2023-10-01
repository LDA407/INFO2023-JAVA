package Caballero_JAVA_JEDI.Tpn1;

public class ObtenerPorcentaje {
    /*
      Dados dos números, uno real y el otro entero. Obtenga el porcentaje que
      indique el segundo número del primer número.
     */

     public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Ingrese un número real: ");
      double numeroReal = scanner.nextDouble();

      System.out.print("Ingrese un número entero: ");
      int numeroEntero = scanner.nextInt();

      scanner.close();

      double porcentaje = (numeroReal / numeroEntero) * 100;

      System.out.println(numeroReal + " es el " + porcentaje + "% de " + numeroEntero);
  }
}