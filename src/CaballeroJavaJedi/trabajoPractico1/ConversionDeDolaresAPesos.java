package CaballeroJavaJedi.trabajoPractico1;

import java.util.Scanner;

public class ConversionDeDolaresAPesos {
  /*
   * Escribir un programa en Java que solicite al usuario una cantidad en dólares
   * y muestre el equivalente en pesos, utilizando una tasa de cambio fija. Por
   * ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el usuario ingresa
   * 50 dólares, el programa deberá mostrar 1000 pesos.
   */
  static float pesos = (float) 345634.56;

  public static void printer(String a, float b, float c) {
    System.out.println(String.format(a, b, c));
  }

  public static void dolares_a_pesos() {
        final double tasaCambio = 20.0; // 1 dólar = 20 pesos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en dólares: ");
        double dolares = scanner.nextDouble();

        double dolaresAPesos = dolares * tasaCambio;
        System.out.printf("El equivalente en pesos es: %.2f pesos", dolaresAPesos);

        scanner.close();
    }

  public static void dolarOficial() {
    float dolarOficial = (float) 348.25;
    float cambio = pesos / dolarOficial;

    printer("Los %.2f pesos equivalen a %.2f dólares según el tipo de cambio dolarOficial", pesos, cambio);
  }

  public static void dolarMinorista() {
    float dolarMinorista = (float) 720.0;
    float cambio = pesos / dolarMinorista;

    printer("Los %.2f pesos equivalen a %.2f dólares según el tipo de cambio dolarMinorista", pesos, cambio);

  }

  public static void dolarMayorista() {
    float dolarMayorista = (float) 349.98;
    float cambio = pesos / dolarMayorista;

    printer("Los %.2f pesos equivalen a %.2f dólares según el tipo de cambio dolarMayorista", pesos, cambio);

  }

  public static void dolarBlue() {
    float dolarBlue = (float) 720.0;
    float cambio = pesos / dolarBlue;

    printer("Los %.2f pesos equivalen a %.2f dólares según el tipo de cambio dolarBlue", pesos, cambio);

  }

  public static void dolarAgro() {
    float dolarAgro = (float) 340.0;
    float cambio = pesos / dolarAgro;

    printer("Los %.2f pesos equivalen a %.2f dólares según el tipo de cambio dolarAgro", pesos, cambio);
  }

  public static void dolarSoja() {
    float dolarSoja = (float) 300.0;
    float cambio = pesos / dolarSoja;

    printer("Los %.2f pesos equivalen a %.2f dólares según el tipo de cambio dolarSoja", pesos, cambio);
  }

  public static void dolarColdplay() {
    float dolarColdplay = (float) 476.4;
    float cambio = pesos / dolarColdplay;

    printer("Los %.2f pesos equivalen a %.2f dólares según el tipo de cambio dolarColdplay", pesos, cambio);
  }

  public static void dolarQatar() {
    float dolarQatar = (float) 657.9;
    float cambio = pesos / dolarQatar;

    printer("Los %.2f pesos equivalen a %.2f dólares según el tipo de cambio dolarQatar", pesos, cambio);
  }
}
