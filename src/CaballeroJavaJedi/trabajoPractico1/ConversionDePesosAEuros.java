package CaballeroJavaJedi.trabajoPractico1;
import java.util.Scanner;

import publicClases.MyScanner;
public class ConversionDePesosAEuros {
    /*
      Escribir un programa en Java que solicite al usuario una cantidad en pesos y
      muestre el equivalente en euros, utilizando una tasa de cambio fija. Por
      ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario ingresa
      5000 pesos, el programa deberá mostrar 250 euros.
     */
    public static void main(String[] args) {

      double tasaDeCambio = 0.05; 
      double pesos = MyScanner.getDouble("Ingrese la cantidad en pesos: ");
      double euros = pesos * tasaDeCambio;

      System.out.println(pesos + " pesos equivalen a " + euros + " euros.");
  }
}