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
        
        //Ciclo que recorre todas las armas
        for(int i=0; i<Iniciador.armasListaCompleta.length; i++){
            if(tipoArma.equals(Iniciador.armasListaCompleta[i].getTipoArma())){
                //Si el tipo de arma concuerda con la arma de la lista, se agrega al vector de armas
                listaArmas.add(Iniciador.armasListaCompleta[i].getNombreArma());
            }
        }
        //Se crea el modelo de armas y se le coloca al JComboBox
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(listaArmas);
        seleccionador.setModel(modelo);
    }
}
