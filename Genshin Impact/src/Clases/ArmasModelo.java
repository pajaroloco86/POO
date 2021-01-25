/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Controlador.Iniciador;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ArmasModelo {
    public static void inicializarListaArmas(JComboBox<String> seleccionador,int posicionPersonaje){
        //Obtenemos el tipo de arma del personaje
        String tipoArma = Iniciador.equipo[posicionPersonaje].getArma().getTipoArma();
        //Vector de armas a mostrar al usuario
        Vector<String> listaArmas = new Vector<String>();
        
        switch(tipoArma){
            case "Catalizador":
                listaArmas.add("Prototipo Malicia");
                listaArmas.add("Carta Náutica de las Tierras y los Mares");
                break;
            case "Claymore":
                listaArmas.add("Espada del Tiempo");
                listaArmas.add("Gran Espada de Sacrificio");
                listaArmas.add("Prototipo Aminus");
                break;
            case "Arco":
                listaArmas.add("Herrumbre");
                listaArmas.add("Juramento del Arquero");
                listaArmas.add("Arco de Favonius");
                break;
            case "Ligera":
                listaArmas.add("Rugido del León");
                listaArmas.add("Espada de Favonius");
                break;
            case "Lanza":    
                listaArmas.add("Perdición del Dragón");
                listaArmas.add("Púa Celestial");
                break;
        }
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(listaArmas);
        seleccionador.setModel(modelo);
    }
}
