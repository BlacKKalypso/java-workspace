package com.crea.bdwa1.backend.devclass;

public class Etudiant {
	/*
	 * Définition des attributs
	 */
	private String nom;
	private Notation[] notes;
	
	/*
	 * Définition des constructeurs
	 */

	public Etudiant(String nom) {
		this.nom = nom;
		this.notes = null;
	}
	public Etudiant() {
		this("");
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Notation[] getNotes() {
		return notes;
	}
	public void setNotes(Notation[] notes) {
		this.notes = notes;
	}

	/*
	 * Définition des méthodes
	 */
	
	/**
	 * Calcule la moyenne mais nécessite d'avoir des notes
	 * @return float la moyenne
	 */
	private float calcMoyenne() {
		float moy;
		float totalCoef;
		float totalNotes;
		totalNotes = 0;
		totalCoef = 0;
		
		if(this.notes != null) {
			for (int i=0; i < notes.length; i++) {
				totalNotes += (this.notes[i].getCoef() * this.notes[i].getNote());
				totalCoef += this.notes[i].getCoef();
			}
			
			moy = totalNotes / totalCoef;
		}else {
			System.out.println("Vous n'avez pas encore de note, par conséquent pas de moyenne");
			moy = 0.0f ;
		}

		return moy;
	}
	private String listNotes() {
		String listNotes = "";

		if(this.notes != null) {
			for (int i=0; i < this.notes.length; i++) {

				listNotes = listNotes + "\t" + (i + 1) + ") " + "Note: " + this.notes[i].getNote() + " Coef: " + this.notes[i].getCoef() + "\n";
			}
		}else {
			listNotes = nom + " n'a pas encore de notes";
		}
		
		return listNotes;
	} 
	public float moyenne() {
		return calcMoyenne();
	}
	
	public void avis() {
		System.out.println(getAvis());
	}
	public String getAvis() {
		if(this.calcMoyenne() >= 4.0) {
			return nom + " passe l'année";
		}else{
			return nom + " doit effectuer des cours de rattrapage";
		}
	}
	
	public void affichage() {
		System.out.println("***********************" );
		System.out.println("Nom: \t" + this.nom );
		System.out.println("Notes: " + this.listNotes() );
		System.out.println("===================" );
		System.out.println("Moyenne: " + this.calcMoyenne() );
		System.out.println("Avis: \t " + this.getAvis() );
		System.out.println("***********************\n" );
	}
	
}
