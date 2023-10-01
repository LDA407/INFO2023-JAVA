package Caballero_JAVA_JEDI.Tpn1;

public class ConversionDeDolaresAPesos {
  /*
   * Escribir un programa en Java que solicite al usuario una cantidad en dólares
   * y muestre el equivalente en pesos, utilizando una tasa de cambio fija. Por
   * ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el usuario ingresa
   * 50 dólares, el programa deberá mostrar 1000 pesos.
   */

  public static void main(String[] args) {
    double tasaDeCambio = 20.0;
    double pesos = dolares * tasaDeCambio;

    System.out.println(dolares + " dólares equivalen a " + pesos + " pesos.");
  }
}