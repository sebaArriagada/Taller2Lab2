package Taller2.gui;

import Taller2.controller.UniversidadController;
import Taller2.model.Carrera;
import Taller2.model.ListaCarrera;

import javax.swing.*;

public class VentanaBusquedaEstudiante extends Ventana {

	private JButton botonBuscarEstudiante, botonRegresar;
	private JLabel textoEncabezado, textoNombre, textoCarrera;
	private JComboBox listaCarrera;
	private JTextField campoNombre;

	private UniversidadController universidadController;

	public VentanaBusquedaEstudiante(UniversidadController universidadController){
		super("Busqueda de Estudiante", 500, 520);
		this.universidadController = universidadController;
		generarElementosVentana();
	}
	private void generarElementosVentana(){
		generarBotonBuscarEstudiante();
		generarBotonRegresar();
		generarCampoNombre();
		generarListaCarrera();
	}

	private void generarListaCarrera() {
		super.generarJLabel(this.textoCarrera,"Carrera:",20,100,100,20);
		this.listaCarrera=super.generarListaDesplegable(ListaCarrera.values(),120,100, 100, 20);
		this.add(this.listaCarrera);
	}

	private void generarCampoNombre() {
		String textoNombre= "Nombre Estudiante:";
		super.generarJLabel(this.textoNombre,textoNombre,20,50,150,20);
		this.campoNombre= super.generarJTextField(200,50,250,20);
		this.add(this.campoNombre);
	}

	private void generarBotonRegresar() {
		String textoBotonRegresar = "Regresar";
		this.botonRegresar = super.generarBoton(textoBotonRegresar, 275, 400, 150, 20);
		this.add(this.botonRegresar);
		this.botonRegresar.addActionListener(this);
	}

	private void generarBotonBuscarEstudiante() {
		String textoBoton = "Buscar Estudiante";
		this.botonBuscarEstudiante = super.generarBoton(textoBoton, 75, 400, 150, 20);
		this.add(this.botonBuscarEstudiante);
		this.botonBuscarEstudiante.addActionListener(this);
	}

}