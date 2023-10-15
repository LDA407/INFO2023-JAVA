package CaballeroJavaJedi.trabajoPractico1;

import java.util.Scanner;

import publicClases.MyScanner;

public class ConversionDeEurosADolares {
    /*
      Escribir un programa en Java que solicite al usuario una cantidad en euros y
      muestre el equivalente en dólares, utilizando una tasa de cambio fija. Por
      ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y el usuario
      ingresa 100 euros, el programa deberá mostrar 120 dólares.
     */
     public static void main(String[] args) {
        double tasaDeCambio = 1.20;
        double euros = MyScanner.getDouble("Ingrese la cantidad en euros: ");
        double dolares = euros * tasaDeCambio;

        System.out.println(euros + " euros equivalen a " + dolares + " dólares.");
    }
}