/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import static Controlador.Iniciador.equipo;
import static Controlador.Iniciador.nombreDominios;

public class FuncionesArreglos {
    public void agregarDominioTalento(){
        for(int i=0; i<4; i++){
            //Si el Array es vacio, se agrega el nombre del dominio
            if(nombreDominios.isEmpty()){
                nombreDominios.add(equipo[i].getDominioMejoraTalentos());
            }else{
                //Si el nombre del dominios no es igual al ultimo dominio agregado, se agrega
                if(!equipo[i].getDominioMejoraTalentos().equals(nombreDominios.get(nombreDominios.size()-1))){
                    nombreDominios.add(equipo[i].getDominioMejoraTalentos());
                }
            }
        }
    }
        public void agregarDominioArmas(){
            //Agregar el nombre del dominio del arma
            for(int j=0; j<4; j++){
                if(j==0){
                nombreDominios.add(equipo[j].getArma().getDominioMaterialMejora());
                }else{
                    //Si el nombre del dominios no es igual al ultimo dominio agregado, se agrega
                    if(!equipo[j].getArma().getDominioMaterialMejora().equals(nombreDominios.get(nombreDominios.size()-1))){
                        nombreDominios.add(equipo[j].getArma().getDominioMaterialMejora());
                    }
                }
            }
        }
        public void OrdenarMayorMenor(){
        //Codigo general del ordenamiento
    }    
}
