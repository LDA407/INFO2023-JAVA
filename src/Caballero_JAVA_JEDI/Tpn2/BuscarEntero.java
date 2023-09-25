package Caballero_JAVA_JEDI.Tpn2;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.w3c.dom.ranges.Range;;

public class BuscarEntero {
	/*
	 * Dado un arreglo con valores enteros, realice la búsqueda de ese entero, si
	 * encontró el entero mostrarlo por pantalla sino muestre por pantalla que no lo
	 * encontró.
	 */
	public static List<Integer> a = Arrays.asList(1765,982,4344,44,576);
	private Integer rangoMinimo = 1;
	private Integer rangoMaximo = 145;


	public static void buscar_entero(int n) {
		List<Integer> b = new ArrayList<>(a);
		System.out.println(b.contains(n));
	}
}