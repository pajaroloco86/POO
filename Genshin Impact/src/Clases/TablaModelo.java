/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Controlador.Iniciador;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TablaModelo {

    public void inicializarTabla(JTable tabla){
        //Vector para los titulos
        Vector<String> titulos = new Vector<String>();
        //Vector para los datos de la tabla
        Vector<Vector<String>> data = new Vector<Vector<String>>();
        //ArrayList para los nombres de los dominios
        ArrayList<String> nombresDominios = new ArrayList<String>();
        //ArrayList para el contador de cada dominio
        ArrayList<Integer> contadoresDominios = new ArrayList<Integer>();
        
        /**
         * Colocamos los nombres de los dominios de los talentos sin repetir
         * En caso de que se repita, se aumenta el contador del mismo
         */
        //Ciclo que recorre a los miembros del equipo
        for(int i=0; i<Iniciador.equipo.length; i++){
            if(!(nombresDominios.contains(Iniciador.equipo[i].getNombreDominioTalentos()))){
                /**
                 * Se ejecuta cuando el nombre del dominio del personaje no se 
                 * encuentra dentro del arreglo
                 */
                //Se agrega el nombre al arreglo
                nombresDominios.add(Iniciador.equipo[i].getNombreDominioTalentos());
                //Se agrega el contador con 1
                contadoresDominios.add(1);
            }else{
                /**
                 * Se ejecuta cuando el nombre del dominio del personaje se 
                 * encuentra dentro del arreglo
                 */
                //Variable que indica en que posicion se encuentra el nombre del dominio
                int posicion =nombresDominios.indexOf(Iniciador.equipo[i].getNombreDominioTalentos());
                //Se incrementa en 1 el contador del dominio correspondiente
                contadoresDominios.add(posicion, contadoresDominios.get(posicion)+1);
            }
        }
        
        //Proceso similar al anterior para los dominios de armas
        for(int i=0; i<Iniciador.equipo.length; i++){
            if(!(nombresDominios.contains(Iniciador.equipo[i].getArma().getNombreDominioMejora()))){
                /**
                 * Se ejecuta cuando el nombre del dominio del arma del personaje 
                 * no se encuentra dentro del arreglo
                 */
                //Se agrega el nombre al arreglo
                nombresDominios.add(Iniciador.equipo[i].getArma().getNombreDominioMejora());
                //Se agrega el contador con 1
                contadoresDominios.add(1);
            }else{
                /**
                 * Se ejecuta cuando el nombre del dominio del arma del personaje 
                 * se encuentra dentro del arreglo
                 */
                //Variable que indica en que posicion se encuentra el nombre del dominio
                int posicion =nombresDominios.indexOf(Iniciador.equipo[i].getArma().getNombreDominioMejora());
                //Se incrementa en 1 el contador del dominio correspondiente
                contadoresDominios.add(posicion, contadoresDominios.get(posicion)+1);
            }
        }
        
        //Ordenar los arreglos
        
        
         //Se crea el modelo de armas y se lo ponemos a la tabla
        DefaultTableModel modelo = new DefaultTableModel(data, titulos);
        tabla.setModel(modelo);
    }
}
