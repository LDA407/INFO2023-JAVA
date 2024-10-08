package MaestroJavaJedi.trabajoPractico3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tienda {
    private Map<Integer,Cliente> listaClientes;
    private Map<Integer,Producto> productosDisponibles;

    public Tienda() {
    }

    public Tienda() {
    listaClientes = new HashMap<>();
    productosDisponibles = new HashMap<>();
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

    public void setProductosDisponibles(Map<Integer, Producto> productosDisponibles) {
        this.productosDisponibles = productosDisponibles;
    }

    public List<String> showClients() {
        return getListaClientes().values().stream()
                .map(Cliente::toString)
                .collect(Collectors.toList());
    }

    public List<String> showProducts() {
        return getProductosDisponibles().values().stream()
                .map(Producto::toString)
                .collect(Collectors.toList());
    }

    public Map<String, String> verProductosVendidos() {
        return getListaClientes().values().stream()
                .filter(a -> a.getProductosAdquiridos() != null)
                .collect(Collectors.toMap(Cliente::getNombre, a -> a.getProductosAdquiridos().toString()))
    }

    public void agregarCliente(Cliente cliente) {
    if (!getListaClientes().containsKey(cliente.getId())) {
        getListaClientes().put(cliente.getId(), cliente);
    } else {
        throw new RuntimeException("Cliente con ID " + cliente.getId() + " ya existe");
    }
}

    public void eliminarCliente(int id) {
        getListaClientes().remove(id);
    }

    public void agregarProducto(Producto producto) {
    if (!getProductosDisponibles().containsKey(producto.getId())) {
        getProductosDisponibles().put(producto.getId(), producto);
    } else {
        throw new RuntimeException("Producto con ID " + producto.getId() + " ya existe");
    }
}

    public void eliminarProducto(int id) {
        getProductosDisponibles().remove(id);
    }
}