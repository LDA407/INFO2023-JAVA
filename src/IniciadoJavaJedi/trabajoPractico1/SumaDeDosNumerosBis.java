package IniciadoJavaJedi.trabajoPractico1;

public class SumaDeDosNumerosBis {
	/**
	 * Se les solicita que guarden dos números enteros y los sumen. El resultado
	 * guardarlo, mostrarlo por pantalla junto con un mensaje que indique si se
	 * trata de un número par o impar. El mensaje debe tener el siguiente formato:
	 * El resultado es '{Resultado} 'y es' {paridad}
	 */

	public static void main(String[] args) {
		int numUno = 10;
		int numDos = 2;

		System.out.print("El resultado de la suma es " + (numUno + numDos));
		System.out.print(" Y su paridad es  : " + (((((numUno + numDos) % 2) == 0)) ? "Par" : "Impar"));
	}
}
