package CaballeroJavaJedi.trabajoPractico1;

import publicClases.MyScanner;

public class ConversionDeDolaresAPesos {
  /*
   * Escribir un programa en Java que solicite al usuario una cantidad en dólares
   * y muestre el equivalente en pesos, utilizando una tasa de cambio fija. Por
   * ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el usuario ingresa
   * 50 dólares, el programa deberá mostrar 1000 pesos.
   */

  public void dolares_a_pesos() {
    final double tasaCambio = 20.0; // 1 dólar = 20 pesos
    double dolares = MyScanner.getDouble("Ingrese la cantidad en dólares: ");

    double dolaresAPesos = dolares * tasaCambio;
    System.out.printf("El equivalente en pesos es: %.2f pesos", dolaresAPesos);
  }
}
