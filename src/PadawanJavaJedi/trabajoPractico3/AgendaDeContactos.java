package PadawanJavaJedi.trabajoPractico3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AgendaDeContactos {
    /*Implementar una clase Contacto con atributos como
    nombre, número de teléfono y correo electrónico. Utiliza una LinkedList para
    almacenar los contactos. La aplicación debe permitir agregar, eliminar, buscar y
    mostrar la lista de contactos.
    */

    List<Contacto> contactos = new LinkedList<>();

    public void printer(String a, Contacto b) {
        System.out.println(String.format(a,b));
    }
    public void agregar(Contacto a) {
        contactos.add(a);
        printer("Se agrego el contacto %s.", a);
    }
    
public void eliminar(String a) {
    Contacto c = contactos.stream().filter(b -> b.getNombre().equalsIgnoreCase(a)).findFirst().orElse(null);
    
    if (c != null) {
        contactos.remove(c);
        System.out.println("Se eliminó el contacto");
    } else {
        System.out.println("No se encontró un contacto con el nombre especificado.");
    }
}

public void buscar(String a) {
    List<Contacto> f = contactos.stream()
            .filter(b -> b.getNombre().equalsIgnoreCase(a))
            .collect(Collectors.toList());
    
    if (!f.isEmpty()) {
        System.out.println("Los contactos encontrados son:");
        f.forEach(System.out::println);
    } else {
        System.out.println("No se encontraron contactos con el nombre especificado.");
    }
}

public void mostrarListaDeContactos() {
    contactos.forEach(System.out::println);
}
}