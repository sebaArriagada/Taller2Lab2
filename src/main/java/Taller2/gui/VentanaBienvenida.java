package Taller2.gui;

import Taller2.controller.UniversidadController;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaBienvenida extends Ventana{
	private JLabel textoMenu;
	private JButton botonRegistrarCarrera, botonRegistrarEstudiante, botonBuscarEstudiante, botonSalir;
	private UniversidadController universidadController;

	public VentanaBienvenida(UniversidadController universidadController){
		super("Menu Bienvenida", 500, 520);
		this.universidadController = universidadController;
		generarElementosVentana();
	}

	private void generarElementosVentana(){
		generarMensajeBienvenida();
		generarBotonRegistrarCarrera();
		generarBotonRegistrarEstudiante();
		generarBotonBuscarEstudiante();
		generarBotonSalir();
	}
	private void generarMensajeBienvenida(){
		String textoBienvenida = "Intranet 2.0";
		super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 20, 30, 500,30);
	}

	private void generarBotonRegistrarCarrera(){
		String textoBoton = "Registrar Carrera";
		this.botonRegistrarCarrera = super.generarBoton(textoBoton, 175, 100, 150,40);
		this.add(this.botonRegistrarCarrera);
		this.botonRegistrarCarrera.addActionListener(this);
	}
	private void generarBotonRegistrarEstudiante(){
		String textoBoton = "Registrar Estudiante";
		this.botonRegistrarEstudiante = super.generarBoton(textoBoton, 175, 180, 150,40);
		this.add(this.botonRegistrarEstudiante);
		this.botonRegistrarEstudiante.addActionListener(this);
	}
	private void generarBotonBuscarEstudiante(){
		String textoBoton = "Buscar Estudiante";
		this.botonBuscarEstudiante = super.generarBoton(textoBoton, 175, 260, 150,40);
		this.add(this.botonBuscarEstudiante);
		this.botonBuscarEstudiante.addActionListener(this);
	}
	private void generarBotonSalir(){
		String textoBoton = "Salir";
		this.botonSalir = super.generarBoton(textoBoton, 175, 420, 150, 40);
		this.add(this.botonSalir);
		this.botonSalir.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == this.botonRegistrarCarrera){
			VentanaRegistroCarrera ventanaRegistroCarrera = new VentanaRegistroCarrera(universidadController);
			this.dispose();
		}
		if(e.getSource() == this.botonRegistrarEstudiante) {
			VentanaRegistroEstudiante ventanaRegistroEstudiante = new VentanaRegistroEstudiante(universidadController);
			this.dispose();
		}
		if(e.getSource() == this.botonBuscarEstudiante) {
			VentanaBusquedaEstudiante ventanaBusquedaEstudiante = new VentanaBusquedaEstudiante(universidadController);
			this.dispose();
		}
		if(e.getSource() == this.botonSalir){
			UniversidadController.almacenarDatos(this.universidadController);
			this.dispose();
			System.exit(0);
		}
	}

}