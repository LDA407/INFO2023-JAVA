package MaestroJavaJedi.trabajoPractico3.tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Tienda {
    private Map<Integer,Cliente> listaClientes;
    private Map<Integer,Producto> productosDisponibles;

    public Tienda() {
    }

    public Tienda(
            Map<Integer, Cliente> listaClientes,
            Map<Integer, Producto> productosDisponibles)
        {
        this.setListaClientes(listaClientes);
        this.setProductosDisponibles(productosDisponibles);
    }

    public Map<Integer, Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Map<Integer, Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Map<Integer, Producto> getProductosDisponibles() {
        return productosDisponibles;
    }

    public void setProductosDisponibles(
            Map<Integer, Producto> productosDisponibles
        ) {
        this.productosDisponibles = productosDisponibles;
    }

    public List<String> showClients() {
        List<String> b = new ArrayList<>();

        for (Cliente a: getListaClientes().values()) {
            b.add(a.toString());
        };

        return b;
    }

    public List<String> showProducts() {
        List<String> b = new ArrayList<>();

        for (Producto a: getProductosDisponibles().values()) {
            b.add(a.toString());
        };

        return b;

    }
}