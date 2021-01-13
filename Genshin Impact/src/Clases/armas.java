/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

public class armas{
    private String nombreArma;
    private String materialMejora;

    //Constructor
    public armas(String nombreArma, String materialMejora) {
        this.nombreArma = nombreArma;
        this.materialMejora = materialMejora;
    }

    //Constructor sin parametros, usado para crear objetos de tipo "Personaje"
    public armas(){
    }

    //Metodos set y get
    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public String getMaterialMejora() {
        return materialMejora;
    }

    public void setMaterialMejora(String materialMejora) {
        this.materialMejora = materialMejora;
    }
    
    
}
