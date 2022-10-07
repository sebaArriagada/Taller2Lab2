package Taller2.gui;

import Taller2.controller.UniversidadController;

import javax.swing.*;

public class VentanaRegistroCarrera extends Ventana {
	private JLabel textoEncabezado, textoNombreCarrera, textoCodigoCarrera, textoCantidadSemestres;
	private JTextField campoNombreCarrera, campoCodigoCarrera, campoCantidadSemestres;
	private JButton botonRegistrarCarrera, botonCancelar;

	private UniversidadController universidadController;

	private void generarEncabezado(){
		String textoCabecera = "Registro de Carrera Universitaria";
		super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);

	}
	public VentanaRegistroCarrera(UniversidadController universidadController){
		super("Registro de Carrera Universitaria", 500, 520);
		this.universidadController = universidadController;
		generarElementosVentana();
	}

	private void generarElementosVentana() {
		generarEncabezado();
		generarCampoNombreCarrera();
		generarCampoCodigoCarrera();
		generarCampoCantidadSemestres();
		generarBotonRegistrarCarrera();
		generarBotonCancelar();
	}

	private void generarCampoCantidadSemestres() {
		String textoSemestres = "Cantidad de semestres:";
		super.generarJLabel(this.textoCantidadSemestres, textoSemestres,20,150,150,20);
		this.campoCantidadSemestres= super.generarJTextField(200,150,250,20);
		this.add(this.campoCantidadSemestres);
	}

	private void generarCampoCodigoCarrera() {
		String textoCodigoCarrera = "Rut:";
		super.generarJLabel(this.textoCodigoCarrera, textoCodigoCarrera,20,100,150,20);
		this.campoCodigoCarrera= super.generarJTextField(200,100,250,20);
		this.add(this.campoCodigoCarrera);
	}

	private void generarCampoNombreCarrera() {
		String textoNombreCarrera = "Nombre Carrera:";
		super.generarJLabel(this.textoNombreCarrera, textoNombreCarrera,20,50,150,20);
		this.campoNombreCarrera= super.generarJTextField(200,50,250,20);
		this.add(this.campoCodigoCarrera);
	}

}