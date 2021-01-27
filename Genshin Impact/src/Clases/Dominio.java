/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

public class Dominio implements Comparable<Dominio> {
    private String dias;
    private String nombre;
    private int frecuencia;
    private String tipoDominio;

    public Dominio(String nombre, int frecuencia,String tipoDominio) {
        setDias(nombre);
        this.nombre = nombre;
        this.frecuencia = frecuencia;
        this.tipoDominio = tipoDominio;
    }

    public String getDias() {
        return dias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getTipoDominio() {
        return tipoDominio;
    }

    public void setTipoDominio(String tipoDominio) {
        this.tipoDominio = tipoDominio;
    }
    
    
    
    //Metodo modificado que coloca el dia que aparece el dominio
    public void setDias(String nombre){
        /**
         * Como cada dia se pueden realizar 4 dominios, entonces si el nombre es
         * igual a alguno de ese dia, se asignan los valores correspondientes
         * Los dominios se repiten con una diferencia de 2 dias entre ellos
         * empezando los lunes y terminando los sabados, los domingos todos los 
         * dominios se encuentran disponibles
         */
        if(nombre.equals("Altar de la escarcha")||nombre.equals("Altar de las llamas")||nombre.equals("Altar de las nubes electricas")||nombre.equals("Ciudad de los reflejos")){
            //Dominios de los dias lunes y jueves
            this.dias = "Lunes/jueves";
            
        }else if(nombre.equals("Abismo helado")||nombre.equals("El corazón de las llamas")||nombre.equals("Ruinas atronadoras")||nombre.equals("Valle sumergido")){
            //Dominios de los martes y viernes
            this.dias = "Martes/viernes";
        }else{
            //Si el dominio no está en alguno de los dias anteriores, entonces es de miercoles y sabado
            this.dias = "Miercoles/sabado";
        }
        
    }

    @Override
    public int compareTo(Dominio e) {
         if(e.getFrecuencia()<frecuencia){
            return -1;
        }else if(e.getFrecuencia()==frecuencia){
            return 0;
        }else{
            return 1;
        }
    }
    
}
