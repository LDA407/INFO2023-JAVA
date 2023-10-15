package MaestroJavaJedi.trabajoPractico3;

import IniciadoJavaJedi.trabajoPractico3.Persona;

import java.util.Map;

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

    @Override
    public String toString() {
        StringBuilder c = new StringBuilder();

        c.append("Cliente: {");
        c.append(" Nombre: ").append(super.getNombre());
        c.append(", Apellido: ").append(super.getApellido());
        c.append(", Edad: ").append(super.getEdad());
        c.append(", Dirección: ").append(this.direccion);
        //c.append(", Productos adquiridos :").append(this.productosAdquiridos);
        c.append("}");

        return c.toString();
    }

    public String verProductosAdquiridos(){
        StringBuilder c = new StringBuilder();

        c.append("Productos adquiridos: ").append(this.productosAdquiridos);

        return c.toString();
    }
}
