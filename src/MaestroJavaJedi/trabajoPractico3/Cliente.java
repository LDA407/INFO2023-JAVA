package MaestroJavaJedi.trabajoPractico3.tienda;

import java.util.List;
import java.util.Map;

import IniciadoJavaJedi.trabajoPractico3.Persona;

public class Cliente extends Persona {
    private String direccion;
    private Map<Integer, Producto> productosAdquiridos;

    public Cliente() {}
    public Cliente(
            String nombre,
            String apellido,
            String fechaDeNacimiento,
            Integer edad,
            String direccion
            //List<Producto> productosAdquiridos
        ) {
        super(nombre, apellido, fechaDeNacimiento, edad);
        this.setDireccion(direccion);
        //this.productosAdquiridos = productosAdquiridos;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String a) {
        this.direccion = a;
    }

    public Map<Integer, Producto> getProductosAdquiridos() {
        return this.productosAdquiridos;
    }

    public void setProductosAdquiridos(Map<Integer, Producto> a) {
        this.productosAdquiridos = a;
    }
}
