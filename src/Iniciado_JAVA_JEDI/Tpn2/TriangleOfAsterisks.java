package Iniciado_JAVA_JEDI.Tpn2;

public class TriangleOfAsterisks {
    public static void triangle_of_asterisks(int filas){
        for (int i = 0; i < filas+1; i++) {
            String triangle_of_asterisks = new String(
                new char[i]).replace("\0", "*"
            );
            System.out.println(triangle_of_asterisks);
        }
    }

}
