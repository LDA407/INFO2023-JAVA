package CaballeroJavaJedi.trabajoPractico1;

import publicClases.MyScanner;
public class ObtenerPorcentaje {
    /*
      Dados dos números, uno real y el otro entero. Obtenga el porcentaje que
      indique el segundo número del primer número.
     */

     public static void main(String[] args) {

      double numeroReal = MyScanner.getDouble("Ingrese un número real: ");
      int numeroEntero = MyScanner.getInt("Ingrese un número entero: ");

      double porcentaje = (numeroReal / numeroEntero) * 100;

      System.out.println(numeroReal + " es el " + porcentaje + "% de " + numeroEntero);
  }
}