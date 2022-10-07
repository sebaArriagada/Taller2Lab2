package Taller2.model;

import java.util.List;

public class Carrera {

    private List<Estudiante> estudiantes;

    private String nombreCarrera;
    private String codigoCarrera;
    private String semestresCarrera;

    public List<Estudiante> getEstudiantes(){
        return estudiantes;
    }

    public Estudiante agregarEstudiante(String nombre, String apellido, String rut, int numMatricula){
        Estudiante estudiante = new Estudiante(nombre, apellido, rut, numMatricula);
        this.estudiantes.add(estudiante);
        return estudiante;
    }

    public void eliminarEstudiante(Estudiante estudiante){
        this.estudiantes.remove(estudiante);
    }

}