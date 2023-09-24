package Iniciado_JAVA_JEDI.Tpn2;

import java.util.*;;

public class MyFriends {
    public static void Lista_de_amigos() {
        ArrayList<String> a = new ArrayList<String>(3);
        a.add("Marcos");
        a.add("Enrrique");
        a.add("Julian");
        a.add("Lau");

        for (String name: a) {
            System.out.println(name);
        }
    }
}
