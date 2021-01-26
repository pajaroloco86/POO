/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

public class Personaje {
    private String nombre;
    private armas arma;
    private String nombreDominioTalentos;

    //Constructor
    public Personaje(String nombre, armas arma,String nombreDominioTalentos ) {
        this.nombre = nombre;
        this.arma = arma;
        this.nombreDominioTalentos = nombreDominioTalentos;
    }

//Metodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public armas getArma() {
        return arma;
    }

    public void setArma(armas arma) {
        this.arma = arma;
    }

    public String getNombreDominioTalentos() {
        return nombreDominioTalentos;
    }

    public void setNombreDominioTalentos(String nombreDominioTalentos) {
        this.nombreDominioTalentos = nombreDominioTalentos;
    }

    


    
}