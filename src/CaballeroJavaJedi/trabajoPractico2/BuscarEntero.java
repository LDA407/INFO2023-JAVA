package CaballeroJavaJedi.trabajoPractico2;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
// import org.w3c.dom.ranges.Range;

public class BuscarEntero {
	/*
	Dado un arreglo con valores enteros, realice la búsqueda de ese entero, si
	encontró el entero mostrarlo por pantalla sino muestre por pantalla que no lo
	encontró.
	 */
	public static List<Integer> a = Arrays.asList(1765,982,4344,44,576);
 

    public static void buscarEntero(int n) {
        if (a.contains(n)) {
            System.out.println("Encontré el entero " + n);
        } else {
            System.out.println("No encontré el entero " + n);
        }
    }
}