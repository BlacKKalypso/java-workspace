package com.crea.bdwa1.backend.devclass;

public class Personnel {
	// Attributs
	private int anneeNaissance;
	private String prenom;
	private String nom;
	private String civilite;
	private String rue;
	private	String ville;
	private String sexe;

	
	
	/**
	 * 
	 * @param anneeNaissance
	 * @param prenom
	 * @param nom
	 * @param civilite
	 * @param rue
	 * @param ville
	 * @param sexe
	 */
	public Personnel(int anneeNaissance, String prenom,  String nom, String civilite, String rue, String ville, String sexe) {
		this.anneeNaissance 	= anneeNaissance;
		this.prenom			= prenom;
		this.nom				= nom;
		this.civilite		= civilite;
		this.rue				= rue;
		this.ville			= ville;
		this.sexe			= sexe;
	}
	/**
	 * 
	 * @param anneeNaissance
	 * @param prenom
	 * @param nom
	 */
	public Personnel(int anneeNaissance, String prenom,  String nom) {
		this.anneeNaissance 	= anneeNaissance;
		this.prenom			= prenom;
		this.nom				= nom;
		this.civilite		= "celibataire";
		this.rue				= "10 rue mystère";
		this.ville			= "Genève";
		this.sexe			= "h";
	}
	
	/**
	 * 
	 */
	public Personnel() {
		this.anneeNaissance 	= 1970;
		this.prenom			= "John";
		this.nom				= "Doe";
		this.civilite		= "celibataire";
		this.rue				= "10 rue mystère";
		this.ville			= "Genève";
		this.sexe			= "h";
	}
	
	

	/*
	 * Getters & Setters
	 */
	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

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

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	/*
	 * Définition des méthodes
	 */
	
	
	// Afficher les info du personnel
	public void afficheInfo() {
		String ne = "né";
		String sujet = "il";
		
		if(sexe=="f") {
			ne = "née";
			sujet = "elle";
		}
		System.out.println(
				prenom + " " + nom + " est " + ne + " en " + anneeNaissance + 
				", " + sujet + " est " + civilite + " et habite à " + rue + " à " + ville + "." 
		);

	}
	// calculAge sans argument
	public void age() {
		int age = 2018 - anneeNaissance;
		System.out.println(prenom + " " + nom + " a " + age + " ans");
	}
	// calculAge avec argument
	/**
	 * 
	 * @param anneeEnCours
	 */
	public void age(int anneeEnCours) {
		int age = anneeEnCours - anneeNaissance;
		System.out.println(nom + " " + prenom + " a " + age + " ans");
	}
}
