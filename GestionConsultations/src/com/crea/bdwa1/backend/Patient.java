
package com.crea.bdwa1.backend;

import java.util.Vector;
import java.util.Iterator;
import com.crea.bdwa1.backend.Consultation;

public class Patient {
    //Attributs
    private String nom;
    private int anneeN;//Année de naissance
    private Vector<Consultation> consultations;
    
    Vector<String> myVector=new Vector<String>(10,2);
;
    //Constructeurs
    public Patient(String nom, int anneeN){
      this.nom = nom;
      this.anneeN = anneeN;
    }
    //Méthodes
    //getNom
    
    public String getNom(){
       return nom;
    }
    //getAnneeN
    public int getAnneeN() {
		return anneeN;
	}

    // Ajoute une consultation dans le vecteur des consultations.  
    // On passe en argument la date et la description de la consultation
    public void addConsultation(String date, String description){
    		//Consultation consultation = new Consultation(date, description);
    		Consultation consultation = new Consultation(date, description);
    		consultations.addElement(consultation);
    }
    //Retourne la consultation à l'indice i
    public Consultation getUneConsultation(int i){
		return consultations.get(i);
    }
    //Retourne une chaine de la forme :
    //Nom du patient : Javanaise
    //Année de naissance : 1977
    //Liste des Consultations 
    //[04/04/2017 - Visite annuelle]
    //[04/02/2017 - Une petite grippe]
    //[04/01/2018 - Une fièvre]
    public String toString(){
    		String retour;
    		retour = "Nom du patient : " + nom;
    		retour += "Annee de naissance : " + anneeN;
    		retour += "Liste des consultations";
    		
    		Iterator<Consultation> consultation = consultations.iterator();
    	    while (consultation.hasNext()) {
    	    		retour += consultation.next().toString();
    	    }
    	    
    	    return retour;
    }
}
