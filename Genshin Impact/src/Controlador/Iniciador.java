/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Clases.Dominio;
import Clases.Personaje;
import Clases.armas;
import Vista.Principal;
import java.util.ArrayList;

public class Iniciador {
    //Arreglo donde se almacenan los datos    
    public static Personaje[] equipo = new Personaje[4];
    //Arreglo completo de armas
    public static armas[] armasListaCompleta = new armas[12];
    //Arregloq ue sirve para el calculo final de los dominios
    public static ArrayList<Dominio> listaDominios = new ArrayList<Dominio>();

    public static void main(String[] args) {               
        //Iniciamos con valores por defecto el arreglo "equipo"
        inicializarEquipo();
        inicializarArregloArmas();
        
        //Iniciador de la ventana principal
        Principal principal = new Principal();
        principal.setVisible(true);
    }
    
    //Metodo que llena el arreglo "equipo" con un persona "porDefecto"
    public static void inicializarEquipo(){
        //Objeto que sirve como default para el arreglo
        Personaje porDefecto = new Personaje("Agregar", new armas(),"");
        for(int i=0; i<4;i++){
            equipo[i]= porDefecto;
        }
    }
    
    //Metodo que llena el arreglo "armasListaCompleta"
    public static void inicializarArregloArmas(){
        armasListaCompleta[0] = new armas("Herrumbre", "Altar de las nubes electricas", "Arco");
        armasListaCompleta[1] = new armas("Rugido del León", "Altar de las nubes electricas", "Ligera");
        armasListaCompleta[2] = new armas("Espada del Tiempo", "Ciudad de los reflejos", "Claymore");
        armasListaCompleta[3] = new armas("Espada de Favonius", "Ciudad de los reflejos", "Ligera");
        armasListaCompleta[4] = new armas("Prototipo Malicia", "Ruinas atronadoras", "Catalizador");
        armasListaCompleta[5] = new armas("Perdición del Dragón", "Ruinas atronadoras", "Lanza");
        armasListaCompleta[6] = new armas("Gran Espada de Sacrificio", "Valle sumergido", "Claymore");
        armasListaCompleta[7] = new armas("Juramento del Arquero", "Valle sumergido", "Arco");
        armasListaCompleta[8] = new armas("Carta Náutica de las Tierras y los Mares", "Campo de prueba del relampago milenario", "Catalizador");
        armasListaCompleta[9] = new armas("Prototipo Aminus", "Campo de prueba del relampago milenario", "Claymore");
        armasListaCompleta[10] = new armas("Arco de Favonius", "Ruinas de la ciudad sedienta", "Arco");
        armasListaCompleta[11] = new armas("Púa Celestial", "Ruinas de la ciudad sedienta", "Lanza");
    }
}
