/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

public class armas{
    private String nombreArma;
    private String DominioMaterialMejora;

    //Constructor
    public armas(String nombreArma, String DominioMaterialMejora) {
        this.nombreArma = nombreArma;
        this.DominioMaterialMejora = DominioMaterialMejora;
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

    public String getDominioMaterialMejora() {
        return DominioMaterialMejora;
    }

    public void setDominioMaterialMejora(String DominioMaterialMejora) {
        this.DominioMaterialMejora = DominioMaterialMejora;
    }

    
    
    
}
