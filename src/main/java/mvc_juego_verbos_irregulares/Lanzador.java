package mvc_juego_verbos_irregulares;

import mvc_juego_verbos_irregulares.controlador.Controlador;
import mvc_juego_verbos_irregulares.controlador.Vista;
import mvc_juego_verbos_irregulares.modelo.Datos;
import mvc_juego_verbos_irregulares.vista.PantallaPrincipal;

public class Lanzador {
    public static void main(String[] args) {
        Datos modelo = new Datos();
        Vista vista = new PantallaPrincipal();

        Controlador controlador = new Controlador(vista,modelo);
        vista.setControlador(controlador);
    }
}
