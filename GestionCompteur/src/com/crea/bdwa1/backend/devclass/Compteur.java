package com.crea.bdwa1.backend.devclass;

public class Compteur {
	// attributs
	private int valeur;
	
	// constructeur
	public Compteur() {
		valeur = 0;
	}
	public Compteur(int val) {
		valeur = val;
	}
	
	// Méthodes
	public void incrementer() {
		valeur++;
	}
	public void decrementer() {
		valeur--;
	}
	public void raz() {
		valeur = 0;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	public void affichage() {
		System.out.println(valeur);
	}
}
