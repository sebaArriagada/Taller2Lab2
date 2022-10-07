package Taller2.gui;

import Taller2.controller.UniversidadController;
import Taller2.model.ListaCarrera;

import javax.swing.*;

public class VentanaRegistroEstudiante extends Ventana{
	private JLabel textoEncabezado, textoNombre, textoRut, textoNumMatricula, textoCarrera;
	private JTextField campoNombre, campoRut, campoMatricula;
	private JComboBox listaCarrera;
	private JButton botonRegistrar, botonCancelar;

	private UniversidadController universidadController;

	public VentanaRegistroEstudiante(UniversidadController universidadController){
		super("Registro Estudiante", 500, 520);
		this.universidadController = universidadController;
		generarElementosVentana();
	}

	private void generarElementosVentana() {
		generarEncabezado();
		generarBotonCancelar();
		generarBotonRegistrar();
		generarCampoNombre();
		generarCampoRut();
		generarCampoMatricula();
		generarListaCarrera();
	}

	private void generarListaCarrera() {
		super.generarJLabel(this.textoCarrera,"Carrera:",20,200,150,20);
		this.listaCarrera=super.generarListaDesplegable(ListaCarrera.values(),200,200, 250, 20);
		this.add(this.listaCarrera);
	}

	private void generarCampoMatricula() {
		String textoMatricula = "Matricula:";
		super.generarJLabel(this.textoNumMatricula, textoMatricula,20,150,150,20);
		this.campoMatricula= super.generarJTextField(200,150,250,20);
		this.add(this.campoMatricula);
	}

	private void generarCampoRut() {
		String textoRut= "Rut:";
		super.generarJLabel(this.textoRut,textoRut,20,100,150,20);
		this.campoRut= super.generarJTextField(200,100,250,20);
		this.add(this.campoRut);
	}

	private void generarCampoNombre() {
		String textoNombre= "Nombre del Estudiante:";
		super.generarJLabel(this.textoNombre,textoNombre,20,50,150,20);
		this.campoNombre= super.generarJTextField(200,50,250,20);
		this.add(this.campoNombre);
	}

	private void generarBotonRegistrar() {
		String textoBoton= "Registrar Estudiante";
		this.botonRegistrar = super.generarBoton(textoBoton, 75, 400, 150, 20);
		this.add(this.botonRegistrar);
		this.botonRegistrar.addActionListener(this);
	}

	private void generarBotonCancelar() {
		String textoBotonCancelar = "Cancelar";
		this.botonCancelar = super.generarBoton(textoBotonCancelar, 275, 400, 150, 20);
		this.add(this.botonCancelar);
		this.botonCancelar.addActionListener(this);
	}

	private void generarEncabezado() {
		String textoCabecera = "Registro de Estudiante";
		super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);
	}

}