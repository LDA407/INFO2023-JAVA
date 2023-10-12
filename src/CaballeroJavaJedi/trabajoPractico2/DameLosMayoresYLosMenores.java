package CaballeroJavaJedi.trabajoPractico2;

import java.util.*;

public class DameLosMayoresYLosMenores {
  /*
   * Realizar un programa donde se guarden 5 en un arreglo. Luego, el programa
   * debe mostrar en pantalla el valor máximo y mínimo de los números ingresados.
   */
  static List<Integer> a = Arrays.asList(1765, 982, 4344, 44, 576);

  public static void printer(String x, Integer b) {
    System.out.println(String.format(x, b));
  }

  public static void dame_el_minimo() {
    printer("El numero minimo obtenido es %s .", Collections.min(a));
  }

  public static void dame_el_maximo() {
    printer("El numero maximo obtenido es %s .", Collections.max(a));
  }
}