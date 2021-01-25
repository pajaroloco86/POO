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
        
        for(int i=0; i<Iniciador.armasListaCompleta.length; i++){
            if(tipoArma.equals(Iniciador.armasListaCompleta[i].getTipoArma())){
                listaArmas.add(Iniciador.armasListaCompleta[i].getNombreArma());
            }
        }
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(listaArmas);
        seleccionador.setModel(modelo);
    }
}
