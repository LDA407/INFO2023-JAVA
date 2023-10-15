package MaestroJavaJedi.trabajoPractico1;

import publicClases.MyScanner;

public class CalculoDeLaVelocidadFinal {
    /*
     * Escribir un programa en Java que calcule la velocidad final de un objeto en
     * caída libre, dados su velocidad inicial, la aceleración de la gravedad y el
     * tiempo transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la
     * velocidad final, v_i es la velocidad inicial, g es la aceleración de la
     * gravedad y t es el tiempo transcurrido. Muestre el resultado por pantalla
     */

    public static void main(String[] args) {
        double inicial = MyScanner.getDouble(
            "Ingrese la velocidad inicial en metros por segundo (v_i): "
        );
        
        double gravedad = MyScanner.getDouble(
            "Ingrese la aceleración de la gravedad en metros por segundo al cuadrado (g): "
        );

        double tiempo = MyScanner.getDouble(
            "Ingrese el tiempo transcurrido en segundos (t): "
        );

        double velocidadFinal = inicial + (gravedad * tiempo);
        System.out.println("La velocidad final del objeto es: " + velocidadFinal + " metros por segundo");
    }
}