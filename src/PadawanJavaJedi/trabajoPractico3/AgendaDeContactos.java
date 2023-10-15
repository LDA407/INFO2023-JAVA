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
        Contacto c = null;

        for (Contacto b: contactos) {
            if (b.getNombre().equals(a)) {c = b; break;}
        }

        if (c != null) {
            contactos.remove(c);
            printer("Se eliminó el contacto %s.", c);
        } else {
            System.out.println("No se encontró un contacto con el nombre especificado.");
        }
    }

    public void buscar(String a) {
        List<Contacto> contactosEncontrados = new ArrayList<Contacto>();

        for (Contacto b: contactos) {
            if (b.getNombre().equals(a)) {
                contactosEncontrados.add(b);
            }
        }

        for (Contacto j: contactosEncontrados) {
            System.out.println("Los contatcos encontrados son: ");
            System.out.println(j.toString());
        }
    }

    public void mostratListaDeContactos() {
        for (Contacto a: contactos) {
            System.out.println(a.toString());
        }
    }
}