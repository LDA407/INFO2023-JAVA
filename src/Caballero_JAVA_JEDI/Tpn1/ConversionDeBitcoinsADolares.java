package Caballero_JAVA_JEDI.Tpn1;

public class ConversionDeBitcoinsADolares {
  /*
    Escribir un programa en Java que solicite al usuario una cantidad en bitcoins
    y muestre el equivalente en dólares, utilizando una tasa de cambio fija. Por
    ejemplo, si la tasa de cambio es de 1 bitcoin = 50000 dólares, y el usuario
    ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.
   */

  Double tasaDeCambio = 27025.77;
  Double bitcoins = 1.50;
  Double dolares = this.bitcoins * this.tasaDeCambio;

  public void conversion() {
    System.out.println(
      String.format(
        "Tus %s equivalen a %d$.",
        this.bitcoins,
        dolares
      )
    );
  }
}