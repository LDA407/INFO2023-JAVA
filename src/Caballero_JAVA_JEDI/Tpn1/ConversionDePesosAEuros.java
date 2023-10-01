package Caballero_JAVA_JEDI.Tpn1;

public class ConversionDePesosAEuros {
    /*
      Escribir un programa en Java que solicite al usuario una cantidad en pesos y
      muestre el equivalente en euros, utilizando una tasa de cambio fija. Por
      ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario ingresa
      5000 pesos, el programa deberá mostrar 250 euros.
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      double tasaDeCambio = 0.05; 

      System.out.print("Ingrese la cantidad en pesos: ");
      double pesos = scanner.nextDouble();

      scanner.close();

      double euros = pesos * tasaDeCambio;

      System.out.println(pesos + " pesos equivalen a " + euros + " euros.");
  }
}