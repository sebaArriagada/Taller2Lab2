package Taller2.principal;

import Taller2.controller.UniversidadController;
import Taller2.gui.VentanaBienvenida;

public class Principal {
    public static void main(String[] args) {
        UniversidadController universidadController= new UniversidadController();
        VentanaBienvenida ventana= new VentanaBienvenida(universidadController);
    }
}