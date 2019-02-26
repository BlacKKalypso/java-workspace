package com.crea.bdwa1.backend;
import com.crea.bdwa1.backend.Patient;
import java.util.Vector;
import java.util.Iterator;

public class ServiceCHU {
    //Attributs
    private String nom;
    private Vector<Patient> patients;
    //Constructeurs
    public ServiceCHU(String nom){
    		this.nom = nom;
    }
    //Méthodes
    //Retourne true ou false selon que le
    //Ajouter un patient à  la collection de patients
    public void addPatient(Patient patient){
        patients.addElement(patient);
    }
    //Retourne 0 si le patient n'est pas trouvé ou son année de naissance dans le cas contraire
    public int getAnnee(String nom){
    		int retour;
    		//TO DO
    		retour = 0;
    		Iterator<Patient> patient = patients.iterator();
	    while (patient.hasNext()) {
	    		if(patient.next().getNom() == nom) {
	    			retour = patient.next().getAnneeN();
	    		}
	    }
	    return retour;
    		
    }
    //Affiche tous les patients, voir Exemple ci-dessous
    //Exemple
    //******Liste des patients******
    //Nom du patient :Moore	Année de naissance :1980
    //Liste des Consultations[02/01/2017-Visite médicale annuelle][10/02/2017-Une petite grippe][03/04/2018-Un coup de soleil]
    //************************
    //Nom du patient :Fisher	Année de naissance :1982
    //Liste des Consultations[02/12/2017-Visite médecine du travail][10/02/2016-Une fièvre][03/04/2017-Un coup de fatigue]
    //************************ 
    public void affiche(){
        //TO DO
    		System.out.println("******Liste des patients******");
    		Iterator<Patient> patient = patients.iterator();
	    while (patient.hasNext()) {
	    		System.out.println(patient.next().toString());
	    }
    }
}
