/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Clases.Personaje;
import Clases.armas;
import Vista.Principal;
import java.util.ArrayList;

public class Iniciador {
    //Vector donde se almacenan los datos    
    public static Personaje[] equipo = new Personaje[4];
    public static ArrayList<String> nombreDominios = new ArrayList<String>();
    public static ArrayList<Integer> aparicionesDominios = new ArrayList<Integer>();

    public static void main(String[] args) {               
        //Objeto que sirve como default para el arreglo
        Personaje porDefecto = new Personaje("Agregar", new armas(),"");
        for(int i=0; i<4;i++){
            equipo[i]= porDefecto;
        }
        
        //Iniciador de la ventana principal
        Principal principal = new Principal();
        principal.setVisible(true);
    }
    
}
