package mvc_juego_verbos_irregulares.vista;

import javax.swing.*;

public class VerbosItem extends JPanel {
    private JTextField textFieldSpanish;
    private JTextField textFieldInfinitive;
    private JTextField textFieldSimplePast;
    private JTextField textFieldPastParticiple;
    private JPanel contenedorVerbos;

    String[] verbos;
    public VerbosItem(String[] verbos) {
        this.verbos = verbos;

        inicializarGUI();
        mostrarVerbos();
    }

    private void mostrarVerbos() {
        textFieldSpanish.setText(this.verbos[0]);
        textFieldInfinitive.setText(this.verbos[1]);
        textFieldSimplePast.setText(this.verbos[2]);
        textFieldPastParticiple.setText(this.verbos[3]);
    }

    private void inicializarGUI() {
        add(contenedorVerbos);
    }
}
