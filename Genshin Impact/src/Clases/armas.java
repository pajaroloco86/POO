/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

public class armas{
    private String nombreArma;
    private String nombreDominioMejora;
    private String tipoArma;

    //Constructor
    public armas(String nombreArma, String nombreDominioMejora, String tipoArma) {
        this.nombreArma = nombreArma;
        this.nombreDominioMejora = nombreDominioMejora;
        this.tipoArma = tipoArma;
    }
    
    //Constructor que solo define el tipo de arma
    public armas(String tipoArma){
        this.tipoArma = tipoArma;
    }
    
    //Constructor sin parametros, usado para el personaje "porDefecto
    public armas(){
    }

    //Metodos set y get
    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public String getNombreDominioMejora() {
        return nombreDominioMejora;
    }

    public void setNombreDominioMejora(String nombreDominioMejora) {
        this.nombreDominioMejora = nombreDominioMejora;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
    
    
    
}
