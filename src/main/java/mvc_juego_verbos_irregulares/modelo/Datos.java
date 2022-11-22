package mvc_juego_verbos_irregulares.modelo;

import java.io.*;
import java.util.*;

public class Datos {

    private List<String[]> CollVerbos = new ArrayList<>();
    private String[] arrayVerbos;

    public Datos() {
        arrayVerbos = new String[4];
        leerFichero();
    }

    private void leerFichero() {
        try (FileReader fr = new FileReader(new File("verbos_irregulares.txt"));
             BufferedReader br = new BufferedReader(fr)){
            String linea;

            while ((linea = br.readLine()) != null){
                aEstructuraDeDatos(linea);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void aEstructuraDeDatos(String linea) {
        arrayVerbos = linea.split(",");
        CollVerbos.add(arrayVerbos);
    }
    public void setVerbos(List<String[]> verbos) {
        this.CollVerbos = verbos;
    }

    public List<String[]> getVerbos(){
        return CollVerbos;
    }
}
