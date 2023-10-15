package MaestroJavaJedi.trabajoPractico3;

public class Producto {
    private String nombre;
    private String descripcion;
    private Integer precio;
    private Integer stock;

    public Producto() {
    }

    public Producto(
            String nombre,
            String descripcion,
            Integer precio,
            Integer stock
        ) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
        this.setStock(stock);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        StringBuilder c = new StringBuilder();

        c.append("Producto: { ");
        c.append("Nombre: ").append(this.nombre);
        c.append(", Descripción: ").append(this.descripcion);
        c.append(", Precio: ").append(this.precio);
        c.append(" }");

        return c.toString();
    }
}
