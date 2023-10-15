package IniciadoJavaJedi.trabajoPractico3;

public class Persona {
    private String Nombre;
    private String Apellido;
    private String FechaDeNacimiento;
    private Integer Edad;

    public Persona() {}

    public Persona(
            String nombre,
            String apellido,
            String fechaDeNacimiento,
            Integer edad
    ) {
        Nombre = nombre;
        Apellido = apellido;
        FechaDeNacimiento = fechaDeNacimiento;
        Edad = edad;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public String getFechaDeNacimiento() {
        return this.FechaDeNacimiento;
    }

    public Integer getEdad() {
        return this.Edad;
    }

    public void setNombre(String n) {
        this.Nombre = n;
    }

    public void setApellido(String a) {
        this.Apellido = a;
    }

    public void setFechaDeNacimiento(String a) {
        this.FechaDeNacimiento = a;
    }

    public void setEdad(Integer e) {
        this.Edad = e;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", FechaDeNacimiento='" + FechaDeNacimiento + '\'' +
                ", Edad=" + Edad +
                '}';
    }
}
