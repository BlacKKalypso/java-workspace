package com.crea.bdwa1.backend;

public class Consultation {
    //Attributs
    private String date;
    private String description;
    //Constructeurs
    public Consultation(String date, String description ){
       //TO DO
    		this.date = date;
    		this.description = description;
    }
    //Méthodes
    //Retourne une chaine sous la forme
    //[04/04/2017 - Visite médicale annuelle]
    
    public String toString(){
        //TO DO
    		return "[" + date + " - " + description + "]";
    }
}
