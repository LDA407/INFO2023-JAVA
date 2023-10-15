package MaestroJavaJedi.tests;


import MaestroJavaJedi.trabajoPractico3.Cliente;
import MaestroJavaJedi.trabajoPractico3.Producto;
import MaestroJavaJedi.trabajoPractico3.Tienda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tests {
    public void trabajoPracticoUno() {
    }

    public void trabajoPracticoDos() {
    }

    public static void main(String[] args) {

        Map<Integer, Cliente> listaClientes = new HashMap<>();
        Map<Integer, Producto> productosDisponibles = new HashMap<>();

        Producto producto2 = new Producto("Producto 2", "asdasdj aasljdalsidja", 20, 5);
        productosDisponibles.put(1, producto2);

        Cliente cliente1 = new Cliente("David", "Lencina", "23/04/1123", 28, "Avenida Siempre Viva");
        Cliente cliente2 = new Cliente("Selina", "Serrat", "23/04/1123", 23, "Calle walavy 123");
        Cliente cliente3 = new Cliente("Isabela", "Pelinski", "23/04/1123", 28, "Calle 12");

        listaClientes.put(1, cliente1);
        listaClientes.put(2, cliente2);
        listaClientes.put(3, cliente3);

        cliente1.setProductosAdquiridos(productosDisponibles);
        Tienda tienda = new Tienda(listaClientes, productosDisponibles);

        //System.out.println(tienda.showClients());
        System.out.println(tienda.verProductosVendidos());
        //System.out.println(tienda.showProducts());

        //System.out.println(tienda);
        //System.out.println(cliente1);
        //System.out.println(cliente1.getProductosAdquiridos());

    }
}
