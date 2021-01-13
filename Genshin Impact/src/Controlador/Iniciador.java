/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Clases.Personaje;
import Vista.Principal;
import java.util.ArrayList;

public class Iniciador {
    //Vector donde se almacenan los datos    
    public static Personaje equipo[]= new Personaje[4];

    public static void main(String[] args) {               
        //Iniciador de la ventana principal
        Principal principal = new Principal();
        principal.setVisible(true);
    }
    
}
