package Taller2.controller;

import java.util.ArrayList;
import Taller2.model.Carrera;
import Taller2.model.Estudiante;

public class UniversidadController {
	
	private ArrayList<Carrera> carreras = new ArrayList<Carrera>();
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	public static void almacenarDatos(UniversidadController universidadController) {
	}

	public static boolean agregarCarrera(String nombre, String codigo, String semestres) {
		return UniversidadController.agregarCarrera(nombre, codigo, semestres);
	}
}