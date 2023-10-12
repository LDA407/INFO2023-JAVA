package MaestroJavaJedi.trabajoPractico3.tienda;

public class Producto {
    private String nombre;
    private String descripción;
    private Integer precio;
    private Integer stock;

    public Producto() {
    }

    public Producto(
            String nombre,
            String descripción,
            Integer precio,
            Integer stock
        ) {
        this.setNombre(nombre);
        this.setDescripción(descripción);
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
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
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
}
