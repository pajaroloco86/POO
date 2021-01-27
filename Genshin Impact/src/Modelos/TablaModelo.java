/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import Clases.Dominio;
import Controlador.Iniciador;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaModelo {
    
    public void InicializaTabla(JTable tabla){
        //Vector para los titulos
        Vector<String> titulos = new Vector<String>();
        //Vector para los datos de la tabla
        Vector<Vector<Object>> data =new Vector<Vector<Object>>();
        
        //Agregamos los titulos a la tabla
        titulos.add("Dias");
        titulos.add("Tipo");
        titulos.add("Dominio");
        titulos.add("Frecuencia");
        
        //Ordenamos de mayor a menor los dominios segun la frecuencia
        Collections.sort(Iniciador.listaDominios);
         
        //Ciclo que recorre todos los elementos del arreglo de dominios
        for(int i=0; i<Iniciador.listaDominios.size(); i++){
            //Vector para las filas
            Vector<Object> row = new Vector<Object>();
            row.add(Iniciador.listaDominios.get(i).getDias());
            row.add(Iniciador.listaDominios.get(i).getTipoDominio());
            row.add(Iniciador.listaDominios.get(i).getNombre());
            row.add(Iniciador.listaDominios.get(i).getFrecuencia());
            data.add(row);
        }
        DefaultTableModel modelo = new DefaultTableModel(data, titulos);
        tabla.setModel(modelo);
    }
}
