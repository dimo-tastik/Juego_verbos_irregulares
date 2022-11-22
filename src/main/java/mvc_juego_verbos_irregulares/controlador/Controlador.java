package mvc_juego_verbos_irregulares.controlador;

import mvc_juego_verbos_irregulares.modelo.Datos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    Vista vista;
    Datos modelo;

    public Controlador(Vista vista, Datos modelo) {
        this.vista = vista;
        this.modelo = modelo;
        cargaInicial();
    }

    private void cargaInicial() {
        modelo.getVerbos().forEach(verbos -> {
            vista.setPalabraVista(verbos);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("REVISE")){
            //validar
        }
    }

}
