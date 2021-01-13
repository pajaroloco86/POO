/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

public class Personaje {
    private String nombre;
    private armas arma;
    private String materialMejoraTalentos;

    //Constructor
    public Personaje(String nombre, armas arma,String materialMejoraTalentos ) {
        this.nombre = nombre;
        this.arma = arma;
        this.materialMejoraTalentos = materialMejoraTalentos;
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

    public String getMaterialMejoraTalentos() {
        return materialMejoraTalentos;
    }

    public void setMaterialMejoraTalentos(String materialMejoraTalentos) {
        this.materialMejoraTalentos = materialMejoraTalentos;
    }


    
}