package CaballeroJavaJedi.trabajoPractico1;

import publicClases.MyScanner;
public class ConversionDeLibrasEsterlinasADolares {
    /*
      Escribir un programa en Java que solicite al usuario una cantidad en libras
      esterlinas y muestre el equivalente en dólares, utilizando una tasa de cambio
      fija. Por ejemplo, si la tasa de cambio es de 1 libra esterlina = 1.40
      dólares, y el usuario ingresa 50 libras esterlinas, el programa deberá
      mostrar 70 dólares.
     */
    public static void main(String[] args) {

      double tasaDeCambio = 1.40; 
      double librasEsterlinas = MyScanner.getDouble("Ingrese la cantidad en libras esterlinas: ");

      double dolares = librasEsterlinas * tasaDeCambio;

      System.out.println(librasEsterlinas + " libras esterlinas equivalen a " + dolares + " dólares.");
  }
}