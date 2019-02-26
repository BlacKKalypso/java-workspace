package com.crea.bdwa1.backend.devclass;

public class Individu {
	// Attributs
	private String prenom;
	private String nom;
	private Individu conjoint;
	private int sexe; //1 Femme 2 Homme
	// private int majNom;//1 Garder 2 Ajouter 3 Changer
	
	/**
	 * 
	 * @param prenom
	 * @param nom
	 * @param sexe 1. Femme 2.Hommexw
	 */
	public Individu( String prenom, String nom, int sexe) {
		this.prenom = prenom;
		this.nom = nom;
		this.conjoint = null;
		this.sexe = sexe;
		
	}
	public Individu( String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = 0;
		this.conjoint = null;
	}

	public Individu() {
		this("","");
	}
	
	/*
	 * Getters & Setters
	 */
	
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Individu getConjoint() {
		return conjoint;
	}

	public void setConjoint(Individu conjoint) {
		this.conjoint = conjoint;
		conjoint.conjoint = this;
	}
	
	
	public int getSexe() {
		return sexe;
	}

	public void setSexe(int sexe) {
		this.sexe = sexe;
	}
	
	/*
	 * Définition des méthodes
	 */
	/**
	 * 
	 * @param conjoint
	 * @param majNom 1. la femme garde son nom  2.  la femme ajoute le nom du mari 3. la femme change de nom
	 */
	private void marierChangeNom(Individu conjoint, int majNom) {
		this.conjoint = conjoint;
		conjoint.conjoint = this;
		// L'individu est une femme et souhaite ajoute le nom du mari a son nom
		if(this.sexe == 1 && majNom == 2) {
			this.setNom(this.nom + " " + conjoint.getNom());
		}
		// L'individu est une femme et souhaite prendre le nom de son mari
		else if(this.sexe == 1 && majNom == 3){
			this.setNom(conjoint.getNom());
		}
		// la conjointe de l'individu est une femme et souhaite ajouter le nom du mari a son nom
		else if(conjoint.getSexe() == 1 && majNom == 2 ) {
			conjoint.setNom(conjoint.getNom() + " " + this.getNom());
		}
		// la conjointe de l'individu est une femme et souhaite prendre le nom de son mari
		else if(conjoint.getSexe() == 1 && majNom == 3) {
			conjoint.setNom(this.getNom());
		}
	}

	public void marier(Individu conjoint) {
			this.marier(conjoint, 1);
	}
	public void marier(Individu conjoint, int majNom) {
		if(this.conjoint== null && conjoint.conjoint==null) {
			this.marierChangeNom(conjoint, majNom);
		}else {
			System.out.println("Polygamie interdite");
		}
	}
	
	

	public void afficheInfo() {
		if(conjoint != null) {
			System.out.println(prenom + " " + nom + " est marié à " + conjoint.getPrenom() + " " + conjoint.getNom());
		}else {
			System.out.println(prenom + " " + nom + " est célibataire");
		}
	}


}
