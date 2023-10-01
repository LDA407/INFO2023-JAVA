package Caballero_JAVA_JEDI.Tpn2;

public class ProhibidoMenoresACeros {
  /*
   * Cree dos arreglos con números decimales, luego recortarlos y reste ambos
   * arreglos el resultado aplicarlos a un tercer arreglo, si la resta da negativo
   * entonces guarde 0.
   */

  public static void main(String[] args) {
    // Crear dos arreglos con números decimales
    double[] arreglo1 = { 5.5, 7.8, 3.2, 6.7 };
    double[] arreglo2 = { 2.1, 4.6, 8.0, 1.5 };

    // Verificar que ambos arreglos tengan la misma longitud
    if (arreglo1.length != arreglo2.length) {
      System.out.println("Los arreglos no tienen la misma longitud. Deben ser del mismo tamaño.");
    } else {
      // Crear un tercer arreglo para almacenar el resultado de la resta
      double[] resultado = new double[arreglo1.length];

      // Restar los elementos de los dos arreglos y aplicar la lógica para guardar 0
      // si el resultado es negativo
      for (int i = 0; i < arreglo1.length; i++) {
        double resta = arreglo1[i] - arreglo2[i];
        resultado[i] = (resta < 0) ? 0 : resta;
      }

      // Imprimir el resultado
      System.out.print("Resultado de la resta con 0 para valores negativos: ");
      for (double valor : resultado) {
        System.out.print(valor + " ");
      }
    }
  }
}
