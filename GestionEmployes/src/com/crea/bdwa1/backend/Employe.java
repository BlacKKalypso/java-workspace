package com.crea.bdwa1.backend;

/**
 * @author Robin
 */
public class Employe {
	/*
	 * Définition des variables d’instance
	 */
	private String nom;
	private int anneeNaissance;

	/*
	 * Définition du constructeur
	 */
	public Employe(String n, int an) {
		this.nom = n;
		this.anneeNaissance = an;
	}
	
	public Employe() {
		this("", 0);
	}

	/*
	 * Getters & Setters
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	/*
	 * Définition des méthodes
	 */
	// calculAge sans argument
	public void calculAge() {
		int age = 2018 - anneeNaissance;
		System.out.println("Votre âge : " + age);
	}

	// calculAge avec arguments
	public void calculAge(int anneeEnCours) {
		int age = anneeEnCours - anneeNaissance;
		System.out.println("Votre âge:" + age);

	}

	public void afficher() {
		System.out.println("Nom : " + nom + " Année de naissance : " + anneeNaissance);
	}

	public void afficher(int age) {
		System.out.println("Nom : " + nom + " Année de naissance : " + anneeNaissance + "age:" + age);
	}

}
