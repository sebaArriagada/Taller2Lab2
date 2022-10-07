package Taller2.gui;

import Taller2.controller.UniversidadController;

import javax.swing.*;
import java.awt.event.ActionEvent;

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

	private void generarBotonCancelar() {
		String textoBotonCancelar = "Cancelar";
		this.botonCancelar = super.generarBoton(textoBotonCancelar, 275, 400, 150, 20);
		this.add(this.botonCancelar);
		this.botonCancelar.addActionListener(this);
	}

	private void generarBotonRegistrarCarrera() {
		String textoBoton= "Registrar Carrera:";
		this.botonRegistrarCarrera = super.generarBoton(textoBoton, 75, 400, 150, 20);
		this.add(this.botonRegistrarCarrera);
		this.botonRegistrarCarrera.addActionListener(this);
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
	private boolean registrarCarrera(){
		return universidadController.agregarCarrera(this.campoNombreCarrera.getText(),this.campoCodigoCarrera.getText(),this.campoCantidadSemestres.getText());
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == this.botonRegistrarCarrera){
			if (registrarCarrera()){
				JOptionPane.showMessageDialog(this,"Carrera Registrada Correctamente");
				VentanaBienvenida ventanaBienvenida = new VentanaBienvenida(universidadController);
				this.dispose();
			}
			else {
				JOptionPane.showMessageDialog(this,"Carrera ingresada incorrectamente");
			}
		}
		if (e.getSource()==this.botonCancelar){
			VentanaBienvenida ventanaBienvenida = new VentanaBienvenida(universidadController);
			this.dispose();
		}
	}

}