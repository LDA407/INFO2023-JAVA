package IniciadoJavaJedi.tests;

import IniciadoJavaJedi.trabajoPractico3.Curso;
import IniciadoJavaJedi.trabajoPractico3.Persona;

import java.util.HashMap;
import java.util.Map;

public class Tests {
    public static void main(String[] args) {
        Map<Integer, Persona> alumnos = new HashMap<>();
        Persona alumno1 = new Persona("Juan", "Perez", "01/01/1990", 33);
        Persona alumno2 = new Persona("Maria", "Gomez", "15/05/1988", 35);
        alumnos.put(1, alumno1);
        alumnos.put(2, alumno2);

        Curso curso = new Curso("Curso de Java", true, "Aprende Java desde cero", alumnos);
        System.out.println(curso);
    }
}
