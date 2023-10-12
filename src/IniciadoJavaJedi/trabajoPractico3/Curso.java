package IniciadoJavaJedi.trabajoPractico3;

import java.util.*;

public class Curso {
    private String Nombre;
    private Boolean Habilitado;
    private String Descripcion;
    private Map<Integer, Persona> Alumnos;

    public Curso() {}

    public Curso(
            String nombre,
            Boolean habilitado,
            String descripcion,
            Map<Integer, Persona> alumnos
    ) {
        Nombre = nombre;
        Habilitado = habilitado;
        Descripcion = descripcion;
        Alumnos = alumnos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Boolean getHabilitado() {
        return Habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        Habilitado = habilitado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripción(String descripcion) {
        Descripcion = descripcion;
    }

    public Map<Integer, Persona> getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(Map<Integer, Persona> alumnos) {
        Alumnos = alumnos;
    }

    public List<String> ShowStudents() {
        List<String> b = new ArrayList<>();

        for (Persona a: getAlumnos().values()) {
            b.add(a.toString());
        };

        return b;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Nombre:'" + Nombre + '\'' +
                ", Habilitado:" + Habilitado +
                ", Descripcion:'" + Descripcion + '\'' +
                ", Alumnos:" + ShowStudents() +
                '}';
    }

}
