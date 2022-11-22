package mvc_juego_verbos_irregulares.vista;

import mvc_juego_verbos_irregulares.controlador.Controlador;
import mvc_juego_verbos_irregulares.controlador.Vista;

import javax.swing.*;

public class PantallaPrincipal extends JFrame implements Vista {
    Controlador controlador;
    private JPanel contenedorPrincipal;
    private JPanel panelDinamico;
    private JButton buttonValidar;

    public PantallaPrincipal(){
        inicializarComponentes();
        inicializarPanelDinamico();
    }
    private void inicializarPanelDinamico() {
        panelDinamico.setLayout(new BoxLayout(panelDinamico, BoxLayout.Y_AXIS));
    }

    private void inicializarComponentes() {
        setContentPane(contenedorPrincipal);
        setSize(674,674);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
        buttonValidar.addActionListener(this.controlador);
    }

    @Override
    public void setPalabraVista(String[] verbos) {
        VerbosItem verbosItem = new VerbosItem(verbos);
        panelDinamico.add(verbosItem);
        panelDinamico.revalidate();
    }
}
