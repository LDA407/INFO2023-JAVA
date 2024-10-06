package publicClases;

import java.util.Scanner;
public class MyScanner {
    private static Scanner scanner = new Scanner(System.in);
    public static int getInt(String mensaje) {
        System.out.print(mensaje);
        int valor = scanner.nextInt();
        scanner.close()
        return valor;
    }

    public static double getDouble(String mensaje) {
        System.out.print(mensaje);
        double valor = scanner.nextDouble();
        scanner.close()
        return valor;
    }

    public static String getString(String mensaje) {
        System.out.print(mensaje);
        String valor = scanner.nextLine();
        scanner.close()
        return valor
    }
}
