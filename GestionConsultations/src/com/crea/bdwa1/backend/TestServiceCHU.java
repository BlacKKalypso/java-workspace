package com.crea.bdwa1.backend;
import com.crea.bdwa1.backend.ServiceCHU;;

public class TestServiceCHU {

 public static void main(String[] args){
    //Création d'un serviceCHU
    //Vous devez utiliser la classe Saisie
    //TO DO

    String nom = Saisie.lireChaine("saisir le nom:");
    
    ServiceCHU schu = new ServiceCHU(nom);
    //Création du patient1 et de ses consultations
    Patient p1 = new Patient("Moore",1980);
   
    p1.addConsultation("02/01/2017", "Visite médicale annuelle");
    p1.addConsultation("10/02/2017", "Une petite grippe");
    p1.addConsultation("03/04/2018", "Un coup de soleil");
    
    //Ajout du patient p1 au service
    schu.addPatient(p1);
    //Création du patient2 et de ses consultations
    Patient p2 = new Patient("Fisher",1982);
    p2.addConsultation("02/12/2017", "Visite médecine du travail");
    p2.addConsultation("10/02/2018", "Une fièvre");
    p2.addConsultation("03/04/2017", "Un coup de fatigue");
    //Ajout du patient p1 au service
    schu.addPatient(p2);
    System.out.println ("Année de naissance du patient Fisher : " 
            + schu.getAnnee("Fisher"));
    System.out.println ("Année de naissance du patient Dubosc : " 
            + schu.getAnnee("Dubosc"));
    schu.affiche();
 } 
}
