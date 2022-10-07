package Taller2.model;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String rut;
	private int numMatricula;
	private Carrera carrera;

	public Estudiante() {
	}

	public Estudiante(String nombre, String apellido, String rut, int numMatricula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.numMatricula = numMatricula;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getNumMatricula() {
		return this.numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

}